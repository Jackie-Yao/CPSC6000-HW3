package HW3_Command;

public class VolumeDownCommand implements Command{
	Speaker speaker;
	
	public VolumeDownCommand(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		speaker.DownVolume();
	}

}
