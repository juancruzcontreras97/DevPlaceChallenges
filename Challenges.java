import java.util.Scanner;

public class Challenges {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		challenge_1(input);
		challenge_2(input);
		challenge_3(input);
		challenge_4(input);
		challenge_5(input);
		input.close();
	}
		
		
	static void challenge_1(Scanner input) {
		/*
		 * Determinacion de si un numero ingresado es o no es primo
		 * @param input Scanner comun al programa
		 */
		System.out.println("Ingrese un numero");
	    int numero = input.nextInt();
	    do {
	    	if (esPrimo(numero))
	    		System.out.println("Es primo");
	    	else
	    		System.out.println("NO es primo");
	    	numero = input.nextInt();
	    }
	    while (numero!=0);
	}
	
	static boolean esPrimo(int numero) {
		for (int i=2;i<numero;i++)
			if (numero%i==0)
				return false;
		return true;
	}
				
	static void challenge_2(Scanner input) {
		/*
		 * Validacion de contrasenia con 3 intentos posibles
		 */
		System.out.println("Ingrese una contrasenia");
	    String pass = input.next();
	    String newPass = "";
	    boolean acierto = false;
	    int intentosFallidos = 0;
	    
	    while (intentosFallidos < 3 && !acierto) {
	    	System.out.println("Ingrese nuevamente la contrasenia");
	    	newPass = input.next();
	    	if (!newPass.equals(pass)) {
	    		System.out.println("contrasenia erronea, intenta nuevamente");
	    		intentosFallidos++;
	    	}
	    	else
	    		acierto = true;
	    }
	    
	    if (acierto)
	    	System.out.println("Felicitaciones, recordas la contrasenia!");
	    else
	    	System.out.println("Tenes que ejercitar la memoria");
	}
	
	static void challenge_3(Scanner input) {
		/*
		 * Calculo del importe a cobrar por un empleado a partir de datos
		 * de valor por hora, horas trabajadas y antiguedad
		 * 
		 */
		
		System.out.println("Ingrese el valor x hora de un empleado");
	    float valorXHora = input.nextFloat();
	    
	    System.out.println("Ingrese el nombre del empleado");
	    String nombre = input.next();
	    
	    System.out.println("Ingrese la antiguedad del empleado");
	    int antiguedad = input.nextInt();
	    
	    System.out.println("Ingrese la cantidad de horas trabajadas");
	    int cantHorasTrabajadas = input.nextInt();
	    
		float importe = cantHorasTrabajadas * valorXHora;		

		if (antiguedad>10)
			importe += antiguedad * 30;
			
		System.out.println(String.format("Nombre: %s \t Antiguedad: %d \t Importe a cobrar: %f \n", nombre,antiguedad,importe));
	}
	
	static void challenge_4(Scanner input) {
		/*
		 * Adivinanza de un numero aleatorio entre 0 y 1000, con pista de si el  
		 * numero ingresado es mayor, menor o igual al buscado
		 */
		int random = (int) Math.floor(Math.random() * 1001);
		System.out.println("Ingrese un numero");
		int guess = input.nextInt(); 
		
		do {
			if (guess>random)
				System.out.println("Es menor");
			else
				System.out.println("Es mayor");
			guess = input.nextInt();//nuevo numero
		} 
		while (guess != random);
		
		System.out.println("Numero encontrado! " + random);
}
	
	static void challenge_5(Scanner input) {
		/*
		 * ingreso de numeros que seran registrados como el mayor, menor y
		 * la suma de todos los numeros ingresados
		 */
		int mayor = -999;
		int menor = 999;
		int sum = 0;
		int sumPares = 0;
		
		System.out.println("Ingrese un numero");
		int numero = input.nextInt(); 
		do {
			if (numero > mayor) 
				mayor = numero;
			if (numero < menor)
				menor = numero;
			if (numero % 2 == 0)
				sumPares+= numero;
			sum+= numero;
			System.out.println("Ingrese un numero");
		} while (numero != -1);
		numero = input.nextInt();
		System.out.println(String.format("Mayor: %d \t Menor: %d \t Suma: %d \t Suma Pares: %d\n",mayor,menor,sum,sumPares));
	}
}
