package com.nari.opfive.domain;
// Generated 2017-8-25 11:17:45 by Hibernate Tools 5.2.5.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Checkresult.
 * @see com.nari.opfive.domain.Checkresult
 * @author Hibernate Tools
 */
public class CheckresultHome {

	private static final Log log = LogFactory.getLog(CheckresultHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Checkresult transientInstance) {
		log.debug("persisting Checkresult instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Checkresult instance) {
		log.debug("attaching dirty Checkresult instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Checkresult instance) {
		log.debug("attaching clean Checkresult instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Checkresult persistentInstance) {
		log.debug("deleting Checkresult instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Checkresult merge(Checkresult detachedInstance) {
		log.debug("merging Checkresult instance");
		try {
			Checkresult result = (Checkresult) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Checkresult findById(int id) {
		log.debug("getting Checkresult instance with id: " + id);
		try {
			Checkresult instance = (Checkresult) sessionFactory.getCurrentSession()
					.get("com.nari.opfive.domain.Checkresult", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Checkresult> findByExample(Checkresult instance) {
		log.debug("finding Checkresult instance by example");
		try {
			List<Checkresult> results = (List<Checkresult>) sessionFactory.getCurrentSession()
					.createCriteria("com.nari.opfive.domain.Checkresult").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
