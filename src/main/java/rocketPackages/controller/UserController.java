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
import rocketPackages.entity.User;
import rocketPackages.service.UserService;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	private UserService clientService;

	@PostMapping("/create")
	public User create(@Valid @RequestBody User client) {
		return clientService.save(client);

	}

	@GetMapping("/list")
	public List<User> list() {
		return clientService.list();

	}

	@GetMapping("/{id}")
	public User findByid(@PathVariable Long id) {
		return clientService.findById(id);
	}

	@PutMapping("/{id}")
	public User update(@PathVariable Long id, @Valid @RequestBody User client) {
		return clientService.update(id, client);

	}

	@DeleteMapping("/{id}")
	public void del(@PathVariable Long id) {
		clientService.del(id);
	}

}
