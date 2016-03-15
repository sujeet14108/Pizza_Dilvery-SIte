package s;
//@Sujeet 2014108
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Form4
 */
@WebServlet("/Form4")
public class Form4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		HttpSession s=request.getSession(true);
		System.out.println("dddddddddddddddddddddddddddddddd");
			int a=(Integer)s.getAttribute("id");
			PrintWriter pw = response.getWriter();
		
		
		
		
		String str1;
	    try
	    {
	    	File f1=new File("C:\\Users\\sujeet14108\\workspace3\\LAB\\src\\s//detail//"+a+".txt");
	         BufferedReader br = new BufferedReader(new FileReader(f1));
	 		 BufferedWriter bw= new BufferedWriter(new FileWriter(f1,true));
	     str1=request.getParameter("submit");
	     if(str1.equals("SUBMIT"))
	     {  
	    	 if(request.getParameter("Name")!=null)
	    		 bw.write(request.getParameter("Name")+",");
	    	 else
	    		 bw.write(",");
	    	 if(request.getParameter("Phone")!=null)
	    		 bw.write(request.getParameter("Phone")+",");
	    	 else
	    		 bw.write(",");
	    	 if(request.getParameter("Address")!=null)
	    		 bw.write(request.getParameter("Address")+",1");
	    	 else
	    		 bw.write(",1");
	    	  bw.newLine();
	    	 
	    	 
	    	 
	    	 bw.close();
			 br.close(); 
	     }
	    }
	    catch(Exception e)
	    {
	     //System.out.println(e);	
	    }
		
		
		
		pw.println("YOUR ORDER ID IS:");
		
		pw.println((int)a);
	    	
  		pw.println("<html><head>");
pw.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
pw.println("<title>Order confirmed</title></head><body>");
pw.println("<form action=\"Form\" method=\"post\" >");


pw.println("<input type='submit' name='submit' value='GO TO HOMEPAGE'><br><br>");
pw.println("</body></html>");
pw.println("Your order is placed");


	}

}
