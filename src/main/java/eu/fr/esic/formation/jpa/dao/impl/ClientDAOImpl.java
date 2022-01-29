package eu.fr.esic.formation.jpa.dao.impl;

import java.util.List;

import javax.persistence.Query;

import eu.fr.esic.formation.jpa.dao.IClientDAO;
import eu.fr.esic.formation.jpa.entity.Client;

public class ClientDAOImpl extends AbstractEntityImpl<Client> implements IClientDAO{

	public ClientDAOImpl() {
		super(Client.class);
	}

	@SuppressWarnings("unchecked")
	public List<Client> findClientsParSexe(int sexe) {
		String namedQuery = "Client.findClientParSexe";
		Query query = this.getEntityManager().createNamedQuery(namedQuery);
		query.setParameter("paramSexe", sexe);
		List<Client> listeClient = query.getResultList();
		return listeClient;  
	}

}
