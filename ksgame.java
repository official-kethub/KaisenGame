import java.util.Scanner;
import java.util.Random;

class ksgame{;
    public static void main(String[] arg){
        int endflg = 0;
        Scanner sc = new Scanner(System.in);
        //while (endflg == 0) {
            System.out.println("あなたは攻撃する側ですか？1:はい2:いいえ");
            int ans = sc.nextInt();
            switch(ans){
                case 1:
                zibungakougeki();
                case 2:
                aitegakougeki();
                case 3:
                //endflg  =1;
            }
        //}
    }

    public static void zibungakougeki(){
        System.out.println("あなたが攻撃します");
        hensu.attackcnt = 0;
        if (hensu.hozk != 99) {
            hensu.k = hensu.hozk;
            hensu.l = hensu.hozl;
            hensu.hozk = 99;
            hensu.hozl = 99;
        }else{
            //choose attack
            hensu.k = phase1();
            hensu.l = phase2();
        }
        System.out.println("戦艦" + hensu.k + "が場所" +hensu.l + "を攻撃");
        //get kind of attack
        Scanner sc = new Scanner(System.in);
        System.out.println("攻撃した結果を入力(1:HIT! 2:big wave 3:no hit)");
        int koa = sc.nextInt();

        if (koa == 1) {
            hensu.hozk = hensu.k;
            hensu.hozl = hensu.l;
        }
        aitegakougeki();
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

    public static void aitegakougeki(){
        System.out.println("あなたが攻撃を受けます");
        System.out.println("攻撃された戦艦を選択してください：A1　1,　A5　2,　E1　3,　E5　4,攻撃されていない 5");
        Scanner sc = new Scanner(System.in);
        hensu.j = sc.nextInt();
        if (hensu.j != 5) {
            if(hensu.hp[hensu.j-1] != 0){
                sennkan_hp(hensu.j,hensu.hp);
                System.out.println("戦艦" + hensu.j + "の残りHPは" + hensu.hp[hensu.j-1] + "です");
            }else{
                System.out.println("その戦艦はすでに破壊されています");
            }
        attacked();
    } else{
        zibungakougeki();
    }
    }

    public static void sennkan_hp(int x, int [] hp){
        hp[x-1] = hp[x-1] - 1;
    }

    public static void attacked() {
        System.out.println("あなたの反撃です");
        hensu.attackcnt = hensu.attackcnt + 1;
        hensu.k = hensu.j;
        hensu.l = phase2();
        hensu.zenkai = hensu.l;
        if (hensu.attackcnt > 1) {
            if (hensu.l == hensu.zenkai) {
                while (hensu.l == hensu.zenkai) {
                    hensu.l = phase2();
                }
            }
        }
        System.out.println("戦艦" + hensu.k + "が場所" +hensu.l + "を攻撃");

        aitegakougeki();
    }
}
