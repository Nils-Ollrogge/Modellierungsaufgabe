public class AccessRoom extends Room {

    public AccessConsole keyPad;
    
    
    /*  ++++++++++ CONSTRUCTORS ++++++++++  */
    
    public AccessRoom(String name) {
        
        super(name);
        
        keyPad = new AccessConsole();
        
    }
    
    public AccessRoom(String name, String password) {
        
        super(name);
        
        keyPad = new AccessConsole();
        keyPad.setKey("00000", password);
        
    }
    
    
    /*  ++++++++++ INTERACTION +++++++++++ */
    
    public enter(String key) {
    
        if (keyPad.getAccess(key)) {
        
          System.out.println("Zugang zu " + this.name + " gewährt.");
          
        } else {
        
          System.out.println("Zugang verweigert. Falsches Passwort.");
          
        }
        
    }
    
    

}
