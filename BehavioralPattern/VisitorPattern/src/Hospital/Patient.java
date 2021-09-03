package Hospital;

public class Patient {
    public void attent(IPatientVisitor patientVisitor){
        patientVisitor.visit(this);
    }
}
