package s;
/*
@Sujeet 2014108
@ Nickey 2014066
*/

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
 * Servlet implementation class Manager
 */
@WebServlet("/Manager")
public class Manager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Manager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	//	request.getParameter("Update");
		String st1,st;
		String [] line;
		int i=0;
		PrintWriter pw = response.getWriter();
		PrintWriter writer = response.getWriter();
		try
		{   
			HttpSession s=request.getSession(true);
			String sr=request.getParameter("Update");
			//System.out.println(sr);
		File f1 =new File("C:\\Users\\sujeet14108\\workspace3\\LAB\\src\\s//detail//"+sr+".txt");
		BufferedReader br = new BufferedReader(new FileReader(f1 ));
	
//bw.append("");
		st1 = br.readLine();	
		BufferedWriter bw= new BufferedWriter(new FileWriter(f1));
	bw.write(st1+"0");
	
	bw.close();
	br.close();
	
		}
		catch(Exception e)
		{
	//	System.out.println(e);
		}
		
		
		
		
		try
		{
			File[] f1 =new File("C:\\Users\\sujeet14108\\workspace3\\LAB\\src\\s//detail/").listFiles();
			{
		
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>TITLE</title></head>");
		writer.println("</head>");
		writer.println("<body><h1 >Order details </h1 >");
	//	writer.println("<form  action='Table' method='get'>");
		writer.println("<table>");

		for(i=0;i<f1.length;i++)
		{
			System.out.println(f1[i].getName());
		
	File f2 =new File("C:\\Users\\sujeet14108\\workspace3\\LAB\\src\\s//detail//"+f1[i].getName());
	BufferedReader br = new BufferedReader(new FileReader(f2 ));
	BufferedWriter bw= new BufferedWriter(new FileWriter(f2 ,true));
		st = br.readLine();
		//writer.write(st);
		line=st.split(",");
		//i++;
		String a=line[0];
		HttpSession s=request.getSession(true);
	
		s.setAttribute("d",a);
		if(0<Integer.parseInt(line[16])&&Integer.parseInt(line[16])<=10000)
		{
		writer.println("<tr>");
		writer.println("<td></td>");
		writer.println("<pre><td>		" + line[0]
		+ "</td></pre>");
	//	writer.println("<td> </td>");
		
		writer.println("<td><pre>  Name: " + line[13 ]
				+ "</td>    </pre>"		+"<td><pre>Phone: " + line[14 ]+" </td>    </pre><td><pre>Address:" + line[15 ]+ " </td></pre>");
		
	
		
		
		//writer.println("</td><td>" + line[2]
		//+ "</td>");
		writer.println("<form  action='Manager' method='get'>");
		pw.println("<td><pre>              <input type='hidden' value="+a+" name='Update'>  <input type='submit' value='Update' name=''></input><br><br></td></pre></form>");
		writer.println("<td><pre>		");
		if("1".equals(line[16]))
			pw.println("OrderPlaced");
		else if("10".equals(line[16]))
				{
			pw.println("Preparing");
				}
		else if("100".equals(line[16]))
		{
	pw.println("Baking");
		}
		else if("1000".equals(line[16]))
		{
	pw.println("Quality check");
		}
		else if("10000".equals(line[16]))
		{
	pw.println("Out for Delivery");
		}
		
		else 
		{
	pw.println("Delivered");
		}
		writer.println("</pre></td>");
		//writer.write("<td><button value=\"xyz\" name=\"update\">Update</button></td>");
		// writer.printlnz a("<input type = 'Button' + "name = 'update'"+ "value='update1 '">");
		/*writer.println("<td><input type = 'button' " +
		"name='update'"
		+ " value= 'UPDATE'/></td>");*/
		br.close();
		bw.close();
		writer.println("</tr>");
		}
		}
		writer.println("</table>");
		writer.println("</form>");
		writer.println("</body>");
		writer.println("</html>");
		/*
		// do stuff for condion A
		else if("ButtonB".equals(buttonClicked))
		// do stuff for condion B
		else if("ButtonC".equals(buttonClicked))
		// do stuff for condion C */
		
		}
		}
		catch(Exception e)
		{
	//	System.out.println(e);
		}
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
