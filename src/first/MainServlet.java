package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

public class MainServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter pw = response.getWriter();

            response.setContentType("text/html");
            response.setStatus(HttpServletResponse.SC_OK);

            RequestDispatcher dispatcher
                  = request.getRequestDispatcher("index.jsp");
           dispatcher.forward(request, response);
        }
}

