public class ocra extends personaje {
	
	public ocra(){
		salud=1500;
		ataque=400;
		defensa=10;
		magia=3;
        agilidad=900;
        reistencia=70;
	}

	public static void detalles(){
		System.out.println("El Ocra tiene: ");
		System.out.println("Salud: 1500");
		System.out.println("Ataque: 400");
		System.out.println("Defensa: 10");
		System.out.println("Agilidad 900");
        System.out.println("Magia: 3");
        System.out.println("Resistencia: 70");
    }
}