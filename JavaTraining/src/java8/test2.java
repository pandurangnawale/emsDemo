package java8;

public interface test2 {

	public default void func(int x,String y){
		System.out.println("printing from test2");
	}
//	
//	public default String toString(){
//		//
//		return super.toString();
//	}

}
