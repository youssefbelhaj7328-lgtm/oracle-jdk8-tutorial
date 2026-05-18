/* Estos caracteres, es decir, forward slash (/) seguido de asterisco (*) 

 y- lo mismo pero a la inversa para el cierre del comentario, permite 

 escribir, documentar, el proyecto o el codigo que estemos desarrollando.
 

 Lo que se escribe entre comentarios, el compilador de java no lo toma 

 en cuenta a la hora de compilar el resto de las sentencia de Java que

 aparecen en el proyecto*/

package com.example;

public class Persona extends Object {

	/*
	 * Una clase en Java es una plantilla a partir de la cual se pueden crear el
	 * codigo es dicer las sentencias (ordenes) de lenguaje java tiene que ser
	 * contenidas dentro de alguna clase //la plantilla es una estyructura muerta
	 * hasta que se utiliza en metodo main de la clase APP
	 */
//public class Persona { La clase ademas de se una plantilla serve como tipo de datos */
// Acontiuación vamos a especificar 0 definar lo que caracteriza a una persona
// que le se llama de las cualquel formas
//Seguintes
// 1. Campos (field)
// 2. variables miembros de las clase(como el lenguaje C++)
// 3. Atributos
// 4. propiedades
	/**
	 * CONCEPTO DE VARIABLE:
	 * 
	 * Es un identificador, es decir, un nombre, que hace referencia a una
	 * ubicacion, direccion, en la memoria RAM del equipo y en la cual se puede
	 * almacenar un valor de un tipo de dato concreto.
	 * 
	 * El identificador, es decir, el nombre de la variable, NO puede comenzar un
	 * numero y tampoco puede tener espacios en blanco.
	 * 
	 * Lo correcto es que el nombre utilice, lo notacion llamada camel case, que
	 * implica que la primera letra sea en minusculas y a partir de ahi letra
	 * mayuscula cuando haya una inflexion, un cambio.
	 * 
	 * /* La variable nombre, declarada a continuacion, solamente va a permitir que
	 * se almacenen en ella cadenas de caracteres, es decir, letras de la A a la Z
	 * mayusculas y minusculas, porque antes del nombre de la variable (nombre)
	 * hemos puesto el tipo de datos String que indica que la variable solamente
	 * puede almacenar valores encerrados entre comillas dobles
	 */

	String nombre = "Susana de las mercedez";
	String primerApilldo = "Martinez";

	double estatura = 1.75;
	int totalCoches = 2;
	// El modificador final impide que se pueda cambiar el valor de una variable, 
			// por lo cual se convierte una variable a una constante.
			static final String PAIS = "España";	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre, String primerApilldo, double estatura, int totalCoches) {
		super();
		this.nombre = nombre;
		this.primerApilldo = primerApilldo;
		this.estatura = estatura;
		this.totalCoches = totalCoches;
		
		
		
	}

	
	

	



	 
	 
}

