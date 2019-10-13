package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/harsh.co")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response)
			throws ServletException, IOException {
//				PrintWriter out = response.getWriter();
//				out.println("Hello World! ");
//		System.out.println(request.getParameter("name"));
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	

}
