package salao.beleza;

import java.util.Objects;

import static salao.beleza.APP.Entrada;
import static salao.beleza.APP.servicos;

public class Servico {

    private String nome;
    private String descricao;
    private double valor;

 public Servico( String nome, String descricao, double valor) {
     this.descricao = descricao;
     this.nome = nome;
     this.valor = valor;
 }
 public void remover(Servico servico, String nome ) {
     if(servico.getNome().equalsIgnoreCase(nome)) {
         servicos.remove(servico);
         System.out.println(" servico removido com sucesso");
     }
 }
 public void alterar(Servico servico, String nome, double valor, String descricao){
      if(servico.getNome().equalsIgnoreCase(nome)) {
         servico.setValor(valor);
         servico.setDescricao(descricao);
 }}
         public String getDescricao() {

             return descricao;
         }

         public double getValor () {
             return valor;
         }

    public String getNome() {
        return nome;
    }

    public String toString () {
             return "nome: " + getNome() + "\n" +
                     "valor: " + getValor() + "\n" +
                     "descriçao: " + getDescricao();
         }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
