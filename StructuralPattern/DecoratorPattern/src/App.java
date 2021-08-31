import Models.*;

public class App {
    public static void main(String[] args) throws Exception {
       Logger logger =  new TimeStampDecorator(new RemovePIIDecorator(new PlaneLogger()));
       logger.log("Social security number of anubhav is 856-45-6789 , his mail id is anshriv@microsoft.com  phone number is 9044288340");
       logger.log("rajesh phone number is 8588876292");
    }
}
