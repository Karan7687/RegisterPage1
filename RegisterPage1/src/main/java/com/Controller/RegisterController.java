package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Model.*;
import com.Dao.*;

import java.util.*;
/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			PrintWriter out=response.getWriter();
			
			int roll_No=Integer.parseInt(request.getParameter("roll_No"));
			String stude_Name=request.getParameter("stude_Name");
			String user_Name=request.getParameter("user_Name");
			String pass=request.getParameter("pass");
			
			Model_Student m=new Model_Student(roll_No, stude_Name, user_Name, pass);
			
			List<Model_Student>mlist=new ArrayList<Model_Student>();
			
			mlist.add(m);
			
			implementDao dao=new implementDao();
			int x=dao.saveRecord(mlist);
				
			if(x>0) {
					
				out.println(" Success");
			}
			else {
					
				out.println("Failed");
			}
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
