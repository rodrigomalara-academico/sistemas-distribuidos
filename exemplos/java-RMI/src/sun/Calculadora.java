package sun;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
	float soma(float a, float b) throws RemoteException;

}
