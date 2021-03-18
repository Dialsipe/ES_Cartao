package poo;

/**
 * 
 * @author diogo
 *
 *
 *	Classe Cart�o  serve para mostrar os funcion�rios, os seus respetivos servi�os e cargos.
 */

public class Cartao {
	
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	
	/**
	 * Constructor - que tem como objetivo criar um objeto da classe Cart�o com apenas o atributo nome incializado.
	 * 
	 * @param nomeFuncionario - Argumento que ir� enviar o nome do funcion�rio para ser guardado no objeto.
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
	
	/**
	 * Constructor - que tem como objetivo criar um objeto da classe Cart�o com os atributos todos incializados.
	 * @param nomeFuncionario -	Argumento que ir� enviar.
	 * @param servico - Argumento que ir� guardar o servi�o da pessoa.
	 * @param cargo - Argumento que ir� guardar o cargo da pessoa.
	 */

	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	/**
	 * Serve para visualizar o nome do funcion�rio.
	 * @return -retorna o nome do Funcion�rio.
	 */
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	/**
	 * Server para guardar um novo valor no atributo servi�o na classe funcion�rio.
	 * @param servico - Argumento que guarda o valor.
	 */
	public void setServico(String servico) {
		this.servico = servico;
	}

	/**
	 * Serve para guardar um novo valor no atributo cargo na classe funcion�rio.
	 * @param cargo - Argumento para guardar o valor.
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// M�todos
	/**
	 *Serve para retirar um servi�o ao funcion�rio.
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	/**
	 * Serve para atribuir um novo servi�o ao funcion�rio.
	 * @param novoServico - argumento que guarda o valor do novo servi�o.
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
	 * M�todo para despedir um funcion�rio.
	 */
	
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
