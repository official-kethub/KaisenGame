import java.util.Scanner;
class kaisenn1{


  public static void main(String[] arg){
    int i;
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
    }while(hp[0]!=0 || hp[1]!=0 || hp[2]!=0 || hp[3]!=0);

  }
  static void sennkan_hp(int x, int [] hp){
    hp[x-1] = hp[x-1] - 1;
  }
}
