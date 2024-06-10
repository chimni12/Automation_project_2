package This_keyword;

public class this_004 {
	
	public void pen () {
		System.out.println("pen method from this_004");
	}
	
	public void pencile() {
		this.pen();
		System.out.println("pencile method from this_004");
		
	}

	public static void main(String[] args) {
		this_004 t4 = new this_004();
		t4.pencile();

	}

}
