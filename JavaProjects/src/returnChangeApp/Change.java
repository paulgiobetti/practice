package returnChangeApp;

public class Change {
	private long coin2 = 0;
	private long bill5 = 0;
	private long bill10 = 0;
	private String receipt = "";
	
	public String calculateOptimalChange(long p){
		if(p >= 10){
			bill10 = (long)p/10;
			p = (long)p%10;
		}
		if(p >= 5){
			bill5 = (long)p/5;
			p = (long)p%5;
		}
		if(p >= 2){
			coin2 = (long)p/2;
			p = (long)p%2;
		}
		if(p > 0)
			receipt = "Can't make exact change.";
		else
			receipt = "$10 = " + bill10 + "\n"
					+ " $5 = " + bill5 + "\n"
					+ " $2 = " + coin2;
		return receipt;
						
	}
	
}
