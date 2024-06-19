package pack1;

public class Sample4 {
	public void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {
	
	Flower lily=new Flower();
	System.out.println(lily.seeds);
	lily.generateOil();
	Sample4 s=new Sample4();
	s.m1();
	
	}

}
