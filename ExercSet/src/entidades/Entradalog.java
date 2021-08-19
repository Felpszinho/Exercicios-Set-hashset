package entidades;

import java.util.Date;
import java.util.Objects;

public class Entradalog {
    private  String nome;
    private Date data;

    public  Entradalog(){

    }

    public Entradalog(String nome, Date data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entradalog)) return false;
        Entradalog that = (Entradalog) o;
        return Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }


}
