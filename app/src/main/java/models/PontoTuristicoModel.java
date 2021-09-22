package models;

import java.io.Serializable;
import java.net.URL;

public class PontoTuristicoModel implements Serializable {
    private int codigo;
    private String nome;
    private String descricao;
    private String foto1;
    private String foto2;
    private String foto3;
    private String localizacao;
    private String site;

    public PontoTuristicoModel() {
    }

    public PontoTuristicoModel(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public PontoTuristicoModel(int codigo, String nome, String descricao, String foto1, String foto2, String foto3, String localizacao, String site) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.localizacao = localizacao;
        this.site = site;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto1() {
        return foto1;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public String getFoto3() {
        return foto3;
    }

    public void setFoto3(String foto3) {
        this.foto3 = foto3;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
