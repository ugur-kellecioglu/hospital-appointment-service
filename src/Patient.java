
public class Patient {
    private String fullname;
    private String category;
    private Hospital hospital;
    private boolean specialCare;
    private Employee emp;
    private String dayOfAppointment;
    private double  price;
    public Patient(String fullname, String category, Hospital hospital, boolean specialCare, Employee emp, String dayOfAppointment, double price) {
        this.fullname = fullname;
        this.category = category;
        this.hospital = hospital;
        this.specialCare = specialCare;
        this.emp = emp;
        this.dayOfAppointment = dayOfAppointment;
        this.price = price;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public boolean isSpecialCare() {
        return specialCare;
    }

    public void setSpecialCare(boolean specialCare) {
        this.specialCare = specialCare;
    }

    public Employee getDoctor() {
        return emp;
    }

    public void setDoctor(Employee emp) {
        this.emp = emp;
    }

    public String getDayOfAppointment() {
        return dayOfAppointment;
    }

    public void setDayOfAppointment(String dayOfAppointment) {
        this.dayOfAppointment = dayOfAppointment;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Patient{" + "fullname=" + fullname + ", category=" + category + ", hospital=" + hospital + ", specialCare=" + specialCare + ", emp=" + emp + ", dayOfAppointment=" + dayOfAppointment + ", price=" + price + '}';
    }
    
    
    
}
