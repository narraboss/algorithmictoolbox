package ttt;

import org.apache.commons.lang3.ArrayUtils;

public class Mergesort {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 4, 2, 4, 67, 7};
         mergeSort(a);
        System.out.println(ArrayUtils.toString(a));
        }

    private static void  mergeSort(int[] a) {
        int len = a.length;
        if(len==1){
            return ;
        }
        int mid =len/2;

        int[] l = new int[mid];
        int[] r = new int[len-mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < len; i++) {
            r[i - mid] = a[i];
        }
         mergeSort(l);
         mergeSort(r);
        merge(a,l,r,mid,len-mid);
    }

    public static void merge(int[] f, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                f[k++] = l[i++];
            }
            else {
                f[k++] = r[j++];
            }
        }
        while (i < left) {
            f[k++] = l[i++];
        }
        while (j < right) {
            f[k++] = r[j++];
        }
    }


}
