public class CalculatePower {
	
	public static void main (String[] args){
		
		int numeroBase = 4;
    	int numeroExponente = 6;
    	

    	System.out.println("Calculate power of a number made by Dennis");

    	int resultado = (int) Math.pow(numeroBase, numeroExponente);


    	System.out.println("We have 2 numbers, number 4 is the base number and number 6 is the power number");
    	System.out.println("The result is: ");
    	System.out.println(resultado);

    	if(resultado%2==0){
        System.out.println("The result is even");
    	}
    	else
    	{
        System.out.println("The result is odd");
   		}

	}
	
	
}