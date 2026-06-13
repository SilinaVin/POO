
import java.util.ArrayList;
import java.util.List;

public class PetShopRepositorio {

	private final ArrayList<Animal> animais = new ArrayList<>();

	/** Adiciona um animal à lista. */
	public void adicionar(Animal a) {
		animais.add(a);
	}

	/**
	 * Busca um animal pelo nome (case-insensitive).
	 * 
	 * @return o Animal encontrado, ou null se não existir.
	 */
	public Animal buscarPorNome(String nome) {
		for (Animal a : animais) {
			if (a.nome.equalsIgnoreCase(nome)) {
				return a;
			}
		}return null;
	}

	/**
	 * Remove o animal com o nome informado.
	 * 
	 * @return true se encontrou e removeu, false caso contrário.
	 */
	public boolean remover(String nome) {
		for (Animal a : animais) {
			if (a.nome.equalsIgnoreCase(nome)) {
				animais.remove(a);
				return true;
			}
		}return false;
	}


	
	public String atualizar(String nome, Animal novo) {
		for (Animal a : animais) {
			if (a.nome.equalsIgnoreCase(nome)) {
				a.nome = novo.nome;
				a.idade = novo.idade;
				a.raca = novo.raca;
				a.nomeDono = novo.nomeDono;
				a.telefone = novo.telefone;
				return "Pet atualizado com sucesso!";
			}
			}return "Pet não encontrado: " + nome;
	}



	/** Retorna a lista completa de animais cadastrados (cópia defensiva). */
	public ArrayList<Animal> listarTodos() {
		return animais;
	}

	/** Quantidade de animais cadastrados no repositório. */
	public int quantidade() {
		return 0;
	}
}

