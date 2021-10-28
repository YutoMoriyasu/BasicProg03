import java.util.Scanner;
public class BasicProg03_2 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("1~12までの整数を入力してください。");

    int input = stdIn.nextInt();

    switch(input) {
      case 12:
      case 1:
      case 2:
        System.out.println("Winter");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("Spring");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("Summer");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("Autumn");
        break;
    }

    stdIn.close();
  }
}