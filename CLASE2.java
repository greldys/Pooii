//clase1
clase estudiante
//atributos
	publico definir nombre como caracter
	publico definir cedula como numerico
	publico definir direccion como caracter
	privado definir evaluaciones como notas
fin clase

//clase2
clase notas
//atributos
	privado definir parcial1, parcial2, parcial3, como real
	privado definir continua, como real
	privado definir trabajo, como real
	privado definir escala100, escala20, escala4, promedios, como real
	prublico definir date como fecha
//metodo para leer notas
	metodo leerNotas()
		mostrar "Introduzca nota de parcial 1:"
		leer parcial1
		mostrar "Introduzca nota de parcial 2:"
		leer parcial2
		mostrar "Introduzca nota de parcial 3:"
		leer parcial3
		mostrar "Introduzca nota de evaluacion continua:"
		leer continua
		mostrar "Introduzca nota de trabajo practico:"
		leer trabajo
	fin metodo
	
	metodo promedios (parcial1, parcial2, parcial3, continua, trabajo) //PARAMETRO
		escala100=parcial+parcial2+parcial3+continua+trabajo
		escala20=escala100/5
		escala4=escala20/5
	fin metodo

	metodo calcularNotas100() como entero //RETORNAR
		retornar escala100
	fin metodo
	metodo calcularNotas20() como entero //RETORNAR
		retornar escala20
	fin metodo
	metodo calcularNotas4() como entero //RETORNAR
		retornar escala4
	fin metodo

	metodo mostrarNotas()
		mostrar "Nota final en escala de 100 pts: ", evaluaciones.calcularNotas100()
		mostrar "Nota final en escala de 20 pts: ", evaluaciones.calcularNotas20() 
		mostrar "Nota final en escala de 4 pts: ", evaluaciones.calcularNotas4() 
	fin metodo

fin clase
//clase3
	clase fecha
		publico definir dia como entero
		publico definir mes como caracter
		publico definir año como entero

		metodo leerFecha()
			mostrar "Ingrese dia:"
			leer dia
			mostrar "Ingrese mes:"
			leer mes
			mostrar "Ingrese año:"
			leer año
		fin metodo
		
		metodo mostrarFecha()
			mostrar "FECHA: " dia "/" mes "/" año
		fin metodo 		
	fin clase

//algoritmo general
algoritmo int-comp
	definir evaluaciones como notas//definicion de objetos
	evaluaciones= nuevo notas()//instanciacion de clases
	definir estudiante1 como estudiante//definicion de objetos
	estudiante1= nuevo estudiante()//instanciacion de clases
	definir date como fecha
	date= nuevo fecha()

//entradas 
	evaluaciones.leerNotas()
	date.leerFecha()
//procesos
	evaluaciones.promedios(parcial1, parcial2, parcial3, continua, trabajo) //PARAMETROS
	evaluaciones.calcularNotas100() 
	evaluaciones.calcularNotas20()
	evaluaciones.calcularNotas4()
//salidas 
	evaluaciones.mostrarNotas()	
	evaluaciones.date.mostrarFecha()
fin algoritmo