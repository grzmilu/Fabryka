
public class FabrykaStron {

    public Strona wybierzStrone(String typStrony) {
        if (typStrony == null) {
            return null;
        } else if (typStrony.equalsIgnoreCase("Galeria")||typStrony.equals("2")) {
            return new Galeria();
        } else if (typStrony.equalsIgnoreCase("Informacyjna")||typStrony.equals("1")) {
            return new Informacyjna();
        } else if (typStrony.equalsIgnoreCase("Kontaktowa")||typStrony.equals("3")) {
            return new Kontaktowa();
        } else if (typStrony.equalsIgnoreCase("Aktualnosci")||typStrony.equals("4")) {
            return new Aktualnosci();
        }
        
        return null;
    }
}
