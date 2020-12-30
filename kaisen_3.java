import java.util.Scanner;

class kaisen_3 {

  public static void main(String[] args) {
    int i, k, l;
    int c1, c2, c3, c4;
    Scanner sc = new Scanner(System.in);
    c1 = c2 = c3 = c4 = 0;
    
    do {
      System.out.println("Please type in 'i'");
      i = sc.nextInt();
      if (i == 1) {
        k = 1;
        c2 = c3 = c4 = 0;
        c1++;
        System.out.println("c1: " + c1 + " c2: " + c2 + " c3: " + c3 + " c4: " + c4);
      }
      if (i == 2) {
        k = 2;
        c1 = c3 = c4 = 0;
        c2++;
        System.out.println("c1: " + c1 + " c2: " + c2 + " c3: " + c3 + " c4: " + c4);
      }
      if (i == 3) {
        k = 3;
        c2 = c1 = c4 = 0;
        c3++;
        System.out.println("c1: " + c1 + " c2: " + c2 + " c3: " + c3 + " c4: " + c4);
      }
      if (i == 4) {
        k = 4;
        c2 = c3 = c1 = 0;
        c4++;
        System.out.println("c1: " + c1 + " c2: " + c2 + " c3: " + c3 + " c4: " + c4);
      }
      if (i == 5) {
        c1 = c2 = c3 = c4 = 0;
        System.out.println("c1: " + c1 + " c2: " + c2 + " c3: " + c3 + " c4: " + c4);
      }
      i = 0;
    } while (true);

  }
}
