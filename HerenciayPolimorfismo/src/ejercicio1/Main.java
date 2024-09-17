package ejercicio1;

public class Main {
	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente(500);
		cc.depositar(1000, "Lo que le debo al thimar");
		CuentaDeAhorros ca = new CuentaDeAhorros();
		ca.depositar(5000, "Lo que le afané al thimar");
		ca.reservar(1000);
		
		cc.transferir(1300, ca, "Le debía");
		ca.transferir(5000, cc, "Me confundí en lo que le pasé");
		cc.historialTransacciones();
//		Cuenta cuentaOrigen = new Cuenta();
//		cuentaOrigen.depositar(10000);
//		System.out.println(cuentaOrigen.consultarSaldo()); // 10000
//		Cuenta cuentaDestino = new Cuenta();
//		System.out.println(cuentaDestino.consultarSaldo()); // 0
//		cuentaOrigen.transferir(550, cuentaDestino);
//		System.out.println(cuentaOrigen.consultarSaldo()); // 9450
//		System.out.println(cuentaDestino.consultarSaldo()); // 550
	}

}
