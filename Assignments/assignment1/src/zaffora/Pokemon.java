package zaffora;

public class Pokemon {
    // 0 - #
    // 1 - Name
    // 2 - Type1
    // 3 - Type2
    // 4 - Total
    // 5 - HP
    // 6 - Attack
    // 7 - Defense
    // 8 - Sp. Atk
    // 9 - Sp. Def
    // 10 - Speed
    // 11 - Generation
    // 12 - Legendary
    private String number, name, type1, type2, total, hp, attack, defence, spAttack, spDefence, speed, generation, legendary;

    public Pokemon(String number, String name, String type1, String type2, String total, String hp, String attack, String defence, String spAttack, String spDefence, String speed, String generation, String legendary) {
        this.number = number;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.spAttack = spAttack;
        this.spDefence = spDefence;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(String spAttack) {
        this.spAttack = spAttack;
    }

    public String getSpDefence() {
        return spDefence;
    }

    public void setSpDefence(String spDefence) {
        this.spDefence = spDefence;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getLegendary() {
        return legendary;
    }

    public void setLegendary(String legendary) {
        this.legendary = legendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", total='" + total + '\'' +
                ", hp='" + hp + '\'' +
                ", attack='" + attack + '\'' +
                ", defence='" + defence + '\'' +
                ", spAttack='" + spAttack + '\'' +
                ", spDefence='" + spDefence + '\'' +
                ", speed='" + speed + '\'' +
                ", generation='" + generation + '\'' +
                ", legendary='" + legendary + '\'' +
                '}';
    }
}
