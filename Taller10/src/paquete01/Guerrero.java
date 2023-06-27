package JuegoRol;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosDeVida, int fuerza) {
        super(nombre, nivel, puntosDeVida);
        this.fuerza = fuerza;
    }

    @Override
    public void ataque() {
        System.out.println("[El guerrero " + nombre + " ataca con fuerza]" + " ->  [Fuerza: " + fuerza + "]");
    }

    @Override
    public void defensa() {
        System.out.println("[El guerrero " + nombre + " se defiende formidablemente]");
    }
}