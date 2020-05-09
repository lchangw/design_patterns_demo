package decorator.v1;

public class Client {

	public static void main(String[] args) {
		
		Person person = new Person("小米");
		
		System.out.println("第一种装扮：");
		Clothes shirt = new TShirts();
		Clothes trouser = new BigTrouser();
		Clothes sneaker = new Sneakers();
		
		shirt.show();
		trouser.show();
		sneaker.show();
		person.show();
		
		System.out.println("另一种装扮：");
		Clothes suit = new Suits();
		Clothes tie = new Ties();
		Clothes shoe = new LeatherShoes();
		
		suit.show();
		tie.show();
		shoe.show();
		person.show();
	}

}
