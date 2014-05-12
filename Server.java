import java.rmi.*; import java.rmi.registry.*;
import java.util.Scanner;

public class Server {
  public static void main(String[] args) throws Exception {
    Generator Ob = new Generator();  
    Scanner sc = new Scanner(System.in);
  //  System.out.print("Portul : "); int port = sc.nextInt();
    Registry reg = LocateRegistry.createRegistry(7);
    reg.bind("Ob",Ob);

   // Naming.rebind("rmi:///Ob", (Remote) Ob);
    System.out.println("Serverul s-a legat la" +
                       " registrul RMI");
  }
}
