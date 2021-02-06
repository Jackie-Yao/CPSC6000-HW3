package HW3_Command;

public class VolumeUpCommand implements Command{
	Speaker speaker;
	
	public VolumeUpCommand(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		speaker.UpVolume();
	}

}
