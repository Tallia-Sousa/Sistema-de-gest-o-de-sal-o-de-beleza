package salao.beleza;

import java.util.ArrayList;

import java.util.Scanner;

public class APP {

    static ArrayList<Servico> servicos;
    static ArrayList<Cliente> clientes;
    static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        servicos = new ArrayList<>();
        clientes =new ArrayList<>();
        menu();


    }

    private static void menu() {

        System.out.println("1- cadastro\n2-listarServicos\n3-removerServico\nalterarServico");

        int opcao = Entrada.nextInt();

        switch (opcao) {
                case 1:
                    cadastro();
                case 2:
                    listarServicos();
                case 3:
                    removerServico();
                case 4:
                    alterarServicos();


        }


    }
    private static void cadastro(){

        System.out.println("1 para cadastrar cliente\n2 para cadastrar serviço\n ");
        int opc =Entrada.nextInt();


        if(opc == 1) {
            System.out.println("nome do cliente: ");
            String nome = Entrada.next();
            System.out.println("email do cliente: ");
            String email = Entrada.next();
            System.out.println("sexo do cliente: ");
            String sexo = Entrada.next();
            System.out.println("uf do cliente: ");
            String uf = Entrada.next();
            System.out.println("cidade do cliente: ");
            String cidade = Entrada.next();
            System.out.println("Bairro do cliente: ");
            String bairro = Entrada.next();
            System.out.println("rua do cliente: ");
            String rua = Entrada.next();
            System.out.println("numero da casa do cliente: ");
            int numero = Entrada.nextInt();
            System.out.println("logradourodo cliente: ");
            String logradouro = Entrada.next();
            Endereco endereco = new Endereco(logradouro, numero, bairro, cidade, rua, uf);
            Cliente cliente = new Cliente(nome, email, sexo, endereco);
            clientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso");
        }
       else if (opc == 2){
            System.out.println("nome do serviço: ");
            String nome = Entrada.next();
            System.out.println("valor do serviço: ");
            double valor = Entrada.nextDouble();
            System.out.println("Descriçao do serviço: ");
            String descricao = Entrada.next();
            Servico servico = new Servico(nome, descricao, valor);
            servicos.add(servico);
            System.out.println("Serviço cadastrado com sucesso");
      menu();
    }

    //private static void cadastroServicos() {
        //System.out.println("nome do serviço: ");
        //String nome = Entrada.next();
       // System.out.println("valor do serviço: ");
        //double valor = Entrada.nextDouble();
       // System.out.println("Descriçao do serviço: ");
        //String descricao = Entrada.next();
       // Servico servico = new Servico(nome, descricao, valor);
        //servicos.add(servico);
        //System.out.println("Serviço cadastrado com sucesso");
        //menu();

    }
    private static void listarServicos() {
        if (servicos.size() > 0) {
            for (Servico servico : servicos) {
                System.out.println(servico);
            }
        }
        else {
            System.out.println("nao ha serviços para listar");
        }
    menu();

}

    private static Servico encontraServicos(String nome){
        Servico servico = null;
        if(servicos.size() > 0){
            for(Servico s :servicos){
                if(s.getNome().equalsIgnoreCase(nome)){
                 servico = s;

                }
            }
        }

        return servico;
    }


public static void removerServico() {
    System.out.println(" nome do servico:  ");
    String nome = Entrada.next();
    Servico servico = encontraServicos(nome);
    if(servico != null) {
        servico.remover(servico, nome);
   }
   else{
        System.out.println(" nao foi possivel remover serviço");
   }
    menu();
    }

public static void alterarServicos() {


    System.out.println(" Encontrar nome do serviço :  ");
    String nome = Entrada.next();
    Servico servico = encontraServicos(nome);
    if(servico != null) {
        System.out.println(" digite o valor do servico que deseja alterar:  ");
        double novovalor = Entrada.nextDouble();
        System.out.println(" digite a nova descricao do servico que deseja alterar:  ");
        String descricao = Entrada.next();
        servico.alterar(servico, nome, novovalor, descricao);
        System.out.println(" Serviço alterado com sucesso");
    }
    else{
        System.out.println("Não foi possivel fazer a alteração ");

    }

        menu();
    }}



