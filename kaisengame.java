import java.util.Scanner;
import java.util.Random;
class kaisengame{


  public static void main(String[] arg){
    int i, k, l;
    int c[];
    c = new int[5];
    int [] hp = {5, 5, 5, 5};
    Scanner sc = new Scanner(System.in);
    do{
      System.out.println("攻撃された戦艦を選択してください：A1　1,　A5　2,　E1　3,　E5　4");
      i = sc.nextInt();
      if(hp[i-1] != 0){
        sennkan_hp(i,hp);
        System.out.println("戦艦" + i + "の残りHPは" + hp[i-1] + "です");
      }else{
        System.out.println("その戦艦はすでに破壊されています");
      }
  //  }while(hp[0]!=0 || hp[1]!=0 || hp[2]!=0 || hp[3]!=0);

  //  int c[a];
    if (i == 5) {
        //choose attack
        k = phase1();
        l = phase2();

        //get kind of attack
        System.out.println("Please input kind of attack!(1:HIT! 2:big wave 3:no hit)");
        int koa = sc.nextInt();


        switch (koa){
            case 1:
            for (int a = 1; a < 6; a++ ) {
                if (c[a] > 1) {
                    //attack same point again
                    System.out.println("attack same point again");
                }
            }
            case 2 || 3:
            System.out.println("try again");
        }

    }

    //int c[a];
    c[0] = c[1] = c[2] = c[3] = c[4] = 0;

  //  do {
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
  public static int phase1() {
      return rnd(4);
  }

  public static int phase2(){
      return rnd(3);
  }

  public static int rnd(int i) {
      //1~iまでの乱数を作成
      Random ra = new Random();
      int rndValue = ra.nextInt(i);
      rndValue = rndValue +1;
      return rndValue;
  }
  static void sennkan_hp(int x, int [] hp){
    hp[x-1] = hp[x-1] - 1;
  }
}
