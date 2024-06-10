package interface_ex;

public class Follow_Traffic_Rule implements  Traffic_signal {

	public static void main(String[] args) {
		 Follow_Traffic_Rule ftr= new  Follow_Traffic_Rule();
		 ftr.green();
		 ftr.yellow();
		 ftr.red();
//Interface object-directly
		 //Traffic_signal f=new Traffic_signal();
		 
		 //Interface obeject-In-directly
		 Traffic_signal f = new  Follow_Traffic_Rule();
	}

	@Override
	public void green() {
	System.out.println("proceed with 60kmph");	
	}

	@Override
	public void yellow() {
	System.out.println("proceed with 30kmph");	
	}

	@Override
	public void red() {
	System.out.println("stop here");	
	}

}
