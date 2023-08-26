class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        int size = N;
        Arrays.sort(A);
        Arrays.sort(B);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> y.sum - x.sum);
        Set<Integer> set = new HashSet<>();
        pq.add(new Pair(A[N - 1] + B[N - 1], N - 1, N - 1));
        set.add(0);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (K > 0) {
            Pair top = pq.poll();
            int sum = top.sum;
            int x = top.first;
            int y = top.second;

            result.add(sum);

            if (x - 1 >= 0 && !set.contains((x - 1) * size + y)) {
                pq.offer(new Pair(A[x - 1] + B[y], x - 1, y));
                set.add((x - 1) * size + y);
            }
            if (y - 1 >= 0 && !set.contains(x * size + y - 1)) {
                pq.offer(new Pair(A[x] + B[y - 1], x, y - 1));
                set.add(x * size + y - 1);
            }
            K--;
        }
        
        return result;
    }

    static class Pair {
        int first;
        int second;
        int sum;

        public Pair(int sum, int first, int second) {
            this.first = first;
            this.second = second;
            this.sum = sum;
        }

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
