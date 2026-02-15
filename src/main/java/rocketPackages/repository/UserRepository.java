package rocketPackages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rocketPackages.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
	boolean existsById(long id);
	
	boolean existsByCpf(String cpf);
	
	

}
