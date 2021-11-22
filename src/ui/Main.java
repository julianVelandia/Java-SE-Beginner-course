package ui;

import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Constantes
        final String SALUDO = "Hola";

        //Instancia
        Doctor myDoctor = new Doctor("Julián","Developer");

        //Getter
        System.out.println(SALUDO + myDoctor.getName());
        System.out.println("The position is: "+myDoctor.getSpeciality());

        //Setters
        myDoctor.setSpeciality("Technical Leader");

        //Métodos
        myDoctor.showName();

        //Sobrecarga de métodos
        myDoctor.showName("juan");

        //Clases anidadas
        myDoctor.addAppointment(new Date(), "4pm");
        myDoctor.addAppointment(new Date(), "5pm");
        System.out.println(myDoctor.getAppointment());

        //Polimorfismo
        Patient myPatient = new Patient("Mi historia clínica");
        System.out.println(myPatient);
        System.out.println(myDoctor);
    }
}
