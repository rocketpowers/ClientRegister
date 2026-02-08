package rocketPackages.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import rocketPackages.entity.Client;
import rocketPackages.service.ClientService;

public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping
	public Client create(@Valid @RequestBody Client client) {
		return clientService.save(client);

	}

	@GetMapping
	public List<Client> list() {
		return clientService.list();

	}

	@GetMapping
	public Client findByid(@PathVariable Long id) {
		return clientService.findById(id);
	}

	public void del(@PathVariable Long id) {
		clientService.del(id);
	}
	
	

}
