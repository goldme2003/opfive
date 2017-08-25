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
 * Home object for domain model class Taskoperator.
 * @see com.nari.opfive.domain.Taskoperator
 * @author Hibernate Tools
 */
public class TaskoperatorHome {

	private static final Log log = LogFactory.getLog(TaskoperatorHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Taskoperator transientInstance) {
		log.debug("persisting Taskoperator instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Taskoperator instance) {
		log.debug("attaching dirty Taskoperator instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Taskoperator instance) {
		log.debug("attaching clean Taskoperator instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Taskoperator persistentInstance) {
		log.debug("deleting Taskoperator instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Taskoperator merge(Taskoperator detachedInstance) {
		log.debug("merging Taskoperator instance");
		try {
			Taskoperator result = (Taskoperator) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Taskoperator findById(int id) {
		log.debug("getting Taskoperator instance with id: " + id);
		try {
			Taskoperator instance = (Taskoperator) sessionFactory.getCurrentSession()
					.get("com.nari.opfive.domain.Taskoperator", id);
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

	public List<Taskoperator> findByExample(Taskoperator instance) {
		log.debug("finding Taskoperator instance by example");
		try {
			List<Taskoperator> results = (List<Taskoperator>) sessionFactory.getCurrentSession()
					.createCriteria("com.nari.opfive.domain.Taskoperator").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
