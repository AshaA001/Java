package collections.arrays.string;

public class Search {
    public static void main(String[] args){
        String[] arr = new String[10];
        arr[0] = "abc";
        arr[1] = "def";
        arr[2] = "ghi";
        arr[3] = "jkl";
        arr[4] = "mno";
        arr[5] = "qrs";

        int n =6;
        String key = "def";

        int pos = search(arr,n,key);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: " + (pos+1));
        }
    }

    private static int search(String[] arr, int n, String key) {
        for(int i =0; i<n; i++){
            if(arr[i].equals(key)){
                return i;
            }
        }

        return -1;
    }
}
