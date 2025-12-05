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
    private boolean escudoActivo = false;

    public void activarEscudo() {
        escudoActivo = true;
        System.out.println(getNombre() + " activa un ESCUDO durante 1 ataque.");
    }

    public void atacar(Robot objetivo) {
        int dano = Math.max(0, ataque - objetivo.defensa);
        if (objetivo.escudoActivo) {
            dano /= 2;
            objetivo.escudoActivo = false;
            System.out.println(objetivo.getNombre() + " recibe daño reducido por ESCUDO!");
        }
        objetivo.energia -= dano;
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + " (-" + dano + " energía)");
    }
}
