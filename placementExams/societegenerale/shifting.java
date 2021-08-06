public class shifting {
    public static void main(String[] args) {
        int n = 2;
        int[] arr = { 1, 2, 3, 4, 5 };
        // the original array is
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // shifting process
        for (int i = 0; i < n; i++) {
            int j, lastelement;
            // lastelement stored into a variable
            lastelement = arr[arr.length - 1];
            // shifting elements one by one towards the right
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            // placing that lastelement at the first position
            arr[0] = lastelement;
        }
        System.out.println();
        // the shifted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
