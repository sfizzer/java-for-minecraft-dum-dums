public class setin { 
    public static void main(String[] args) { 
        /*BOOLS AND COMPARISON OPERATORS */

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("I exist: " + isTrue);
        System.out.println("I does not exist: " + isFalse);

        // COMPARISON OPERATORS
        // > >= == != < <=

        int score = 98;

        boolean passed = score >= 50; //True

        System.out.println("you passed: "+ passed + " with "+ score + " points!");

        boolean perfectScore = score == 100;//False not equal

        System.out.println("you have a perfect score? " + perfectScore);

        boolean failed = passed == false;
        failed = !passed;

        System.out.println(failed);

        System.out.println("Offset added");

        boolean nevermore = 60 >= 100; //False

        System.out.println(nevermore);


    }
}
