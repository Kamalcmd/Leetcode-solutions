package hard;

public class Median_of_Two_Sorted_Array_0003 {
    public double findMedianSortedArrays(int [] num1, int [] num2){
        if (num1.length > num2.length){
            System.out.println(num1.length);
            System.out.println(num2.length);
            return findMedianSortedArrays(num2, num1);
        }

        int m = num1.length;
        int n = num2.length;

        int low = 0, high = m;


        while(low <= high){
            int i = (low + high)/2;
            int j = (m + n + 1)/2 -i;

            int maxLeftA = (i ==0) ? Integer.MIN_VALUE : num1[i-1];
            int minRightA = (i == m) ? Integer.MAX_VALUE : num1[i];

            int maxLeftB = (j == 0) ? Integer.MIN_VALUE : num2[j - 1];
            int minRightB = (j == n) ? Integer.MAX_VALUE : num2[j];

            //Valid partition found
            if(maxLeftA <= minRightB  && maxLeftB <= minRightA){
                if((m + n) % 2 == 0){
                    return (Math.max(maxLeftA, maxLeftB) +
                            Math.min(minRightA, minRightB))/2.0;
                }else{
                    return Math.max(maxLeftA, maxLeftB);
                }}
                else if (maxLeftA > minRightB){
                    high = i -1;
                }else {
                    low = i + 1;
                }
            }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }

    public static void main(String[] args) {
        Median_of_Two_Sorted_Array_0003 solution = new Median_of_Two_Sorted_Array_0003();

        int[] num1 = {1,3};
        int[] num2 = {2};
        System.out.println(solution.findMedianSortedArrays(num1, num2));

        int[] num3 = {1, 2};
        int[] num4 = {3,4};
        System.out.println(solution.findMedianSortedArrays(num3, num4));
    }
}
