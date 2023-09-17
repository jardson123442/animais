package animais;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome, int cartasEnviadas){
        super(nome);
        this.cartasEnviadas = 10;
    }

    public void fazerPru(){
        System.out.printf("%s fez Pruuuuu!\n", getNome());
    }

    public void cartasEnviadas(){
        System.out.printf("%s enviou uma carta!\n", getNome());
        cartasEnviadas ++; 
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }


    
    
}
