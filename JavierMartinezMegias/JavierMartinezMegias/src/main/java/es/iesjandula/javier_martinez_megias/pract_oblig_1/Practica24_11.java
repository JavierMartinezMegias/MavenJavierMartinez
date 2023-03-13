package es.iesjandula.javier_martinez_megias.pract_oblig_1;

public class Practica24_11 {
	public static void main(String[] args) {
		String usuario = "ninguno";
		String password = "ninguno";
		
		boolean accesoSistema = false;
		
		if (usuario.equals("usuarioSecreto")&& password.equals("contraseñaSecreta"))
		{
			accesoSistema = true;
			System.out.println("Acceso al sistema realizado");
		}
		else
		{
			System.out.println("Aviso al personal de vigilancia");
		}
		
		boolean accesoAlNumeroSecreto = false;
		
		if (accesoSistema)
		{
			int numeroSecreto = 10;
			
			if (numeroSecreto ==20)
			{
				accesoAlNumeroSecreto = true;
			}
		}
	}
	
	public static void aperturaDeCompuerta() 
	{
		System.out.println("Apertura de compuerta realizada");
	}

}
