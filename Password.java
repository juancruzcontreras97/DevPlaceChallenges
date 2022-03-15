public class Password {
	
	private int longitud;
	private String contrasenia;

	public Password() {
		setLongitud(8);
		this.contrasenia = generaPassword();
	}

	public Password(int longitud) {
		setLongitud(longitud);
		this.contrasenia = generaPassword();
	}
	
	public Password(String pass) {
		this.contrasenia = pass;
		setLongitud(pass.length());
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenia() {
		return contrasenia;
	}
	
	public boolean esFuerte() {
		/*
	    mas de:
	      - 2 mayusculas
	      - 1 minuscula
	      - 3 numeros
		 */
		int contMayus, contMinus, contNum;
		contMayus = contMinus = contNum = 0;
		for (int i=0; i<this.contrasenia.length();i++) {
			if (Character.isUpperCase(this.contrasenia.charAt(i)))
				contMayus++;
			if (Character.isLowerCase(this.contrasenia.charAt(i)))
				contMinus++;
			if (Character.isDigit(this.contrasenia.charAt(i)))
				contNum++;
		}
		if (contMayus>2 && contMinus>1 && contNum>3)
			return true;
		else 
			return false;
	}

	public String generaPassword() {
		String alfanumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789";
		StringBuilder sb = new StringBuilder();
		
		for (int i=0;i<this.longitud;i++) {
			int indice = (int) (alfanumeros.length() * Math.random());
			sb.append(alfanumeros.charAt(indice));
		}
		return sb.toString();
	}
}
