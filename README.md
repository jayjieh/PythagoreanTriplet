# PythagoreanTriplet
Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

### Example:
```sh
Input: arr[] = {3, 1, 4, 6, 5}
Output: True
There is a Pythagorean triplet (3, 4, 5).

Input: arr[] = {10, 4, 6, 12, 5}
Output: False
There is no Pythagorean triplet.
```

### Prerequisite
* Ensure you have Java 8 installed ,


#### Using O(n2). we do it through the below number of steps
* 1. Doing the square of every element in the array
        ```sh
             for (int i=0; i<n; i++)
                 arr[i] = arr[i]*arr[i];
        ```
* 2. Then you sort the array in an ascending order
        ```sh
           Arrays.sort(arr);
        ```
* 3. To get a2 + b2 = c2, do following
    i) Hava 'a' as the last element of the sorted array
    ii) Then look for  pair (b, c) in subarray between first element and ‘a’
    iii) if no pair for 'a' is found, the repeat step (3.ii)

        ```sh
        for (int i = n-1; i >= 2; i--){
            int l = 0; // index of the first element in arr[0..i-1]
            int r = i-1; // index of the last element in arr[0..i-1]
            while (l < r)
            {
                // A triplet found
                if (arr[l] + arr[r] == arr[i])
                    return true;
  
                // Else either move 'l' or 'r'
                if (arr[l] + arr[r] < arr[i])
                   l++;
                else
                   r--;
            }
        }
        ```


License
----

Owori Juma





