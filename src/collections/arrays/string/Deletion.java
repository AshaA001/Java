package collections.arrays.string;

public class Deletion {
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
        String key = "abc";

        System.out.println("Before deletion: ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }

        n = delete(arr, n, key);

        System.out.println("After deletion: ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }

    private static int delete(String[] arr, int n, String key) {
        int pos = findElement(arr, n, key);
        if(pos==-1){
            System.out.println("Element not found");
            return n;
        }
        //Deleting element
        for(int i =pos; i <n-1 ; i++){
            arr[i] = arr[i+1];
        }
        return n-1;
    }

    private static int findElement(String[] arr, int n, String key) {
        for(int i =0; i<n; i++){
            if(arr[i].equals(key)){
                return i;
            }
        }

        return -1;
    }

}
