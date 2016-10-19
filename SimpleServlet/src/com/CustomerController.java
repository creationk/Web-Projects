package com;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(CustomerController.class.getName());

	public CustomerController() {
		super();
		log.info("In constructor class");
	}

	public void init(ServletConfig config) throws ServletException {
		log.info("Inside server initialisation");
	}

	public void destroy() {
		log.info("In destroy");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.info("In do get");
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.info("In do post");
		String customerName = request.getParameter("Name");
		response.getWriter().println("Name = " + customerName);
	}

}
