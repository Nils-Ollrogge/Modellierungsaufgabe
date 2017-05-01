public class AccessConsole {

    private String key;
    
    
    /*  ++++++++++ CONSTRUCTORS ++++++++++  */
    
    public AccessConsole {
    
        key = "00000";
    
    }
    
    
    /*  ++++++++++ GETTER ++++++++++  */
    
    public boolean getAccess(String key) {
    
        if (key.equals(this.key)) {
            return true;
        } else {
            return false;
        }
    
    }
    
    
    /*  ++++++++++ SETTER ++++++++++  */
    
    public void setKey(String currKey, String newKey) {
    
        if (currKey.equals(this.key)) {
            
            this.key = newKey;
            
            System.out.println("Passwort wurde ersetzt.");
            
        } else {
        
            System.out.println("Falsches Passwort. Passwort wurde nicht verändert.");
        
        }
    
    }

}
