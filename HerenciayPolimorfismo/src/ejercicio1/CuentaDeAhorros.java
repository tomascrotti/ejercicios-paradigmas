package ejercicio1;

public class CuentaDeAhorros extends Cuenta{
	
	private float reserva;
	
	public CuentaDeAhorros() {
		super();
		this.reserva = 0;
	}
	
	public boolean reservar(float cantidad) {
		if(this.extraer(cantidad, "Reserva para caja de ahorros")) {
			this.reserva += cantidad;
			return true;
		}
		return false;
	}
	
	public boolean reintegrar(float cantidad) {
		if(cantidad <= this.reserva) {
			this.reserva -= cantidad;
			this.depositar(cantidad, "Reintegro");
			return true;
		}
		return false;
	}
	
}
