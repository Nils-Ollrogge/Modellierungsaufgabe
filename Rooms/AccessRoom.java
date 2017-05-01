public class AccessRoom extends Room {

    public AccessConsole keyPad;
    
    
    /*  ++++++++++ CONSTRUCTORS ++++++++++  */
    
    public AccessRoom(String name) {
        
        super(name);
        
        keyPad = new AccessConsole();
        
    }
    
    
    /*  ++++++++++ INTERACTION +++++++++++ */
    
    @Override
    public enter(String key) {
    
        if (keyPad.getAccess(key)) {
        
          System.out.println("Zugang zu " + this.name + " gewährt.");
          
        } else {
        
          System.out.println("Zugang verweigert. Falsches Passwort.");
          
        }
        
    }
    
    

}