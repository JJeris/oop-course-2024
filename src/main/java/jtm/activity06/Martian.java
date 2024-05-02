package jtm.activity06;

public class Martian implements Humanoid, Alien, Cloneable {
    Object stomach;

    public Martian() {

    }

    @Override
    public void eat(Object item) {
        if (stomach == null) {
            if (item instanceof Human) {
                ((Human) item).killHimself();
            }
            stomach = item;
        }
    }

    @Override
    public void eat(Integer food) {

        eat((Object)food);
    }

    @Override
    public Object vomit() {
        Object tmp = stomach;
        stomach = null;
        return tmp;
    }



    @Override
    public String isAlive() {
        return "I AM IMMORTAL!";
    }

    @Override
    public String killHimself() {
        return isAlive();
    }

    @Override
    public int getWeight() {
        int stomachWeight = 0;
        if (stomach instanceof Integer) {
            stomachWeight = (Integer) stomach;
        }  else if (stomach instanceof Humanoid) {
            stomachWeight = ((Humanoid) stomach).getWeight();
        }
        return stomachWeight + Alien.BirthWeight;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getWeight() + " [" + stomach + "]";
    }

    @Override
    public Object clone() throws java.lang.CloneNotSupportedException {
        return clone(this);
    }

    private Object clone(Object current) {
        if (current instanceof Integer) {
            return Integer.valueOf((int) current);
        }
        if (current instanceof Martian) {
            Martian tmp = (Martian) current;
            Martian clone = new Martian();
            clone.eat(clone(tmp.stomach));
            return clone;
        }
        if (current instanceof Human) {
            Human tmp = (Human) current;
            Human clone = new Human();
            clone.eat(Integer.valueOf(tmp.stomach));
            return clone;
        }
        return null;
    }

}
