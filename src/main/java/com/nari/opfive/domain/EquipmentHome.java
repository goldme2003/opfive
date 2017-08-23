package com.nari.opfive.domain;
// Generated 2017-8-23 16:23:19 by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Equipment.
 * @see com.nari.opfive.domain.Equipment
 * @author Hibernate Tools
 */
@Stateless
public class EquipmentHome {

	private static final Log log = LogFactory.getLog(EquipmentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Equipment transientInstance) {
		log.debug("persisting Equipment instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Equipment persistentInstance) {
		log.debug("removing Equipment instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Equipment merge(Equipment detachedInstance) {
		log.debug("merging Equipment instance");
		try {
			Equipment result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Equipment findById(int id) {
		log.debug("getting Equipment instance with id: " + id);
		try {
			Equipment instance = entityManager.find(Equipment.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}