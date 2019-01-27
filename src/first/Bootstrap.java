package first;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class Bootstrap {

  public static void main(String[] args) throws Exception
  {
        Server server = new Server(8080);
        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping(MainServlet.class, "/");//Set the servlet to run.
        server.setHandler(handler);

        server.start();
        server.join();

  }

}


