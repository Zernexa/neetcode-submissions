class MyHashSet {
    int[] v = new int[10000];
    
    public MyHashSet() {
        Arrays.fill(v, -1);
    }
    
    public void add(int key) {
        for (int i = 0; i < v.length; i++){
            if(contains(key)){
                return;
            }
            if(v[i] == -1){
                v[i] = (int)key;
                return;
            }
        }
    }
    
    public void remove(int key) {
        for (int i = 0; i < v.length; i++){
            if(v[i] == key){
                v[i] = -1;
            }
        }
    }
    
    public boolean contains(int key) {
        for (int i = 0; i < v.length; i++){
            if (v[i] == key){
                return true;
            }
        }
        return false;
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */