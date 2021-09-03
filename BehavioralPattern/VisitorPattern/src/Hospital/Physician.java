package Hospital;

public class Physician implements IPatientVisitor {

    @Override
    public void visit(Patient patient) {
        System.out.println("physician going to treate "+patient);
    }
    
}
