package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private float saldo;
	private List<Transaccion> transacciones;
	
	public Cuenta() {
		this.saldo = 0;
		this.transacciones = new ArrayList<Transaccion>();
	}

	public boolean extraer(float dinero, String motivo) {
		if (dinero > 0 && this.saldo >= dinero) {
			this.saldo -= dinero;
			this.transacciones.add(new Transaccion(motivo, dinero, "Débito"));
			return true;
		}
		return false;
	}

	public boolean depositar(float dinero, String motivo) {
		if (dinero > 0) {
			this.saldo += dinero;
			this.transacciones.add(new Transaccion(motivo, dinero, "Crédito"));
			return true;
		}
		return false;
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}
	
	public void transferir(float dinero, Cuenta c, String motivo) {
		if(this.extraer(dinero, "Transferencia a otra cuenta: " + motivo)) {
			c.depositar(dinero, "Transferencia recibida: " + motivo);
		}
	}
	
	public void historialTransacciones() {
		for(Transaccion t : this.transacciones) {
			System.out.println(t + "\n");
		}
	}
	
}
