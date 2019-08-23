package br.com.fiap.aulaspringdata.bean;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name="produto", sequenceName = "SQ_PRODUTO")
public class ProdutoBean {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
        private int codigo;
        private String nome;
        private double preco;
        private boolean novo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    private LocalDate dataFabricacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }

        public void setPreco(double preco) {
        this.preco = preco;
    }
}
