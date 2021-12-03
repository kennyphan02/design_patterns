import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 * Holds information for a MedicalRecordAdapter. Implements Medical Record. Converts a Health record to a Medical Record
 */
public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    /**
     * Default constructor that takes an instance of Healthrecord
     * @param record type HealthRecord
     */
    public MedicalRecordAdapter(HealthRecord record){
        this.record = record;
    }

    /**
     * Gets the first name of a full name
     */
    public String getFirstName(){
        String fullName = this.record.getName();
        int space = fullName.indexOf(" ");
        return fullName.substring(0,space);   
    }

    /**
     * Gets the last name of a full name
     */
    public String getLastName(){
        String fullName = this.record.getName();
        int space = fullName.indexOf(" ");
        return fullName.substring(space+1, fullName.length()-1);
    }

    /**
     * Gets the date of a birthday
     */
    public Date getBirthday(){
        return this.record.getBirthdate();
    }

    /**
     * Gets the gender off an ENUM.
     */
    public Gender getGender(){
        Gender gender = Gender.valueOf(this.record.getGender().toUpperCase());
        return gender;
    }

    /**
     * Adds a visit to the record history
     */
    public void addVisit(Date date, boolean well, String description)
    {
        this.record.addHistory(date, well, description);
    }

    /**
     * Can't get this to work after attempting for hours :(
     */
    public ArrayList<Visit> getVisitHistory(){
        ArrayList<Visit> visits = new ArrayList();
        // for(int i = 0; i < this.record.getHistory().size(); i++) {
        //     int month = 0;
        //     int year = 0;
        //     int day = 0;
        //     String line = this.record.getHistory().get(i);
        //     String[] itemSplit = line.split("\n");
        //     if(i % 3 == 0) {
        //         String date = itemSplit[i];
        //         String[] date2 = date.split(",");
        //         String firstItem = date2[0];
        //         String[] spaceItem = firstItem.split(" ");
        //         day = Integer.parseInt(spaceItem[2]);
        //         month = Integer.parseInt(date2[1]); 
        //         year = Integer.parseInt(date2[2]);
        //     }
        //     String[] splitAfterColons = dateSplit.split(":");
        //     for(String test : splitAfterColons){
        //         System.out.println(test);
        //     }


        //     String[] formattedDate = dateSplit.split("/");
        //     for(String test : formattedDate){
        //         System.out.println(test);
        //     }
        //     int day = Integer.parseInt(formattedDate[0]);
        //     int month= Integer.parseInt(formattedDate[1]);
        //     int year = Integer.parseInt(formattedDate[2]);

        //     Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        //     Date date1 = myCalendar.getTime();


        //     boolean isTrue = Boolean.parseBoolean(isWell);
        //     Visit visit = new Visit(date1, isTrue, description);
        //     visits.add(visit);
        
        return visits;
    }

    /**
     * ToString method that implements the format of the project assignment
     */
    public String toString(){
        String title = "***** " + this.record.getName() + " ******";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatted = simpleDateFormat.format(getBirthday());
        String gender = getGender().toString();
        String visits = "";
        ArrayList<Visit> visitList = getVisitHistory();
        for(int i = 0; i < visitList.size(); i++){
            if(visitList.get(i).isWell()){
                visits += visitList.get(i).getDate() + ": Well Visit, " + visitList.get(i).getDescription() + "\n";
            }
            else
            {
                visits += visitList.get(i).getDate() + ": Sick Visit, " + visitList.get(i).getDescription() + "\n";
            }
        }
        return title + "\nBirthday: " + dateFormatted + "\nGender: " + gender + "\nMedical Visit History:\n" + visits;
    }



    
}
