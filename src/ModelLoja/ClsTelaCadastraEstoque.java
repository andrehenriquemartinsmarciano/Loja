package ModelLoja;

import java.util.Date;

public class ClsTelaCadastraEstoque {

    private String Nome;
    private String Produto;
    private String Marca;
    private Float CodigoBarra;
    private int Quantidade;
    private Date DataEntrada;
    private Float Valor;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Float getCodigoBarra() {
        return CodigoBarra;
    }

    public void setCodigoBarra(Float CodigoBarra) {
        this.CodigoBarra = CodigoBarra;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public Date getDataEntrada() {
        return DataEntrada;
    }

    public void setDataEntrada(Date DataEntrada) {
        this.DataEntrada = DataEntrada;
    }

    public Float getValor() {
        return Valor;
    }

    public void setValor(Float Valor) {
        this.Valor = Valor;
    }
    
    

}
