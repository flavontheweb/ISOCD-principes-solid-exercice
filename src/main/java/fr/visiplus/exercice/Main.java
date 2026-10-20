package fr.visiplus.exercice;

import java.util.ArrayList;
import java.util.List;

import fr.visiplus.exercice.service.IUserSorter;
import fr.visiplus.exercice.service.ServiceImplementation;
import fr.visiplus.exercice.service.UserRepository;

public class Main {

	public static void main(String[] args) throws Exception {

		IUserSorter s = new ServiceImplementation(new UserRepository());
		
		List<User> list = new ArrayList<User>();
		list.add(new User("albert", "martin", "martina", "noidea"));
		list.add(new User("gerard", "charles", "charlesg", "idea"));

		s.sortUsersByUsername(list).forEach(System.out::println);

	}

}
