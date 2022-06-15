import java.util.Scanner;
public class Game {
    //El método initGame nos ayuda a iniciar un juego nuevo y crea una instancia de la clase aventurero
    public static void initGame() {
        System.out.println("Bienvenido Aventurero, ¿Como te llamas?");
        //Obtenemos el nombre del aventurero
        Scanner sc = new Scanner(System.in);
        String aventureroName = sc.nextLine();
        //Constructor de la clase aventurero
        Aventurero jugador = new Aventurero(aventureroName);
        jugador.saludar();
        System.out.println("\n 1. Seguir \n 2. Salir");
        int continuar = sc.nextInt();
        if (continuar == 1){
            //Llamamos la función que nos traerá el siguiente nivel
            nextLevel();
        }
    }
    //Este método nos ayuda a validar el nivel actual y generar una nueva ubicación en el mar con un siguiente nivel
    public static void nextLevel(){
        //Evaluamos el nivel del mar utilizando la variable estática marLevel
        switch (mar.getIslaLevel()) {
            case 0:
            Mar mar1 = new Mar("Mar Atlantico");
            ejecutarNivel(mar1);
            break;
            case 1:
            Mar mar2 = new Mar("Mar Caribe");
            ejecutarNivel(mar2);
            break;
            case 2:
            Mar mar3 = new Mar("Mar del mediterraneo");
            ejecutarNivel(mar3);
            break;
            case 3:
            Mar mar4 = new Mar("Mar rojo");
            ejecutarNivel(mar4);
            break;
            case 4:
            Mar mar5 = new Mar("Mar desconocido");
            ejecutarNivel(mar5);
            break;
            case 5:
            winGame();
            break;
        }
    }
    //Con este método entramos en el mar, creamos una nueva pregunta y solicitamos el resultado de la operación
    public static void ejecutarNivel(Mar mar){
        //Damos la bienvenida al mar y generamos una nueva pregunta
        mar.welcomeMar();
        //Constructor de la clase pregunta, por el momento es una sola pregunta de prueba
        Question question = new Question("Cuanto es 9-6:
        \na.1\nb.3\nc.5\nd.4", 'b');
        question.showQuestion();
        //Pedimos la respuesta al usuario
        Scanner sc = new Scanner(System.in);
        char response = sc.nextLine().charAt(0);
        //Comparar la respuesta y avanzar al siguiente mar
        boolean isCorrect = question.isCorrectAnswer(response);
        if (isCorrect == true){
            System.out.println("Lo lograste, respuesta correcta");
            System.out.println("1. Vamos al siguiente Mar");
            int nextMar = sc.nextInt();
            if (nextMar == 1) {
                nextLevel();
            }
        } else {
            rectificarVidas(mar);
        }
    }
    //Con este método restamos una vida al aventurero y le damos otra oportunidad si aún puede jugar
    public static void rectificarVidas(Mar mar){
        //Restamos una vida al aventurero
        Aventurero.setLives(Aventurero.getLives() - 1);
        System.out.println("\n\nTe equivocaste, has perdido una vida");
        if (Aventurero.getLives() != 0){
            System.out.println("Aun tienes" + Aventurero.getLives() + "vidas");
            ejecutarNivel(mar);
        } else {
            gameOver();
        }
    }
    //Con este método notificamos al jugador que ha ganado el juego
    public static void winGame(){
        System.out.println("\n\n Lo has logrado!! Llegasta hasta Atlantis");
        System.out.println("Aun puedes continuar aprendiendo todo lo que quieras, nunca te rindas");
    }
    // Con este método notificamos al jugador que ha perdido y puede volver a intentarlo
    public static void gameOver(){
        System.out.println("\n\n Hemos perdido las pistas, lo siento");
        System.out.println("Vuelve a intentarlo, estas cerca!!");
        System.out.println("1. Jugar de nuevo");
        System.out.println("0. Salir del juego");
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        if (res == 1){
            initGame();
        } else {
            System.out.println("Espero verte otra vez");
        }
    }
}