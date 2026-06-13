
class Cachorro extends Animal {
    Cachorro(String nome, int idade, String raca, String nomeDono,String telefone) {
        super(nome, idade, raca,nomeDono,telefone);
    }

    @Override
    protected String exibirDados() {
        return "---------------------------------\n"+
               "|o nome do cachorro é; "+nome+ " | \n" 
              +"| a raça é "+raca+ "             |\n" 
              +"|idade "+idade+"                 |\n"
              +"|o nome do tutor é "+nomeDono+"  |\n"
              +"|e o telefone é "+telefone+"     |\n" 
              +"----------------------------------";
    }
}

