package collections.arrays.integer;

public class search {
    public static void main(String[] args){
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 16;
        arr[2] = 22;
        arr[3] = 13;
        arr[4] = 44;
        arr[5] = 15;

        int n =6;
        int key = 44;

        int pos = search(arr,n,key);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: " + (pos+1));
        }
    }

    private static int search(int[] arr, int n, int key) {
        for(int i =0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }
}
