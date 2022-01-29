package eu.fr.esic.formation.jpa.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import eu.fr.esic.formation.jpa.dao.ICommandeDAO;
import eu.fr.esic.formation.jpa.dao.impl.CommandeDAOImpl;
import eu.fr.esic.formation.jpa.entity.Commande;
import eu.fr.esic.formation.jpa.entity.Produit;

public class CommandeDAOTest {

	ICommandeDAO commandeDAO  = new CommandeDAOImpl();;
	@Test
	public void testRecupAll(){
		List<Commande> listeCommande = this.commandeDAO.findAll();
		for (Commande commande : listeCommande) {
			System.out.println(commande);
		}
		Assert.assertTrue(listeCommande.size() == 13);
	}
	@Test
	public void testRecupCommandeById(){
		//TODO : Recuperer la commande via le DAO correspondant
		Commande commande = null;
		Assert.assertNotNull(commande);
		Assert.assertEquals(commande.getNumCommande(), "CMD_05");
		System.out.println(commande);
		//TODO : Recuperer les produits correspondants
		List<Produit> listeProduit = null;
		Assert.assertTrue(listeProduit.size() == 9);
	}
	
	
	@Test
	public void testSupprimerCommande(){
		Commande commande = this.commandeDAO.getEnityById(21);
		Assert.assertNotNull(commande);
		System.out.println(commande);
		this.commandeDAO.deleteById(21);
	}
}
