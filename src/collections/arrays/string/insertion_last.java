package collections.arrays.string;

public class insertion_last {
    public static void main(String[] args){
        String[] arr = new String[10];
        arr[0] = "abc";
        arr[1] = "def";
        arr[2] = "ghi";
        arr[3] = "jkl";
        arr[4] = "mno";
        arr[5] = "qrs";

        int n =6;
        int capacity = arr.length;
        String key = "xyz";

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

    private static int insertLast(String[] arr, int n, String key, int capacity) {
        if(n>=capacity){
            return n;
        }
        arr[n] = key;
        return n+1;
    }


}
