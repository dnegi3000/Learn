import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream {
	public static void main (String args[])
	{
		List<Integer >  values = Arrays.asList(1,3,455,56,4,5,6);
		
		for ( int i = 0 ;i < values.size(); i++)
		{
			
			System.out.println(values.get(i));
		}

	 //external iterator 
	 //internal iterator
	 
		values.forEach(new Consumer<Integer>() {
			
			@Override
			public void accept(Integer value) {
				 System.out.println(value);
				
			}
		});
		
		values.forEach(value -> System.out.println(value));
		
		values.forEach(System.out::println);

		//values.forEach(java.util.List::add);
		
       int total = 0;
		for ( int i : values)
		{
			total += i*2;
		}
		System.out.println(total);
		
		values.stream().map(e -> e*2).reduce(0,(c,e) -> c+e);
		
		testStreams();

	}
	
	public static void  testStreams(){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(21);
		list.add(4);
		list.add(5);
		list.add(10);
		System.out.println("=======================");
		 list.stream().filter((values)->{
			 return (int)values > 0;
		 } ).forEach(System.out::println);;
		
		
	}
	

}
