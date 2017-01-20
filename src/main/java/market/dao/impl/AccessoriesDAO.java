package market.dao.impl;

import market.dao.BaseDAO;
import market.dao.api.CrudDAO;
import market.entity.Accessories;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class AccessoriesDAO extends BaseDAO implements CrudDAO<Accessories> {


    @Override
    public Accessories findById(int id) {
        Accessories accessories;
        Session session = getActiveSession();
        accessories = (Accessories) session.createCriteria(Accessories.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        System.out.println(accessories);
        return accessories;
    }

    @Override
    public List<Accessories> findAll() {
        Session session = null;
        List accessories = new ArrayList<Accessories>();
        try {
            session = getActiveSession();
            accessories = session.createCriteria(Accessories.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'findAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return accessories;
    }

    @Override
    public void create(Accessories accessories) {
    Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(accessories);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    @Override
    public void update(Accessories accessories) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(accessories);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Accessories accessories) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(accessories);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
