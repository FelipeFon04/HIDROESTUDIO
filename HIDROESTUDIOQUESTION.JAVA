public class Question {
    //Los atributos serán un string que contiene la pregunta y las posibles respuestas y un caracter que contenga la respuesta correcta
    private String question;
    private char correctAnswer;
    Question(String question, char correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }
    //Muestra la pregunta en pantalla con sus posibles opciones
    public void showQuestion() {
        System.out.println();
        System.out.println(getQuestion());
        System.out.println("Coloca tu respuesta, NO numero");
    }
    //Compara la respuesta del usuario con la respuesta correcta
    public boolean isCorrectAnswer(char response){
        if (response == getCorrectAnswer()){
            return true;
        } else {
            return false;
        }
    }
    //Getters
    public String getQuestion() {
        return question;
    }
    public char getCorrectAnswer() {
        return correctAnswer;
    }
}
   