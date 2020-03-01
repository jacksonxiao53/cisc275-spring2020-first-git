import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3 {
	
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>() {
			@Override
			public int compare(Animal a, Animal b){
			    System.out.println(a +" " +b);
			    System.out.println(a.getLegs()-b.getLegs());
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
	}
}
