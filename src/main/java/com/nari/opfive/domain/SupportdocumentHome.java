package com.nari.opfive.domain;
// Generated 2017-8-24 13:04:26 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Supportdocument.
 * @see com.nari.opfive.domain.Supportdocument
 * @author Hibernate Tools
 */
@Stateless
public class SupportdocumentHome {

	private static final Log log = LogFactory.getLog(SupportdocumentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Supportdocument transientInstance) {
		log.debug("persisting Supportdocument instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Supportdocument persistentInstance) {
		log.debug("removing Supportdocument instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Supportdocument merge(Supportdocument detachedInstance) {
		log.debug("merging Supportdocument instance");
		try {
			Supportdocument result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Supportdocument findById(int id) {
		log.debug("getting Supportdocument instance with id: " + id);
		try {
			Supportdocument instance = entityManager.find(Supportdocument.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
