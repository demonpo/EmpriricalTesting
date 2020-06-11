public class Triangle{


public Triangle(){
  }

  public String triangleProblem(int a,int b,int c){
      String tipo;
      boolean c1,c2,c3;
        //Step 1: get input
        do{
            System.out.println("Enter 3 integers which are sides of a triangle");
             //System.in is a standard input stream
          
            System.out.printf("Enter first side: %d\n",a);
            
            System.out.printf("Enter second side: %d\n",b);
            
            System.out.printf("Enter third side: %d\n",c);
           

            c1 = (1 <= a) && (a <= 200);
            c2 = (1 <= b) && (b <= 200);
            c3 = (1 <= c) && (c <= 200);

            if(!c1){
                System.out.println("Value of a is not in the range of permitted values");
            }
            if(!c2){
                System.out.println("Value of a is not in the range of permitted values");
            }
            if(!c3){
                System.out.println("Value of 1a is not in the range of permitted values");
            }
            System.out.println("Side A is " +a);
            System.out.println("Side B is " +b);
            System.out.println("Side C is " +c);
        }while (!(c1 && c2 && c3));

        // Step 2: Is a trinagle?
        boolean isTriangle;
        if((a < b + c) && (b < a + c) && (c < a + b)){
            isTriangle = true;
        }
        else {
            isTriangle = false;
        }

        //Step 3: Determine Triangle type
        if(isTriangle){
            if((a==b)&&(b==c)){
                tipo="Equilateral";
            }
            else if((a != b) && (a != c) && (b != c)){
                tipo="Scalene";
            }
            else{
                tipo="Isoceles";
            }

        }
        else {
            tipo="Not triangle";
        }
      return tipo;
    }
    
}