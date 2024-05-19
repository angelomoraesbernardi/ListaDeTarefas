package br.com.lista.tarefa.model;

public class Status {
	
	private Integer id;
	private String descricao; //pendente-pausada-Em_andamento-etc...
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
	
		
}
