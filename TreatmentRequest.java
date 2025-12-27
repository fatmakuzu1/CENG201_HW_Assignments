import java.text.SimpleDateFormat;
import java.util.Date;
public class TreatmentRequest {
    private int patientId;
    private long arrivalTime;
    private boolean isPriority; 

    
    public TreatmentRequest(int patientId, boolean isPriority) {
        this.patientId = patientId;
        this.isPriority = isPriority;
        this.arrivalTime = System.currentTimeMillis();
    }

    public int getPatientId() {
        return patientId;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }
    
    public boolean isPriority() {
        return isPriority;
    }
    // return formatted arrival time
    public String getFormattedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date(this.arrivalTime);
        return sdf.format(date);
    }

    // return waiting time as "Hh Mm Ss"
    public String getWaitingTime() {
        long currentTime = System.currentTimeMillis();
        long durationInMillis = currentTime - this.arrivalTime;
    
        long seconds = (durationInMillis / 1000) % 60;
        long minutes = (durationInMillis / (1000 * 60)) % 60;
        long hours = durationInMillis / (1000 * 60 * 60);
    
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}