package Java_Assignment92;
/*
 * This class will help your knowledge on Collection Framework.
 */

import java.util.Set;
import java.util.TreeSet;

public class Java_Assignment9_2 
{
	//method for union of the set
	public static <T> Set<T> union(Set<T> setA, Set<T> setB) 
	{
	    Set<T> tmp = new TreeSet<T>(setA);
	    tmp.addAll(setB);
	    return tmp;
	}

	  
	
	public static void main(String[] args) 
	{
		//Defining the object set set1
		TreeSet<Character> set1 = new TreeSet<Character>();
		//Defining the object set set2
	    TreeSet<Character> set2 = new TreeSet<Character>();

	    //Adding the elements in set1
	    set1.add('A');
	    set1.add('B');
	    set1.add('C');
	    set1.add('D');

	    //Adding the elements in set2
	    set2.add('C');
	    set2.add('D');
	    set2.add('E');
	    set2.add('F');

	    System.out.println("set1: " + set1); //printing the elements of set1
	    System.out.println("set2: " + set2); //printing the elements of set2
	    set1=(TreeSet<Character>) union(set1, set2);  //Storing the union of set1 and set2 in set1
	    System.out.println("After Union of set1 and set2 in set1: " + set1); //printing the elements of set1 after storing the union
	    
	}

}