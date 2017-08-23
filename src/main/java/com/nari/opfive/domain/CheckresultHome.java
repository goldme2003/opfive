package com.nari.opfive.domain;
// Generated 2017-8-23 16:23:19 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Checkresult.
 * @see com.nari.opfive.domain.Checkresult
 * @author Hibernate Tools
 */
@Stateless
public class CheckresultHome {

	private static final Log log = LogFactory.getLog(CheckresultHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Checkresult transientInstance) {
		log.debug("persisting Checkresult instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Checkresult persistentInstance) {
		log.debug("removing Checkresult instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Checkresult merge(Checkresult detachedInstance) {
		log.debug("merging Checkresult instance");
		try {
			Checkresult result = entityManager.merge(detachedInstance);
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
			Checkresult instance = entityManager.find(Checkresult.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
