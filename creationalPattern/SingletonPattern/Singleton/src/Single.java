public class Single {
    private static volatile Single single;
    // volatile means it will prevent cache issue.
    public static Single getInstance(){
        if(single !=null){
            return single;
        }
        // double check because there can be two threads which are waiting at the synchronized line
        synchronized(Single.class){
            if(single ==  null){
                single = new Single();
                return single;
            }
            else{
                return single;
            }
        }
    }
}
