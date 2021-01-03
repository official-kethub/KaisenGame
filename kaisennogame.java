import java.util.Scanner;
import java.util.Random;
class kaisennogame{


  public static void main(String[] arg){
    String at = "NoData";
    String ni = "NoData";
    int i, k, l;
    int c[];
    //choose attack
  //  k = phase1();
  //  l = phase2();
    c = new int[5];
    int [] hp = {5, 5, 5, 5};
    Scanner sc = new Scanner(System.in);
    do{
      k = phase1();
      l = phase2();

      System.out.println("攻撃された戦艦を選択してください：A1　1,　A5　2,　E1　3,　E5　4  攻撃されていない場合は 5");
      i = sc.nextInt();
      //int c[a];
      c[0] = c[1] = c[2] = c[3] = c[4] = 0;

    //  do {
      //  System.out.println("Please type in 'i'");
      //  i = sc.nextInt();
        if (i == 1) {
          k = 1;
          c[2] = c[3] = c[4] = 0;
          c[1]++;
          //System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
        }
        if (i == 2) {
          k = 2;
          c[1] = c[3] = c[4] = 0;
          c[2]++;
          //System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
        }
        if (i == 3) {
          k = 3;
          c[1] = c[2] = c[4] = 0;
          c[3]++;
          //System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
        }
        if (i == 4) {
          k = 4;
          c[1] = c[2] = c[3] = 0;
          c[4]++;
          //System.out.println("c1: " + c[1] + " c2: " + c[2] + " c3: " + c[3] + " c4: " + c[4]);
        }

      if(i<5){
      if(hp[i-1] != 0){
        sennkan_hp(i,hp);
        System.out.println("戦艦" + i + "の残りHPは" + hp[i-1] + "です");
      }else{
        System.out.println("その戦艦はすでに破壊されています");
      }
      if(hp[0] == 0 && hp[1] == 0 && hp[2] == 0 && hp[3] == 0){
        System.out.println("敗北");
        break;
      }
      System.out.println("前回の攻撃はどうでしたか。(1:HIT! 2:波高し 3:no hit)");
      int koa = sc.nextInt();
      if(k==1 && l==1){
        at = "A2";
      }
      if(k==1 && l==2){
        at = "B1";
      }
      if(k==1 && l==3){
        at = "B2";
      }
      if(k==2 && l==1){
        at = "A4";
      }
      if(k==2 && l==2){
        at = "B4";
      }
      if(k==2 && l==3){
        at = "B5";
      }
      if(k==3 && l==1){
        at = "D1";
      }
      if(k==3 && l==2){
        at = "D2";
      }
      if(k==3 && l==3){
        at = "E2";
      }
      if(k==4 && l==1){
        at = "D4";
      }
      if(k==4 && l==2){
        at = "D5";
      }
      if(k==4 && l==3){
        at = "E4";
      }
    if(koa == 1) {
      System.out.println(ni + "を攻撃");
    }else
    System.out.println(at + "を攻撃");
}

  //  }while(hp[0]!=0 || hp[1]!=0 || hp[2]!=0 || hp[3]!=0);

  //  int c[a];
    if (i == 5) {
      c[1] = c[2] = c[3] = c[4] = 0;
        //choose attack
        /*k = phase1();
        l = phase2();*/

        //get kind of attack
        System.out.println("前回の攻撃はどうでしたか。(1:HIT! 2:波高し 3:no hit)");
        int koa = sc.nextInt();
        if(k==1 && l==1){
          at = "A2";
        }
        if(k==1 && l==2){
          at = "B1";
        }
        if(k==1 && l==3){
          at = "B2";
        }
        if(k==2 && l==1){
          at = "A4";
        }
        if(k==2 && l==2){
          at = "B4";
        }
        if(k==2 && l==3){
          at = "B5";
        }
        if(k==3 && l==1){
          at = "D1";
        }
        if(k==3 && l==2){
          at = "D2";
        }
        if(k==3 && l==3){
          at = "E2";
        }
        if(k==4 && l==1){
          at = "D4";
        }
        if(k==4 && l==2){
          at = "D5";
        }
        if(k==4 && l==3){
          at = "E4";
        }
        if(koa == 1) {
          System.out.println(ni + "を攻撃");
        }else
        System.out.println(at + "を攻撃");


        }




      i = 0;
      ni = at;



    //} while (true);

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
