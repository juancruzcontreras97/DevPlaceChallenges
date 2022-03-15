class Password {
	_longitud;
	_contrasenia;

    constructor (longitud,pass) {
        this._longitud = longitud;
        this._contrasenia = pass;
    }

    constructor (longitud) {
        this._longitud = longitud;
        this._contrasenia = generaPassword();
    }

    constructor () {
        this._longitud = 8;
        this._contrasenia = generaPassword();
    }
	
	get longitud() {
		return this._longitud;
	}

	set longitud(longitud) {
		this._longitud = longitud;
	}

	get contrasenia() {
		return this._contrasenia;
	}
	
	esFuerte() {
		/*
	    mas de:
	      - 2 mayusculas
	      - 1 minuscula
	      - 3 numeros
		 */
		let contMayus, contMinus, contNum;
		contMayus = contMinus = contNum = 0;
		for (let i=0; i<this._contrasenia.length();i++) {
			if (/[A-Z]/.test(this._contrasenia.charAt(i)))
				contMayus++;
			if (/[a-z]/.test(this._contrasenia.charAt(i)))
				contMinus++;
			if (/[0-9]/.test(this._contrasenia.charAt(i)))
				contNum++;
		}
		if (contMayus>2 && contMinus>1 && contNum>3)
			return true;
		else 
			return false;
	}

	generaPassword() {
		const alfanumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789";
        let indice;
        let pass = "";
		for (let i=0;i<this._longitud;i++) {
			indice = (int) (alfanumeros.length() * Math.random());
			pass.concat(alfanumeros.charAt(indice));
		}
		return pass;
	}
}

let pass = prompt("Ingrese una contrasenia");
let p = new Password(8);
console.log(p.getContrasenia());
console.log(p.esFuerte());