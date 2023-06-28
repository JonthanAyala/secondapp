package mx.edu.utez.secondapp.models.pokemon;

import mx.edu.utez.secondapp.models.user.Person;

public class Pokemon {
    private Long id;
    private String nombre;
    private Double power;
    private Double weight;
    private Double height;
    private String abilities;
    private Person person;
    private PokemonType pokemonType;

    public Pokemon() {
    }

    public Pokemon(Long id, String nombre, Double power, Double weight, Double height, String abilities, Person person, PokemonType pokemonType) {
        this.id = id;
        this.nombre = nombre;
        this.power = power;
        this.weight = weight;
        this.height = height;
        this.abilities = abilities;
        this.person = person;
        this.pokemonType = pokemonType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PokemonType getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(PokemonType pokemonType) {
        this.pokemonType = pokemonType;
    }
}
