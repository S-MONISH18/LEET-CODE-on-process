class Solution {
    record Robot(int position, int distance) {}
    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        int n = robots.length;
        Robot[] rs = new Robot[n];
        for (int i = 0; i < n; i++) {
            rs[i] = new Robot(robots[i], distance[i]);
        }
        Arrays.sort(rs, Comparator.comparingInt(r -> r.position));
        Arrays.sort(walls);

        int[] leftWall = computeLeft(rs, walls);
        int[] rightWall = computeRight(rs, walls);
        int[] common = computeOverlap(rs, walls);

        int[] dpLeft = new int[n];
        int[] dpRight = new int[n];

        dpLeft[0] = leftWall[0];
        dpRight[0] = rightWall[0];

        for (int i = 1; i < n; i++) {
            dpLeft[i] = leftWall[i] + Math.max(dpLeft[i - 1], dpRight[i - 1] - common[i]);
            dpRight[i] = rightWall[i] + Math.max(dpLeft[i - 1], dpRight[i - 1]);
        }

        return Math.max(dpLeft[n - 1], dpRight[n - 1]);
    }
    private int[] computeLeft(Robot[] rs, int[] walls) {
        int n = rs.length, m = walls.length;
        int[] result = new int[n];
        int l = 0, r = -1;

        for (int i = 0; i < n; i++) {
            int prev = (i == 0 ? Integer.MIN_VALUE : rs[i - 1].position);
            int start = Math.max(prev + 1, rs[i].position - rs[i].distance);
            int end = rs[i].position;

            while (r + 1 < m && walls[r + 1] <= end) r++;
            while (l < m && walls[l] < start) l++;

            if (l <= r) result[i] = r - l + 1;
        }
        return result;
    }

    private int[] computeRight(Robot[] rs, int[] walls) {
        int n = rs.length, m = walls.length;
        int[] result = new int[n];
        int l = 0, r = -1;

        for (int i = 0; i < n; i++) {
            int next = (i == n - 1 ? Integer.MAX_VALUE : rs[i + 1].position);
            int start = rs[i].position;
            int end = Math.min(next - 1, rs[i].position + rs[i].distance);

            while (r + 1 < m && walls[r + 1] <= end) r++;
            while (l < m && walls[l] < start) l++;

            if (l <= r) result[i] = r - l + 1;
        }
        return result;
    }
    private int[] computeOverlap(Robot[] rs, int[] walls) {
        int n = rs.length, m = walls.length;
        int[] result = new int[n];
        int l = 0, r = -1;

        for (int i = 1; i < n; i++) {
            int start = Math.max(rs[i - 1].position + 1, rs[i].position - rs[i].distance);
            int end = Math.min(rs[i].position - 1, rs[i - 1].position + rs[i - 1].distance);

            if (start > end) continue;

            while (r + 1 < m && walls[r + 1] <= end) r++;
            while (l < m && walls[l] < start) l++;

            if (l <= r) result[i] = r - l + 1;
        }
        return result;
    }
    
}