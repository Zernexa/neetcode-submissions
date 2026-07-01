class MyHashSet {
    boolean[] v = new boolean[1000001];
    
    public MyHashSet() {
    }
    
    public void add(int key) {
        v[key] = true;
    }
    
    public void remove(int key) {
        v[key] = false;
    }
    
    public boolean contains(int key) {
        if (v[key] == true) return true;
        else return false;
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */