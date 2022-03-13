import java.util.Scanner;
/**
 * fibonacci
 */
public class fibonacci {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, n1 = 0, n2 = 1, n3, counter = 0;
    System.out.print("Bir Sayı Giriniz: ");
    n = input.nextInt();

    for (counter = 0; counter < n; counter += 1){

      System.out.println(n1 + " ");

      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      
    }


    input.close();
  }
}