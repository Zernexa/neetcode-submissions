class MyHashMap {

    final int n = 1000001;
    int[][] hashMap = new int[2][n];
    boolean init = false;
    int c = 0;

    public MyHashMap() {
        if (init == false){
            for (int i = 0; i < n; i++){
                hashMap[1][i] = -1;
            }      
            for (int i = 0; i < n; i++){
                hashMap[0][i] = c;
                c++;
            } 
        }
    }
    
    public void put(int key, int value) {
        for (int i = 0; i < n; i++){
            if (hashMap[0][i] == key){
                hashMap[1][i] = value;
                break;
            }
        }
    }
    
    public int get(int key) {
        for (int i = 0; i < n; i++){
            if (hashMap[0][i] == key){
                return hashMap[1][i];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for (int i = 0; i < n; i++){
            if (hashMap[0][i] == key){
                hashMap[1][i] = -1;
                break;
            }
        }
    }
}