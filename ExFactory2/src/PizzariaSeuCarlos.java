

public class PizzariaSeuCarlos extends pizzaria{

	public static final int TYPE_1 = 1;
	public static final int TYPE_2 = 2;
	public static final int TYPE_3 = 3;
	
	@Override
	public pizza createPizza(int type) {
		if (type == TYPE_1) {
			return new Type1pizza();
		} else if (type == TYPE_2) {
			return new Type2pizza();
		} else if (type == TYPE_3) {
			return new Type3pizza();
		} else {
			System.out.println("Tipo n�o suportado");
			return null;
		}
	}

}
