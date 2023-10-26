package Assignment3.Question1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment3 {
    public Assignment3() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.print("Instance created at:"
                + formattedDate);
    }
}