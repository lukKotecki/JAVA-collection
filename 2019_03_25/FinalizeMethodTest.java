


public class FinalizeMethodTest{
	
	public FinalizeMethodTest(){	
		System.out.println("This is constructor of FinalizeMethodTest class");
	}
	
	protected void finalize(){	
		System.out.println("This is finalize function");
	}
	
	//public ~FinalizeMethodTest(){
	//	System.out.println("This is destructor of FinalizeMethodTest class");
	//}
}
