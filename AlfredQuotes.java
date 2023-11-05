import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String message = "Hello, " + name +". Lovely to see you.";
        return message;
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        String message = "It is currently "+currentDate; 
        return message;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String message;
        if (conversation.indexOf("Alexis") != -1 ) {
           message =  "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") != -1) {
            message = "At your service. As you wish, naturally.";
        }
        else {
            message="Right. And with that I shall retire.";
        }
        return message;
    }


    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method

    public String guestGreeting(String name , String dayPeriod) {
        String message = "Good "+dayPeriod +", " +name + ". Lovely to see you.";
        return message;
    }

    public String guestGreeting(String name, Date currentTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(dateFormat.format(currentTime));

        String dayPeriod;
        if (hour >= 5 && hour < 12) {
            dayPeriod = "morning";
        } else if (hour >= 12 && hour < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }

        return "Good " + dayPeriod + ", " + name + ". Lovely to see you.";
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!

    public String moodExpressing(String name,String mood) {
        String message= name +" is ";
        if(mood=="angry") {
            message += "angry right now. Don't call him.";
        }
        else if (mood=="happy") {
            message+="happy right now. Let's play with him.";
        }
        else if(mood=="sad") {
            message += "sad right now. Let's support him.";
        }
        else {
            return "I'm not sure what mood "+name+" is in.";
        }
        return message;
    }
}

