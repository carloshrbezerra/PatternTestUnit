
public class RetanguloMain {
	public static void main(String[] args) {
		RetanguloTest retanguloTest = new RetanguloTest();
		boolean resultado;
		
		resultado = retanguloTest.testCalcularArea();
		System.out.println("testCalcularArea " + resultado);
		
		resultado = retanguloTest.testCalcularPerimetro();
		System.out.println("testCalcularPerimetro " + resultado);
	}
}