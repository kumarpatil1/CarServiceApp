package com.carservice.dao;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

import javax.persistence.Id;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * The Class BaseDaoImpl.
 * 
 * @author KUMAR
 */
@Repository
public class BaseDaoImpl implements BaseDao {

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;

	
	/* (non-Javadoc)
	 * @see com.carservice.dao.BaseDao#save(java.io.Serializable)
	 */
	public <T extends Serializable> void save(final T iEntity) {
		sessionFactory.getCurrentSession().save(iEntity);

	}

	
	/* (non-Javadoc)
	 * @see com.carservice.dao.BaseDao#merge(java.io.Serializable)
	 */
	public <T extends Serializable> Serializable merge(Serializable iEntity) {
		Serializable employeeMergeFromDB = (Serializable) sessionFactory.getCurrentSession().merge(iEntity);
		return employeeMergeFromDB;
	}

	
	/* (non-Javadoc)
	 * @see com.carservice.dao.BaseDao#fetchAll(java.lang.Class)
	 */
	public <T extends Serializable> List<T> fetchAll(Class<T> iEntityClass) {
		return sessionFactory.getCurrentSession().createQuery("from " + iEntityClass).list();
	}


	/* (non-Javadoc)
	 * @see com.carservice.dao.BaseDao#fetchEntityById(java.lang.Class, java.io.Serializable)
	 */
	public <T extends Serializable> T fetchEntityById(Class<T> iEntity,	Serializable iIds) {
		Object employeeIdFromDB = sessionFactory.getCurrentSession().get(iEntity, iIds);
		return iEntity.cast(employeeIdFromDB);
	}

	
	/* (non-Javadoc)
	 * @see com.carservice.dao.BaseDao#deleteEntitiesByIds(java.lang.Class, java.util.List)
	 */
	public <T extends Serializable> void deleteEntitiesByIds(Class<? extends Serializable> iEntityClass, List<? extends Serializable> iIds) {
		// TODO deleteEntitiesByIds method stub

	}

	/*
	 * @SuppressWarnings("unused") private Session getSession() { return
	 * sessionFactory.getCurrentSession(); }
	 */

	/**
	 * Gets the field.
	 * 
	 * @param iEntityName
	 *            the i entity name
	 * @return the field
	 */
	@SuppressWarnings("unused")
	private Field getIdField(Serializable iEntityName) {
		Field field = null;
		Field[] declaredFields = iEntityName.getClass().getDeclaredFields();
		System.out.println(declaredFields);
		for (Field fields : declaredFields) {

			if (iEntityName.getClass().getAnnotation(Id.class) != null) {
				field = fields;
				break;
			}

		}
		return field;
	}
}
