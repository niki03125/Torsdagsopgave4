import java.util.ArrayList;
class Main{
	

	public static void main(String[]args){
		Team t = new Team("Bulldogs");
		Team t1  = new Team("Chivava");
		Team t2  = new Team("Goldies");
		Team t3  = new Team("Puddels");
		Team t4  = new Team("pupuus");

		t.setRank(12);
		t1.setRank(13);
		t2.setRank(14);
		t3.setRank(15);
		t4.setRank(16);


		t2.addPlayer("niki");
		t2.addPlayer("nicoline");

		System.out.println(t2);


	}
}