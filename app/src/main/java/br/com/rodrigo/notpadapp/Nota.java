package br.com.rodrigo.notpadapp;

import com.google.gson.annotations.SerializedName;

public class Nota {

    private String id;
    private String titulo;
    @SerializedName(value = "descricao")
    private String texto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
