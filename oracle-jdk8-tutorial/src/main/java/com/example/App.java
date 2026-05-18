
/** El alcance o ambito (scope) de los elementos de una clase, que tambien se les llama
* los miembros de una clase, que pueden tanto los campos, variables miembros, propiedades
* o atributos de la clase, como los metodos o funciones miembros de la clase, solamente 
* pueden existir en El Plano de las Clases o en El Plano de las Instancias 
* * ¿Que quiere decir que un elemento vive en El Plano de las Instancias? 
* 
* Quiere decir que para el elemento exista tiene que ser a traves de un objeto o una 
* instancia de la clase que lo contiene 
* ¿Que quiere decir que un elemento vive en El Plano de las Clases ?
* 
* Quiere decir, que no hace falta crear un objeto, o instancia, de la clase que lo contiene
* para que el elemento tenga vida
* 
* ¿Como distinguir un elemento (variable o metodo) para saber en cual plano existe?
* 
* Rta. Por el modificador static que llevaria delante si se trata de un elemento que 
* vive en El Plano de las Clases, y de lo contrario, es decir, si viviera en el plano de las
* instancias NO llevaria delante el modificador static */





package com.example;

public class App {
	// La variable siguiente es una variable de instancia, porque no lleva el modificador static

	int variable1 = 5;

	// La siguiente variable es de Clase porque lleva delante el modificador static

	static double salario = 3500.25;	

	public static void main(String[] args) {
	// Imprimir el valor de la variable , o campo de clase, variable 
	Estudiante estudiante1 	= new Estudiante();
	// Instancia u objeto de la clase contenadora de la variable
	/* A la variable salario puedo acceder sin hacer nada en absoluto, porque 
	* es static y desde un metodo static, como es el metodo main puede acceder a
	* la misma sin ningun codigo adicional */
	/* A la variable salario puedo acceder sin hacer nada en absoluto, porque 
	* es static y desde un metodo static, como es el metodo main puede acceder a
	* la misma sin ningun codigo adicional */
	
	
	
	
		
} 
}