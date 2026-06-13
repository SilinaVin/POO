public class Animal {

   

    protected String nome;
    protected int idade;
    protected String raca;
    protected String nomeDono;
    protected String telefone;
    protected String exibirDados() {
        return "---------------------------------\n"+
               "|o nome é; "+nome+ " | \n" 
              +"| a raça é "+raca+ "             |\n" 
              +"|idade "+idade+"                 |\n"
              +"|o nome do tutor é "+nomeDono+"  |\n"
              +"|e o telefone é "+telefone+"     |\n" 
              +"----------------------------------";
    }
    public Animal(String nome, int idade, String raca, String nomeDono,String telefone) {

        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.nomeDono= nomeDono;
        this.telefone=telefone;

    }
}
