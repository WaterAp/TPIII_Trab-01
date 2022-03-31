package br.edu.univas.vo;

import java.util.Objects;

public class Player {

	
	private String nome;
	private String Site;
	
	
	//get&set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	
	//equals
	@Override
	public int hashCode() {
		return Objects.hash(Site, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(Site, other.Site) && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "[" + nome + "  - Site:  " + Site + "] ";
	}
	
	//toString()
	
	
	
	
	
	
	

}
