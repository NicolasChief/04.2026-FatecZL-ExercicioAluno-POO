package org.example;

import java.time.LocalDate;

public class Aluno {

    private long id;
    private LocalDate nasc;
    private String ra;
    private String nome;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public LocalDate getNasc() {
        return nasc;
    }
    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | DataNasc: " + nasc + " | RA: " + ra + " | Nome: " + nome;
    }

}
