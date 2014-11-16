package logicaServer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class SocialNetworkServer extends AbstractHandler{

  public void startServer(){
    try{
      Server server = new Server(8080);
      server.setHandler(new SocialNetworkServer());

      server.start();
      server.join();
    }catch(Exception e){
      System.out.println("Running server Failed");
    }
  }

  public void handle(String target,Request baseRequest,
    HttpServletRequest request, HttpServletResponse response)

        throws IOException, ServletException
    {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<h1>Hello World</h1>");
    }
}
