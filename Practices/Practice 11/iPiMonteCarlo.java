/**
 * @(#)iPiMonteCarlo.java
 * @author A.T.
 * @version 1.00 2014/01/8
 */

import java.rmi.*;
public interface iPiMonteCarlo
  extends Remote
{
  public void reset() throws RemoteException;
  public void masPuntos(int nPuntos)  throws RemoteException;
  public int get_puntos() throws RemoteException;
  public int get_intentos() throws RemoteException;
  public void set_puntos(int p) throws RemoteException;
  public void set_intentos(int i) throws RemoteException;
  public double resultado() throws RemoteException;

}