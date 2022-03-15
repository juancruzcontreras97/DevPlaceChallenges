import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("Ingrese una contrasenia");
		Scanner input = new Scanner(System.in);
		String pass = input.next();
		
		Password p = new Password(pass);
		System.out.println(p.getContrasenia());
		System.out.println(p.esFuerte());
		
		p = new Password(16);
		System.out.println(p.getContrasenia());
		System.out.println(p.esFuerte());
		
		p = new Password();
		System.out.println(p.getContrasenia());
		System.out.println(p.esFuerte());
		
		input.close();

	}

}
