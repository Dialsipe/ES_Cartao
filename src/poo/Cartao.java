package poo;

/**
 * 
 * @author diogo
 *
 *
 *	Classe Cartão  serve para mostrar os funcionários, os seus respetivos serviços e cargos.
 */

public class Cartao {
	
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	
	/**
	 * Constructor - que tem como objetivo criar um objeto da classe Cartão com apenas o atributo nome incializado.
	 * 
	 * @param nomeFuncionario - Argumento que irá enviar o nome do funcionário para ser guardado no objeto.
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
	
	/**
	 * Constructor - que tem como objetivo criar um objeto da classe Cartão com os atributos todos incializados.
	 * @param nomeFuncionario -	Argumento que irá enviar.
	 * @param servico - Argumento que irá guardar o serviço da pessoa.
	 * @param cargo - Argumento que irá guardar o cargo da pessoa.
	 */

	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	/**
	 * Serve para visualizar o nome do funcionário.
	 * @return -retorna o nome do Funcionário.
	 */
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	/**
	 * Server para guardar um novo valor no atributo serviço na classe funcionário.
	 * @param servico - Argumento que guarda o valor.
	 */
	public void setServico(String servico) {
		this.servico = servico;
	}

	/**
	 * Serve para guardar um novo valor no atributo cargo na classe funcionário.
	 * @param cargo - Argumento para guardar o valor.
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// Métodos
	/**
	 *Serve para retirar um serviço ao funcionário.
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	/**
	 * Serve para atribuir um novo serviço ao funcionário.
	 * @param novoServico - argumento que guarda o valor do novo serviço.
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	
	/**
	 * 
	 * @param novoCargo - para guardar o valor do cargo.
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	
	/**
	 * Método para despedir um funcionário.
	 */
	
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
