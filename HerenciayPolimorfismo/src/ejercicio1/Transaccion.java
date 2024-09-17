package ejercicio1;

public class Transaccion {
	private String motivo;
	private float monto;
    private String tipo;

    public Transaccion(String motivo, float monto, String tipo) {
        this.motivo = motivo;
        this.monto = monto;
        this.tipo = tipo;
    }

    public String getMotivo() {
        return motivo;
    }

    public float getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo + ": " + monto + " (" + motivo + ")";
    }
}
