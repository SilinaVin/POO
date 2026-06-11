public class petShop {
    public static void main(String[] args) {
    Animal[] filaAtendimento = new Animal[2];
    filaAtendimento[0] = new Cachorro("Rex", 5, "Labrador", true, "João");
    filaAtendimento[1] = new Gato("Mia", 3, false, "Maria", true);
    AtendivelNoEstetica[] filaEstetica = new AtendivelNoEstetica[1];
filaEstetica[0] = (AtendivelNoEstetica) filaAtendimento[0];
for (int i = 0; i < filaAtendimento.length; i++) {
    System.out.println("Animal " + (i + 1) + ":");   
    filaAtendimento[i].emitirSom();
     if (filaAtendimento[i] instanceof AtendivelNoEstetica) {

        AtendivelNoEstetica atendivel =
                (AtendivelNoEstetica) filaAtendimento[i];

        atendivel.darBanho();
        atendivel.cortarUnhas();
    }
    System.out.println("Nome: " + filaAtendimento[i].getnome());
    System.out.println("Raça: " + filaAtendimento[i].getraca());
    System.out.println("Idade: " + filaAtendimento[i].getidade());
    System.out.println("Faminto: " + filaAtendimento[i].isfaminto());
    System.out.println("O dono do pet é: " + filaAtendimento[i].getdono());
    System.out.println("Total de animais no pet shop: " + Animal.totalDeAnimais);
    } 
}
}
        

    