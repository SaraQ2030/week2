import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

                //Q1 ------------------------------------------Find the smallest number --------------------------------
//        System.out.print("Input the First number: ");
//        int x = input.nextInt();
//
//        System.out.print("Input the Second number: ");
//        int y = input.nextInt();
//        System.out.print("Input the third number: ");
//        int z = input.nextInt();
//
//        System.out.print("The smallest value is " +smallest(x,y,z) );

        //Q2------------------check if negative or positive or zero-----------------------------------------------------
//      System.out.println("Enter the number to check :");
//      int num=input.nextInt();
//      System.out.println(check(num));

        //Q3------------------check if password is valid --------------------------------------------------------------
        System.out.println("Enter the Password :");
        System.out.println("1/A password must have at least eight character.");
        System.out.println("2/A password consist of at least two digit ");
        System.out.println( "3/A password must contain at least two digit  "+
        "@ and _ are accepted");

      String pass=input.next();
      System.out.println(password(pass));

    }

    public static String password(String pass){
        char ch;
        int count_letter=0;
        int count_number=0;
        int symbol=0;
        if (pass.length()>=9){
            for(int i=0;i<pass.length();i++) {
                ch = pass.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    count_letter++;

                } else if ((ch >= '0' && ch <= '9')) {
                    count_number++;
                }else if( ch=='!' || ch=='#'||ch=='$'|| ch=='%' || ch=='^'  ||
                        ch=='&' || ch=='*' || ch=='('||ch==')' ||ch=='-'    ||
                        ch=='='||ch=='+' ||ch==';' ||  ch=='`'||ch=='|' || ch=='}'||
                        ch=='{'||ch=='[' ||ch==']')

                    {//not accept the symbols
                              System.out.println("Not valid password "+pass);
                              symbol++;
                     }
            }
            if(count_number>=2 && count_letter>=2 && symbol==0){
                System.out.println("Valid password "+pass);

            }else
                System.out.println("Password contains least two digits");

           // System.out.println("Password consist only letters and digits");


        }else { System.out.println("Password must be at least 10 character");}


        return pass;
    }


    public static int check(int x){
        if(x>0){
            System.out.println("Positive Number");
        } else if (x<0) {
            System.out.println("Negative Number");
        }else  System.out.println("It is a Zero");
        return x;
    }

    public static int smallest(int x,int y,int z){
        int smallest;
        if(x<y){
            if(x<z){
                smallest=x;
            }else {
                smallest=z;
            }
        } else if (y<z) { smallest=y;

        }else
            smallest = z;

        return  smallest;
    }
}