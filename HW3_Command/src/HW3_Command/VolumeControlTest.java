package HW3_Command;

public class VolumeControlTest {

	public static void main(String[] args) {
		//Case 1: Initial speaker to have volume of 10 (Maximum 20)
		Speaker speaker = new Speaker(10);
		System.out.println("Initial Volume: " + speaker.GetVolume());
		
		VolumeUpCommand volumeupcommand = new VolumeUpCommand(speaker);
		VolumeDownCommand volumedowncommand = new VolumeDownCommand(speaker);
		
		VolumeControl VolumeControl = new VolumeControl(volumeupcommand,volumedowncommand);
		// add 1 to the volume
		VolumeControl.AddVolume();
		System.out.println("Volume after adding 1: " + speaker.GetVolume());
		
		// minus 2 to the volume, by clicking twice.
		VolumeControl.DownVolume();
		VolumeControl.DownVolume();
		System.out.println("Volume after turning down 2: " + speaker.GetVolume());
		
		// Case 2: add volume for 30 times, it should reach the maximum 20, without further increments
		for(int i = 0; i < 30 ; i += 1) {
			VolumeControl.AddVolume();
		}
		System.out.println("Volume after adding 30, reaching maximum: " + speaker.GetVolume());
		
		
		// Case 3: turn down volume for 30 times, it should reach the maximum 20, without further increments
		for(int i = 0; i < 30 ; i += 1) {
			VolumeControl.DownVolume();
		}
		System.out.println("Volume after turning down 30, reaching minimum: " + speaker.GetVolume());
	}
}