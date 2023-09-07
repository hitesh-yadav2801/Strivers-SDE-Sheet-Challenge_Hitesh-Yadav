class LRUCache {
    class Node{
        int key, val;
        Node next, prev;
        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    HashMap<Integer, Node> map = new HashMap<>();
    int capacity;
    Node head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if(node == null) return -1;
        delete(node);
        add(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            delete(map.get(key));
        }
        if(map.size() == capacity){
            delete(tail.prev);
        }
        add(new Node(key, value));
    }
    public void add(Node node){
        map.put(node.key, node);
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }
    public void delete(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
