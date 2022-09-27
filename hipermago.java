public class hipermago extends personaje {
	
	public hipermago(){
		salud=2000;
		ataque=350;
		defensa=15;
		magia=8;
        agilidad=300;
        reistencia=40;
	}

	public static void detalles(){
		System.out.println("El Hipermago tiene: ");
		System.out.println("Salud: 2000");
		System.out.println("Ataque: 350");
		System.out.println("Defensa: 15");
		System.out.println("Agilidad 300");
        System.out.println("Magia: 8");
        System.out.println("Resistencia: 40");
    }
}