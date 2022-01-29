package eu.fr.esic.formation.jpa.dao;

import java.util.List;

public interface IAbstractEntityDAO<E> {

	public E createUpdateEntity(E entity);
	public E getEnityById(Integer idEntity);
	public List<E> findAll();
	public void deleteById(Integer idToDelete);
}
