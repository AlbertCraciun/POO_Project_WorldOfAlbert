package ro.upb.world.albert.board;

public class Finish implements CellElement {
    String name;
    public Finish() {
        name = "finish";
    }

    @Override
    public String toCharacter() {
        return "F";
    }
}
