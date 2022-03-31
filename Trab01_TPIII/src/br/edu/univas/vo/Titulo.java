package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.Objects;

public class Titulo {

	private boolean tipo;
	private String titulo;
	private ArrayList<String> elenco;
	private String descricao;
	private ArrayList<String> genero;
	private String diretor;
	private int ageRating;
	private ArrayList<Player> streamings;
	private int id;
	
	//get & set
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<String> getElenco() {
		return elenco;
	}
	public void setElenco(ArrayList<String> elenco) {
		this.elenco = elenco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getAgeRating() {
		return ageRating;
	}
	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}
	public ArrayList<Player> getStreamings() {
		return streamings;
	}
	public void setStreamings(ArrayList<Player> streamings) {
		this.streamings = streamings;
	}
	public ArrayList<String> getGenero() {
		return genero;
	}
	public void setGenero(ArrayList<String> genero) {
		this.genero = genero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String toString() {

		
		String tipoTtl;
		if (tipo) {
			
			tipoTtl = "Filme";
			
		} else {
			
			tipoTtl = "Serie";
		}
		
		return "{Tipo: " + tipoTtl + "\n Título: " + titulo + "\n Elenco: " + elenco + "\n Descrição: " + descricao
				+ "\n Gênero: " + genero + "\n Diretor: " + diretor + "\n Classificação Indicativa: +" + ageRating + "\n Dísponivel em: "
				+ streamings + "} " + "\n";
	}
	
	@Override
	
	
	public int hashCode() {
		return Objects.hash(ageRating, diretor, elenco, genero, streamings, tipo, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		return ageRating == other.ageRating && Objects.equals(diretor, other.diretor)
				&& Objects.equals(elenco, other.elenco) && Objects.equals(genero, other.genero)
				&& Objects.equals(streamings, other.streamings) && tipo == other.tipo
				&& Objects.equals(titulo, other.titulo);
	}
	
	
}
