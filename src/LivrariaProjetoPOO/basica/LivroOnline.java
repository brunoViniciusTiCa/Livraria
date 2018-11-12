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
public class LivroOnline extends Livro{
    
    private int idLivroOnline;
    private String siteLivro;
    private String clubeLivro;

    /**
     * @return the idLivroOnline
     */
    public int getIdLivroOnline() {
        return idLivroOnline;
    }

    /**
     * @param idLivroOnline the idLivroOnline to set
     */
    public void setIdLivroOnline(int idLivroOnline) {
        this.idLivroOnline = idLivroOnline;
    }

    /**
     * @return the siteLivro
     */
    public String getSiteLivro() {
        return siteLivro;
    }

    /**
     * @param siteLivro the siteLivro to set
     */
    public void setSiteLivro(String siteLivro) {
        this.siteLivro = siteLivro;
    }

    /**
     * @return the clubeLivro
     */
    public String getClubeLivro() {
        return clubeLivro;
    }

    /**
     * @param clubeLivro the clubeLivro to set
     */
    public void setClubeLivro(String clubeLivro) {
        this.clubeLivro = clubeLivro;
    }
    
}
