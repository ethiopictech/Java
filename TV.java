
public class TV {
	//state (attributes)of the tv
	private boolean isOn;
	private int volume;
	private int channel;
	
	// constructor to initialize the tv object
	public TV() {
		isOn=false;
		volume=50;
		channel=1;
		
	}
	
	//behavior (methods) of the TV
	
	//method to turn the TV on
	
	public void turnOn() {
		isOn=true;
		System.out.println("Tv is now ON");
	}
	//Method to turn the TV off
	public void turnOff() {
		isOn=false;
		System.out.println("TV is now OFF");
	}
	//method to change the channel
	
	public void changeChannel(int newChannel) {
		if(isOn) {
			channel =new channel;
			System.out.println("channel changed to "+ channel);
			
		}
		else {
			System.out.println("tv is off .please turn it on first");
		}
	}
	// method to increase the volume
	public void increaseVolume() {
		if(isOn) {
			volume ++;
			System.out.println("volume increased to "+volume);
		}
		else {
			System.out.println("Tv is off. please turn it on first ");
		}
	}
	 public void decreaseVolume() {
	        if (isOn) {
	            volume--;
	            System.out.println("Volume decreased to " + volume);
	        } else {
	            System.out.println("TV is off. Please turn it on first.");
	        }
	    }
	 
	// Method to display the current status of the TV
	    public void displayStatus() {
	        System.out.println("TV is " + (isOn ? "ON" : "OFF"));
	        System.out.println("Channel: " + channel);
	        System.out.println("Volume: " + volume);
	    }
	}

	public static void main(String[] args) {
		 	TV myTV = new TV(); // Create a new TV object

	        myTV.turnOn();     // Turn the TV on
	        myTV.changeChannel(5); // Change the channel
	        myTV.increaseVolume(); // Increase volume
	        myTV.displayStatus();  // Display the current status

	        myTV.turnOff();    // Turn the TV off
	        myTV.changeChannel(3); // Try to change channel while off
	    }
		
	}

}
