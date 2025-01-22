package _8Arrays;

public class _7SubArr {
    public static void subArr(int number[]) {
        int total = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + number[k];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                    System.out.print(number[k] + " ");
                }
                System.out.print("sum =" + sum);
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total numbers of subarrays are:" + total);
        System.out.println("maximum sum of the subarrays is:" + maxSum);
    }

    public static void prefixSum(int number[]) {
        int Sum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                Sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (Sum > max) {
                    max = Sum;
                }
            }
        }
        System.out.println("Max sum of subArr is:" + max);
    }

    public static void kadane(int number[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
            if (sum < 0) {
                sum = 0;
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println("max sum of subarr is:" + max);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, -4, -8, 10 };
        subArr(number);
        prefixSum(number);
        kadane(number);
    }
}
