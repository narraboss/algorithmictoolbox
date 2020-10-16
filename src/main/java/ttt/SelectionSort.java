package ttt;

import org.apache.commons.lang3.ArrayUtils;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a1 = {2, 4, 1, 4, 2, 4, 67, 7};
        int[] a = {};

        for (int x = 0; x < a.length; x++) {
            for (int y = x+1; y < a.length; y++) {
                if(a[x]>a[y]){
                    int t = a[x];
                    a[x] = a[y];
                    a[y]= t;
                }
            }
        }
        System.out.println(ArrayUtils.toString(a));
    }
}
