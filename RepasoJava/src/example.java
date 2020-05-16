
public class example {
	
	public static void main(String[] args) {
		String mensaje1 = "Hola Mundo Pandémico";
		String mensaje2 = "Este es un mensajote muy largo se supone";
		
		boolean bandera1 = true;
		boolean bandera2 = false;
		
		int contador = 5;
		int num1 = 1;
		int num2 = 5;
		int resultado;
		
		if(bandera1)
		{	System.out.println(mensaje1);
			System.out.println(contador);
		}
		else
			System.out.println(mensaje2);
		
		for(int i=3; i<contador;i++)
		{
			System.out.println(mensaje1);
		}
		
		for(int i=0; i<contador;i++)
		{
			resultado = num1 + num2;
			System.out.println(resultado);
			num1 = num1 +i;
			System.out.println(num1);
			num2++;
		}
		
		int i = 2;
		while(i <= contador)
		{	System.out.println("Imprime consola");
			i++;
		}
		
			
}

}
