import java.util.Scanner;
public class combate{
public static void main(String[] args){
    personaje personaje1=null;
    personaje personaje2=null;
Scanner leer = new Scanner(System.in);
int respuesta, opc;
do{
    System.out.println("BIENVENIDO");
    System.out.println("Bienvenido Jugador 1");
    System.out.println("Elija su personaje");
    System.out.println("1. Yopuka");
    System.out.println("2. Sacrogrito");
    int numero;
       numero=leer.nextInt();
       if(numero==1){
           personaje1=new yopuka();
           System.out.println("Elegiste al Yopuka");
       }else if(numero==2){
           personaje2=new sacrogrito();
           System.out.println("Elegiste al Sacrogrito");
       }
       break;
       default:
       System.out.println("opcion incorrecta");
       break;
   }
   while(respuesta!=2);
   leer.next();
   do{
        System.out.println("Bienvenido");
        System.out.println("Bienvenido jugador 2");
        System.out.println("Elija si personaje");
        System.out.println("1. Yopuka");
        System.out.println("2. Sacrogrito");

          opc =leer.nextInt();
          if(opc==1){
              personaje2=new yopuka();
          }else{
              personaje2=new sacrogrito();
           }            
          break;
          default:
          System.out.println("opcion incorrecta");
      }
  }
      while( resput !=2);
        
      personaje1.estado();
        personaje2.estado();
      do {
        System.out.println("Que deseas realizar jugador 1");
        System.out.println("1: Atacar");
        System.out.println("2: Curarse");
        int re;
        re =leer.nextInt();
        if (re == 1) {
        atacar(personaje2, personaje1);
        System.out.println("la vida del jugador 1 es "+personaje1.salud);
        System.out.println("la vida del jugador 2 es "+personaje2.salud);
        } else {
        curar(personaje1);}
        System.out.println("Que deseas realizar jugador 2");
        System.out.println("1: Atacar");
        System.out.println("2: Curarse");
        resput = leer.nextInt();
        if (resput == 1) {
        atacar(personaje1, personaje2);
        System.out.println("la vida del jugador 1 es "+personaje1.salud);
        System.out.println("la vida del jugador 2 es "+personaje2.salud);
        } else {
     
        curar(personaje1);}
        personaje1.estado();
        personaje2.estado();
        leer.next();
        limpiar();
    }
    while (personaje1.salud>0 && personaje2.salud>0);
    if(personaje2.salud<=0){
        System.out.println("Gano el jugador 1");
    }else{
        System.out.println("Gano el jugador 2");
    }
static void limpiar(){
System.out.print("\033[H\033[2J");
   System.out.flush();  
}

static void atacar(personaje uno, personaje dos){
    uno.salud=uno.salud-dos.fuerza;
}
static void curar(personaje uno){
    uno.salud=uno.salud+uno.regeneracion;

}
}