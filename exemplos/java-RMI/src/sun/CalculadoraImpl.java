package sun;

import java.rmi.RemoteException;

public class CalculadoraImpl implements Calculadora {

	@Override
	public float soma(float a, float b) throws RemoteException {
		return a + b;
	}

}
