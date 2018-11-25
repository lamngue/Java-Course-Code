
public class Student {
	private String name;
	private static int numbers; //chia se voi tat ca doi tuong trong lop (ko can p tao instance)
	public Student(String name) {
		this.name = name;
		System.out.println("Sinh vien moi ten:" + this.name);
		numbers++;
		System.out.println("So luong sv trong lop:" + numbers); //ko co this vi la bien static
	}
	public String getName() {
		return this.name;
	}
	public static int getNumbers() {
		return numbers; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
