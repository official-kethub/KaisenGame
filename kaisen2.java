import java.util.Scanner;
import java.util.Random;

class kaisen_2 {

    public static void main(String[] args) {
        int i, k, l;
        int c[a];
        if (i == 5) {
            //choose attack
            k = phase1();
            l = phase2();

            //get kind of attack
            Scanner sc = new Scanner(System.in);
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


}
