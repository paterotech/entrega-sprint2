package edu.udea.main.modelos;

public class Movimiento {

    private String concepto;
    private float monto;
    private String usuario;

    public Movimiento(String concepto, float monto, String usuario) {
        this.concepto = concepto;
        this.monto = monto;
        this.usuario = usuario;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
