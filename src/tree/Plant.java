package tree;

public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Plant() {
        this("pew");
    }
}

