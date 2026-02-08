package rocketPackages.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rocketPackages.entity.Client;
import rocketPackages.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	// save
	public Client save(Client client) {
		if (clientRepository.existsByCpf(client.getCpf())) {
			throw new RuntimeException("cpf already registered");
		}
		return clientRepository.save(client);
	}

	// list all
	public List<Client> list() {
		return clientRepository.findAll();
	}

	// list by id
	public Client findById(Long id) {
		return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("client not found"));
	}

	// update
	public Client update(Long id, Client dateClient) {
		Client client = clientRepository.findById(id).get();
		BeanUtils.copyProperties(dateClient, client, "id");
		return clientRepository.save(client);

	}

	// dell
	public void del(Long id) {
		clientRepository.deleteById(id);
	}

}
