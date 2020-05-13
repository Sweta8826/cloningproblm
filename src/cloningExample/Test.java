package mvnPractice;

public class Test implements Cloneable {

	int x;
	int z;

	Test(int x,int z){
		this.x=x;
		this.z=z;
	}

	Test Clone(){
		try
		{ 
			Test clonedTestObject= (Test) super.clone(); 
			return clonedTestObject;
		} 
		catch(CloneNotSupportedException e) 
		{ 
			System.out.println("CloneNotSupportedException is caught"); 
			return this; 
		} 
	} 

	public static void main(String args[]) throws Exception {

		Test t1=new Test(1,2);


		Test t2= t1.Clone();
		t1.x=3;
		t1.z=4;
		System.out.println("Object is cloned");
		System.out.println("Return is:"+t1.x+"Return of y is:"+t1.z);
		System.out.println("Return of x is:"+t2.x+"Return of y is:"+t2.z);
		
		Object tfrv =new Test(1,2);
		Test rcrr = (Test) tfrv;
	}


}
