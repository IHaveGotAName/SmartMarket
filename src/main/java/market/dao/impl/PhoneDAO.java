package market.dao.impl;

import market.dao.BaseDAO;
import market.dao.api.CrudDAO;
import market.entity.Phone;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class PhoneDAO extends BaseDAO implements CrudDAO<Phone> {
    @Override
    public Phone findById(int id) {
        Phone phone;
        Session session = getActiveSession();
        phone = (Phone) session.createCriteria(Phone.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        System.out.println(phone);
        return phone;
    }

    @Override
    public List<Phone> findAll() {
        Session session = null;
        List phones = new ArrayList<Phone>();
        try {
            session = getActiveSession();
            phones = session.createCriteria(Phone.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'findAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return phones;
    }

    @Override
    public void create(Phone phone) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(phone);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    @Override
    public void update(Phone phone) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(phone);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Phone phone) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(phone);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
