package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public class ServiceImplementation implements IUserSorter {

	private final IUserRepository userRepository;

	public ServiceImplementation(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> sortUsersByUsername(List<User> users) throws Exception {
		return userRepository.sortUsers(users);
	}

}
