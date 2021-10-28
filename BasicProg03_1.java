import java.util.Scanner;
public class BasicProg03_1 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("x,y,zを昇順に並べます。\n3つの数値を入力してください。");
    
    System.out.println("1つ目の値を入力してください。");
    int x = stdIn.nextInt();
    
    System.out.println("2つ目の値を入力してください。");
    int y = stdIn.nextInt();
    
    System.out.println("3つ目の値を入力してください。");
    int z = stdIn.nextInt();

    // // 最大値を求める
    int max = x>y ? x : y;
    max = max>z ? max : z;

    // // 最小値を求める
    int min = x<y ? x : y;
    min = min<z ? min : z;

    // 中央値を求める
    int med = 0;
    if (x==y || y==z || z==x) {
      if (min <= x  && x <=max) {
        med = x;
      } else
      if (min <= y  && y <=max) {
        med = y;
      } else
      if (min <= z  && z <=max) {
        med = z;
      }
    } else {
      if (min < x  && x < max) {
        med = x;
      } else
      if (min < y  && y < max) {
        med = y;
      } else
      if (min < z  && z < max) {
        med = z;
      }
    }

    System.out.println("昇順に並べると、"+min+","+med+","+max+"となります。");
    stdIn.close();
  }
}