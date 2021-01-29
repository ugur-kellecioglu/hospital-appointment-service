
import java.util.ArrayList;
import javax.swing.JComboBox;


public class SystemClass {
    private ArrayList<Doctor> doctors;
    private ArrayList<Assistant> assistants;
    private ArrayList<Employee> employees;
    private ArrayList<Patient> patients;
    private ArrayList<Hospital> hospitals;

    public SystemClass() {
        doctors = new ArrayList<Doctor>();
        assistants = new ArrayList<Assistant>();
        patients = new ArrayList<Patient>();
        employees = new ArrayList<Employee>();
        hospitals = new  ArrayList<Hospital>();
    }

    //girilen isim ile employee arıyor
    public Employee searchEmployeeByName(String fullname){
        for(Employee e: employees){
            if(e.getFullname().equals(fullname)){
                return  e;
            }
        }
       return null;
    }
    
    
    public void addDoctor(Doctor d){
        doctors.add(d);
        employees.add(d);
    }
    public void addAssistant(Assistant a){
        assistants.add(a);
        employees.add(a);
    }
    public void addHospital(Hospital h){
        hospitals.add(h);
    }
    public void addPatient(Patient p){
        patients.add(p);
    }
    
    //indekse göre doktor 
    public Doctor getDoctor(int i ){
        return doctors.get(i);
    }
    
     public Employee getEmployee(int i ){
        return employees.get(i);
    }

     //isme göre doktor araması
    public Doctor getDoctor(String s){
        for(Doctor d: doctors){
            if(d.getFullname().equals(s)) return d;
        }
        return null;
    }
    
    //girilen hastaneye ve departmana ait doktorları parametre olarak girilen comboboxa ekler 
    public JComboBox<String> displayDoctors(Hospital h, JComboBox<String> c, String department){
        c.removeAllItems();
        for(Doctor d : getDoctors()){
            if(d.getHospital().hospitalName.equals(h.hospitalName) && d.getCategory().equals(department)){
                c.addItem(d.getFullname() + " (" + d.title + ")");
            }
        }
         
            for(Assistant a : getAssistants()){
            if(a.getHospital().hospitalName.equals(h.hospitalName)){
                c.addItem(a.getFullname() + " (" + a.title + ")");
            }
        }
       
        return c;
    }
    
    //girilen employee nin günlerini combobox a ekler
    public JComboBox<String> displayDays(Employee d, JComboBox<String> c){
        c.removeAllItems();
        for(String day : d.getDaysList()){
            c.addItem(day);
        }
        return c;
    }
    
    //indekse göre almak
    public Patient getPatient(int i){
        return patients.get(i);
    }
    public Assistant getAssistant(int i){
        return assistants.get(i);
    }
    public Hospital getHospital(int i){
        return hospitals.get(i);
    }
    
    //isme göre hastane alımı
    public Hospital getHospital(String s){
        for(Hospital h: hospitals){
            if(h.getHospitalName().equals(s)) return h;
        }
        return null;
    }
    
    
    
    
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Assistant> getAssistants() {
        return assistants;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }
    
    
    
    
}
