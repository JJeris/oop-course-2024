package jtm.activity06;

public class Human implements Humanoid {
    int stomach;
    boolean alive;

    public Human() {
        alive = true;
    }

    @Override
    public void eat(Integer food) {
        if (stomach == 0) {
            stomach = food;
        }
    }

    @Override
    public Integer vomit() {
        int tmp = stomach;
        stomach = 0;
        return tmp;
    }

    @Override
    public String isAlive() {
        if (alive == true) {
            return "Alive";
        }
        return "Dead";
    }

    @Override
    public String killHimself() {
        alive = false;
        return isAlive();
    }

    @Override
    public int getWeight() {
        return stomach + Humanoid.BirthWeight;
    }

    @Override
    public String toString() {
        return "Human: " + getWeight() + " [" + stomach + "]";
    }
}
