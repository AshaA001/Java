package collections.arrays.integer;

public class insertion_anywhere {
    public static void main(String[] args){
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 16;
        arr[2] = 22;
        arr[3] = 13;
        arr[4] = 44;
        arr[5] = 15;

        int n =6;
        int key = 50;
        int pos = 3;

        System.out.println("Before insertion: ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }

        n = insertAnywhere(arr, n, key, pos);

        System.out.println("After insertion: ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }

    private static int insertAnywhere(int[] arr, int n, int key, int pos) {
        for(int i = n-1; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = key;
        return n+1;
    }
}
