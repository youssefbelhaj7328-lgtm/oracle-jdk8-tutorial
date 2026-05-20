

package com.example;

public class Persona extends Object {
	/*
	* Existen 4 modificadores de acceso, para los miembros de una clase (propiedades y los
	* metodos)
	* 
	* 1- Privado del paquete
	* 2- Privado (private)
	* 3- Publico (public)
	* 4- Protegido (protected) 
	* 
	* Los modificadores de acceso se ubican a la izquierda del tipo de datos de las propiedades 
	* 
	* */

	String nombre = "Susana de las mercedez";
	
	
	/*Al elemento que es privado solamente se puede acceder desde la misma clase, es decir no se puede acceder
	 * a un elemente privado ni a traves de una instancia u objeto de la propia  clase 
	 * Una clase bien diseñada es aquella que tiene todos sus propiedades  o canpos privados
	 * Como acceder desde fuera de una clase a un elemento (proiedad ocampo)
	 * La respuesta a la anterior interrogante  es: mediante metodos publicos denominados getters and setters (Para leer el valor de la propiedad o campo que es privado) and 

	 * setters (Para modificar o asignarle valor a un campo o propiedad privada) 
	  
	 /* A continuacion escribimos, manualmente, metodos getters and setters para la propiedad

* primerApellido */

 

// metodo publico getter




	// metodo publico getter

	 

	





	private  String primerApilldo = "Martinez";
	// El modificador final impide que se pueda cambiar el valor de una variable, 
	// por lo cual se convierte una variable a una constante.
	static final String PAIS = "España";
	double estatura = 1.75;
	int totalCoches = 2;
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}// metodo publico getter

 

public String getPrimerApellido() {
// metodo publico setter que no devuelve nada y recibe como parametro
	// el valor , o el dato, que queremos asignar a la variable provada
	
	return this.primerApilldo;
 
} 



	
	public String getPrimerApilldo() {
	return primerApilldo;
}



public void setPrimerApelldo(String primerApilldo) {
	this.primerApilldo = primerApilldo;
}



	public Persona(String nombre, String primerApilldo, double estatura, int totalCoches) {
		super();
		this.nombre = nombre;
		this.primerApilldo = primerApilldo;
		this.estatura = estatura;
		this.totalCoches = totalCoches;

		
		
		
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

	



	 
	 
}

