package gameCore.entities;

public abstract class charater {
    protected String name;
    protected boolean isAlive;

    //delacres a vraiable to BLANK object for itself
    public charater(String name) {
        this.name = name;
        this.isAlive = true;
    }

    //returns the name
    public String getName() {
        return name;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }

    public abstract void speak(String line);
}


/*protected String name
protected boolean isAlive

public abstract void speak(String line)*/