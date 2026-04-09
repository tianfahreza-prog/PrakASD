package P6;

public class SortingMain19 {
    static int a[]= {20,10,2,7,12};
    static int b[] = {30, 20, 2, 8, 14};
    static int c[] = {40, 10, 4, 9, 3};

    static Sorting19 dataurut1 = new Sorting19(a,a.length);
    static Sorting19 dataurut2 = new Sorting19(b, b.length);
    static Sorting19 dataurut3 = new Sorting19(c, c.length);

    public static void main(String[] args) {
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
