package eu.fr.esic.formation.jpa.dao.impl;

import eu.fr.esic.formation.jpa.dao.ICommandeDAO;
import eu.fr.esic.formation.jpa.entity.Commande;

public class CommandeDAOImpl extends AbstractEntityImpl<Commande> implements ICommandeDAO{

	public CommandeDAOImpl() {
		super(Commande.class);
	}
}
