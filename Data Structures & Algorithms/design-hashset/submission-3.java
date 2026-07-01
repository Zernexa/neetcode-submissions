class MyHashSet {
    int[] v = new int[10000];
    boolean initialized = false;
    
    public MyHashSet() {
        if (initialized == false){
            for (int i = 0; i < v.length; i++){
                v[i] = -1;
                initialized = true;
            }
        }
    }
    
    public void add(int key) {
        boolean test = false, added = false;
        for (int i = 0; i < v.length; i++){
            if (v[i] == key){
                test = true;
            }
            if(v[i] == -1 && test == false && added == false){
                v[i] = (int)key;
                added = true;
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