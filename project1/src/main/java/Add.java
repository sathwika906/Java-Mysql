

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int age=Integer.parseInt(request.getParameter("age"));
        int smoke=Integer.parseInt(request.getParameter("smoke"));
        int alcohol=Integer.parseInt(request.getParameter("alcohol"));
        int waist=Integer.parseInt(request.getParameter("waist"));
        int physical=Integer.parseInt(request.getParameter("physical"));
        int fam=Integer.parseInt(request.getParameter("fam"));
        
        int sum=(age+smoke+alcohol+waist+physical+fam);
        
        if (sum == -1)
			out.println("<h2>Please answer the questions first.");
		if (sum > 4)
			out.println("The person needs  screening.");
		if (sum < 4)
			out.println("<br>The person is not at risk of NCDs and doesn't need screening.");
        out.print("THE TOTAL SCORE IS = "+sum);
        out.println("<body>");
        out.println("<html>");

        out.println("<button onclick=location.href='Registration.jsp'; align=\"center\" class=\"btn btn-primary\" >Back</button>");
        out.println("</body>");
        out.println("</html>");
    }

	}


