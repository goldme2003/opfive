package com.nari.opfive.domain;
// Generated 2017-8-23 16:23:19 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Judgementitem.
 * @see com.nari.opfive.domain.Judgementitem
 * @author Hibernate Tools
 */
@Stateless
public class JudgementitemHome {

	private static final Log log = LogFactory.getLog(JudgementitemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Judgementitem transientInstance) {
		log.debug("persisting Judgementitem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Judgementitem persistentInstance) {
		log.debug("removing Judgementitem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Judgementitem merge(Judgementitem detachedInstance) {
		log.debug("merging Judgementitem instance");
		try {
			Judgementitem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Judgementitem findById(int id) {
		log.debug("getting Judgementitem instance with id: " + id);
		try {
			Judgementitem instance = entityManager.find(Judgementitem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
