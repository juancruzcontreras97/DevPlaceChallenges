void challenge_1() {
    int numero = 0;
    scanf("Ingrese un numero ", &numero);
    do {
        if (esPrimo(numero))
            printf("Es primo");
        else
            printf("NO es primo");
        scanf("Ingrese un numero ", &numero);
    }
    while (numero!=0);
}

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
    scanf("Ingrese una contrasenia ", pass);
    char[31] newPass = "";
    int acierto = 0;
    int intentosFallidos = 0;

    while (intentosFallidos < 3 && !acierto) {
        scanf("Ingrese una contrasenia ", newPass);
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
    float valorXHora;
    char[24] nombre = "";
    int antiguedad;
    int cantHorasTrabajadas;
    float importe;

    scanf("\n Ingrese el valor x hora: %f", &valorXHora);
    scanf("\n Ingrese el nombre del empleado: %s", nombre);
    scanf("\n Ingrese la antiguedad: %d", &antiguedad);
    scanf("\n Ingrese la cantidad de horas trabajadas: %d", &cantHorasTrabajadas);
    importe = cantHorasTrabajadas * valorXHora;

    if (antiguedad>10) 
        importe+= antiguedad * 30;
    printf("Nombre: %s \t Antiguedad: %d \t Importe a cobrar: $%.2f",nombre,antiguedad,importe);
}

void challenge_4() {
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
