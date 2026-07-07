package com.anshuman.rest.webservices.restful_web_services.user;

import org.springframework.stereotype.Component;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
	
	//Jpa//Hibernate
	//Data
	
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 0;
	
	static {
		users.add(new User(++userCount,"Rajpal Yadav",LocalDate.now().plusYears(5)));
		users.add(new User(++userCount,"Raj",LocalDate.now().minusYears(0)));
		users.add(new User(++userCount,"Anshuman Swain",LocalDate.now().minusYears(9)));
		users.add(new User(++userCount,"suman",LocalDate.now().minusYears(5)));
		users.add(new User(++userCount,"rahul",LocalDate.now().minusYears(35)));
		users.add(new User(++userCount,"sahil",LocalDate.now().minusYears(23)));
		
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	//Public List<User> findAll(){
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id){
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	public void  deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
		
	}
	
}
