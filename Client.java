import java.rmi.*; import java.util.*;

public class Client {
  public static void main(String[] args) 
                     throws RemoteException {
    double val; Scanner sc = new Scanner(System.in);
    //System.out.print("Adresa server si port: ");
    //String adresa = sc.next(); 
    //int port = sc.nextInt();
    String url =  "rmi://" + "localhost" + ":" + 7 + "/Ob";
    I_Generator Ob = null; I serv = null;
    try { 
      Ob = (I_Generator) Naming.lookup(url);
    }
    catch(Exception e) {
      System.out.println("Conectare esuata");
      System.exit(0);
    } 
    try {  
     serv = Ob.server_propriu(); 
    }        
    catch(Exception e) { }
    
    System.out.print("Meniu:\n"
            + "0 - iesire                        8 - radacina patrata\n"
            + "1 - puneti o valoare              9 - inversare\n"  
            + "2 - adunare                      10 - stocare memorie\n"  
            + "3 - scadere                      11 - adunare memorie\n"
            + "4 - inmultire                    12 - scadere memorie\n"
            + "5 - impartire                    13 - citire memorie\n" 
            + "6 - factorial                    14 - stergere memorie\n"
            + "7 - ridicare la putere\n\n");
            
    
    System.out.println("Val. curenta este: " + serv.curent() );
    System.out.println("Mem. curenta este: " + serv.mem_curent() );
    double e; double b;
    int operatie = 0; String op="";
    for( ; ; ) {
    
    System.out.print("Alegeti o operatie : "); 
    int ok=0;
     
    op=sc.next(); 
     
     try{ operatie = Integer.parseInt(op);} catch(Exception t) { System.out.println("Operatia nu este corecta!"); continue; }
    
    if(operatie==0) break;
  try{  
    switch(operatie)
      {
          case 1: { 
              System.out.print("Valoare : "); val = sc.nextDouble();
              serv.pune(val); 
          System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 2: { 
              System.out.print("Valoare : "); val = sc.nextDouble();
              serv.adunare(val); 
          System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 3: { 
              System.out.print("Valoare : "); val = sc.nextDouble();
              serv.scadere(val); 
          System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 4: { 
              System.out.print("Valoare : "); val = sc.nextDouble();
              serv.inmultire(val);
          System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 5: { 
              System.out.print("Valoare : "); val = sc.nextDouble();
              serv.impartire(val); 
          System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 6: { 
              System.out.print("Valoare : "); val = sc.nextDouble();
              serv.factorial(val); 
          System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 7: { 
              System.out.println("Introduceti baza: "); b = sc.nextDouble();
              System.out.println("Introduceti exponentul: "); e = sc.nextDouble(); 
              serv.ridicare_la_putere(b,e);
          System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 8: { 
              System.out.print("Valoare : "); val = sc.nextDouble();
              serv.radacina_patrata(val);
              System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 9: {  
               System.out.print("Valoare : "); val = sc.nextDouble();
               serv.inversare(val);
               System.out.println("Val. curenta este: " + serv.curent() ); break; }
          
          case 10: { serv.stocare_mem(); System.out.println("Mem. curenta este: " + serv.mem_curent() ); break; }
          
          case 11: { serv.adunare_mem(); System.out.println("Mem. curenta este: " + serv.mem_curent() ); break; }
          
          case 12: { serv.adunare_mem(); System.out.println("Mem. curenta este: " + serv.mem_curent() ); break; }
          
          case 13: { serv.citire_mem(); System.out.println("Mem. curenta este: " + serv.mem_curent() ); break; }
          
          case 14: { serv.sterge_mem(); System.out.println("Mem. curenta este: " + serv.mem_curent() ); break; }
          
          }
  }
  catch(Exception o) { System.out.println("Valoarea nu este corecta!"); }
                
    }     
       
    System.out.println("Val. curenta este: " + serv.curent() );
    System.out.println("Mem. curenta este: " + serv.mem_curent() );
  }
}
