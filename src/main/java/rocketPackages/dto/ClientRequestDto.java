package rocketPackages.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;

@Getter
public class ClientRequestDto {
	
	
	private String name;
	
	@Email
	private String email;
	private String phone;
	

}
