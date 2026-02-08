package rocketPackages.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import rocketPackages.entity.Client;
import rocketPackages.repository.ClientRepository;

public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	//save
	public Client save(Client client) {
		if (clientRepository.existsByCpf(client.getCpf())) {
			throw new RuntimeException("cpf already registered");
		}
		return clientRepository.save(client);
	}
	
	//list all
	public List<Client> list() {
		return clientRepository.findAll();
	}

	//list by id
	public Client findById(Long id) {
		return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("client not found"));
	}
	
	//dell
	public void del(Long id) {
		clientRepository.deleteById(id);
	}
	
}
