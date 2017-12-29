package com.jwt.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jwt.hibernate.metier.UserService;

public class UserControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	UserService userService = new UserService();



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password1 = request.getParameter("password1");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String password2 = request.getParameter("password2"); 

		 

		try {			 
			userService.ajouterUser(userName, password1, password2, email, phone, city);
			response.sendRedirect("list");	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

}
