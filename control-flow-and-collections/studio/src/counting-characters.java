import java.util.HashMap;

    public class counting-characters {
        public static void main(String[] args) {
            String input = "Test Input!";

        // Stores and updated the count
        HashMap<Character, Interger> charCountMap = new HashMap<>();

        // Loops through the stirng one char at a time
        for (char currentChar : input.toCharArray()){
            if(Character.isLetterOrDigit(currentChar)){
            charCountMap.put(currentChar,charCountMap.getOrDefault(currentChar,0)+1);
            }
        }
        // Loops through the HashMap to print the results!
        for (char currentChar : charCountMap.keySet()) {
            System.out.println("Character" + currentChar + ", Count: " + charCountMap.get(currentChar));
        }
        }

        }
