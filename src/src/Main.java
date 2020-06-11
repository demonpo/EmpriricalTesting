import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        triangleProblem();

    }


     public static void triangleProblem(){
        int a,b,c;
        boolean c1,c2,c3;

        //Step 1: get input
        do{
            System.out.println("Enter 3 integers which are sides of a triangle");
            Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter first side: ");
            a= sc.nextInt();
            System.out.print("Enter second side: ");
            b= sc.nextInt();
            System.out.print("Enter third side: ");
            c= sc.nextInt();

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
                System.out.println("Equilateral");
            }
            else if((a != b) && (a != c) && (b != c)){
                System.out.println("Scalene");
            }
            else{
                System.out.println("Isoceles");
            }

        }
        else {
            System.out.println("Not triangle");
        }

    }

}

