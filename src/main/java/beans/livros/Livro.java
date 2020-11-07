package beans.livros;

import java.util.Date;

public class Livro {
	private String titulo;
	private String isbn;
	private Double preco;
	private Date dataLancamento;

	public Livro() {

	}

	public Livro(String titulo, String isbn, Double preco, Date dataLancamento) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.preco = preco;
		this.dataLancamento = dataLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}
