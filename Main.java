import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        double USD= 3.526;
        double EUR= 3.685;
        double sum;
        int order;
        do {
            for (String options: Arrays.asList(
                    "press 0 to exit",
                    "press 1 to convert NIS to USD",
                    "press 2 to convert USD to NIS",
                    "press 3 to convert EUR to NIS", "press 4 to convert NIS to EUR"
            )){

                System.out.println( options);
            }
            order= scanner.next().charAt(0);
            switch (order){
                case '1', '2','3','4'->{
                    System.out.println("enter a sum:");
                    sum= scanner.nextDouble();
                    if (order=='1') System.out.println(sum/ USD);
                    if (order=='2') System.out.println(sum* USD);
                    if (order=='3') System.out.println(sum*EUR);
                    if (order=='4') System.out.println(sum/ EUR);

                }
            }

        }while (order!= 0);{
            System.out.println("exit");
        }






    }



}




