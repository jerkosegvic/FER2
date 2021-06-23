package laurin_labos;

public class RestrictedWrhProduct extends WrhProduct{
	///int resQty;
	public RestrictedWrhProduct(String pid, int qty, double price , int rq) {
		super(pid, Math.min(rq , qty), price);
		
	}
	
}
