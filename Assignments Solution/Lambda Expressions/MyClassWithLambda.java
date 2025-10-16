package LambdaExpressions;

public class MyClassWithLambda {
    public static void main(String[] args) {
        // Implement the 'count' method using a lambda expression
        WordCount wordCounter = (str) -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            // Split the string by one or more spaces to count words
            String[] words = str.trim().split("\\s+");
            return words.length;
        };

        String sentence = "This is a sample sentence for counting words.";
        int count = wordCounter.count(sentence);

        System.out.println("The sentence is: \"" + sentence + "\"");
        System.out.println("Number of words: " + count);

        // Test with another string
        String anotherSentence = "Lambda expressions make code concise.";
        System.out.println("\nThe sentence is: \"" + anotherSentence + "\"");
        System.out.println("Number of words: " + wordCounter.count(anotherSentence));
    }
}
