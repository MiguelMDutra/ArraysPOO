import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    private static Biblioteca biblioteca = new Biblioteca();
    public static void run() {
         int goTo = -1;
        while(goTo != 0){
            System.out.println("O que você quer?");
            goTo = input.nextInt();
        switch (goTo) {
            case 0:  
                break;
            case 1:{
                Livro livro = new Livro("miga", 1900, 200, 69.67, "migona");
                biblioteca.livros.add(livro);
            }
            break;
            case 2:{
                System.out.println(biblioteca.livros.get(0).getNome());
            }
            default:
                break;
        }
            
        }
        System.out.println("obrigado por vir");
    }
}
