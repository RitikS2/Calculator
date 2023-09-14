import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        
        int n1,n2,ch,cal;
        
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();
       
        System.out.println("Select Operation : 1(add) 2(sub) 3(multiply) 4(division) ");

        ch = sc.nextInt();
           
        if (ch == 1) {
            cal= n1+n2;
            System.out.println("ADDITION =" + cal);
        }
        else if (ch == 2){
            cal= n1-n2;
            System.out.println("SUBTRACTION =" + cal);
        } else if( ch == 3){
            cal= n1*n2;
            System.out.println("MUTIPLICATION =" + cal);
        } else if ( ch == 4 ){
           cal= n1/n2;
            System.out.println("DIVISION =" + cal);
        } else {
           cal= n1%n2;
            System.out.println("REMAINDER =" + cal);
        }
    }
}