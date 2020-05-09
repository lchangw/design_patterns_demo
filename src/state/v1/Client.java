package state.v1;

public class Client {

	public static void main(String[] args) {
		Work work = new Work();
		work.setHour(9);
		work.state();
		work.setHour(12);
		work.state();
		work.setHour(13);
		work.state();
		work.setHour(14);
		work.state();
		work.setHour(17);
		work.state();
		work.setFinished(true);
		work.setHour(19);
		work.state();
		work.setHour(21);
		work.state();
		work.setHour(22);
		work.state();
	}

}
