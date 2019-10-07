/*
package com.company;
        import javax.print.DocFlavor;
        import java.math.BigInteger;
        import java.sql.SQLOutput;
        import java.time.LocalDate;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        while (i<=100) {
            System.out.print( i + " " ); i++;
        }

    }
}
*/

//Bài 2

        package com.company;
import javax.print.DocFlavor;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("nhap so:");
        int a = in.nextInt();

        if (a <= 0) {
            System.out.println("Lỗi");
        }
        else if (a >0 ){
            int tong=0;
           for (int i=1; i<=a; i++){
              tong = tong + (tong+1);}
            System.out.println( tong );
            }
        }
        }

/*
//Bài 4
        package com.company;
import javax.print.DocFlavor;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d x %d = %d \n", i, j, (i * j));            }
        }
    }
}*/
