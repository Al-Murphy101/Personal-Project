public class InsertionSort {
    
    //method to sort array using Insertion sort
    void sort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i -1;

            //move the elements i-1 that are greater than the key
            //to one element ahead of their current element position
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = key;
        }
    }

    //print array method
    static void printArray(int[] arr){
        int n = arr.length;

        //iterate over array and print contents
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");

            System.out.println();
        } 
    }
    //main method
    public static void main(String[] args) {
        int[] arr = {7, 6, 8, 10, 9, 5};

        InsertionSort sorting = new InsertionSort();
        sorting.sort(arr);
        printArray(arr);
    }
}
