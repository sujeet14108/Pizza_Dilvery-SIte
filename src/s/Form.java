package s;
//@Sujeet 2014108
// Nickey 2014066
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int i=103;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		// i=0;
	}

    /**
     * Default constructor. 
     */
    public Form() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s=request.getSession(true);
	
		s.setAttribute("id",i);
		System.out.println("ddddddd");
	
		PrintWriter pw = response.getWriter();
		pw.println("<h1>WELCOME\n</h1><br>");
	
		//System.out.println(i);
	
		String str=request.getParameter("order");
		
	    if(str.equals("NewOrder"))
	    {
	    	//String site="menu.html";
	   	i++;
	    	pw.println("\n<br>YOUR ORDER ID IS:");
	    pw.println(i-1);	  try
	    {
	    	File f1=new File("C:\\Users\\sujeet14108\\workspace3\\LAB\\src\\s//detail\\"+(i-1)+".txt");
	    //	 FileWriter bw=new FileWriter("d://(i-1).txt");
	    BufferedWriter bw= new BufferedWriter(new FileWriter(f1));
	       BufferedReader br = new BufferedReader(new FileReader(f1));
	    	 // FileReader br=new FileReader("abc.txt");  
	 		 
	     bw.write(i-1+",");
	     bw.close();
		 br.close(); 
     
    }
    catch(Exception e)
    {
     System.out.println(e);	
    }
	
	    
	    	pw.println("\n");
		
	    	pw.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");	    
pw.println(" <html>");
pw.println("<head>");
pw.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
pw.println("<title>New Order</title></head><body>");

pw.println("<form action=\"Form3\" method=\"post\" required>");
pw.println("<br><br><input type=\"checkbox\" name=\"PIZZA1\" value=\"pizza1\">ONION");
pw.println("<input type=\"checkbox\" name=\"S1\" value=\"small1\" >SMALL");
		pw.println("<input type=\"text\" name=\"qtyS1\" value=\"1\" size=\"1\">");
				pw.println("<input type=\"checkbox\" name=\"M1\" value=\"medium1\">MEDIUM");
						pw.println("<input type=\"text\" name=\"qtyM1\" value=\"1\" size=\"1\">");
						pw.println("<input type=\"checkbox\" name=\"L1\" value=\"large1\">LARGE");
						pw.println("<input type=\"text\" name=\"qtyL1\" value=\"1\" size=\"1\">"+"<br>");

						pw.println("<input type=\"checkbox\" name=\"PIZZA2\" value=\"pizza2\">Simple");
						pw.println("<input type=\"checkbox\" name=\"S2\" value=\"small2\">SMALL");
						pw.println("<input type=\"text\" name=\"qtyS2\" value=\"1\" size=\"1\">");
								pw.println("<input type=\"checkbox\" name=\"M2\" value=\"medium2\">MEDIUM");
										pw.println("<input type=\"text\" name=\"qtyM2\" value=\"1\" size=\"1\">");
												pw.println("<input type=\"checkbox\" name=\"L2\" value=\"large2\">LARGE");
														pw.println("<input type=\"text\" name=\"qtyL2\" value=\"1\" size=\"1\">");
														pw.println("<br>");


														pw.println("<input type=\"checkbox\" name=\"PIZZA3\" value=\"pizza3\">Cheese");
																pw.println("<input type=\"checkbox\" name=\"S3\" value=\"small3\">SMALL");
																		pw.println("<input type=\"text\" name=\"qtyS3\" value=\"1\" size=\"1\">");
																				pw.println("<input type=\"checkbox\" name=\"M3\" value=\"medium3\">MEDIUM");
																						pw.println("<input type=\"text\" name=\"qtyM3\" value=\"1\" size=\"1\">");
																								pw.println("<input type=\"checkbox\" name=\"L3\" value=\"large3\">LARGE");
																										pw.println("<input type=\"text\" name=\"qtyL3\" value=\"1\" size=\"1\"><br>");

																												pw.println("<input type=\"checkbox\" name=\"PIZZA4\" value=\"pizza4\">Tomato");
																														pw.println("<input type=\"checkbox\" name=\"S4\" value=\"small4\">SMALL");
																																pw.println("<input type=\"text\" name=\"qtyS4\" value=\"1\" size=\"1\">");
																																		pw.println("<input type=\"checkbox\" name=\"M4\" value=\"medium4\">MEDIUM");
pw.println("<input type=\"text\" name=\"qtyM4\" value=\"1\" size=\"1\">");
pw.println("<input type=\"checkbox\" name=\"L4\" value=\"large4\">LARGE");
		pw.println("<input type=\"text\" name=\"qtyL4\" value=\"1\" size=\"1\">");
		pw.println("<br><br><br>");
				pw.println("<input type=\"submit\" name=\"submit\" value=\"SUBMIT\">");

  pw.println("</form></body></html>");
		
		
		
		
	    }
	    else if(str.equals("TrackOrder"))
	    {
	    	pw.println("<h1>");
	    	
	    	pw.println("<html><head>");


		    pw.println("<title>Track order</title></head><body>");
		    pw.println("<form action='Form2' method=\"get\">");
		    pw.println("Please enter your ID      :<input type=\"text\" name=\"Name\" required><br><br>");
		    
		    pw.println("<input type='submit' name='submit' value='SUBMIT'>");
		    pw.println("</form> </body></html>");
		    
	    }
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.sendRedirect("Start.html");
	}

}
