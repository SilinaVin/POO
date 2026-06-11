class Cachorro extends Animal implements AtendivelNoEstetica{
    Cachorro(String nome, int idade, String raca, boolean faminto, String dono) {
        super(nome, idade, raca, faminto, dono);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void darBanho() {
        System.out.println("Dando banho no cachorro...");
    }

    @Override
    public void cortarUnhas() {
    System.out.println("Cortando as unhas do cachorro...");
    }
}
