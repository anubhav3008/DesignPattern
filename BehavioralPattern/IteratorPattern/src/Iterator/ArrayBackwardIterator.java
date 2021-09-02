package Iterator;

public class ArrayBackwardIterator<T> implements Iterator<T> {

    private T[] array;
    int index;
    public ArrayBackwardIterator(T[] array){
        this.array =  array;
        this.index = array.length;
    }

    @Override
    public boolean moveNext() {
        this.index --;
        if(this.index < 0){
            return false;
        }
        return true;
    }

    @Override
    public T getCurrent() {
        return this.array[this.index];
    }
    
}
