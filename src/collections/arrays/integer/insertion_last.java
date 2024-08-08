package collections.arrays.integer;

public class insertion_last {
    public static void main(String[] args){
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 16;
        arr[2] = 22;
        arr[3] = 13;
        arr[4] = 44;
        arr[5] = 15;

        int n =6;
        int capacity = arr.length;
        int key = 50;

        System.out.println("Before insertion: ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }

        n = insertLast(arr, n, key, capacity);

        System.out.println("After insertion: ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }

    private static int insertLast(int[] arr, int n, int key, int capacity) {
        if(n>=capacity){
            return n;
        }
        arr[n] = key;
        return n+1;
    }


}
