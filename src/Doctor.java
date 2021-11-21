import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String speciality) {
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println("El nombre del doctor es: "+name+" La especialidad es: "+speciality);
    }

    public void showName(String newName){
        System.out.println("El nombre del doctor es: "+newName+" La especialidad es: "+speciality);
        this.name = newName;
    }

    ArrayList<Appointment> appointment = new ArrayList<>();
    public void addAppointment(Date date, String localTime){
        appointment.add(new Doctor.Appointment(date, localTime));
    }

    public ArrayList<Appointment> getAppointment(){
        return appointment;
    }

    public static class Appointment{
        static int id;
        private Date date;
        private String LocalTime;

        public String getLocalTime() {
            return LocalTime;
        }

        public void setLocalTime(String localTime) {
            LocalTime = localTime;
        }

        public Appointment(Date date, String localTime) {
            this.date = date;
            this.LocalTime = localTime;

        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }
}

