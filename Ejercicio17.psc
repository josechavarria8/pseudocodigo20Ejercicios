Algoritmo Ejercicio17
	
	
	Definir a como entero
	Definir b como entero
	Definir c como entero
	
	Escribir "Ingrese el primer lado:"
	Leer a
	Escribir "Ingrese el segundo lado:"
	Leer b
	Escribir "Ingrese el tercer lado:"
	Leer c
	
	Si a=b y a=c Entonces
		Escribir "El tri�ngulo es EQUIL�TERO"
	SiNo
		Si a<>b y a<>c y c<>b Entonces
			Escribir "El tri�ngulo es ESCALENO"
		SiNo
			Escribir "El tri�ngulo es IS�SCELES"
		Fin Si
	Fin Si
	
FinAlgoritmo
