class MyHashMap {

    final int n = 1000001;
    int[][] hashMap = new int[2][n];
    boolean init = false;

    public MyHashMap() {
        if (init == false){
            for (int i = 0; i < n; i++){
                hashMap[1][i] = -1;
            }      
            for (int i = 0; i < n; i++){
                hashMap[0][i] = i;
            } 
        }
    }
    
    public void put(int key, int value) {
        if (hashMap[0][key] == key) hashMap[1][key] = value;
    }
    
    public int get(int key) {
        if (hashMap[0][key] == key) return hashMap[1][key];
        else return -1;
    }
    
    public void remove(int key) {
        if (hashMap[0][key] == key) hashMap[1][key] = -1;
    }
}