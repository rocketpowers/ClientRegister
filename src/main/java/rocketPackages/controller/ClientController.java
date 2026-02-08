package rocketPackages.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import rocketPackages.entity.Client;
import rocketPackages.service.ClientService;

@RestController
@RequestMapping
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping("/create")
	public Client create(@Valid @RequestBody Client client) {
		return clientService.save(client);

	}

	@GetMapping("/list")
	public List<Client> list() {
		return clientService.list();

	}

	@GetMapping("/{id}")
	public Client findByid(@PathVariable Long id) {
		return clientService.findById(id);
	}

	@PutMapping("/{id}")
	public Client update(@PathVariable Long id, @Valid @RequestBody Client client) {
		return clientService.update(id, client);
		

	}

	@DeleteMapping("/{id}")
	public void del(@PathVariable Long id) {
		clientService.del(id);
	}

}
