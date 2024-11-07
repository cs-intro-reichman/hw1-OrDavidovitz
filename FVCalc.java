// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args [0]);
		double rate = Double.parseDouble(args [1]);
		int years = Integer.parseInt(args[2]);
		int loop = years;
		double futureValue = currentValue;
		while (loop>0)
		{
			futureValue = futureValue*(rate/100+1);
			loop--;
		}
		System.out.println("After " + years +" years " +(int)currentValue+"$ "+
		 "saved at " + rate+"% "+"will yeald "+ (int)futureValue+"$");
	}
}