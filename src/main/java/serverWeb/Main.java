package serverWeb;
import logicaServer.*;

import org.eclipse.jetty.server.Server;

public class Main {

  public static void main(String[] args){
    try{
      Server server = new Server(80);
      server.setHandler(new SocialNetworkServer());

      server.start();
      server.join();
    }catch(Exception e){
      System.out.println("Running server Failed");
    }
  }
}
