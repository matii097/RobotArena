package arena;

public class Robot {

    private String nombre;
    private int energia;
    private int ataque;
    private int defensa;

    public Robot(String nombre, int energia, int ataque, int defensa) {
        this.nombre = nombre;
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public boolean estaVivo() {
        return energia > 0;
    }

    public String getEstado() {
        return nombre + "[Energia:" + energia + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void atacar(Robot objetivo) {
        int dano = (ataque * 2) - objetivo.defensa; // cambio incompatible
        objetivo.energia -= dano;
        System.out.println(nombre + " realiza un ataque doble!");
    }
}
