import java.util.Date;

public class Main {
    public static void main(String[] args) {
        final String SALUDO = "Hola";
        Doctor myDoctor = new Doctor("Developer");
        System.out.println(SALUDO);
        myDoctor.showName("juan");
        myDoctor.setSpeciality("Technical Leader");
        System.out.println("The position is: "+myDoctor.getSpeciality());
        myDoctor.showName();

        myDoctor.addAppointment(new Date(), "4pm");
        myDoctor.addAppointment(new Date(), "5pm");

        System.out.println(myDoctor.getAppointment());
    }
}
