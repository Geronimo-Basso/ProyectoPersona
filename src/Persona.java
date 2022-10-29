
public class Persona {
	
	//Atributos o propiedades de la clase
	//Sino pongo nada asumo que son prublic las variables
	String nombre;
	String fechaNac;
	String origen;
	String sexo;
	int posicion;
	
	
	//Comportamiento o metodos
	public void andar(int metros) {
		//Metodo para andar hacia adelante
		if(metros>=0) {
			posicion+=metros;
		}
		
	}

	//Constuctor (función que se llama cuando se crea una instancia)

	//Este es un constuctor que me incializa todo vacío. Tengo que rellenarlo todo despues
	public Persona() {
		nombre = fechaNac=origen=sexo="";
	}
	
	
// Segundo constuctor, que ya me inicializa todo. El this. es para referirme siempre al atributo de Persona. 
	public Persona(String nombre, String fechaNac, String origen, String sexo, int posicion) {
	this.nombre = nombre;
	this.fechaNac = fechaNac;
	this.origen = origen;
	this.sexo = sexo;
	this.posicion = posicion;
}

	//Lo uso para poder ver bien todo en pantalla cuando lo imprimo. 
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "\n" + 
				", fechaNac=" + fechaNac +  "\n" + 
				", origen=" + origen +  "\n" + 
				", sexo=" + sexo + "\n" + 
				", posicion=" + posicion + "]";
	}


	
	
}
