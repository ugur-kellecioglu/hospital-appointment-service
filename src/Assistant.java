
import java.util.Random;


public class Assistant extends Employee {
    Doctor doctor;
    public Assistant(String fullname, int experience, Hospital hospital) {
        super(fullname, hospital);
        super.experience = experience;
        title = "Ass.";
        calculatePrice();
    }

    @Override
    void calculatePrice() {
        price = 40 + getDaysList().size()*27 + 15*experience ;
    }
    
    void setDays(){
        for(int i = 0 ; i < 5 ; i++){
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
}
