public class finalB1 {
    public static String TimeManagement(String time, int s) {
        int secs = Integer.valueOf(time.substring(6)) + s;
        int min = Integer.valueOf(time.substring(3, 5));
        int hours = Integer.valueOf(time.substring(0, 2));
        
        if (secs>=60) {
            secs = secs - 60;
            min = min + 1;
            if (min>=60) {
                hours = hours + 1;
                
                time = time.substring(0, 3) + "00" + time.substring(5);
            }
        }
        if (secs<0) {
            secs = 60 + secs;
            min = min - 1;
            if (min<0) {
                min = 60 + min;
                hours = hours - 1;
                if (hours<0) {
                    hours = 24 + hours;
                }
                
            }
            time = hours + ":" + min + ":" + secs;
        }
        
        if (secs<10) {
            time = time.substring(0, 6) + "0" + secs;
        }
        if (min<10) {
            time = time.substring(0, 3) + "0" + Integer.toString(min) + time.substring(5);
        }
        if (hours<10) {
            time = "0" + Integer.toString(hours) + time.substring(2);
        }
        
        return time;
    }
    
    public static void main(String[] args) {
        System.out.println(TimeManagement("00:00:50", 20));
    }
}
