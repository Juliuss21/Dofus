public class Uginak extends personaje {
	
	public Uginak(){
		salud=4500;
		ataque=350;
		defensa=15;
		magia=1;
        agilidad=600;
        reistencia=60;
	}

	public static void detalles(){
		System.out.println("El Uginak tiene: ");
		System.out.println("Salud: 4500");
		System.out.println("Ataque: 400");
		System.out.println("Defensa: 10");
		System.out.println("Agilidad 900");
        System.out.println("Magia: 3");
        System.out.println("Resistencia: 70");
    }
}