public class quicksort{

    private static void randomized_quick_sort(int[] arr, int l, int r){
        if(l >= r) return ;
        int random = l + (int)(Math.random() * (r-l+1));
        int t = arr[r];
        arr[r] = arr[random];
        arr[random] = t;

        int p = arr[r];
        int i = l;

        for(int j = l; j < r; j++){
            if(arr[j] <= p){
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j] = temp;
            }
        }
        t = arr[i];
        arr[i] = arr[r];
        arr[r] = t;

        randomized_quick_sort(arr, l, i-1);
        randomized_quick_sort(arr, i+1, r);
    }

    private static void quick_sort(int[] arr, int l, int r){
        if(l >= r) return ;
        int p = arr[r];
        int i = l;

        for(int j = l; j < r; j++){
            if(arr[j] <= p){
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        quick_sort(arr, l, i-1);
        quick_sort(arr, i+1, r);
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,5,9,7,2,3};
        randomized_quick_sort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}