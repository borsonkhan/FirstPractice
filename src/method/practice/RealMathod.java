package method.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RealMathod {

	public static void main(String[] args) {
		System.out.println("Q1 = " + getUpperName("zarin khan"));
		System.out.println("Q2 = " + getUpperNameWithoutSpace("Borson khan"));
		System.out.println("Q3 = " + getLowerName("BORSON KHAN"));
		System.out.println("Q4 = " + getEvenNumber(20));
		System.out.println("Q5 = " + getOddList(20));
		System.out.println("Q6 = " + getKilometer(3));
		System.out.println("Q7 = " + getListOfName("borsonkhan"));
		System.out.println("Q8 = " + getTextCharacter("borsonkhan"));
		System.out.println("Q9 = " + getSumOfNumber(5));
		System.out.println("Q10 = " + getSquare(3));
		System.out.println("Q11 = " + Arrays.toString(getGivenNumber(5)));
		System.out.println("Q12 = " + Arrays.toString(getContainNumber(9)));
		System.out.println("Q13 = " + getGivenList(5));
		System.out.println("Q14 = " + getFizzBuzzText(9));
		
		int [] numberArray = {4 , 90 , 78,2};
		System.out.println("Q15 = " + (getMiniNumber(numberArray)));
		

		int [] numberArrayTwo = {4 , 90 , 78,2};
		System.out.println("Q16 = " + (getMaxNumber(numberArrayTwo)));


	}

	/*
	 * * Q47 = write a method that take one string input and return the same String
	 * by making upperCase of all alternative character and rest of the character
	 * lower case;
	 * 
	 */
	/*
	 * Q46 = write a method that take string input and return alternative character
	 * as a string ;
	 */
	/*
	 * Q45 = write a method that take one string input which contain an email adress
	 * then collect and return that email;
	 */
	/*
	 * Q44 = write a method that take one string input Which contain some numnbers
	 * then collect all of those numbers and rerurn in a list;
	 */
	/*
	 * Q43 = write a method that take one string inout which contain (a) number and
	 * return that as a int;
	 */
	/*
	 * Q42 = write a method that take a int [] input and return the bubble sorted
	 * array;
	 */
	/*
	 * Q41 = write a method that take one number list input and return the sorted
	 * list;
	 */
	/*
	 * Q40 = write a method take one number array input and return the sorted array;
	 */

	/*
	 * Q39 = write a method that take a int array input then convert that to a list
	 * and return list;
	 */
	/*
	 * Q38 = write a method take one int list input then convert that to an array
	 * and return that array;
	 */

	/*
	 * Q37 = write method that take one string input and retrun same string in
	 * reverse order'
	 */

	/*
	 * Q36 = write a method that take one int list input and return sum of all value
	 * 
	 */
	/*
	 * Q35 = write a method that take one int array and return sum of all value;
	 */

	/*
	 * Q34 = Write a method that take one string input and return all the unique
	 * characters without whitespace
	 */

	/*
	 * Q33 = write a method that take one string input and return all
	 * repeatedcharacters without whitespace
	 */

	/*
	 * Q32 = write a method that take one string and return count of character
	 * without whispace; Q31 = write a method that take one string input and return
	 * the count of allupper case character;
	 */

	/*
	 * Q30 = write a method that take one String input and return the count of all
	 * vowels;
	 */

	/*
	 * Q29 = write a method that take one string and return the count of all
	 * consonant;
	 */

	/*
	 * Q28 = write a method one string and one word input and return ture if that
	 * sentence contain given word otherwise false; Q27 = write a method that take
	 * one string and one character input and return the count of given character;
	 */

	/*
	 * Q26 = write a method take one string and one word input and return the
	 * countof that gien word;
	 */

	/*
	 * Q25 = write a method take one string input and return first word;
	 */
	/*
	 * Q24 = write a method that take one String input and return all word;
	 */

	/*
	 * Q23 = write a method that take a string input and return 5 to 10 character as
	 * a string;
	 */

	/*
	 * Q22 = write a method that take one string and return a list of first five
	 */
	/*
	 * Q21 = write a method that take one string and return a list of last five
	 */

	/*
	 * Q20 = write a method that take one string input and return the sum of all
	 */

	/*
	 * Q19 = write a method take string input and return true if it contain char 'o'
	 */

	/*
	 * Q18 = write a method that take a string representation of number input and
	 * return the same value as a int;
	 */

	/*
	 * Q17 = write a method that take a number input and return the same value as
	 * string;
	 */

	/*
	 * Q16 = write a method that take one number array and return the maximum
	 * number;
	 */
	public static int getMaxNumber(int[] numberArrayTwo) {
		int max = numberArrayTwo[0];
		
		for(int i=0; i<numberArrayTwo.length;i++) {
			
			if(max<numberArrayTwo[i]) {
				
				max = numberArrayTwo[i];
			}
		}
		
		return max;
	}

	/*
	 * Q15 = write a method that take one number array input and return the minimum
	 * number ;
	 * input = int[] number;
	 * return type = int;
	 * serving bucket = 0;
	 */
	public static int getMiniNumber(int[]numberArray) {
		int mini = numberArray[0];
		
		for(int i=0;i<numberArray.length;i++) {
			
			if(mini>numberArray[i]) {
				
				mini = numberArray[i];
			}
		}
		
		return mini;
	}

	/*
	 * 
	 * Q14 = write a method that take one number input and return a number "fizz" if
	 * 
	 * the given number divided by 5 and return "buzz" if the given number divided
	 * 
	 * by 5&&3 otherwise return "fizzbuzz";
	 * 
	 */

	public static String getFizzBuzzText(int number) {

		String fizzBuzz = " ";
		
		
		if(number% 5 ==0 && number% 3 ==0) {
			
			fizzBuzz = "fizz";
		}else if(number%3 ==0) {
			
			fizzBuzz = "buzz";
		}else {
			
			fizzBuzz = "fizzbuzz";
		}
		
		
		return fizzBuzz;
	}

	/*
	 * Q13 = write a method that take one number input and return number list 0 to
	 * given number;
	 */
	public static ArrayList<Integer> getGivenList(int number) {
		ArrayList<Integer> givenList = new ArrayList<Integer>();

		for (int i = 0; i < number; i++) {

			givenList.add(i);
		}

		return givenList;
	}

	/*
	 * Q12 = write a method take one number input and return an array that contain 1
	 * to that given number;
	 */

	public static int[] getContainNumber(int number) {
		int[] containNumber = new int[number + 1];

		for (int i = 1; i <= number; i++) {

			containNumber[i] = i;
		}

		return containNumber;
	}

	/*
	 * Q11 = write a method that take one number input and return an array that
	 * contain 0 to given number;
	 */
	public static int[] getGivenNumber(int number) {
		int[] givenNumber = new int[number + 1];

		for (int i = 0; i <= number; i++) {

			givenNumber[i] = i;

		}

		return givenNumber;
	}

	/*
	 * Q10 = write a method that take one number and return square of the that
	 * number; input = int number; return type = int; serving bucket = variable;
	 */
	public static int getSquare(int number) {
		int square = 0;

		square = number * number;

		return square;
	}

	/*
	 * Q9 = write a method take one number input and return the sum of 1 to that
	 * given number; input = int return type = int serving bucket = variable;
	 */
	public static int getSumOfNumber(int number) {
		int sum = 0;

		for (int i = 0; i <= number; i++) {

			sum = sum + i;
		}

		return sum;
	}

	/*
	 * Q8 = write a method that take one string and return list of all character;
	 * input = string name; return type = ArrayList<character> serving bucket =
	 * list;
	 */

	public static ArrayList<Character> getTextCharacter(String name) {
		ArrayList<Character> text = new ArrayList<Character>();

		for (int i = 0; i < name.length(); i++) {

			text.add(name.charAt(i));
		}

		return text;
	}

	/*
	 * Q7 = write a method that take one string input and return a list of all
	 * index; input = String name; Return type = ArrayLIST<Integer>; serving bucket
	 * = list;
	 */
	public static ArrayList<Integer> getListOfName(String name) {
		ArrayList<Integer> text = new ArrayList<Integer>();

		for (int i = 0; i < name.length(); i++) {

			text.add(i);
		}

		return text;
	}

	/*
	 * Q6 = write a method that take input as mile and return as a kilometer; input
	 * = int number; return type = int; serving bucket = variable;
	 */
	public static int getKilometer(int number) {
		int kilometer = 0;

		kilometer = number * 106;

		return kilometer;
	}

	/*
	 * Q5= write a method a number input and return the list of all odd number from
	 * 0 to that given number; input = ArrayList<Integer> numberlist; return type =
	 * ArrayList<Integer> serving bucket = list;
	 */
	public static ArrayList<Integer> getOddList(int number) {
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < number; i++) {

			if (i % 2 == 1)
				;

			odd.add(i);
		}

		return odd;
	}

	/*
	 * Q4 = write a method that take one number input and return the list of all
	 * even number from o to that given number input = int number; return type =
	 * ArrayList<Integer>; serving bucket = list;
	 */
	public static ArrayList<Integer> getEvenNumber(int number) {
		ArrayList<Integer> even = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {

				even.add(i);
			}

		}

		return even;
	}

	/*
	 * Q3= write a method that take one string input and return same string as a
	 * lower case; input = String name; return type = String; serving bucket =
	 * variable;
	 */
	public static String getLowerName(String name) {
		String lowerName = " ";

		lowerName = name.toLowerCase();

		return lowerName;
	}

	/*
	 * Q2 = write a method that take string input and return same as a upper case
	 * with no space; input = String name; return = String ; serving bucket =
	 * variable;
	 */

	public static String getUpperNameWithoutSpace(String name) {
		String upperName = " ";

		upperName = name.toUpperCase();

		upperName = name.replaceAll(" ", "");

		return upperName;
	}
	/*
	 * Q1 = write a method that take one String input and return same as uppercase;
	 * input = String name; return type = String; serving bucket = variable;
	 */

	public static String getUpperName(String name) {
		String upperName = " ";

		upperName = name.toUpperCase();

		return upperName;
	}

}
