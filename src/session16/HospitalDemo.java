package session16;

public class HospitalDemo {
    public static void main(String[] args) {

        Person staff = new Person( "stafName", "1");
        Person doctor = new Doctor( "Doc", "2");
        Person nurse = new Nurse("Nurse", "3");

        Patient patient = new Patient("Marcel", "4", "Cold");

        staff.performDuties();
        doctor.performDuties();
        nurse.performDuties();

        InsurenceBilling insurenceBilling = new InsurenceBilling();
        InsurenceBilling.generateBill(patient);

    }
}
