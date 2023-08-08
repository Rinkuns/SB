package Logics;

public class GetSet {
	
	private String name="Rinkun";
	private int sal=100;
	private int incen=50;
	private int ph=98;
	
	void totalSal() {
		System.out.println(sal+incen);
	}

	public String getName() {
		return name;
	}

	public int getPh() {
		return ph;
	}

	public void setName(String name) {
		this.name = "Siku";
	}

	public void setPh(int ph) {
		this.ph = 123;
	}
	
	
	

}
