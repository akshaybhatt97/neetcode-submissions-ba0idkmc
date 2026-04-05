class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key , int value ){
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity ;
    private final Map<Integer , Node> map;
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0 , 0);
        tail = new Node( 0 , 0 );

        head.next = tail;
        tail.prev = head;
        
        
    }
    
    public int get(int key) {
        
        if(!map.containsKey(key)){
            return -1 ;
        }
        Node node = map.get(key);
        remove(node);
        insertAfterHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node existingNode = map.get(key);
            existingNode.value = value;
            remove(existingNode);
            insertAfterHead(existingNode);
            return;

        }

        if(map.size() == capacity){
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);

        }

        Node newNode  = new Node(key , value);
        insertAfterHead(newNode);
        map.put(key , newNode);
        
    }


    private void remove(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private void insertAfterHead(Node node){

        Node firstRealNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = firstRealNode;
        firstRealNode.prev = node;
    }
}
