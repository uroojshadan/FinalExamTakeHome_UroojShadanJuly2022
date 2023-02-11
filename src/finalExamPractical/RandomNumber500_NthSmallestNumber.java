package finalExamPractical;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Q. Generate 500 random numbers and print the nth smallest number.Ask user for the Nth smallest number

public class RandomNumber500_NthSmallestNumber {

	public static void main(String[] args) {

		Set<Integer> myData = new TreeSet<Integer>();// because TreeSet is sorted

		Random rn = new Random();
//		int min=100;
//		int max=1000;
		while (myData.size() != 500)// while this condition becomes false keep adding to the TreeSet
		{

			myData.add(rn.nextInt(999));// generating 1000 random nos
			// myData.add((rn.nextInt(max-min)+min)+1);//to generate random nos between 100
			// and 1000

		}
		System.out.println(myData);
		Object[] myDataArr = myData.toArray();

		System.out.println("Enter the n to get Nth smallest no: ");
		Scanner ui = new Scanner(System.in);
		int N = ui.nextInt();
		System.out.println(myDataArr[N - 1]);// print out element at n-1 since array index starts at 0

		ui.close();
	}
}
