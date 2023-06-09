package com.hashmap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        /*
         * Counts the number of occurrence of given word in a string
         */
        String sentence ="To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        for ( String word : words)
        {
            hashMap.put(word,1);
        }
        int frequency = hashMap.get("to");
        System.out.println("Frequency of given word is "+frequency);

        /*
         * Counts the number of occurrence of given word in a paragraph
         */
        HashMap hashMap1 = new HashMap();
        //Counts the number of occurrence of given word in string
        String sentence1 = "Paranoids are not"
                + "paranoid because they are paranoid but"
                + "because they keep putting themselves"
                + "deliberately into paranoid avoidable"
                + "situations";
        String[] words1 = sentence1.toLowerCase().split(" ");
        for ( String word : words1)
        {
            hashMap1.put(word,1);
        }
        int frequency1 = hashMap1.get("into");
        System.out.println("Frequency of given word is "+frequency1);

        /*
         * Delete a word from given paragraph
         */
        hashMap1.deleteWord("avoidable");
    }
}
