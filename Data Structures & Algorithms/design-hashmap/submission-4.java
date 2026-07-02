class MyHashMap {

    final int n = 1000001;
    int[][] hashMap = new int[2][n];

    public MyHashMap() {
        for (int i = 0; i < n; i++){
            hashMap[1][i] = -1;
        }      
        for (int i = 0; i < n; i++){
            hashMap[0][i] = i;
        } 
    }
    
    public void put(int key, int value) {
        hashMap[1][key] = value;
    }
    
    public int get(int key) {
        return hashMap[1][key];
    }
    
    public void remove(int key) {
        hashMap[1][key] = -1;
    }
}