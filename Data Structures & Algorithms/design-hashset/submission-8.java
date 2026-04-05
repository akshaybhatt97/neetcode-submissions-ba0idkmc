class MyHashSet {

    public static final int size = 1000;

    List<Integer>[] buckets ; 

    public MyHashSet() {
        buckets = new ArrayList[size];
        
    }
    
    public void add(int key) {

        int hash = key % size;

        if (buckets[hash] == null){
            buckets[hash] = new ArrayList<>();
        }

        if(!buckets[hash].contains(key)){
            buckets[hash].add(key);
        }
        
    }
    
    public void remove(int key) {

        int hash = key % size;

        if (buckets[hash] != null && buckets[hash].contains(key)){
            buckets[hash].remove(Integer.valueOf(key));
        }
        
    }
    
    public boolean contains(int key) {
                int hash = key % size;

        return buckets[hash] != null && buckets[hash].contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */