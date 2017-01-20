package market.dao.impl;

import market.dao.BaseDAO;
import market.dao.api.CrudDAO;
import market.entity.History;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class HistoryDAO extends BaseDAO implements CrudDAO<History> {
    @Override
    public History findById(int id) {
        Session session = null;
        History history = null;
        try {
            session = getActiveSession();
            history = (History) session.load(History.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return history;
    }

    @Override
    public List<History> findAll() {
        Session session = null;
        List history = new ArrayList<History>();
        try {
            session = getActiveSession();
            history = session.createCriteria(History.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'findAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return history;
    }

    @Override
    public void create(History history) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(history);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    @Override
    public void update(History history) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(history);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(History history) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(history);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    public History findByUserId(Integer userId){
        History history;
        Session session = getActiveSession();
        history = (History) session.createCriteria(History.class)
                .add(Restrictions.eq("user_id", userId))
                .uniqueResult();
        System.out.println(history);
        return history;
    }
}