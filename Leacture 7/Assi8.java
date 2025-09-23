public class Assi8 {
    public static void maxSubArray(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        // Initialize prefix array
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

         
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = start; j < num.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum is " + maxsum);
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4};
        maxSubArray(num);
    }
}
