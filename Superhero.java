package perin_labos;

import java.util.List;

public class Superhero {
    private String name;
    private String alias;
    private List<String> supervillains;

    public Superhero(String name, String alias, List<String> supervillains) {
        super();
        this.name = name;
        this.alias = alias;
        this.supervillains = supervillains;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public List<String> getSupervillains() {
        return supervillains;
    }
}
