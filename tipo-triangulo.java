import java.util.Scanner;


    public class TipoTriangulo {
	 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int x, y, z;
		double cateto1, cateto2, hipotenusa;
		
	    
       		System.out.print("Digite o valor do lado 1: ");
         	x = scanner.nextInt();

        	System.out.print("Digite o valor do lado 2: ");
        	 y = scanner.nextInt();

        	System.out.print("Digite o valor do lado 3: ");
         	z = scanner.nextInt();
         
        	System.out.print("\n\n");
		 
		 
		if (x > 0 && y > 0 && z > 0){
		 }
		 
		else {
		System.out.printf(" Esta forma nao é a de um triangulo! " );
		return;
		 }
		 
		 
         	if( x == y && y == z){
        	System.out.printf("Este e um triangulo equilatero " );
		 }
		 
		 
	        else if (x == y || x == z || y == z){
		System.out.printf("Este e um triangulo Isosceles " ); 
		 }
		 
		else{
	   	System.out.printf("Este e um triangulo Escaleno " );
	    
		 } 
		 
	    	System.out.printf("\n\n\n" ); 
		 
	        System.out.print(" Coloque o valor do cateto 1: ");
                cateto1 = scanner.nextDouble();

                System.out.print(" Coloque o valor do cateto 2: ");
                cateto2 = scanner.nextDouble();

       		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        	System.out.printf("\n\n" );

       		System.out.println("A hipotenusa é: " + hipotenusa);
      
		  
    }
}
