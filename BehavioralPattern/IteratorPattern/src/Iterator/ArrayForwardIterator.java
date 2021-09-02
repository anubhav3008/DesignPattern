package Iterator;

public class ArrayForwardIterator<T> implements Iterator<T>{

    private T[] array;
    int index;
    public ArrayForwardIterator(T[] array){
        this.array =  array;
        this.index = -1;
    }

    @Override
    public boolean moveNext() {
        this.index ++;
        if(this.index >= this.array.length){
            return false;
        }
        return true;
    }

    @Override
    public T getCurrent() {
        return this.array[this.index];
    }
    
}
