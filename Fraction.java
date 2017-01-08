public class Fraction {
	protected double numerator;
	protected double denominator;
	public double a;
	public void setNumerator(int n) {
		this.numerator = n ;
	}
	
	Fraction() {
		 this.numerator = 1.0;
		 this.denominator = 1.0;
		 }

	public double getNumerator() {
		return numerator;
	}
	
	public double getDenominator() {
		return denominator;
	} 

	public void getOutput(double c,double e) {
		this.a = c/e ;
	}
	 
	public double geta() {
		return a;
	}

	public void toFraction(String str){
		String s, s1;
		int sep = 0;
		if (str.lastIndexOf("/")!=-1){
		sep = str.lastIndexOf("/");
        		s = str.substring(0, sep);
			s1 = str.substring(sep + 1, str.length());
		numerator = (Double.valueOf(s)).doubleValue();
		denominator = (Double.valueOf(s1)).doubleValue();
		}
		else{
		numerator = (Double.valueOf(str)).doubleValue();
		denominator = 1;
		}
	}

	public void add(Fraction first, Fraction second) {
			 double numerSum,denomres;
			 if ( first.getDenominator() == second.getDenominator() ) {
				 numerSum = first.getNumerator() + second.getNumerator();
			 	 numerator = numerSum;
			 	 denominator = first.getDenominator();
			 	 reduce();	 

			 }
			 else {
				 numerSum = first.getNumerator()*second.getDenominator() + first.getDenominator()*second.getNumerator();
				 denomres = second.getDenominator() * first.getDenominator();
				 numerator = numerSum;
			 	 denominator = denomres;
				 reduce();
			 }
	}

	public void subtract(Fraction first, Fraction second) {
			double numerSub,denomres;
			if ( first.getDenominator() == second.getDenominator()) {
				numerSub = first.getNumerator() - second.getNumerator();
			 	numerator = numerSub;
			 	denominator = first.getDenominator();
			 	reduce();
				}
			else {
				numerSub = first.getNumerator()*second.getDenominator() - first.getDenominator()*second.getNumerator();
				denomres = second.getDenominator() * first.getDenominator();
				numerator = numerSub;
			 	denominator = denomres;
				reduce();
			}
		} 

	public void divide(Fraction first, Fraction second)
	  {
		  double num,deno;
		  num = first.numerator*second.denominator;
		  deno= first.denominator*second.numerator;
		  numerator = num;
		  denominator = deno;
		  reduce();
		  
	  }

	public void multiply(Fraction first, Fraction second)
	  {
		  double num,deno;
		  num = first.numerator*second.numerator;
		  deno= first.denominator*second.denominator;
		  numerator = num;
		  denominator = deno;
		  reduce();
		  
	  }
	
	public double toFraction1(String str){
		String s, s1;
		int sep = 0;
		if (str.lastIndexOf("/")!=-1){
		sep = str.lastIndexOf("/");
        		s = str.substring(0, sep);
			s1 = str.substring(sep + 1, str.length());
		numerator = (Double.valueOf(s)).doubleValue();
		denominator = (Double.valueOf(s1)).doubleValue();
		getOutput(numerator,denominator);
		return geta();
		}
		else 
		return (Double.valueOf(str)).doubleValue();
	}

	public void reduce() {
		int g=1;
		for(int i=1; i<= numerator && i<= denominator; i++)
		{ if( numerator%i ==0 && denominator%i == 0)
			g = i;
		}
		numerator = numerator/g;
		denominator = denominator/g;
	}

	public String print() {
		return (getNumerator() + "/" + getDenominator());
	}
	
	public String inverse() {
		return ( getDenominator() + "/" + getNumerator());
	}
}
