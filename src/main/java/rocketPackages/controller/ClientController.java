package rocketPackages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import rocketPackages.entity.Client;
import rocketPackages.service.ClientService;

public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	
	
	public Client create(@RequestBody Client client) {
		
		
	}

}
