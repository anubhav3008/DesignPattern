import Iterator.*;

public class App {
    public static void main(String[] args) throws Exception {
       Iterator<String> forwardIterator = new ArrayForwardIterator<String>(new String[]{"a", "b", "c"});   
       while(forwardIterator.moveNext()){
           System.out.println(forwardIterator.getCurrent());   
       } 
       System.out.println();
       Iterator<String> backwardIterator = new ArrayBackwardIterator<String>(new String[]{"a", "b", "c"});   
       while(backwardIterator.moveNext()){
           System.out.println(backwardIterator.getCurrent());   
       } 
    }
}
