package HW3_Command;

public class VolumeControl {
	Command VolumeUp;
	Command VolumeDown;
	
	public VolumeControl(Command volumnUp, Command volumeDown) {
		this.VolumeUp = volumnUp;
		this.VolumeDown = volumeDown;
	}
	
	public void AddVolume() {
		VolumeUp.execute();
	}
	
	public void DownVolume() {
		VolumeDown.execute();
	}
}
