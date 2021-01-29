
import java.util.ArrayList;
import java.util.Random;


public class Doctor extends Employee implements IPayTaxes{
   private String category;
    public Doctor(String fullname, String category, int experience, Hospital hospital) {
        super(fullname, hospital);

        this.category = category;
        super.experience = experience;
        title = "Dr";
        calculatePrice();
    }

    @Override
    void calculatePrice() {
        price = getPatients().size()*30+experience*40;
    }
    
    void setDays(){
        for(int i = 0 ; i < 3 ; i++){
            Random rnd = new Random();
            int d = rnd.nextInt(7);
            String day = daysArr[d];
            boolean check = false;
            for(String x : daysList){
                if(day.equals(x)){
                    check = true;
                    break;
                }
            }
            if(!check) daysList.add(day);
        }
        
    }
 
  


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void payTax(int number) {
        this.price -= (number*100)/7;
    }



    
   
   
}
