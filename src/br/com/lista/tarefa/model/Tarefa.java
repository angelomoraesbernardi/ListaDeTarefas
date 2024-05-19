package br.com.lista.tarefa.model;

public class Tarefa {
	private Integer id;
	private String descricao;
	private Status status;
	private Integer percentual;
	private Pessoa pessoaRequisitante;
	private Pessoa pessoaRequisitadaResponsavel;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Integer getPercentual() {
		return percentual;
	}
	public void setPercentual(Integer percentual) {
		this.percentual = percentual;
	}
	public Pessoa getPessoaRequisitante() {
		return pessoaRequisitante;
	}
	public void setPessoaRequisitante(Pessoa pessoaRequisitante) {
		this.pessoaRequisitante = pessoaRequisitante;
	}
	public Pessoa getPessoaRequisitada() {
		return pessoaRequisitadaResponsavel;
	}
	public void setPessoaRequisitada(Pessoa pessoaRequisitada) {
		this.pessoaRequisitadaResponsavel = pessoaRequisitada;
	}
	
	
}
