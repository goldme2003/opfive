package com.nari.opfive.domain;
// Generated 2017-8-23 16:23:19 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Judgementsubitem.
 * @see com.nari.opfive.domain.Judgementsubitem
 * @author Hibernate Tools
 */
@Stateless
public class JudgementsubitemHome {

	private static final Log log = LogFactory.getLog(JudgementsubitemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Judgementsubitem transientInstance) {
		log.debug("persisting Judgementsubitem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Judgementsubitem persistentInstance) {
		log.debug("removing Judgementsubitem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Judgementsubitem merge(Judgementsubitem detachedInstance) {
		log.debug("merging Judgementsubitem instance");
		try {
			Judgementsubitem result = entityManager.merge(detachedInstance);
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
			Judgementsubitem instance = entityManager.find(Judgementsubitem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
