package ro.upb.world.albert.board;

public class Empty implements CellElement{
    String name;
    public Empty() {
        name = "empty";
    }
    @Override
    public String toCharacter() {
        return "N";
    }
}
