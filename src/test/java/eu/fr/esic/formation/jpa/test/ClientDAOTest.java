package eu.fr.esic.formation.jpa.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import eu.fr.esic.formation.jpa.dao.IClientDAO;
import eu.fr.esic.formation.jpa.dao.impl.ClientDAOImpl;
import eu.fr.esic.formation.jpa.entity.Client;
import eu.fr.esic.formation.jpa.entity.Commande;
import eu.fr.esic.formation.jpa.entity.Produit;

public class ClientDAOTest {

	IClientDAO clientDAO  = new ClientDAOImpl();
	@Test
	public void testRecupAll(){
		List<Client> listeClient = this.clientDAO.findAll();
		for (Client client : listeClient) {
			System.out.println(client);
		}
		Assert.assertTrue(listeClient.size() == 13);
	}
	@Test
	public void testRecupClientById(){
		//TODO : Recuperez ici le client d'identifiant 1 
		Client client = null;
		Assert.assertNotNull(client);
		Assert.assertEquals(client.getNom(), "ZOME");
		System.out.println(client);
		//TODO : Recupere ses commandes
		List<Commande> listeCommandeClient = null;
		Assert.assertTrue(listeCommandeClient.size() == 2);
	}
	
	@Test
	public void testRecupClientParIdProduit(){
		Client clientDuProduit = null;
		//TODO : Recuperer le client ayant acheté le produit d'identifiant 4
		Assert.assertNotNull(clientDuProduit);
		System.out.println(clientDuProduit);
	}
	
	
	@Test
	public void testRecupClientParSexe(){
		List<Client> listeClient = this.clientDAO.findClientsParSexe(1);
		for (Client client : listeClient) {
			System.out.println(client);
		}
		Assert.assertTrue(listeClient.size() == 10);
	}
}
