import elementoComposto.Kit;
import elementoSimples.Produto;


public class Main {
    public static void main(String[] args) {

        Produto mouse = new Produto("Mouse", 80);
        Produto teclado = new Produto("Teclado", 150);
        Produto monitor = new Produto("Monitor", 900);
        Produto mousepad = new Produto("Mousepad", 40);

        Kit perifericos = new Kit("Kit Perifericos");
        Kit setup = new Kit("Kit Setup");

        perifericos.adicionar(mouse);
        perifericos.adicionar(teclado);
        perifericos.adicionar(mousepad);

        setup.adicionar(monitor);
        setup.adicionar(perifericos);

        setup.exibir("");
        System.out.println("=========================================");


    }
}