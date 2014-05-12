import java.rmi.*;

public interface I extends Remote {
  void pune(double i) throws RemoteException;
  double curent() throws RemoteException;
  void adunare(double i) throws RemoteException;
  void scadere(double i) throws RemoteException;
  void inmultire(double i) throws RemoteException;
  void inversare(double i) throws RemoteException;
  void impartire(double i) throws RemoteException;
  void factorial(double i) throws RemoteException;
  void ridicare_la_putere(double b,double e) throws RemoteException;
  void radacina_patrata(double i) throws RemoteException;
  double mem_curent() throws RemoteException;
  void stocare_mem() throws RemoteException;
  void adunare_mem() throws RemoteException;
  void scadere_mem() throws RemoteException;
  void citire_mem() throws RemoteException;
  void sterge_mem() throws RemoteException;
}


