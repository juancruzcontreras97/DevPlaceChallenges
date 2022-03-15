void challenge_1() {
    /*
    * Validacion de si un numero ingresado es primo o no
    */
    int numero = 0;
    printf("Ingrese un numero ");
    scanf("%d", &numero);
    do {
        if (esPrimo(numero))
            printf("Es primo");
        else
            printf("NO es primo");
        printf("Ingrese un numero ");
        scanf("%d", &numero);
    } while (numero!=0);
}

/*
* Funcion entera que valida si un numero pasado por parametro es primo o no
*/
int esPrimo(int numero){
    for (int i = 2; i < numero; i++)
        if (numero % i === 0)
            return 0;
    return 1;
}

void challenge_2() {
    /*
    * Validacion de contrasenia con 3 intentos posibles
    */
    char[31] pass = "";
    printf("Ingrese una contrasenia ");
    scanf("%s", pass);
    char[31] newPass = "";
    int acierto = 0;
    int intentosFallidos = 0;

    while (intentosFallidos < 3 && !acierto) {
        printf("Ingrese nuevamente la contrasenia ");
        scanf("%s", pass);
        if (strcmp(newPass,pass)==0) {
            printf("Contrasenia erronea, intenta nuevamente");
            intentosFallidos++;
        }
        else
            acierto = 1;
    }

    if (acierto)
        printf("Felicitaciones, recordas la contrasenia!");
    else
        printf("Tenes que ejercitar la memoria");
}

void challenge_3() {
    /*
    * Calculo de importe a cobrar a partir de los valores proporcionados y con criterio de antiguedad
    */
    float valorXHora;
    char[24] nombre = "";
    int antiguedad;
    int cantHorasTrabajadas;
    float importe;

    print("\n Ingrese el valor x hora: ");
    scanf("%f", &valorXHora);
    print("\n Ingrese el nombre del empleado: ");
    scanf("%s", nombre);
    print("\n Ingrese la antiguedad: ");
    scanf("%d", &antiguedad);
    print("\n Ingrese la cantidad de horas trabajadas: ");
    scanf("%d", &cantHorasTrabajadas);
    importe = cantHorasTrabajadas * valorXHora;

    if (antiguedad>10) 
        importe+= antiguedad * 30;
    printf("Nombre: %s \t Antiguedad: %d \t Importe a cobrar: $%.2f",nombre,antiguedad,importe);
}

void challenge_4() {
    /*
    * Adivinanza de un numero aleatorio, con pistas de si es mayor o menor al generado
    */
    int guess;
    int random = rand() % 1001;

    printf("\n Ingrese un numero ");
    scanf("%d", &guess);
    do {
        if (guess > random)
            printf("\n Es menor");
        else
            printf("\n Es mayor");
        printf("\nIngrese un numero ");
        scanf("%d", &guess);
    } while (guess != random);
    printf("\n Numero %d encontrado!",random);
}

void challenge_5() {
    /*
    * Ingreso de numeros y registro del mayor, menor, suma total y suma de numeros pares
    */
    int mayor = -999, menor = 999, sum = 0, sumPares = 0, numero;
    
    printf("\nIngrese un numero ");
    scanf("%d", &numero); 
    do {
        if (numero > mayor) 
            mayor = numero;
        if (numero < menor)
            menor = numero;
        if (numero % 2 == 0)
            sumPares+= numero;
        sum+= numero;
        printf("\nIngrese un numero ");
        scanf("%d", &numero); 
    } while (numero != -1);
    printf("Mayor: %d \t Menor: %d \t Suma: %d \t Suma Pares: %d",mayor,menor,sum,sumPares);
}
