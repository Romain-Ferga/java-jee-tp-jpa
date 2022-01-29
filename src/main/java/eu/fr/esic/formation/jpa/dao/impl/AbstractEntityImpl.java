package eu.fr.esic.formation.jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.fr.esic.formation.jpa.dao.IAbstractEntityDAO;

public class AbstractEntityImpl<E> implements IAbstractEntityDAO<E>{

	private EntityManager entityManager;
	// Create an EntityManagerFactory when you start the application.
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("tps-jpa");
    final Class<E> typeParameterClass;

    
	public AbstractEntityImpl(Class<E> typeParameterClass){
		this.entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		this.typeParameterClass = typeParameterClass;
	}
	 
	public E createUpdateEntity(E entity) { 
		// Get a transaction
		EntityTransaction transaction = null;
		try {
			transaction = this.entityManager.getTransaction();
            // Begin the transaction
            transaction.begin();
            this.entityManager.persist(entity);
            // Commit the transaction
            transaction.commit();
        } catch (Exception ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            ex.printStackTrace();
        } 
		//Retourne l'entité qui a été normalement completée par l'id
		return entity;
	}

	public E getEnityById(Integer idEntity) {
		return this.entityManager.find(this.typeParameterClass, idEntity);
	}
 
	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		String namedQuery = this.typeParameterClass.getSimpleName().toString()+".findAll";
		return this.entityManager.createNamedQuery(namedQuery).getResultList();
	}

	public void deleteById(Integer idToDelete) {
		// Get a transaction
				EntityTransaction transaction = null;
				try {
					transaction = this.entityManager.getTransaction();
		            // Begin the transaction
		            transaction.begin();
		            E entityToDelete = this.getEnityById(idToDelete);
		            this.entityManager.remove(entityToDelete);
		            // Commit the transaction
		            transaction.commit();
		        } catch (Exception ex) {
		            // If there are any exceptions, roll back the changes
		            if (transaction != null) {
		                transaction.rollback();
		            }
		            // Print the Exception
		            ex.printStackTrace();
		        }
	}

	public boolean isConEMOpen(){
		return this.entityManager != null && this.entityManager.isOpen();
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
