
package practiceproblem;
import java.util.*;
public class PracticeProblem {

    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner ObiWan = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("--Menu--");
            System.out.println("1. Pokemon");
            System.out.println("¿Que ejercicio quiere probar?");
            opcion = ObiWan.nextInt();
            switch(opcion){
                case 1 ->{
                    Ejercicio2();
                }
                
            }
        }while(opcion==1);
    }
    
    
    public static void Ejercicio2(){
        Scanner ObiWan = new Scanner(System.in);
        System.out.println("¡Jugadores ingresen sus Pokemones!");
        ArrayList <Pokemon> Juga1= new ArrayList <Pokemon>();
        ArrayList <Pokemon> Juga2 = new ArrayList <Pokemon>();
        boolean n = true;
        boolean j = true;
        int conta1 = 0;
        int conta2 = 0;

        while(n){
            System.out.println("Jugador 1");
            System.out.println("Ingrese el nombre de su Pokemon: ");
            String nombre = ObiWan.next();
            int vida = 0;
            System.out.println("Ingrese puntos de vida: ");
            vida = ObiWan.nextInt();
            if (vida > 300) {
                System.out.println("Ingrese un numero de vida menor a 300 para todos sus pokemones");
            }else{
            System.out.println("Ingrese puntos de ataque: ");
            int ataque = ObiWan.nextInt();
            int suerte = new Random().nextInt((5-1)+1)+1;
            Pokemon poke1 = new Pokemon(nombre,vida,ataque,suerte);
            Juga1.add(poke1);
            conta1++;
            if (conta1 == 3) {
                    System.out.println("No se puede ingresar más Pokemones");
                    break;
            }
            System.out.println("¿Desea ingresar otro Pokemon?[S/N]");
            String n2 = ObiWan.next();
             if(n2.equalsIgnoreCase("N")){
                 n = false;
             }else if(n2.equalsIgnoreCase("S")){
                 n = true;
             }else{
                 System.out.println("Ingrese letra válida");
                 break;
             }
            }
            
        }
         while(j){
            System.out.println("Jugador 2");
            System.out.println("Ingrese el nombre de su Pokemon: ");
            String nombre = ObiWan.next();
            int vida = 0;
            System.out.println("Ingrese puntos de vida: ");
            vida = ObiWan.nextInt();
            if (vida > 300) {
                System.out.println("Ingrese un numero de vida menor a 300 para todos sus pokemones");
            }else{
            System.out.println("Ingrese puntos de ataque: ");
            int ataque = ObiWan.nextInt();
            int suerte = new Random().nextInt((5-1)+1)+1;
            Pokemon poke2 = new Pokemon(nombre,vida,ataque,suerte);
            Juga2.add(poke2);
            conta2++;
            if (conta2 == 3) {
                    System.out.println("No se puede ingresar más Pokemones");
                    break;
                }
            System.out.println("¿Desea ingresar otro Pokemon?[S/N]");
            String n2 = ObiWan.next();
             if(n2.equalsIgnoreCase("N")){
                 j = false;
             }else if(n2.equalsIgnoreCase("S")){
                 j = true;
             }else{
                 System.out.println("Ingrese letra válida");
                 break;
             }
                
            }
            
        }
         
         Pokemon elec = Juga1.get(0);
         Pokemon elec2 = Juga2.get(0);
         int i = 0;
         do{
            elec.setSuerte(new Random().nextInt((5-1)+1)+1);
            elec2.setSuerte(new Random().nextInt((5-1)+1)+1);
            System.out.println("---Ronda "+i+"---");
            
         if (elec2.getSuerte()>elec.getSuerte()) {
            Ataque(elec2,elec);
        }else if(elec2.getSuerte()==elec.getSuerte()){
             System.out.println("Ronda de Empate");
             elec.setSuerte(new Random().nextInt((5-1)+1)+1);
             elec2.setSuerte(new Random().nextInt((5-1)+1)+1);
        }
         else{
            Ataque(elec,elec2);
        }
        i++;
        if (elec2.getVida()<=0) {
            System.out.println(elec.getNombre()+" gana esta ronda");
            Juga2.remove(0);
            if(Juga2.isEmpty()){
            System.out.println("¡FELICIDADES JUGADOR 1 HAS GANADO");
            break;
            }else{
                elec2 = Juga2.get(0);
            }
            }
        else if(elec.getVida()<=0){
            System.out.println(elec2.getNombre()+" gana esta ronda");
            Juga1.remove(0);
            if(Juga1.isEmpty()){
            System.out.println("¡FELICIDADES JUGADOR 2 HAS GANADO");
            break;
            }else{
                elec = Juga1.get(0);
            }
        }
    }while(elec2.getVida()>0||elec.getVida()>0);
    }
    public static void Ataque(Pokemon elec,Pokemon elec2){

            System.out.println(elec.getNombre()+" Ataca primer Tiene: "+elec.getVida());
            System.out.println(elec2.getNombre()+" Ataca Segundo Tiene: "+elec2.getVida());
            System.out.println("**Puntos Restantes**");
            int fina = elec2.getVida()-elec.getAtaque();
            elec2.setVida(fina);
            System.out.println(elec.getNombre()+" tiene: "+elec.getVida());
            System.out.println(elec2.getNombre()+" tiene: "+elec2.getVida());
            
            
        
    }
    
}
