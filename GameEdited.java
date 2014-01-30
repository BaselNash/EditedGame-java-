
public class Game {

  // Gloabal
  public static int currentLocation = 0;
    
  public static void main(String[] args) {
     updateDisplay();
  }

  private static void updateDisplay() {
     String message = new String();
     message = "";
     switch (currentLocation) {
        case 0: message = "Dexter's Lab";
                break;
        default: message = "currentLocation does not compute.";
     }
     System.out.println(message);
  } 


} 