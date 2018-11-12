/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.basica;

/**
 *
 * @author BrunoTiCaVini
 */
public class Livro {

    
    
    
        private int    idLivro;
        private String codlivro;
	private String tituloLivro;
	private String autorLivro;
        private String descricaoLivro;

    /**
     * @return the idLivro
     */
    public int getIdLivro() {
        return this.idLivro;
    }

    /**
     * @param idLivro the idLivro to set
     */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    

    /**
     * @return the codlivro
     */
    public String getCodlivro() {
        return this.codlivro;
    }

    /**
     * @param codlivro the codlivro to set
     */
    public void setCodlivro(String codlivro) {
        this.codlivro = codlivro;
    }

    /**
     * @return the tituloLivro
     */
    public String getTituloLivro() {
        return this.tituloLivro;
    }

    /**
     * @param tituloLivro the tituloLivro to set
     */
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    /**
     * @return the autorLivro
     */
    public String getAutorLivro() {
        return this.autorLivro;
    }

    /**
     * @param autorLivro the autorLivro to set
     */
    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    /**
     * @return the descricaoLivro
     */
    public String getDescricaoLivro() {
        return this.descricaoLivro;
    }

    /**
     * @param descricaoLivro the descricaoLivro to set
     */
    public void setDescricaoLivro(String descricaoLivro) {
        this.descricaoLivro = descricaoLivro;
    }
    
}
