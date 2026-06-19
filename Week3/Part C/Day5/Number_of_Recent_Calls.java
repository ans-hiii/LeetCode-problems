import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> recentRequests;

    public RecentCounter() {
        recentRequests = new LinkedList<>();
    }

    public int ping(int t) {

        recentRequests.offer(t);

        while (recentRequests.peek() < t - 3000) {
            recentRequests.poll();
        }

        return recentRequests.size();
    }
}
