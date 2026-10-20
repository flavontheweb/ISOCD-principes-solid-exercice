package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public class ServiceImplementation implements IUserSorter {

	public List<User> sortUsersByUsername(List<User> users) throws Exception {
		return UserRepository.sortUsers(users);
	}

}
