package gen;
class Gen<T>{
	T obj;
	Gen (T o){
		obj = o;
	}
	public T getobj() {
		return obj;
	}
}
public class Demo {

	public static void main(String[] args) 
	{
		Gen<Integer> iob = new Gen<>(100);
		int x = iob.getobj();
		System.out.println(x);
		
		Gen<String> sob = new Gen<>("Hello");
		String str = sob.getobj();
		System.out.println(str);
	}

}
