package collections.arrays.integer;

public class deletion {
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
        int key = 44;

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

    private static int delete(int[] arr, int n, int key) {
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

    private static int findElement(int[] arr, int n, int key) {
        for(int i =0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }

}
