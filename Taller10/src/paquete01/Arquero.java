package JuegoRol;

public class Arquero extends Personaje {
    private int precision;

    public Arquero(String nombre, int nivel, int puntosDeVida, int precision) {
        super(nombre, nivel, puntosDeVida);
        this.precision = precision;
    }

    @Override
    public void ataque() {
        System.out.println("[El arquero " + nombre + " dispara con precisión]" + " ->  [Precisión: " + precision + "]");
    }

    @Override
    public void defensa() {
        System.out.println("[El arquero " + nombre + " se defiende ágilmente]");
    }
}
