package org.iesalandalus.programacion.cuatroenraya;

public class Casilla {

    private Ficha ficha;

    public Casilla() {
        this.ficha = null;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        if (ficha == null) {
            throw new NullPointerException("No se puede poner una ficha nula.");
        }
        if (this.ficha != null) {
            throw new CuatroEnRayaExcepcion("La casilla ya contiene una ficha.");
        }
        this.ficha = ficha;
    }

    public boolean estaOcupada() {
        return ficha != null;
    }

    @Override
    public String toString() {
        return ficha == null ? " " : ficha.toString().substring(0, 1);
    }
}
