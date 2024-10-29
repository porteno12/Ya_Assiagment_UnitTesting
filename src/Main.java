public class Main {
    public static void main(String[] args) {
        // example input and output
        String str = "she sells sea shells by the sea";
        int maxChars = 10;

        // call the wordBucket method and stores the result
        String[] buckets = wordBucket(str, maxChars);

        // display the output using foreach loop
        System.out.println("Buckets for string: " + str);
        for (String bucket : buckets) {
            System.out.println(bucket);
        }
    }


    // Method signature for the wordBucket method
    public static String[] wordBucket(String str, int maxChars) {
        //todo: implement the method algorithm

        return null; // just a tmp placeholder return
    }
}