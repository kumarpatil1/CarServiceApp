/**
 * 
 */
package com.carservice.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author KUMAR
 * 
 */
public interface BaseDao {

	/**
	 * save or update given entity
	 * 
	 * @param iEntity
	 */
	public <T extends Serializable> void save(final T iEntity);

	/**
	 * update given entity using merge() method
	 * 
	 * @param iEntity
	 * @return
	 */
	public <T extends Serializable> Serializable merge(final Serializable iEntity);

	/**
	 * fetchAll return all entity
	 * 
	 * @param iEntityClass
	 * @return
	 */
	public <T extends Serializable> List<T> fetchAll(Class<T> iEntityClass);

	/**
	 * fetchEntityById return list of entity based on particular id
	 * 
	 * @param iEntity
	 * @return
	 */
	public <T extends Serializable> T fetchEntityById(Class<T> iEntity, Serializable iIds);


	/**
	 * deleteEntitiesByIds will delete an entity based on particular id
	 * 
	 * @param iEntityClass
	 * @param iIds
	 */
	public <T extends Serializable> void deleteEntitiesByIds(
			Class<? extends Serializable> iEntityClass,
			List<? extends Serializable> iIds);

}
