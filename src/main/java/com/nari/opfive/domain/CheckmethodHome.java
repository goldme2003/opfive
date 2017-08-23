package com.nari.opfive.domain;
// Generated 2017-8-23 16:23:19 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Checkmethod.
 * @see com.nari.opfive.domain.Checkmethod
 * @author Hibernate Tools
 */
@Stateless
public class CheckmethodHome {

	private static final Log log = LogFactory.getLog(CheckmethodHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Checkmethod transientInstance) {
		log.debug("persisting Checkmethod instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Checkmethod persistentInstance) {
		log.debug("removing Checkmethod instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Checkmethod merge(Checkmethod detachedInstance) {
		log.debug("merging Checkmethod instance");
		try {
			Checkmethod result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Checkmethod findById(int id) {
		log.debug("getting Checkmethod instance with id: " + id);
		try {
			Checkmethod instance = entityManager.find(Checkmethod.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
