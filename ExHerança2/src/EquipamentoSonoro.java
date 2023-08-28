
public class EquipamentoSonoro extends Equipamento{
	private short volume;
	private boolean stereo;
	
	public short getVolume() {
		return volume;
	}
	
	public void setVolume(short volume) {
		this.volume = volume;
	}
	
	public void mono(){
		this.stereo = false;
	}
	
	public void stereo(){
		this.stereo = true;
	}
	
	public boolean getStereo() {
		return this.stereo;
	}
	
	public void liga() {
		this.ligado = true;
		this.volume = 5;
	}
}
