import java.util.Date;

public class Main {
    public static void main(String[] args) {
        final String SALUDO = "Hola";
        Doctor myDoctor = new Doctor(0, "julián", "Developer");
        System.out.println(SALUDO);
        myDoctor.showName();
        myDoctor.setSpeciality("Technical Leader");
        System.out.println("The position is: "+myDoctor.getSpeciality());
        myDoctor.showname("juan");

        myDoctor.addAppointment(new Date(), "4pm");
        myDoctor.addAppointment(new Date(), "5pm");

        System.out.println(myDoctor.getAppointment());
    }
}
