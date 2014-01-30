
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
		case 1: message = "Dexter's Room";
		        break;
		case 2: message = "DeDe's Room";
				break;
		case 3: message = "Living Room";
				break;
        default: message = "currentLocation does not compute.";
     }
     System.out.println(message);
  } 


} 