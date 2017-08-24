package com.nari.opfive.domain;
// Generated 2017-8-24 13:04:26 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Task.
 * @see com.nari.opfive.domain.Task
 * @author Hibernate Tools
 */
@Stateless
public class TaskHome {

	private static final Log log = LogFactory.getLog(TaskHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Task transientInstance) {
		log.debug("persisting Task instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Task persistentInstance) {
		log.debug("removing Task instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Task merge(Task detachedInstance) {
		log.debug("merging Task instance");
		try {
			Task result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Task findById(int id) {
		log.debug("getting Task instance with id: " + id);
		try {
			Task instance = entityManager.find(Task.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
