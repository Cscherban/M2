package edu.gatech.oad.antlab.person;

import java.lang.StringBuilder;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Christopher Scherban
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {

	  StringBuilder sb = new StringBuilder(input);
	  StringBuilder outputString = new StringBuilder("");
	  int index = 0;

	  Random rnd = new Random();

	  for(int i =0; i < sb.length(); i++){
	  	index = rnd.nextInt(sb.length());
	  	outputString.append(sb.charAt(index));
	  	sb.deleteCharAt(index);
	  }

	  return outputString.toString();
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
