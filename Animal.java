public abstract class Animal {

    protected static int totalDeAnimais;

    protected String nome;
    protected int idade;
    protected String raca;
    protected boolean faminto;
    protected Cliente dono = new Cliente();

    public Animal(String nome, int idade, String raca,boolean faminto, String dono) {

        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.faminto = faminto;
        this.dono.setNome(dono);

        totalDeAnimais++;
    }

    public Animal(String nome, int idade,boolean faminto, String dono) {

        this.nome = nome;
        this.idade = idade;
        this.faminto = faminto;
        this.dono.setNome(dono);

        totalDeAnimais++;
    }

    public String getnome() {
        return nome;
    }

    public String getraca() {
        return raca;
    }

    public int getidade() {
        return idade;
    }

    public boolean isfaminto() {
        return faminto;
    }

    public String getdono() {
        return dono.getNome();
    }

    public abstract void emitirSom();
}
