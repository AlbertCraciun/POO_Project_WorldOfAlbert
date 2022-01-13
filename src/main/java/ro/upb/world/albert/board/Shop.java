package ro.upb.world.albert.board;

public class Shop implements CellElement {
    String name;

    public Shop() {
        name = "A shop...";
    }

    @Override
    public String toCharacter() {
        return "S";
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }
}
