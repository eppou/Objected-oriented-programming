
public class Main {

	public static void main(String[] args) {
		Rectangle retangulo = new Rectangle();
		
		retangulo.setLength(21);
		retangulo.setLength(17);
		retangulo.setWidth(22);
		retangulo.setWidth(2);
		
		System.out.printf("%n o retangulo tem %f de altura e %f de largura",retangulo.getWidth(),retangulo.getLength());
		
		System.out.printf("%n A area é %f",retangulo.calculateArea());
		System.out.printf("%n O perimetro é %f",retangulo.calculatePerimeter());
		
	}

}
