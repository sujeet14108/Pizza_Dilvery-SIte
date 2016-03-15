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
 * Servlet implementation class Form3
 */
@WebServlet("/Form3")
public class Form3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form3() {
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
	
		int a=(Integer)s.getAttribute("id");
		PrintWriter pw = response.getWriter();
	
	//	pw.println(a);
		String str1;
	    try
	    {
	    	File f1=new File("C:\\Users\\sujeet14108\\workspace3\\LAB\\src\\s//detail//"+a+".txt");
	         BufferedReader br = new BufferedReader(new FileReader(f1));
	 		 BufferedWriter bw= new BufferedWriter(new FileWriter(f1,true));
	     str1=request.getParameter("submit");
	     if(str1.equals("SUBMIT"))
	     {  
	    	 
	    	   
	    	 
	    		
	    		//PIZZA 1 
	    	 if(request.getParameter("PIZZA1")!=null)
	      	  {
	   			if(request.getParameter("S1")!=null)
	   			{ //pw.println(request.getParameter("qtyS1"));
	   			 bw.write(request.getParameter("qtyS1"));
	   			 bw.write(",");
	   			}
	   			else
	   			{
	   			 bw.write("0");
	   			 bw.write(",");
	   			}
	   			
	   		    if(request.getParameter("M1")!=null)
	   			{//pw.println(request.getParameter("qtyM1"));
	   		    	bw.write(request.getParameter("qtyM1"));
	   			 bw.write(",");
	   			}
	   		    else
	   			{
	   			 bw.write("0");
	   			 bw.write(",");
	   			}
	      	  
	   		    if(request.getParameter("L1")!=null)
	   			{
	   		    	bw.write(request.getParameter("qtyL2"));
	   			 bw.write(",");				
	   			}
	   		    else
	   			{
	   			 bw.write("0");
	   			 bw.write(",");
	   			}
	   		   
	   	  }
	    	 else
	    	 {
	    		 bw.write("0");
	    		 bw.write(",");
	   			 bw.write("0");
	   			 bw.write(",");
	   			 bw.write("0");
	   			 bw.write(",");
	    		 // End OF PIZZA 1
	    	 }
	   	  	  
	  
	                                                        //PIZZA 2
	       if(request.getParameter("PIZZA2")!=null)
	        {
			if(request.getParameter("S2")!=null)
			{
			 bw.write(request.getParameter("qtyS2"));
			 bw.write(",");
			}
			else
			{
			 bw.write("0");
			 bw.write(",");;
			}
			
		    if(request.getParameter("M2")!=null)
			{
		    	bw.write(request.getParameter("qtyM2"));
		   	 bw.write(",");
			}
		    else
			{
			 bw.write("0");
			 bw.write(",");
			}
		    
		    if(request.getParameter("L2")!=null)
			{
		    	bw.write(request.getParameter("qtyL2"));
		   	 bw.write(",");			
			}
		    else
			{
			 bw.write("0");
			 bw.write(",");
			}    	
	    }
	       else
	    	 {
	    		 bw.write("0");
	   			 bw.write(",");
	   			 bw.write("0");
	   			 bw.write(",");
	   			 bw.write("0");
	   			 bw.write(",");
	    		 // End OF PIZZA 1
	    	 }
	       // End OF PIZZA 2
	                                                             //PIZZA 3
	  
	       if(request.getParameter("PIZZA3")!=null)
	        {
			if(request.getParameter("S3")!=null)
			{
			 bw.write(request.getParameter("qtyS3"));
			 bw.write(",");
			}
			else
			{
			 bw.write("0");
			 bw.write(",");
			}
			
		    if(request.getParameter("M3")!=null)
			{
		    	bw.write(request.getParameter("qtyM3"));
				 bw.write(",");
			}
		    else
			{
			 bw.write("0");
			 bw.write(",");
			}
		    
		    if(request.getParameter("L3")!=null)
			{
		    	bw.write(request.getParameter("qtyL3"));
				 bw.write(",");				
			}
		    else
			{
			 bw.write("0");
			 bw.write(",");
			}
		    
	  } 
	       else
	    	 {
	    		 bw.write("0");
	   			 bw.write(",");
	   			 bw.write("0");
	   			 bw.write(",");
	   			 bw.write("0");
	   			 bw.write(",");
	    		 // End OF PIZZA 1
	    	 }
	       // End OF PIZZA 3
	  
	                                                           //PIZZA 4
	      if(request.getParameter("PIZZA4")!=null)
	        {
			if(request.getParameter("S4")!=null)
			{
			 bw.write(request.getParameter("qtyS4"));
			 bw.write(",");
			}
			else
			{
			 bw.write("0");
			 bw.write(",");
			}
			
		    if(request.getParameter("M4")!=null)
			{
		    	bw.write(request.getParameter("qtyM4"));
				 bw.write(",");
			}
		    else
			{
			 bw.write("0");
			 bw.write(",");
			}
		    
		    if(request.getParameter("L4")!=null)
			{
		    	bw.write(request.getParameter("qtyL4"));
				 bw.write(",");				
			}
		    else
			{
			 bw.write("0");
			 bw.write(",");
			}
		   
	     } else
    	 {
    		 bw.write("0");
   			 bw.write(",");
   			 bw.write("0");
   			 bw.write(",");
   			 bw.write("0");
   			 bw.write(",");
    		 // End OF PIZZA 1
    	 }
	    
	      // End OF PIZZA 4
	      pw.println("YOUR ORDER ID IS:");
	     
     	pw.println(a);
      	//pw.println("\n");
  	      
      		pw.println("<html><head>");
  pw.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
  pw.println("<title>Personal Details</title></head><body>");
  pw.println("<form action=\"Form4\" method=\"post\" required><br>");
  pw.println("<form action=\"demo_form.asp\"  required><br><br>");
 
  pw.println("Name      :<input type=\"text\" name=\"Name\" required ><br><br>");
  pw.println("Mobile no.:<input type=\"number\" min='999999999' max='9999999999' name=\"Phone\" required><br><b>");
  pw.println("ADDRESS.:<input type=\"text\" size='35' name=\"Address\" required>");
  pw.println("<br>");
  pw.println("<input type=\"submit\" name=\"submit\" value=\"SUBMIT\">");
  pw.println("</form></form> </body></html>");
	  
	    //  String str21=request.getParameter("submit9a");
	   //   pw.println("Your order is placed");
  	   
	  
	 
	    	
	    //	pw.println("ewfwrf"); 
	    //	String site="details.html";
	    	//response.sendRedirect(site);
	 
	      	/*try
	        {
	      		String Line=" ";
	         File f1=new File("d://pizza1.txt");
	         BufferedReader br = new BufferedReader(new FileReader(f1));
	 		 BufferedWriter bw= new BufferedWriter(new FileWriter(f1,true));
	         Enumeration<String> parameterNames = request
	                 .getParameterNames();
	          while (parameterNames.hasMoreElements()) {
	             String paramName = parameterNames.nextElement();
	         //    pw.println(paramName + ": ");
	             String[] paramValues = request
	                     .getParameterValues(paramName);
	             for (String paramValue : paramValues) {
	            	 if(!paramValue.equals("0"))
	            	 {
	            	  pw.println(paramName + ": ");	 
	                  pw.println(paramValue + "<br/>");
	           
	            	 }
	            	 bw.write(paramValue);
	            	 bw.write(",");
	             }
	         }
	        
	        // bw.write("sujeet");
			 //bw.newLine();
			
	    	   
	       }
	        catch(Exception e){
	        	System.out.println(e);
	        }*/
	      bw.close();
			 br.close(); 
	     }
	    }
	    catch(Exception e)
	    {
	     System.out.println(e);	
	    }
	
	    
	}

}
