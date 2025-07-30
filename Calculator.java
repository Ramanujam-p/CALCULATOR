import java.util.Scanner;
class Calculator
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      int a,b,c,r = 0;
      do{
        System.out.println("Calculator\n 1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.DIVISION\n0.EXIT");
        System.out.println("enter your choice:");
        a = sc.nextInt();
        sc.nextLine();
        switch(a)
        {
            case 1:
             System.out.println("enter two numbers:");
            b=sc.nextInt();
            c=sc.nextInt();
             r=b+c;
            System.out.println(r);
            break;
            case 2:
             System.out.println("enter two numbers:");
             b=sc.nextInt();
             c=sc.nextInt();
            r=b-c;
            System.out.println(r);
            break;
             case 3:
              System.out.println("enter two numbers:");
              b=sc.nextInt();
              c=sc.nextInt();
            r=b*c;
            System.out.println(r);
            break;
             case 4:
              System.out.println("enter two numbers:");
              b=sc.nextInt();
              c=sc.nextInt();
              if(c!=0) {
                r=b/c;
                System.out.println(r);
              }
              else
                System.out.println("Division by zero is not allowed.");
            break;
             case 0:
             System.out.println("exited successfully");
             break;
        }
    }while(a!=0);
    sc.close();
    }
}