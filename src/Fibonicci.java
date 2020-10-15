import java.util.Scanner;

public class Fibonicci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        int i = input.nextInt();
if(i<0){
    System.out.println("not eligible");

}else if(i==0){
    System.out.println(0);
}else if(i==1) {
    System.out.println(1);
}else {
    long[] f = new long[i+1];
    f[0]=0;
    f[1]=1;
    for (int h=2 ; h<=i; h++)
    {
    f[h]= f[h-1]+f[h-2];
    }
    System.out.println( f[i]);

}

    }
private static int calculateFibonicci(long i){
        if(i==0){
            return  0;
        }
        if (i==1){
            return  1;
        }
        return  calculateFibonicci(i-1) + calculateFibonicci(i-2);
}

}
