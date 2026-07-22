class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;

        int[] values = new int[n];
        int[] freq = new int[n];
        int idx = 0;


        for (int i = 0; i < n; i++) {

            boolean alreadyCounted = false;

      
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted)
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            values[idx] = nums[i];
            freq[idx] = count;
            idx++;
        }


        for (int i = 0; i < idx - 1; i++) {
            for (int j = i + 1; j < idx; j++) {
                if (freq[j] > freq[i]) {

                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = values[i];
        }

        return res;
    }
}