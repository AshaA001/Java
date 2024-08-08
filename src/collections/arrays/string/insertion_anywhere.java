package collections.arrays.string;

public class insertion_anywhere {
    public static void main(String[] args){
        String[] arr = new String[10];
        arr[0] = "abc";
        arr[1] = "def";
        arr[2] = "ghi";
        arr[3] = "jkl";
        arr[4] = "mno";
        arr[5] = "qrs";

        int n =6;
        String key = "xyz";
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

    private static int insertAnywhere(String[] arr, int n, String key, int pos) {
        for(int i = n-1; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos]=key;
        return n+1;
    }
}
