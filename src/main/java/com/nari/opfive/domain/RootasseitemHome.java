package com.nari.opfive.domain;
// Generated 2017-8-24 13:04:26 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Rootasseitem.
 * @see com.nari.opfive.domain.Rootasseitem
 * @author Hibernate Tools
 */
@Stateless
public class RootasseitemHome {

	private static final Log log = LogFactory.getLog(RootasseitemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Rootasseitem transientInstance) {
		log.debug("persisting Rootasseitem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Rootasseitem persistentInstance) {
		log.debug("removing Rootasseitem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Rootasseitem merge(Rootasseitem detachedInstance) {
		log.debug("merging Rootasseitem instance");
		try {
			Rootasseitem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Rootasseitem findById(int id) {
		log.debug("getting Rootasseitem instance with id: " + id);
		try {
			Rootasseitem instance = entityManager.find(Rootasseitem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
