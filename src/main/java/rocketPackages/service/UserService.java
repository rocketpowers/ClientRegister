package rocketPackages.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rocketPackages.entity.User;
import rocketPackages.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		if (userRepository.existsByCpf(user.getCpf())) {
			throw new RuntimeException("cpf alrady registered");
		}
		return userRepository.save(user);
	}

	public List<User> list() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("client not found"));
	}

	public User update(Long id, User dateClient) {
		User client = userRepository.findById(id).get();
		BeanUtils.copyProperties(dateClient, client, "id");
		return userRepository.save(client);

	}

	public void del(Long id) {
		userRepository.deleteById(id);
	}

}
