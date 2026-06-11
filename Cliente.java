public class Cliente { 

private String nome="";
private String telefone="";

public void exibirDados(){
    System.out.println("Dono: " + nome);
    System.out.println("Telefone: " + telefone);
}
public String getNome() {
    return nome;


}
public String getTelefone() {
    return telefone;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
}
