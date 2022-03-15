const challenge_1 = () => {
    /*
     * Determinacion de si un numero ingresado es o no es primo
     */
    let numero = prompt("Ingrese un numero");
    do {
        if (esPrimo(numero))
            console.log("Es primo");
        else
            console.log("NO es primo");
        numero = prompt("Ingrese un numero");
    }
    while (numero !== 0);
}

const esPrimo = numero => {
    for (let i = 2; i < numero; i++)
        if (numero % i === 0)
            return false;
    return true;
}

const challenge_2 = () => {
    /*
    * Validacion de contrasenia con 3 intentos posibles
    */
    let pass = prompt("Ingrese una contrasenia");
    let newPass = "";
    let acierto = false;
    let intentosFallidos = 0;

    while (intentosFallidos < 3 && !acierto) {
        newPass = prompt("Ingrese nuevamente la contrasenia");
        if (newPass !== pass) {
            console.log("contrasenia erronea, intenta nuevamente");
            intentosFallidos++;
        }
        else
            acierto = true;
    }

    if (acierto)
        console.log("Felicitaciones, recordas la contrasenia!");
    else
        console.log("Tenes que ejercitar la memoria");
}

const challenge_3 = () => {
    /*
    * Calculo del importe a cobrar por un empleado a partir de datos
    * de valor por hora, horas trabajadas y antiguedad
    * 
    */
    const valorXHora = prompt("Ingrese el valor x hora de un empleado");
    
    const nombre = prompt("Ingrese el nombre del empleado");
    
    const antiguedad = prompt("Ingrese la antiguedad del empleado");
    
    const cantHorasTrabajadas = prompt("Ingrese la cantidad de horas trabajadas");
    
    let importe = cantHorasTrabajadas * valorXHora;		

    if (antiguedad>10)
        importe += antiguedad * 30;        
    console.log(`Nombre: ${nombre} Antiguedad: ${antiguedad} Importe a cobrar: $${importe}`);
}

const challenge_4 = () => {
    /*
    * Adivinanza de un numero aleatorio entre 0 y 1000, con pista de si el  
    * numero ingresado es mayor, menor o igual al buscado
    */
    const random = Math.floor(Math.random() * 1001);
    console.log("Ingrese un numero");
    let guess = prompt("Ingrese un numero"); 

    do {    
        if (guess>random)
            console.log("Es menor");
        else
            console.log("Es mayor");
        guess = prompt("Ingrese un numero"); //nuevo numero
    } while (guess !== random);

    console.log(`Numero ${random} encontrado!`);
}

const challenge_5= () => {
    /*
     * ingreso de numeros que seran registrados como el mayor, menor y
     * la suma de todos los numeros ingresados
     */
    let mayor = -999;
    let menor = 999;
    let sum = 0;
    let sumPares = 0;
    
    console.log("Ingrese un numero");
    let numero = prompt("Ingrese un numero"); 
    do {
        if (numero > mayor) 
            mayor = numero;
        if (numero < menor)
            menor = numero;
        if (numero % 2 == 0)
            sumPares+= numero;
        sum+= numero;
        numero = prompt("Ingrese un numero");
    } while (numero !== -1);
    console.log(`Mayor: ${mayor} Menor: ${menor} Suma: ${sum} Suma Pares: ${sumPares}`);
}

