public class Aventurero {
    //Los atributos del aventurero son el número de vidas y el nombre del jugador
    private static int lives = 3;
    private String name;
    //El método constructor del aventurero recibe el nombre del jugador
    Aventurero(String name){
        this.name = name;
    }
    //Este método le da la bienvenida al aventurero
    public void saludar() {
        System.out.println("Hola" + name + "encontremos Atlantis");
        System.out.println("Vamos al primer mar");
    }
    //Getters y setters
    public static int getLives() {
        return lives;
    }
    public static void setLives(int lives) {
        Aventurero.lives = lives;
    }
}