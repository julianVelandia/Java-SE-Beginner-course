package model;

public class Nurse extends User{

    private String speciality;

    public Nurse(String speciality) {
        super(id, name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}