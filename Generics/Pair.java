public class Pair<T, V> {
    private T x;
    private V y;

    public Pair(T x, V y){
        this.x = x;
        this.y = y;
    }

    public T getX(){
        return this.x;
    }

    public V getY(){
        return this.y;
    }
 
    public void setX(T x){
        this.x = x;
    }

    public void setY(V y){
        this.y = y;
    }
}

