import java.util.ArrayList;
public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int[] intArray = new int[10];
		String[] stringArray = new String[10];
		ArrayList<String> stringList = new ArrayList<String>();
		int int1 = 5;
		/*ArrayList<int> intList = new ArrayList<int>();*/
		//int - primitive data type
		//Integer - wrapper class
		Integer integer1 = new Integer(5);
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		//integerList.add(integer1);
		for(int i = 0;i<10;i++) {
			integerList.add(new Integer(i));
		}
		for(int i = 0;i<10;i++) {
			System.out.println(i+"------"+integerList.get(i).intValue());
		}
		Integer integer2 = 5; //boxing (them class cho 5)
		int1 = integer2; //unboxing (bo class)
		ArrayList <Double> doubleList = new ArrayList<Double>();
		for(double i=0.5;i<10.0;i+=0.5) {
			doubleList.add(i);
		}
		for(int i=0;i<doubleList.size();i++) {
			System.out.println(i+"-----"+doubleList.get(i));
		}
	}

}
