package Hospital;

public class Doctor implements IPatientVisitor{
    @Override
    public void visit(Patient patient) {
        System.out.println("Doctor going to treate "+patient);
    }
}
