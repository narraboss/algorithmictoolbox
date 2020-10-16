package ttt;

public class Gcd {
    public static void main(String[] args) {
        long a = 708787872;
        long b = 896676672;
        long best = 1;
//        for (long i = 1; i <a+b; i++) {
//            if(a%i==0 && b%i==0){
//                best = i;
//            }
//        }


//        for (long i = a+b; i > 1; i--) {
//            if(a%i==0 && b%i==0){
//                best = i;
//                break;
//            }
//        }
//        System.out.println(best);

        System.out.println( calculategbd(a,b));

    }
//euclid 
    public static long calculategbd(long a, long b){
        if(b==0){
            return a;
        }
        return  calculategbd(b,a%b);
    }
}
