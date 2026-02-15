package rocketPackages.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rocketPackages.entity.User;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

	private Long id;
	private String name;

	public UserDto(User user) {
		id = user.getId();
		name = user.getName();

	}

}