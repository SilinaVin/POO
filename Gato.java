public class Gato extends Animal {

    private boolean arranhaMoveis;

    public Gato(String nome, int idade, boolean faminto,String dono, boolean arranhaMoveis) {
    super(nome, idade, faminto, dono);
        this.arranhaMoveis = arranhaMoveis;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public boolean isArranhaMoveis() {
        return arranhaMoveis;
    }

    public void setArranhaMoveis(boolean arranhaMoveis) {
        this.arranhaMoveis = arranhaMoveis;
    }
}