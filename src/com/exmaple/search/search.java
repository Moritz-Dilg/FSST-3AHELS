package com.exmaple.search;

public class search {
    public static void search() {
        int[] a = {2,3,3,5,7,7,8,10,11,15,16,17};
        System.out.println("Index: " + linearSearch(a, 10));
        System.out.println("Index: " + binarySearch(a, 10));

    }

    private static int linearSearch(int[] a, int x) {
        int i;
        for (i = 0; i < a.length && a[i] != x; i++);
        if (i >= a.length) return -1;
        return i;
    }

    private static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int m = (low + high) / 2;
            if (a[m] == x) return m;
            else if (x > a[m]) low = m + 1;
            else high = m - 1;
        }
        return -1;
    }
}
