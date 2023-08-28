
public class PizzariaDoce extends pizzaria{

	public static final int TYPE_A = 1;
	public static final int TYPE_B = 2;
	
	@Override
	public pizza createPizza(int type) {
			if (type == TYPE_A) {
				return new TypeA();
			} else if (type == TYPE_B) {
				return new TypeBpizza();
			}
		return null;
	}
	
}
