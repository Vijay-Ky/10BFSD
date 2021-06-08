package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    	//we need to override service method
    	public void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException
    	{
    		//in order to read any input use request object get parameter method
    		String  s1 = request.getParameter("name");
    		int status = DbUtil.save(s1);
    		//we need PrintWriter to write something to the browser
    		PrintWriter out = response.getWriter();
    		if(status == 1)
    		{
    			out.println("saved in the db successfully");
    		}
    		else
    		{
    			out.println("some error");
    		}
    	}
    }
