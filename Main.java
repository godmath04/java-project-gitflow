public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        
        System.out.println(saludo.generarSaludo("Mundo", "en"));
        System.out.println(saludo.generarSaludo("Mundo", "es"));
        System.out.println(saludo.generarSaludo("Mundo", "fr"));
        


        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundilloooooo"));


        System.out.println("****ESTE ES LA V1.1.0****");
        System.out.println("* JAVAAA APRENDIZAJE*");
        System.out.println("***DE GITFLOW**");


    }
}
