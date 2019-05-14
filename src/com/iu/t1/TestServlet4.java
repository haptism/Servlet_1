package com.iu.t1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet4
 */
@WebServlet("/TestServlet4")
public class TestServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int r = Integer.parseInt(request.getParameter("r"));
		int c = Integer.parseInt(request.getParameter("c"));
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<style type=\"text/css\">");
		out.println("table { width:100%; border:1px solid red;}");
		out.println("td {border:1px solid red;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		for(int i=0;i<r;i++) {
			out.println("<tr>");
			for(int j=0;j<c;j++) {
				out.println("<td>");
				out.println(1);
				out.println("</td>");
			}
			out.println("</tr>");
		}
		
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
