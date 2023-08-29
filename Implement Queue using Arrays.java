public class Solution {
    class Queue {
        int front, rear;
        int []arr;
        int n;
        int count;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
            n = arr.length;
            count = 0;
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            if(count < n){
                arr[rear % n] = e;
                rear++;
                count++;
            }
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            if (count == 0) {
                return -1;
            }
            count--;
            return arr[front++ % n];
        }
    }
}
