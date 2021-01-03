import java.util.Scanner;

class kaisen_3 {

  public static void main(String[] args) {
    int c[];
    c = new int[5];
    int i, k, l;
    //int c[a];
    Scanner sc = new Scanner(System.in);
    c[0] = c[1] = c[2] = c[3] = c[4] = 0;

    do {
      System.out.println("Please type in 'i'");
      i = sc.nextInt();
      if (i == 1) {
        k = 1;
        c[2] = c[3] = c[4] = 0;
        c[1]++;
        System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
      }
      if (i == 2) {
        k = 2;
        c[1] = c[3] = c[4] = 0;
        c[2]++;
        System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
      }
      if (i == 3) {
        k = 3;
        c[1] = c[2] = c[4] = 0;
        c[3]++;
        System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
      }
      if (i == 4) {
        k = 4;
        c[1] = c[2] = c[3] = 0;
        c[4]++;
        System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
      }
      if (i == 5) {
        c[1] = c[2] = c[3] = c[4] = 0;
        System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
      }
      i = 0;
    } while (true);

  }
}
