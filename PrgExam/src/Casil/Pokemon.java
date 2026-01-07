package Casil;

import java.io.Serializable;

public class Pokemon implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String type;
    private int level;
    private String ability;
    private double weight;

    // ✅ Constructor ORDER MATCHES GUI
    public Pokemon(int id, String name, String type, int level, String ability, double weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.ability = ability;
        this.weight = weight;
    }

    // ✅ GETTERS
    public int getId() { 
        return id; 
    }

    public String getName() { 
        return name; 
    }

    public String getType() { 
        return type; 
    }

    public int getLevel() { 
        return level; 
    }

    public String getAbility() { 
        return ability; 
    }

    public double getWeight() { 
        return weight; 
    }

    // ✅ SETTERS
    public void setId(int id) { 
        this.id = id; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public void setType(String type) { 
        this.type = type; 
    }

    public void setLevel(int level) { 
        this.level = level; 
    }

    public void setAbility(String ability) { 
        this.ability = ability; 
    }

    public void setWeight(double weight) { 
        this.weight = weight; 
    }

    @Override
    public String toString() {
        return "Pokemon ID: " + id +
               "\nPokemon Name: " + name +
               "\nPokemon Type: " + type +
               "\nPokemon Level: " + level +
               "\nPokemon Weight: " + weight +
               "\nPokemon Ability: " + ability;
    }
}
