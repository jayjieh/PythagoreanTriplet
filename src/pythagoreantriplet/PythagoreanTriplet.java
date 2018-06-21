/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoreantriplet;

import java.util.Arrays;

/**
 *
 * @author Owori Juma
 */
public class PythagoreanTriplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 6, 5};
        int arr_size = arr.length;
        if (isArrayTriplet(arr, arr_size) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Returns true if there is a triplet with following property
    public static boolean isArrayTriplet(int arr[], int n) {
        // Square array elements
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }
        // Sort array elements
        Arrays.sort(arr);
        
        for (int i = n - 1; i >= 2; i--) {
            int l = 0; // index of the first element in arr[0..i-1]
            int r = i - 1; // index of the last element in arr[0..i-1]
            while (l < r) {
                // A triplet found
                if (arr[l] + arr[r] == arr[i]) {
                    return true;
                }

                // Else either move 'l' or 'r'
                if (arr[l] + arr[r] < arr[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return false;
    }

}
