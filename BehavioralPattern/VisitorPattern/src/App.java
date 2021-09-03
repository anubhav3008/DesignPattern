import Hospital.Doctor;
import Hospital.IPatientVisitor;
import Hospital.Patient;
import Hospital.Physician;

public class App {
    public static void main(String[] args) throws Exception {
       var patient  =  new Patient();
       var visitors  =  new IPatientVisitor[] {new Physician(), new Doctor()};

       for (IPatientVisitor iPatientVisitor : visitors) {
           iPatientVisitor.visit(patient);
       }
    }
}
