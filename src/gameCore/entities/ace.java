package gameCore.entities;

public class ace {

    private int health;
    private int sanityLevel;
    private boolean hearingVoices;

    private final int maxHealth = 100;
    private final int maxSanity = 100;
    private final int voiceThreshold = 30;

    public ace() {
        this.health = maxHealth;
        this.sanityLevel = maxSanity;
        this.hearingVoices = false;
    }

    public void takeDamage(int amount) {
        if (amount < 0) return;

        this. health -= amount;
        if(this.health < 0) {
            this.health = 0;
        }
    }
    
    public void loseSanity(int amount) {
        if (amount < 0) return;

        this.sanityLevel -= amount;
        if(this.sanityLevel < 0) {
            this.sanityLevel = 0;
        }

        updateVoicesStatus();
    }

    private void updateVoicesStatus() {
        this.hearingVoices = (this.sanityLevel <= voiceThreshold);
    }

    public int getHealth() { return health; }
    public int getSanityLevel() { return sanityLevel; }
    public boolean isHearingVoices() { return hearingVoices; }
    public boolean isDead() { return health <= 0; }

    public int getMaxHealth() { 
        return this.maxHealth;
    }
    
    public int getMaxSanity() { 
        return this.maxSanity; 
    }

    public void displayStatus(ace ace) {
        System.out.println("=== ACE STATUS ===");
        System.out.println("Health: " + ace.getHealth() + "/" + ace.getMaxHealth());
        System.out.println("Sanity: " + ace.getSanityLevel() + "/" + ace.getMaxSanity());
        System.out.println("Hearing Voices: " + (ace.isHearingVoices() ? "YES" : "NO"));
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
