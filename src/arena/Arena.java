
package arena;


public class Arena {
    public static void main(String[]args){
        
        Robot r1 = new Robot("Alpha",100,20,5);
        Robot r2 = new Robot("Omega",120,18,7);
        
        for(int round = 1 ; round <= 3 ;round++){
            System.out.println("===Round"+ round + "===");
            r1.atacar(r2);
            r2.atacar(r1);
            
            System.out.println(r1.getEstado());
            System.out.println(r2.getEstado());
        }
    }
}
