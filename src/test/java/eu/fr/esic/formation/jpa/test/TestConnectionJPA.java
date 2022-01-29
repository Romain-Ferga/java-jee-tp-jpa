package eu.fr.esic.formation.jpa.test;

import org.junit.Assert;
import org.junit.Test;

import com.mysql.fabric.xmlrpc.Client;

import eu.fr.esic.formation.jpa.dao.impl.AbstractEntityImpl;

public class TestConnectionJPA {

	@Test
	public void testConnecionJPAOpen(){
		AbstractEntityImpl<Client> clientDAOImpl = new AbstractEntityImpl<Client>(Client.class);
		Assert.assertTrue(clientDAOImpl.isConEMOpen());
	}
}
