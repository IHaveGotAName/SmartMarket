package market.dao.impl;

import market.dao.BaseDAO;
import market.dao.api.CrudDAO;
import market.entity.Manufacturer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class ManufacturerDAO extends BaseDAO implements CrudDAO<Manufacturer> {
    @Override
    public Manufacturer findById(int id) {
        Session session = null;
        Manufacturer manufacturer = null;
        try {
            session = getActiveSession();
            manufacturer = (Manufacturer) session.load(Manufacturer.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return manufacturer;
    }

    @Override
    public List<Manufacturer> findAll() {
        Session session = null;
        List manufacturers = new ArrayList<Manufacturer>();
        try {
            session = getActiveSession();
            manufacturers = session.createCriteria(Manufacturer.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'findAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return manufacturers;
    }

    @Override
    public void create(Manufacturer manufacturer) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(manufacturer);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    @Override
    public void update(Manufacturer manufacturer) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(manufacturer);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Manufacturer manufacturer) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(manufacturer);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
