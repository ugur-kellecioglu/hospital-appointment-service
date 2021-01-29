
import java.util.ArrayList;


public abstract class Employee extends SystemClass{
   protected String fullname;
   protected ArrayList<String> daysList;
   protected String[] daysArr = {"Mondays", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
   protected double price = 0;
   protected int experience = 0;
   protected Hospital hospital;
   protected String title;
    public Employee(String fullname, Hospital hospital) {
        this.fullname = fullname;
        this.hospital = hospital;
        daysList = new ArrayList<String>();
        setDays();//daysList 'e rastgele günler verecek fonksiyon, doctor ve asistan için farklı olduğu için abstract fonksiyon yaptık
    }
   
    
    //abstract methodlar -> doctor ve assistant classında olmalı
    abstract void calculatePrice();
    abstract void setDays();
    
    
    
    
    
    
    
    
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public ArrayList<String> getDaysList() {
        return daysList;
    }

    public String[] getDaysArr() {
        return daysArr;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Hospital getHospital() {
        return hospital;
    }


   

}
