public class Node{
    int key , val ;
    Node prev , next ;
    public Node(int key , int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}


public class LRUCache {

    private int cap ;
    private HashMap<Integer,Node> cache ;
    private Node left , right ;

    public LRUCache(int capacity) {
        this.cap = capacity ;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right ;
        this.right.prev = this.left;        
    }

    private void insert(Node n){
        Node m = this.right.prev;
        m.next = n ;
        n.prev = m ; 
        n.next = this.right ;
        this.right.prev = n;
    }
    
    private void remove(Node n){
        Node le = n.prev ;
        Node ri = n.next ;
        ri.prev = le;
        le.next = ri;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node n = cache.get(key);
            remove(n);
            insert(n);
            return n.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node mm = new Node(key,value);
        cache.put(key,mm);
        insert(mm);
        while( cache.size() > this.cap ){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }


    }
}
