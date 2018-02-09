/*
 * Nestor Damian Espinola Chaves
 * CI: 4.543.390
 * Analisis De Sistemas
 */
package cl.modelo;

/**
 *
 * @author user
 */
public class Persona {
    private Integer CodPersona;
    private String nomPersona;
    private String apePersona;
    private String telPersona;

    public Integer getCodPersona() {
        return CodPersona;
    }

    public void setCodPersona(Integer CodPersona) {
        this.CodPersona = CodPersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getApePersona() {
        return apePersona;
    }

    public void setApePersona(String apePersona) {
        this.apePersona = apePersona;
    }

    public String getTelPersona() {
        return telPersona;
    }

    public void setTelPersona(String telPersona) {
        this.telPersona = telPersona;
    }

    public Persona(Integer CodPersona, String nomPersona, String apePersona, String telPersona) {
        this.CodPersona = CodPersona;
        this.nomPersona = nomPersona;
        this.apePersona = apePersona;
        this.telPersona = telPersona;
    }

    
}
