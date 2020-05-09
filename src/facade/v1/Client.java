package facade.v1;

public class Client {

	public static void main(String[] args) {
		Stock1 s1 = new Stock1();
		Stock2 s2 = new Stock2();
		Stock3 s3 = new Stock3();
		NationalDebt1 d1 = new NationalDebt1();
		Realty1 r1 = new Realty1();
		
		s1.buy();
		s2.buy();
		s3.buy();
		d1.buy();
		r1.buy();
		
		s1.sell();
		s2.sell();
		s3.sell();
		d1.sell();
		r1.sell();
	}

}
