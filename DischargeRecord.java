import java.text.SimpleDateFormat;
import java.util.Date;

// Discharge record: stores patient id and discharge timestamp
public class DischargeRecord {
    private int patientID;
    private long dischargeTime;

    public DischargeRecord(int patientID) {
        this.patientID = patientID;
        this.dischargeTime = System.currentTimeMillis();

    }

    public int getPatientID() {
        return patientID;
    }
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    public long getDischargeTime() {
        return dischargeTime;
    }
    public void setDischargeTime(long dischargeTime) {
        this.dischargeTime = dischargeTime;
    }
    // returns formatted discharge time
    public String getFormattedTime() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date(this.dischargeTime);
        return sdf.format(date);
    }

    

    
}
