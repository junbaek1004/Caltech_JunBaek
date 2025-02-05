package com.zumba.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zumba.bean.Batch;
import com.zumba.service.BatchService;


@WebServlet("/BatchController")
public class BatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BatchController() {
        super();
        
    }

    BatchService bs = new BatchService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Batch> listOfBatch = bs.viewAllBatchDetails();
		HttpSession hs = request.getSession();
		hs.setAttribute("batches", listOfBatch);
		response.sendRedirect("viewBatch.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String typeOfBatch = request.getParameter("typeOfBatch");
		String time = request.getParameter("time");
		int bid = Integer.parseInt(request.getParameter("bid"));
		
		Batch ba = new Batch();
		ba.setTypeofbatch(typeOfBatch);
		ba.setTime(time);
		ba.setBid(bid);
		
		bs.addBatch(ba);
		response.sendRedirect("BatchController");
	}

}
