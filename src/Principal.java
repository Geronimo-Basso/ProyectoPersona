
public class Principal {

	public static void main(String[] args) {
		
		//Instancia de persona con el primer constuctor, se puede ver como lleva mas trabajo
		Persona persona1=new Persona(); //Creo una instancia de persona
		persona1.nombre="Geronimo";
		persona1.fechaNac="13/11/2001";
		persona1.origen="Uruguay";
		persona1.posicion=0;
		persona1.sexo="Hombre";
		
		System. out. println(persona1.toString()); //Uso el toString para ver bien la información
		
		//Instancia de persona creada con el segundo constuctor, es más facíl asi. 
		Persona persona2= new Persona("Facundo","01/05/2000","uruguay","hombre",1);
		System.out.println(persona2.toString());
		
		
	}

}
