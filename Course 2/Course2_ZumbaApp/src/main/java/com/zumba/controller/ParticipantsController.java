package com.zumba.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.zumba.bean.Participants;
import com.zumba.service.ParticipantsService;


@WebServlet("/ParticipantsController")
public class ParticipantsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ParticipantsController() {
        super();
        
    }

	ParticipantsService ps = new ParticipantsService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Participants> listOfParticipants = ps.viewAllParticipantsDetails();
		
		
		HttpSession hs = request.getSession();
		hs.setAttribute("participants", listOfParticipants);
		response.sendRedirect("viewParticipants.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int bid = Integer.parseInt(request.getParameter("bid"));
		
		Participants pa = new Participants();
		pa.setName(name);
		pa.setAge(age);
		pa.setBid(bid);
		
		ps.addParticipant(pa);
		response.sendRedirect("ParticipantsController");
	}

}
