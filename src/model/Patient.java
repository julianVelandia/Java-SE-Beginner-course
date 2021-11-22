package model;

public class Patient extends User{
    private String historiaClinica;

    public Patient(String historiaClinica) {
        super(id, name);
        this.historiaClinica = historiaClinica;
    }

    //Polimorfismo
    @Override
    public String toString() {
        return "Patient{" +
                "historiaClinica='" + historiaClinica + '\'' +
                '}';
    }
}
