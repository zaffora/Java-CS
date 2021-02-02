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
    private String  name, type1, type2;
    private int number, total, hp, attack, defence, spAttack, spDefence, speed, generation;
    private boolean legendary;

    public Pokemon(String number, String name, String type1, String type2, String total, String hp, String attack, String defence, String spAttack, String spDefence, String speed, String generation, String legendary) {
        this.number = Integer.parseInt(number);
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = Integer.parseInt(total);
        this.hp = Integer.parseInt(hp);
        this.attack = Integer.parseInt(attack);
        this.defence = Integer.parseInt(defence);
        this.spAttack = Integer.parseInt(spAttack);
        this.spDefence = Integer.parseInt(spDefence);
        this.speed = Integer.parseInt(speed);
        this.generation = Integer.parseInt(generation);
        this.legendary = Boolean.parseBoolean(legendary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }

    public int getSpDefence() {
        return spDefence;
    }

    public void setSpDefence(int spDefence) {
        this.spDefence = spDefence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public void setLegendary(boolean legendary) {
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
