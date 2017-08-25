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
 * Home object for domain model class Judgementsubitem.
 * @see com.nari.opfive.domain.Judgementsubitem
 * @author Hibernate Tools
 */
public class JudgementsubitemHome {

	private static final Log log = LogFactory.getLog(JudgementsubitemHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Judgementsubitem transientInstance) {
		log.debug("persisting Judgementsubitem instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Judgementsubitem instance) {
		log.debug("attaching dirty Judgementsubitem instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Judgementsubitem instance) {
		log.debug("attaching clean Judgementsubitem instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Judgementsubitem persistentInstance) {
		log.debug("deleting Judgementsubitem instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Judgementsubitem merge(Judgementsubitem detachedInstance) {
		log.debug("merging Judgementsubitem instance");
		try {
			Judgementsubitem result = (Judgementsubitem) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Judgementsubitem findById(int id) {
		log.debug("getting Judgementsubitem instance with id: " + id);
		try {
			Judgementsubitem instance = (Judgementsubitem) sessionFactory.getCurrentSession()
					.get("com.nari.opfive.domain.Judgementsubitem", id);
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

	public List<Judgementsubitem> findByExample(Judgementsubitem instance) {
		log.debug("finding Judgementsubitem instance by example");
		try {
			List<Judgementsubitem> results = (List<Judgementsubitem>) sessionFactory.getCurrentSession()
					.createCriteria("com.nari.opfive.domain.Judgementsubitem").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
