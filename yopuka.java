public class yopuka extends personaje{
	
	public yopuka(){
		salud=2500;
		ataque=250;
		defensa=20;
		magia=2;
        agilidad=500;
        reistencia=40;
	}

	public static void detalles(){
		System.out.println("El Yopuka tiene: ");
		System.out.println("Salud: 2500");
		System.out.println("Ataque: 250");
		System.out.println("Defensa: 20");
		System.out.println("Agilidad 500");
        System.out.println("Magia: 2");
        System.out.println("Resistencia: 40");
    }
}