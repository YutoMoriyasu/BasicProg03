import java.util.Scanner;
public class BasicProg03_3 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int digit = 0;

    System.out.println("入力された整数の桁数を判定します。");

    int num = stdIn.nextInt();

    while (num != 0) {
      num = num / 10;
      digit++;
      System.out.println(num);
    }

    System.out.println("桁数は"+digit+"桁です。");
    stdIn.close();
  }
}
