
public class Car {
	private String model;
	private String marca;
	private float speed;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public float getMarch () {
		if(this.speed < 20) {
			return 1;
		}
		
		if(this.speed == 20) {
			return 2;
		}
		
		if(this.speed > 20) {
			return 3;
		}
		
		return 0;
	}
	
}
