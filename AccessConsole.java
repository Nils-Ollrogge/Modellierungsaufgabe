public class AccessConsole {

    private String key;
    
    
    /*  ++++++++++ CONSTRUCTORS ++++++++++  */
    
    public AccessConsole {
    
        key = "00000";
    
    }
    
    
    /*  ++++++++++ GETTER ++++++++++  */
    
    public boolean getAccess(Sring key) {
    
        if (key === this.key) {
            return true;
        } else {
            return false;
        }
    
    }
    
    
    /*  ++++++++++ SETTER ++++++++++  */
    
    public void setKey(String currKey, String newKey) {
    
        if (currKey === this.key) {
            
            this.key = newKey;
            
            System.out.println("Passwort wurde ersetzt.");
            
        } else {
        
            System.out.println("Falsches Passwort. Passwort wurde nicht verändert.");
        
        }
    
    }

}