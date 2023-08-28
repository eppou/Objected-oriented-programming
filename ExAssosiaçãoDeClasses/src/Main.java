import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Carro car = new Carro();
		car.setCor("amarelo");
		car.setMarca("ford");
		car.setModelo("fusion");
		car.setPlaca("axx-3928");
		morador teste = new morador();
		ArrayList<Carro> carros = new ArrayList<Carro>();
		carros.add(car);
		teste.setCar(carros);
		
		System.out.println(teste.getCar().get(0).getModelo());
	}

}
