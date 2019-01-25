package first;

import org.eclipse.jetty.server.Server;

public class Bootstrap {

  public static void main(String[] args) throws Exception
  {
        Server server = new Server(8080);
        server.setHandler(new handler());

        server.start();
        server.join();

  }

}


