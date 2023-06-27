package JuegoRol;

public class Mago extends Personaje {
    private String[] hechizos;

    public Mago(String nombre, int nivel, int puntosDeVida, String[] hechizos) {
        super(nombre, nivel, puntosDeVida);
        this.hechizos = hechizos;
    }

    @Override
    public void ataque() {
        System.out.println("[El mago " + nombre + " lanza un hechizo]");
    }

    @Override
    public void defensa() {
        System.out.println("[El mago " + nombre + " invoca un gran hechizo mágico]");
    }
}
