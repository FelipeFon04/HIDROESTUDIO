public class Mar {
    //Los atributos de la lista son el nombre y el nivel del mar que es estático y se autoincrementa con el constructor
    private String marName;
    private static int marLevel = 0;
    //El método constructor da el nombre al mar y controla el autoincremento de la variable estática del nivel del mar
    Mar(String name){
        this.marName = name;
        marLevel += 1;
    }
    //Da la bienvenida al mar
    public void welcomeIsla() {
        System.out.println("\n\n Hemos llegado al mar" +
        marLevel + " " + marName);
        System.out.println("Contesta correctamente para continuar");
    }
    // Getter
    public static int getIslaLevel() {
        return marLevel;
    }
}