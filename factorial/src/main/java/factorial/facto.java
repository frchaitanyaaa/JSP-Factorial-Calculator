package factorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class facto
 */
@WebServlet("/facto")
public class facto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public facto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int n;
		n=Integer.parseInt(request.getParameter("num"));
		long fact=1;
		if (n==0) {
			out.println("1");
		}
		else {
			for (int i = 1; i <= n; i++) {
				 fact =fact* i; //5*1=5 5*2=10 10*3=30 30*4=120
			}
		}
		out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Factorial Result</title>");
        out.println("<style>");
        out.println("body { display: flex; justify-content: center; align-items: center; height: 100vh; background: linear-gradient(135deg, #667eea, #764ba2); font-family: Arial, sans-serif;}");
        out.println(".result-box { background: rgba(255, 255, 255, 0.1); padding: 20px; border-radius: 15px; box-shadow: 0 8px 32px rgba(0, 0, 0, 0.3); text-align: center; width: 320px; border: 1px solid rgba(255, 255, 255, 0.3);}");
        out.println("h2 { color: #fff; }");
        out.println("p { color: #fff; font-size: 18px; }");
        out.println("a { text-decoration: none; color: #ff7eb3; font-size: 16px;}");
        out.println("a:hover { color: #ff4d94; }");
        out.println("</style></head><body>");
        out.println("<div class='result-box'>");
        out.println("<h2>Factorial Result</h2>");
        out.println("<p>The factorial of " + fact + "</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</div></body></html>"); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
