public class sacrogrito extends personaje {
	
	public sacrogrito(){
		salud=5000;
		ataque=300;
		defensa=35;
		magia=20;
        agilidad=100;
        reistencia=20;
	}

	public static void detalles(){
		System.out.println("El Sacrogrito tiene: ");
		System.out.println("Salud: 5000");
		System.out.println("Ataque: 300");
		System.out.println("Defensa: 35");
		System.out.println("Agilidad 100");
        System.out.println("Magia: 1");
        System.out.println("Resistencia: 20");
    }
}