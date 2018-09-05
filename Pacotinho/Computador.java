package Pacotinho;

/**
 *
 * @author Filipe Holanda
 */
public class Computador {

    String tipoComputador;
    String sistemaOperacional;
    String HD;
    String[] acessorios;
    String[] servicos;

    public Computador(String tipoComputador, String sistemaOperacional, String HD, String[] acessorios, String[] servicos) {
        this.tipoComputador = tipoComputador;
        this.sistemaOperacional = sistemaOperacional;
        this.HD = HD;
        this.acessorios = acessorios;
        this.servicos = servicos;
    }

    public String getTipoComputador() {
        return tipoComputador;
    }

    public void setTipoComputador(String tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String[] getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    public String[] getServicos() {
        return servicos;
    }

    public void setServicos(String[] servicos) {
        this.servicos = servicos;
    }

    

}


