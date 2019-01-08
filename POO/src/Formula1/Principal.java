package Formula1;

import java.util.Iterator;


public class Principal {
	
	/*
	 *En este ejercicio vamos a simular la carrera de un conjunto de veh�culos. 
La carrera ser� lineal, no hay curvas. Los veh�culos se deslizar�n horizontalmente sobre la pantalla. 
El total de p�xeles del largo de la pista individual de cada coche puede ser el que t� prefieras, 
sin embargo te recomiendo que utilices al menos 500 p�xeles. 

Los veh�culos avanzar�n en riguroso turno, desde el primero al �ltimo. La cantidad de p�xeles que 
avanzar� cada coche depender� de un n�mero generado al azar.

La pista de cada veh�culo tendr�, al menos, dos tipos de elementos "extra": manchas de aceite, que 
restar�n velocidad al coche cuando se pase sobre ellas; y rampas, que aumentar�n la velocidad 
del coche. No hay forma de evitar los elementos "extra", los veh�culos deben atravesar las manchas de
aceite y las rampas que formen parte de su pista.

La localizaci�n de cada elemento "extra" se crear� al azar y todas las pistas de coche deben tener
la misma cantidad de elementos (4) aunque la distribuci�n de los mismos se realizar� al azar, tanto 
en su n�mero, como en sus caracter�sticas y su localizaci�n.

Los puntos a conseguir en el videojuego son los siguientes:

1.- Existe un array de 5 elementos de tipo "Vehiculo". Los veh�culos pertenecer�n a, al menos, dos
	clases diferentes: coches y motos. Los coches y las motos deben ser definidas como clases que
	extiendan de la clase "Vehiculo". Todos los veh�culos tendr�n una variable que indique la 
	cantidad de metros que el veh�culo ha avanzado. La clase "Vehiculo" es abstracta, no desarrollando
	un m�todo de tipo "paint()" que pintar� el veh�culo en pantalla. El m�todo "paint" ser� desarrollado 
	en las subclases "Coche" y "Moto", siendo ligeramente diferente en cada una de ellas. Cada 
	objeto "Vehiculo" tiene un m�todo que se denomina "avanza()", que obtiene un n�mero al azar entre
	3 y 50, determinando la cantidad de "metros" de pista que el coche debe avanzar en su turno.
	
2.- Consigues que exista un sistema de turnos para todo el array de Vehiculos. En cada turno, un 
	vehiculo debe avanzar y mostrar en pantalla su posici�n. Para mostrar su posici�n lo haces en 
	modo texto, algo parecido a como lo hac�amos en las primeras versiones del juego de La Oca.
	
3.- Existe una clase llamada "Pista" de la que se obtienen nuevos objetos y se asocian con cada uno
	de los vehiculos. Existe una clase llamada "Obstaculo", que deriva en dos subclases llamadas
	"Rampa" y "ManchaAceite". Cada "Obstaculo" debe tener un valor que impulsa o retrasa al vehiculo,
	en realidad se trata de un valor num�rico entero. La clase "Obstaculo" es abstracta y no 
	desarrolla un m�todo llamado "inicializa()", que debe ser desarrollado en las subclases "Rampa" y
	"ManchaAceite". La clase "Rampa", cuando ejecuta su m�todo "inicializa()" obtendr� un n�mero
	positivo al azar, entre 50 y 100, ese valor indicar� que un veh�culo debe avanzar una cantidad 
	de "metros" al pasar sobre la "rampa". La clase "ManchaAceite" tendr� un desarrollo del m�todo
	"inicializa()" ligeramente diferente a la clase "Rampa", ya que se obtendr� al azar un n�mero
	negativo entre -10 y -50.
	
4.- Cada objeto de tipo "Pista" debe contener un array de 4 elementos de tipo "Obstaculo". Se debe
	decidir al azar la cantidad de elementos de tipo "Rampa" y "ManchaAceite" que existir�n en el
	array. La localizaci�n de cada "Obstaculo" sobre la pista se realizar� al azar, pero los obstaculos
	no pueden superponerse.
	
5.- Realizas una carrera de los veh�culos que tienes en tu array, cada uno sobre su propia pista. 
	Cada pista es creada al azar. 
	
6.- Debes crear un "podium" con los ganadores, que almacene las tres primeras posiciones de los
	veh�culos. Debes mostrar esto en la consola.
	
7.- Entorno gr�fico. Debe aparecer una ventana que muestra las pistas, los coches y los obst�culos.

8.- Los coches se deben mostrar con una composici�n vectorial que simule un coche y las motos se
	deben comportar de forma similar. Cada coche y moto tendr� un color al azar y que no puede 
	repetirse.
	
9.- La carrera debe avanzar por turnos, utiliza el JOptionPane para poder ver cada paso de la carrera

10.- Sonido. Existir� un sonido cont�nuo de motores en marcha. Cuando un veh�culo pise una mancha
	de aceite debe escucharse un sonido adecuando. Al igual debe suceder con las rampas.
	
11.- Cuando el juego acabe se debe mostrar una pantalla completamente diferente, con el podium. 
	 */
	
	public static  Vehiculo coche[] = new Coches[5];
	public static  Vehiculo moto[] = new Motos[5];
	


	public static void main(String[] args) {	
		
		inicializaVehiculos();
		
		recorreVehiculos();
		
	}
	
	private static void inicializaVehiculos(){
		moto[0] = new Motos();
		moto[1] = new Motos();
		moto[2] = new Motos();
		moto[3] = new Motos();
		moto[4] = new Motos();
		
		coche[0] = new Coches();
		coche[1] = new Coches();
		coche[2] = new Coches();
		coche[3] = new Coches();
		coche[4] = new Coches();
		
	}
	
	private static void recorreVehiculos(){
		System.out.println("Motos: ");
		
		for (int i = 0; i < moto.length; i++) {
			System.out.println(moto[i].turno + "-" + moto[i].posicion + "-" + moto[i].avanza());
		}
		
		System.out.println("Coches: ");
		
		for (int i = 0; i < coche.length; i++) {
			System.out.println(coche[i].turno + "-" + coche[i].posicion + "-" + coche[i].avanza());
			
		}
		
	}

}
