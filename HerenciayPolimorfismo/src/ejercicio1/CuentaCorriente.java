package ejercicio1;

public class CuentaCorriente extends Cuenta {
	private float enDescubierto;
	private float aCubrir;

	public CuentaCorriente(float enDescubierto) {
		super();
		this.enDescubierto = enDescubierto;
		this.aCubrir = 0;
	}

	@Override
	public boolean extraer(float cantidad, String motivo) {
		if (!super.extraer(cantidad, motivo)) {
			if (!(cantidad <= this.consultarSaldo() + this.enDescubierto)){
				return false;
			}
			cantidad -= this.consultarSaldo();
			super.extraer(this.consultarSaldo(), motivo);
			this.enDescubierto -= cantidad;
			this.aCubrir += cantidad;
		}
		return true;
	}
	
	@Override
	public boolean depositar(float cantidad, String motivo) {
		if (cantidad <= 0)
			return false;
		if (cantidad - this.aCubrir > 0) {
			this.enDescubierto += this.aCubrir;
			super.depositar(cantidad - this.aCubrir, motivo);
			this.aCubrir = 0;
			return true;
		} else {
			this.enDescubierto += cantidad;
			this.aCubrir -= cantidad;
			return true;
		}
	}

}
