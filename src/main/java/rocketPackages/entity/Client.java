package rocketPackages.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String email;

	private String phone;
	
	private boolean ativo=true;
	
	//@Column(unique = true)
	//@CPF(message=" enter with cpf")
	//@NotBlank(message="not empty")
	private String cpf;
	

  
}


