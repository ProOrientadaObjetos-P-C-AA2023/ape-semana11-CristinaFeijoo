package JuegoRol;

public abstract class Personaje {
    public String nombre;
    public int nivel;
    public int puntosDeVida;

    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public abstract void ataque();
    public abstract void defensa();

    public void subirNivel() {
        nivel++;
        System.out.println(nombre + " ha subido de nivel a " + nivel + " !!!!");
    }
}

