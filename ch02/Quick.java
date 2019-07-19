public class Quick {
    public static void sort(Comparable[] a ){
        //eliminate dependence on input
        StdRandom.shuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if(hi <= lo) return;
        int j = partition (a, lo, hi);
        sort(a, lo, j-1); //sort left part
        sort(a, j+1, hi); //sort right part
    }

    private static int partition(Comparable[] a, int lo, int hi){
        int i = lo, j = hi+1;
        Comparable v = a[lo]; //pivot

    }
}