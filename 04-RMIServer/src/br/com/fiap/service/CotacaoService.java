package br.com.fiap.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CotacaoService extends Remote{
	double converterLibraReal(double libra) throws RemoteException;
	
}
