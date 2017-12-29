package com.jwt.hibernate.metier;

import java.util.List;

import com.jwt.hibernate.bean.User;
import com.jwt.hibernate.dao.UserDAO; 

public class UserService {


	UserDAO userDAO = new UserDAO();


	public void ajouterUser(String userName, String password1,String password2, String email, String phone, String city) throws Exception {

//
//
//		if(userName!=null) {
//
//		}else {
//			throw new Exception();
//		}
//
//		if(password1!=null) {
//
//		}else {
//			throw new Exception();
//		}
//
//
//		if(password2!=null) {
//
//		}else {
//			throw new Exception();
//		}
//
//		if(!password2.equalsIgnoreCase(password1)) {
//			throw new Exception();
//		}
//
//		if(email!=null) {
//
//		}else {
//			throw new Exception();
//		}
//
//
//		if(phone!=null) {
//
//		}else {
//			throw new Exception();
//		}

		User user = new User(userName, password1, email, phone, city);
		userDAO.addUserDetails(user);
	}


	public User consultUserDetaills(Long id) {
		return userDAO.consultUserDetaills(id);
	}

	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

}
