package org.iesalandalus.programacion.cuatroenraya;

public enum Ficha {
    AZUL("A"),
    VERDE("V");

    private String cadenaAMostrar;

    private Ficha(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    @Override
    public String toString() {
        return String.format("%s", cadenaAMostrar);
    }
}
