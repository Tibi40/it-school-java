package session16;

public class InsurenceBilling extends Builling {

    @Override
     static void generateBill(Patient patient) {

        System.out.println("There is a bill generated for patient"
                + patient.getName());
    }
}
