public class DogSearch {
	public static void main(String[] args) {
		// This code will not compile correctly until you fix it.
		//
		// We are trying to count the number of times the word
		// dog appears in some input text, but we can't seem to
		// remember the appropriate method call in the String class,
		// and are not sure our approach will work.
		// task: Use the JDK documentation to help us finish the code,
		// then discuss the ambiguity in the problem description, and
		// reword it to remove the ambiguity in the space provided below.
		//
		// Comments:
		// The description does not explicitly state that the matching word
		// 'dog' should be a word refers to an animal or any word that contains 'dog'.
		// The code below satisfy the latter condition which will count any
		// occurrences of 'dog' in the input string.
		// To count the word 'dog', the best practice is to use regex: \bdog\b(?!-)
		//
		// We could reword the problem description as follows:
		// We are trying to count the number of times the substring 'dog'
		// appears in some input text...

		String input = new String(
				"The Dogman was no ordinary dog, nor man, but rather a peculiar dog-like man who barked like a dog, and panted like a dog, he even ate like a dog.  He owned a dog named Doglips, and interestingly enough, his favorite food was hotdogs.");
		System.out.println(input);
		int index = -1;
		int count = 0;
		System.out.print("Counting dogs:");
		do {
			// use indexOf() to find the index of the first occurrence of substring 'dog'
			index = input.indexOf("dog", index + 1);
			if (index != -1) {
				count++;
				System.out.print(count + " ");
			}
		} while (index != -1);
		System.out.println("The word \"dog\" appears " + count + " times.");
	}
}
