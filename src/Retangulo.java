
public class Retangulo {
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) { 
		this.base = base;
		this.altura = altura;
	}
	
	public int calcularArea(){
		int x = 10;
		while(x > 0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			x--;
		}
		if(this.base == 0){
			throw new NumberFormatException();
		}
		return base * altura;
	}
	
	public int calcularPerimetro(){
		return 2*base + 2*altura;
	}
}
