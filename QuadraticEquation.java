
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	
	public QuadraticEquation(double a, double b, double c) throws ArithmeticException{
		super();
		if(a != 0) {
			this.a = a;
		}else {
			throw new ArithmeticException(); 
		}
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public void solve() {
		double x1, x2;
		double delta = (Math.pow(b, 2) - 4 * a * c);
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo nghiem");
				
			}else {
				System.out.println("Phuong trin co mot nghiem:" + "x1" + (-c/b));
				
			}
			
			throw new ArithmeticException();
		}
		
			if(delta == 0) {
				System.out.println("Phuong trinh co nghiem kep" + (-b/(2*a)));
			}
			else if(delta > 0) {
				 x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	             x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
				System.out.println("Phuong trinh co 2 nghiem\n x1 = " + x1 + "\n x2 = " + x2 );
			}
			else {
				throw new ArithmeticException();
			}
	}
	
}
