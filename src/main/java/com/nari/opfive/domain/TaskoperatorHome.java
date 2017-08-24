package com.nari.opfive.domain;
// Generated 2017-8-24 13:04:26 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Taskoperator.
 * @see com.nari.opfive.domain.Taskoperator
 * @author Hibernate Tools
 */
@Stateless
public class TaskoperatorHome {

	private static final Log log = LogFactory.getLog(TaskoperatorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Taskoperator transientInstance) {
		log.debug("persisting Taskoperator instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Taskoperator persistentInstance) {
		log.debug("removing Taskoperator instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Taskoperator merge(Taskoperator detachedInstance) {
		log.debug("merging Taskoperator instance");
		try {
			Taskoperator result = entityManager.merge(detachedInstance);
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
			Taskoperator instance = entityManager.find(Taskoperator.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
