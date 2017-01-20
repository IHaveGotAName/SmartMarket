package market.dao;

import market.Utilites.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class BaseDAO {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    protected Session getActiveSession() {
        Session session = sessionFactory.openSession();
        return session;
    }
}
