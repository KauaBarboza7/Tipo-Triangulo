import java.util.Scanner;


 class TipoTriangulo {
	 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int x, y, z;
		
		

        System.out.print("Digite o valor do lado 1: ");
         x = scanner.nextInt();

        System.out.print("Digite o valor do lado 2: ");
         y = scanner.nextInt();

        System.out.print("Digite o valor do lado 3: ");
         z = scanner.nextInt();
		 
		 
		 if(x > 0 && y > 0 && z > 0){
			 
		 }
		 
		 else{
		 System.out.printf("Este nao e um triangulo  "  \n\n);
		 
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
		 
		 
		  
    }
}
