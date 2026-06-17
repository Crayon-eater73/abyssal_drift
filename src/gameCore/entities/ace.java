package gameCore.entities;

public class ace {

    private String name;
    private int health;
    private int sanityLevel;
    private boolean hearingVoices;

    private final int maxHealth = 100;
    private final int maxSanity = 100;
    private final int voiceThreshold = 30;

    //eventually when I build this out, these will be in the game. For right now, it's a visual novel
    //this. whatever a declared varaible that belongs to the BLANK object itself
    public ace(String name) {
        this.name = name;
        this.health = maxHealth;
        this.sanityLevel = maxSanity;
        this.hearingVoices = false;
    }

    //returns the name vaule
    public String getName() {
        return name;
    }
//if damage is over 0, player takes damage
    public void takeDamage(int amount) {
        if (amount < 0) return;

        //if player takes damage, player looses health
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    //player looses sanity
    public void loseSanity(int amount) {
        if (amount < 0) return;

        this.sanityLevel -= amount;
        if (this.sanityLevel < 0) {
            this.sanityLevel = 0;
        }

        updateVoicesStatus();
    }

    private void updateVoicesStatus() {
        this.hearingVoices = (this.sanityLevel <= voiceThreshold);
    }

    //all below is basially returning health or sanity
    public int getHealth() { return health; }
    public int getSanityLevel() { return sanityLevel; }
    public boolean isHearingVoices() { return hearingVoices; }
    public boolean isDead() { return health <= 0; }

    public int getMaxHealth() { return this.maxHealth; }
    public int getMaxSanity() { return this.maxSanity; }

    //this is when I will eventually add these attributes to the screen
    public void displayStatus() {
        System.out.println("=== ACE STATUS ===");
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth() + "/" + getMaxHealth());
        System.out.println("Sanity: " + getSanityLevel() + "/" + getMaxSanity());
        System.out.println("Hearing Voices: " + (isHearingVoices() ? "YES" : "NO"));
        System.out.println("==================");
    }
}
/*What should be inside 
    private int health
    private int sanityLevel
    private boolean
    hearingVoices
    
    public void takeDamage(int amount)
    public void loseSanity(int amount)*/
