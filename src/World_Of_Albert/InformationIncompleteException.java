package World_Of_Albert;

public class InformationIncompleteException extends Exception{
    public InformationIncompleteException(String pr) {
        System.out.println("You can't continue without complete " + pr);
    }
}
