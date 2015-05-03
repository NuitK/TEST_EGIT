package ti.java.otis.p1;

public class test01 {
	void f(){
		System.out.println("1");
	}
	public class in{
		public test01 out(){
			return test01.this;
		}
	}
	static void te(int i , Object ... args){
		System.out.print(i);
		for(Object o:args){
		System.out.print(" "+o);
		}
	}
//	in in(){return new in();}
	public static void main(String args[]){
		test01 test = new test01();
//		test01.in t1=test.in();
//		t1.out().f();
		test01.in i=test.new in();
		test01 test2=i.out();
		test2.f();
//		testFinalize t = new testFinalize();
//		t.checkIn();
		new testFinalize(true);
		new tf();
		tf tf1= new tf(0);
		tf1.changei();
		new tf(333);
		System.gc();
		
		te(1,new Object[]{
				new Integer(4),new Float(4.5),new varArgs()
		});
		
		varArgs.printArry(new Object[]{
				new Integer(47),new Float(1.1),new Double(2.2)
		});
		varArgs.printArry(new Object[]{
				new varArgs().toString() ,new varArgs(),new varArgs()
		});	
	}
}
class testFinalize{
	boolean checkedOut = false;
	testFinalize(){
		checkedOut = true;
	}
	testFinalize(boolean b){
		checkedOut = b;
	}
	void checkIn(){
		checkedOut = false;
	}
	protected void finalize(){
		if(checkedOut){
			System.out.print(checkedOut);
		}
	}
}

class varArgs{
	static void printArry(Object[] args){
		for (Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}
}


class tf{
	int i = 0;
	tf(){
	}
	tf(int j){
		i=j;
	}
	void changei(){
		i=666;
	}
	protected void finalize(){
		System.out.println(i);
	}
}