package eu.fr.esic.formation.jpa.dao;

import java.util.List;

import eu.fr.esic.formation.jpa.entity.Client;

public interface IClientDAO extends IAbstractEntityDAO<Client>{

	/**
	 * Recupère les clients par le sexe
	 * @param sexe : Entier representant le sexe (1= Homme, 2 = Femme)
	 * @return Liste de Clients correspondant au sexe
	 */
	public List<Client> findClientsParSexe(int sexe); 
}
