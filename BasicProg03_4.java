import java.util.Scanner;
public class BasicProg03_4 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
  
    System.out.println("何個*を表示しますか?");
  
    int n = stdIn.nextInt();

    int i = 1;
    while (i<=n) {
      if (i%5==0) {
        System.out.print("*\n");
      } else {
        System.out.print('*');
      }
      i++;
    }

    stdIn.close();
  }
}