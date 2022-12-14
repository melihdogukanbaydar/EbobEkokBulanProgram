import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob = 1, ekok = 0;
        System.out.print("n1 Sayısını Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 Sayısını Giriniz : ");
        int n2 = input.nextInt();

       int i =1;
        while ( i  <= n1 && i <= n2 ){
            if (n1%i == 0 && n2%i == 0){
                ebob = i;

            }
            i++;

        }
          i++;
        System.out.println("EBOB : " + ebob);
        ekok = n1*n2/ebob;
        System.out.println("EKOK : " + ekok);

    }
}