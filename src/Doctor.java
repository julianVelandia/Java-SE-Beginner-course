public class Doctor {
    static int id;
    private String name;
    private String speciality;

    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println("El nombre del doctor es: "+name+" La especialidad es: "+speciality);
    }

    public void showname(String newName){
        System.out.println("El nombre del doctor es: "+newName+" La especialidad es: "+speciality);
        this.name = newName;
    }
}

