package anagramCheck;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheckApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first word you would like to check: ");
		String word1 = in.nextLine().trim();
		System.out.println("Please enter the second word you would like to check: ");
		String word2 = in.nextLine().trim();
		char[] chars1 = word1.toCharArray();
		char[] chars2 = word2.toCharArray();
		HashMap<String,Integer> letters1 = new HashMap<String,Integer>();
		HashMap<String,Integer> letters2 = new HashMap<String,Integer>();
		Boolean match = true;
		if(chars1.length == chars2.length){
			for(char i:chars1){
				if(letters1.containsKey(Character.toString(i))){
					letters1.replace(Character.toString(i), letters1.get(Character.toString(i))+1);
				}
				else{
					letters1.put(Character.toString(i), 1);
				}
			}
			for(char j:chars2){
				if(letters2.containsKey(Character.toString(j))){
					letters2.replace(Character.toString(j), letters1.get(Character.toString(j))+1);
				}
				else{
					letters2.put(Character.toString(j), 1);
				}
			}
			for(String key:letters1.keySet()){
				if(letters1.get(key) != letters2.get(key))
					match = false;
			}
		}
		else match = false;
		
		if(match)System.out.println("The two words are anagrams!");
		else System.out.println("The two words are not anagrams!");
	}

}
