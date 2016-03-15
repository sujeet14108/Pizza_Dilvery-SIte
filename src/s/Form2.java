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

/**
 * Servlet implementation class Form2
 */
@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1;
	    str1=request.getParameter("Name");
	    
	  //  System.out.println("fffffffffffffff");
	    try
	    {		PrintWriter pw = response.getWriter();
	    	File f1=new File("C:\\Users\\sujeet14108\\workspace3\\LAB\\src\\s//detail//"+str1+".txt");
	         BufferedReader br = new BufferedReader(new FileReader(f1));
	 		 BufferedWriter bw= new BufferedWriter(new FileWriter(f1,true));
	     str1=request.getParameter("Name");
	     String s;
	     System.out.println("fffffffffffffff");
	     
			 
	     s=br.readLine();
	     
	     String d = ",";
		  /* given string will be split by the argument delimiter provided. */
			String[]  t = s.split(d);
			System.out.println(t[0]);
			pw.println("Status for your order id:    ");
			pw.println("\n");
			pw.println(str1+"<br><h1>");
			if(t[0].equals(str1))
			{
				System.out.println(t[16]);
				if("1".equals(t[16]))
					pw.println("OrderPlaced");
				else if("10".equals(t[16]))
						{
					pw.println("Preparing");
						}
				else if("100".equals(t[16]))
				{
			pw.println("Baking");
				}
				else if("1000".equals(t[16]))
				{
			pw.println("Quality check");
				}
				else if("10000".equals(t[16]))
				{
			pw.println("Out for Delivery");
				}
				
				else 
				{
			pw.println("Delivered");
				}
				
				
			    pw.println("<form action=\"Form\" method=\"post\" >");


			    pw.println("<input type='submit' name='submit' value='GO TO HOMEPAGE'><br><br>");		
			}
	     System.out.println(s);
	     bw.close();
			 br.close(); 
	     
	    
	    }
	    catch(Exception e)
	    {
	     //System.out.println(e);	
	    }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
