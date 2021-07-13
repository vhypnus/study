import java.util.Random;

public class MathSample {

    public static void main(String[] args) {
        Random r = new Random() ;

        Random r1 = new Random() ;

        for (int i = 0 ;i < 50 ;i++){
            for(int j = 0 ;j < 4;j++){
                Integer a = r.nextInt(80)+10 ;
                a = a == 0?1:a ;
                Integer b = r1.nextInt(10);
                b = b== 0?1:b ;
                System.out.print(a+" x " +b +" =        ") ;
            }
            System.out.print("\n\n\n\n\n") ;
        }




    }
}
