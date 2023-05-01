package mypractise.core;

import java.util.*;

public class ArrayOperations {
    public static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }

    public static int findHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > highest) {
                highest = i;
            }
        }
        return highest;
    }
    public static int findLowest(int[] array) {
        int lowest = array[0];
        for (int i : array) {
            if (i < lowest) {
                lowest = i;
            }
        }
        return lowest;
    }
    public static int findKthSmallest(Integer[] arr, int k){
        int ksmall = 0;
        if(k<=0 || k>arr.length){
            ksmall = -1;
        }
        else {
            Arrays.sort(arr);
            ksmall = arr[k - 1];
        }
        return ksmall;
    }
    public static int findKthLargest(Integer[] arr, int k){
        int kbig = 0;
        if(k<=0 || k>arr.length){
            kbig = -1;
        }
        else {
            Arrays.sort(arr);
            kbig = arr[(arr.length-1)-(k - 1)];
        }
        return kbig;
    }
    //rearrange -ve to left and +ve to right side of array
    public static void move(int a[])
    {
        Arrays.sort(a);
        printArray(a, a.length);
    }

    // A utility function to print an array
    public static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    //dutch national flag prblm -- using counter
    public static void rearrange(int arr[]){
        int i,cnt0 = 0,cnt1 = 0,cnt2=0;
        for(i=0;i<arr.length;i++){
            switch (arr[i]){
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i=0;
        while (cnt0>0){
            arr[i++]=0;
            cnt0--;
        }
        while (cnt1>0){
            arr[i++]=1;
            cnt1--;
        }
        while (cnt2>0){
            arr[i++]=2;
            cnt2--;
        }
        //print array
        System.out.println("\nafter rearranging 0,1,2: ");
        printArray(arr, arr.length);
    }
    public static void rearrangeDutch(int darr[]){
        int low=0,mid=0,temp=0,high=darr.length-1;
        while(mid<=high){
            switch (darr[mid]){
                case 0:
                    temp = darr[low];
                    darr[low] = darr[mid];
                    darr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = darr[high];
                    darr[high] = darr[mid];
                    darr[mid] = temp;
                    mid++;
                    high--;
                    break;
            }
        }
        System.out.println("\nafter rearranging 0,1,2 using pointer approach: ");
        printArray(darr,darr.length);
    }
   public static Boolean subArrayExists(int arr[]) {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;

            // Add sum to hash set
            hs.add(sum);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }

    //find duplicates in array
    public static void findDuplicates(int arr[]) {
            int size = arr.length;
            int count[] = new int[size];
            int i;
            System.out.print("Repeating elements are ");
            for (i = 0; i < size; i++) {
                if (count[arr[i]] == 1)
                    System.out.print(arr[i] + " ");
                else
                    count[arr[i]]++;
            }
    }
    //find duplicates in array -- using math
    public static void printRepeating(int arr[], int size)
    {
        int i;
        System.out.print("using abs - Repeating elements are ");
        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val] > 0)
                arr[abs_val] = -arr[abs_val];
            else
                System.out.print(abs_val+" ");
        }
    }
    //find duplicates in array -- using set
    public static void findDupUsngSet(int arr[], int size){
        HashSet<Integer> hs = new HashSet<>();
        System.out.print("using set - Repeated elements are: ");
        for(int i=0; i<size; i++){
            if(!hs.isEmpty() && hs.contains(arr[i]))
                System.out.print(arr[i]+" ");
            hs.add(arr[i]);
            }
    }
    public static int firstNonRepeating(int[] arr, int n) {
        Map<Integer, Integer> freq
                = new HashMap<Integer, Integer>();

        // creating a map with the frequency of each element
       for(int i : arr) {
           freq.put(i, freq.getOrDefault(i,0)+1);
       }

        // running a loop in arr to find the first
        // non-repeating element
        for (int i : arr) {
            if (freq.get(i) == 1) {
                return i;
            }
        }

        // return -1 if no non-repeating element found
        return -1;
    }
    public static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
   public static void mSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mSort(arr, l, m);
            mSort(arr, m + 1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    //binarysearch -- searching a element in a rotated and sorted array
    public static int binarySearch(int barr[], int l, int h, int key) {
        if(h<l)
            return -1;
        int mid = (l+h)/2;
        if(key == barr[mid]) {
            return mid;
        }
        if(barr[l] <= barr[mid]) {
            if(key >= barr[l] && key <= barr[mid])
                return binarySearch(barr, l, mid-1, key);
           return binarySearch(barr, mid+1, h, key);
        }
        if(key >= barr[mid] && key <= barr[h]){
            return binarySearch(barr, mid+1, h, key);
        }
        return binarySearch(barr, l, mid-1, key);
    }

    //optimising above code return stmts
    public static int biSearch(int barr[],int l,int h,int key) {
        int index = -1;
        if(h < l) {
            return index;
        }
        int mid = (l+h)/2;
        if(key == barr[mid]) {
            index = mid;
        }
        else {
            if(barr[l] <= barr[mid]) {
                if(key >= barr[l]&&key <= barr[mid])
                    index = biSearch(barr,l,mid-1,key);
                else
                    index = biSearch(barr,mid+1,h,key);
            } else {
                if(key >= barr[mid] && key <= barr[h])
                    index=biSearch(barr,mid+1,h,key);
                else
                    index=biSearch(barr,l,mid-1,key);
            }
        }
        return index;
    }

   //finding min ele using binary search
    public static int findMinUsngBiSearch(int barr[], int l, int h) {
        if(h < l)
            return -1;
        if(l == h)
            return barr[l];
        int mid = (l+h)/2;
        if (mid < h && barr[mid + 1] < barr[mid])
            return barr[mid + 1];

        // Check if mid itself is minimum element
        if (mid > l && barr[mid] < barr[mid - 1])
            return barr[mid];

        // Decide whether we need to go to left half or
        // right half
        if (barr[h] > barr[mid])
            return findMinUsngBiSearch(barr, l, mid - 1);
        return findMinUsngBiSearch(barr, mid + 1, h);
    }

    //Cyclically rotate array by one
    public static void rotateCyclically(int carr[]) {
        int head = carr[carr.length - 1];
        for(int i = carr.length -1 ; i > 0 ; i--)
            carr[i] = carr[i - 1];
        carr[0] = head;
        printArray(carr, carr.length);
    }

    //Cyclically rotate array by one -- by swaping
    public static void rotateCyc(int carr[]) {
        int i = 0, j = carr.length - 1;
        while(i != j)
        {
            int temp = carr[i];
            carr[i] = carr[j];
            carr[j] = temp;
            i++;
        }
        printArray(carr, carr.length);
    }

    //to check whether a string is anagram
    public static boolean checkAnagram(String first, String second) {
        char[] ch = first.toCharArray();
        StringBuilder sb = new StringBuilder(second);
        for(char c : ch) {
            int index = sb.indexOf(""+c);
            if(index != -1) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sb.length() == 0 ? true : false;
    }
}
