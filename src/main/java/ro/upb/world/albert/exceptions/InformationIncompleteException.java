package ro.upb.world.albert.exceptions;

public class InformationIncompleteException extends Exception{
    public InformationIncompleteException(String pr) {
        System.out.println("You can't continue without complete " + pr);
    }
}
