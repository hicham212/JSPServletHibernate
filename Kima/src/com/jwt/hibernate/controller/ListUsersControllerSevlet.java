package com.jwt.hibernate.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jwt.hibernate.bean.User;
import com.jwt.hibernate.metier.UserService;



public class ListUsersControllerSevlet extends HttpServlet{


	private static final long serialVersionUID = 1L;
	UserService userService = new UserService();


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {			 
			
			List<User> list = userService.getAllUsers();			
			request.setAttribute("data", list);  
			request.getRequestDispatcher("listUsers.jsp").forward(request, response);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
