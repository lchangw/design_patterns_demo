package facade.v2;

import facade.v1.NationalDebt1;
import facade.v1.Realty1;
import facade.v1.Stock1;
import facade.v1.Stock2;
import facade.v1.Stock3;

public class Fund {

	private Stock1 s1;
	private Stock2 s2;
	private Stock3 s3;
	private NationalDebt1 d1;
	private Realty1 r1;
	
	public Fund() {
		s1 = new Stock1();
		s2 = new Stock2();
		s3 = new Stock3();
		d1 = new NationalDebt1();
		r1 = new Realty1();
	}
	
	
	public void buy() {
		s1.buy();
		s2.buy();
		s3.buy();
		d1.buy();
		r1.buy();
	}
	
	public void sell() {
		s1.sell();
		s2.sell();
		s3.sell();
		d1.sell();
		r1.sell();
	}
}
