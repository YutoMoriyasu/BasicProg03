import java.util.Scanner;
public class BasicProg03_5 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("1以上の自然数を入力してください。");

    int n = stdIn.nextInt();

    int i = 1;
    while (i<=n) {
      System.out.printf("%"+(n-i+1)+"s", i%10); // 行の1文字目を入力
      for (int j = 1; j < 2*i-1; j++ ) {
        System.out.print(i%10); // 行の2文字目以降を入力
      }
      System.out.print("\n"); // 改行する
      i++;
    }
    stdIn.close();
  }
}