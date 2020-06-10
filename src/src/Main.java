import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        triangleProblem();

    }


    static public void triangleProblem(){

        //Step 1: get input
        System.out.println("Enter 3 integers which are sides of a triangle");
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first side: ");
        int a= sc.nextInt();
        if(!((1<= a) && (a<= 200))){
            System.out.println("Value of a is not in the range of permitted values");
            return;
        }
        System.out.print("Enter second side: ");
        int b= sc.nextInt();
        if(!((1<= b) && (b<= 200))){
            System.out.println("Value of a is not in the range of permitted values");
            return;
        }
        System.out.print("Enter third side: ");
        int c= sc.nextInt();
        if(!((1<= c) && (c<= 200))){
            System.out.println("Value of a is not in the range of permitted values");
            return;
        }
        System.out.println("Side A is " +a);
        System.out.println("Side B is " +b);
        System.out.println("Side C is " +c);


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
                System.out.println("Equilateral");
            }
            else if((a != b) && (a != c) && (b != c)){
                System.out.println("Scalene");
            }
            else{
                System.out.println("Isoceles");
            }

        }






    }

}

