public class App {
    public static void main(String[] args) throws Exception {
        long startTime, endTime;

        for(int i=0;i<5;i++){
            startTime = System.nanoTime();
            System.out.print(Single.getInstance()+"\t");
            endTime = System.nanoTime();
            System.out.println((endTime - startTime)/10000);    
        }
    }
}
