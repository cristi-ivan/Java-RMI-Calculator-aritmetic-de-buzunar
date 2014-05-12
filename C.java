import static java.lang.Math.*;
import java.rmi.*; import java.rmi.server.*;

public class C extends UnicastRemoteObject 
               implements I {
  private int nr_ordine;
  private double val,mem; 
  
  public C(double i,int nr) throws RemoteException { 
    val = i; nr_ordine = nr; 
  }

  public void pune(double i) {
    val = i; System.out.println(nr_ordine + "\t: " + val); 
  }
  
  public void adunare(double i)
  {
      val +=i; System.out.println(nr_ordine + "\t: " + val);
  }
  
  public void scadere(double i)
  {
      val -=i; System.out.println(nr_ordine + "\t: " + val);
  }
  
  public void inmultire(double i)
  {
      val *=i; System.out.println(nr_ordine + "\t: " + val);
  }
  
  public void inversare(double i)
  {
      val = 1/val; System.out.println(nr_ordine + "\t: " + val);
  }
  
  public void impartire(double i)
  {
      val /=i; System.out.println(nr_ordine + "\t: " + val);
  }
  
  public void factorial(double i)
  {
      val=1;
      if(i==0) { }
      else {  
      while(i>0) { val*=i; i--; } }
      System.out.println(nr_ordine + "\t: " + val);
  }
  
  public void ridicare_la_putere(double b,double e)
  {
      val = pow(b,e);
  }
  
  public void radacina_patrata(double i)
  {
      val = sqrt(i);
  }

  public double curent() { return val; }
  
  public double mem_curent() { return mem; }
  
  public void adunare_mem() { mem += val; }
  
  public void scadere_mem() { mem -= val; }
  
  public void citire_mem() { val = mem; }
  
  public void stocare_mem() { mem = val; }
  
  public void sterge_mem() { mem = 0; }
}
