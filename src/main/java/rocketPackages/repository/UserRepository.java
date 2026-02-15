package rocketPackages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rocketPackages.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	boolean existsById(long id);
	
	boolean existsByCpf(String cpf);
	
	

}
