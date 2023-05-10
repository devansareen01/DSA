public static int totalFruits(int N, int[] fruits) {
        int cnt[] = new int[N];
        int max = 0;
        int currMax = 0;
        int type = 0;

        int j = 0;

        for (int i = 0; i < N; i++) {

            if (cnt[fruits[i]] == 0) {
                type++;
            }
            cnt[fruits[i]]++;
            currMax++;

            while (type > 2 && j < i) {
                cnt[fruits[j]]--;
                if (cnt[fruits[j]] == 0) {
                    type--;
                }

                currMax--;
                j++;
            }
            max = Math.max(max, currMax);
        }

        return max;
    }
