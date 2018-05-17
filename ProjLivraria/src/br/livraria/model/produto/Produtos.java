/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.livraria.model.produto;

/**
 *
 * @author jackson.motta
 */
public class Produtos {

    /**
     * @return the codLivro
     */
    private int id;
    private int codLivro;
    private int isbn;
    private String Nome;
    private String genero;
    private String Marca;
    private float valorVenda;
    private int quantEstoque;
    private int quantPagina;
    private String organizador;
    private String editor;
    private String editora;
    private String idioma;
    private String acabamento;
    private String papel;
    private int ano;
    
    public int getCodLivro() {
        return codLivro;
    }

    /**
     * @param codLivro the codLivro to set
     */
    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the valorVenda
     */
    public float getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    /**
     * @return the quantEstoque
     */
    public int getQuantEstoque() {
        return quantEstoque;
    }

    /**
     * @param quantEstoque the quantEstoque to set
     */
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    /**
     * @return the quantPagina
     */
    public int getQuantPagina() {
        return quantPagina;
    }

    /**
     * @param quantPagina the quantPagina to set
     */
    public void setQuantPagina(int quantPagina) {
        this.quantPagina = quantPagina;
    }

    /**
     * @return the organizador
     */
    public String getOrganizador() {
        return organizador;
    }

    /**
     * @param organizador the organizador to set
     */
    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    /**
     * @return the editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @param editor the editor to set
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the acabamento
     */
    public String getAcabamento() {
        return acabamento;
    }

    /**
     * @param acabamento the acabamento to set
     */
    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    /**
     * @return the papel
     */
    public String getPapel() {
        return papel;
    }

    /**
     * @param papel the papel to set
     */
    public void setPapel(String papel) {
        this.papel = papel;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
