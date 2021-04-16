package de.dc.emf.contact.server;

import java.sql.SQLException;

import org.h2.tools.Server;

public class H2Server {

	public static void main(String[] args) throws SQLException {
		Server h2Server = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082");
		Server server = h2Server.start();
		System.out.println(server.getURL());
	}
}
