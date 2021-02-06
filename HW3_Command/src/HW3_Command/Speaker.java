package HW3_Command;

public class Speaker {
	
	private int max_volume = 20;
	private int min_volume = 0;
	
	public int current_volume;
	
	public Speaker(int current_volume) {
		if(current_volume > this.max_volume) {
			this.current_volume = max_volume;
			
		}else if(current_volume < this.min_volume) {
			this.current_volume = min_volume;
			
		}else {
			this.current_volume = current_volume;
		}
	}
	
	public int GetVolume() {
		return this.current_volume;
	}
	
	public void UpVolume() {
		if(this.current_volume < this.max_volume) {
			this.current_volume += 1;
		}
	}
	
	public void DownVolume() {
		if(this.current_volume > this.min_volume) {
			this.current_volume -= 1;
		}
	}
}
