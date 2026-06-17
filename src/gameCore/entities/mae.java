package gameCore.entities;

public class mae extends charater {

    private boolean isReal;

    public mae(String name, boolean isReal) {
        super(name);
        this.isReal = isReal;
    }

    public boolean getIsReal() {
        return isReal;
    }

    public void setIsReal(boolean real) {
        this.isReal = real;
    }

    //a method that is ment to replace a method from the class or interface before
    @Override
    public void speak(String line) {
        if (isReal) {
            System.out.println("Mae whispers: " + line);
        } else {
            System.out.println("Mae echoes faintly: " + line);
        }
    }
}


/*extends charater

private boolean isReal*/