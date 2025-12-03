
package arena;


public class RobotEspecial extends Robot {
    private int energiaExtra;

    public RobotEspecial(int energiaExtra, String nombre, int energia, int ataque, int defensa) {
        super(nombre, energia, ataque, defensa);
        this.energiaExtra = energiaExtra;
    }
    
   public void habilidadEspecial(Robot objetivo){
       objetivo.atacar(this);
       System.out.println(getNombre()+"absorbe energia...");
       objetivo.atacar(this);
       System.out.println(getNombre() + "libera un ataque crìtico!");
   }
}
