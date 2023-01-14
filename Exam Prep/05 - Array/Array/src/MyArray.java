public class MyArray {
    public static void main(String[] args){

        int[] a = new int[6];

        a[0] = 4;
        a[1] = 8;
        a[2] = 15;
        a[3] = 16;
        a[4] = 23;
        a[5] = 42;

        int[] b = new int[6];
        b[0] = 5;
        b[1] = 4;
        b[2] = 22;
        b[3] = 66;
        b[4] = 22;
        b[5] = 11;

        int sum = a[0] + a[1] + a[2] + a[3] + a[4] + a[5];
        System.out.println(sum);

        System.out.println(b[0]);
        b = a;
        System.out.println(b[0]);

        int[] c = {1,2,3,4,5,6};

    }
}
