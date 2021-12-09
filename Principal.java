import java.util.ArrayList;


import javax.swing.JOptionPane;


public class Principal{
    public static void main(String[] args) {
         
        boolean login = true;  

             int senha;

        while(login){
            
         JOptionPane.showMessageDialog(null , "Tela de Login" + "\n Digite a senha: 123456 para acessar o sistema");
             
             
             senha  = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
                if (senha == 123456) {
                  
             
      
         int opcao;
       

        //Arrays 
        ArrayList<Automovel> lista = new ArrayList<Automovel>();
        ArrayList<Cliente> dado = new ArrayList<Cliente>();
       

       
         
         boolean teste = true; //Enquando verdadeiro repete caso contário sai do programa

          while (teste) {
                //Tela do menu
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Principal" + "\n1- Cadastrar veículo" + "\n2- Listar Veículo Cadastrado " + "\n3- Consultar Estoque de Veículo" + "\n4- Editar: " 
                    + "\n5- Deletar: " + "\n6- Cadastrar cliente" +  "\n7- Sair" + "\nDigite uma opção: "));

          switch (opcao) {
          case 1:
            
            // Solicitação para inserção dos dados
            Automovel cad = new Automovel();
            cad.setTipo(JOptionPane.showInputDialog("Digite o tipo"));
            cad.setMarca(JOptionPane.showInputDialog("Digite a marca"));
            cad.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
            cad.setCor(JOptionPane.showInputDialog("Digite a cor"));
            cad.setKm(Float.parseFloat(JOptionPane.showInputDialog("Digite os quilomtros rodados")));
            cad.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")));
            cad.setPlaca(JOptionPane.showInputDialog("Digite a placa"));
            cad.setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor")));
            
            // Inserção no vetor
            lista.add(cad);
            
            //Imprime dados cadastrados com sucesso
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso");

            

            break;

           case 2:  //Lista os automóveis dentro o Arrey
          
            String dadosCad = "Automóveis cadastrados\n\n";
            for (int i = 0; i < lista.size(); i++) {
            dadosCad += "Tipo: " + lista.get(i).getTipo() + "\n";
            dadosCad += "Marca: " + lista.get(i).getMarca() + "\n";
            dadosCad += "Modelo: " + lista.get(i).getModelo() + "\n";
            dadosCad += "Cor: " + lista.get(i).getCor() + "\n";
            dadosCad += "KM: " + lista.get(i).getKm() + "\n";
            dadosCad += "Ano: " + lista.get(i).getAno() + "\n";
            dadosCad += "Placa: " + lista.get(i).getPlaca() + "\n";
            dadosCad += "Valor: " + lista.get(i).getValor() + "\n\n\n";
        }
                //Imprime dados listados
                 JOptionPane.showMessageDialog(null, dadosCad, "Consecionária", JOptionPane.INFORMATION_MESSAGE);
            
            break;

            case 3:  
                 //Consulta veículos
                 JOptionPane.showMessageDialog(null,"****CONSULTAR VEÍCULO***");
                 String rPlaca = JOptionPane.showInputDialog("Digite a placa para localizar o veículo");
                    
                boolean localizou = false; //usado quando o veículo não é localizado. E para não repetir as mensagens
                  
                   for(int i = 0; i < lista.size(); i++){
                     Automovel pes = lista.get(i);
                      
                     if (rPlaca.equals(pes.getPlaca())) {
                        rPlaca += "Tipo: " + lista.get(i).getTipo() + "\n";
                        rPlaca += "Marca: " + lista.get(i).getMarca() + "\n";
                        rPlaca += "Modelo: " + lista.get(i).getModelo() + "\n";
                        rPlaca += "Cor: " + lista.get(i).getCor() + "\n";
                        rPlaca+= "KM: " + lista.get(i).getKm() + "\n";
                        rPlaca+= "Ano: " + lista.get(i).getAno() + "\n";
                        rPlaca += "Placa: " + lista.get(i).getPlaca() + "\n";
                        rPlaca += "Valor: " + lista.get(i).getValor() + "\n";
                        localizou = true;  
                        
                        //Imprime dados localizados na busca
                        JOptionPane.showMessageDialog(null, rPlaca, "Automóvel localizado com sucesso", JOptionPane.INFORMATION_MESSAGE);
                         
                      

                         break;

                     }
                           
                         if (!localizou) {
                            JOptionPane.showMessageDialog(null,"Veículo não encontrado com esse número de placa");
                             
                         }
                     

                   }
            break;


            case 4:
                  //Atualiza os dados
                  JOptionPane.showMessageDialog(null, "***Atualizar Dados***");
                  for(int i = 0; i < lista.size(); i++){ // Faz uma varredura em todas as placas localizadas
                     
                    Automovel editar = lista.get(i); //Pega a placa do automóvel na posição x

                    JOptionPane.showMessageDialog(null, ( +  i + "-"  +  editar.getPlaca())); // Mostra o número do índice da placa

                  }
                  
                  int indicar = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da placa que deseja editar: "));
                   String novoTipo = JOptionPane.showInputDialog("Digite um novo tipo");
                   String novaMarca = JOptionPane.showInputDialog("Digite uma nova marca");
                   String novoModelo = JOptionPane.showInputDialog("Digite um novo modelo");
                   String novaCor = JOptionPane.showInputDialog("Digite uma nova cor");
                   Float novoKm = Float.parseFloat(JOptionPane.showInputDialog("Digite um novo KM"));
                   int novoAno = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo ano"));
                   String novaplaca = JOptionPane.showInputDialog("Digite uma nova placa");
                   Float novoValor = Float.parseFloat(JOptionPane.showInputDialog("Digite um novo valor"));
                   
                   Automovel a = lista.get(indicar);
                   a.setTipo(novoTipo);
                   a.setMarca(novaMarca);
                   a.setModelo(novoModelo);
                   a.setCor(novaCor);
                   a.setKm(novoKm);
                   a.setAno(novoAno);
                   a.setPlaca(novaplaca);
                   a.setValor(novoValor);
                    

                   //Imprime dados atualizados com sucesso
                   JOptionPane.showMessageDialog(null, " Atualizado com sucesso ");
                 
   
            break;

            case 5:

            //Remove os dados
            JOptionPane.showMessageDialog(null, "***Remover Dados***"); // Tela para remoção
            for(int i = 0; i < lista.size(); i++){ // Faz uma varredura em todas as placas localizadas
               
              Automovel edt = lista.get(i); //Pega a placa do automóvel na posição x

              JOptionPane.showMessageDialog(null, ( +  i + "-"  + edt.getPlaca())); //Mostra o número do índice da placa

            }
             //Solicitando o índice do vetor que esta a placa para remoção
            int rem = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da placa que deseja remover: "));
            lista.remove(rem);

           //Imprime dados removidos
            JOptionPane.showMessageDialog(null, " Removido com sucesso ");


            break;

            case 6:
             //Cadastro de clientes
            Cliente c = new Cliente(); // Inserção de dados do cliente
            c.setNome(JOptionPane.showInputDialog("Digite o nome"));
            c.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
            c.setRg(JOptionPane.showInputDialog("rg"));
            c.setCpf (JOptionPane.showInputDialog("Digite o cpf"));
           
            
            // Inserção no vetor
            dado.add(c);
           //Imprime dados cadastrados com sucesso
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso");

            //Listando o cliente

            String dadosCli = "Clientes cadastrados\n\n";
            for (int i = 0; i < dado.size(); i++) {
            dadosCli += "Nome: " + dado.get(i).getNome() + "\n";
            dadosCli += "Idade: " + dado.get(i).getIdade() + "\n";
            dadosCli += "RG: " + dado.get(i).getRg() + "\n";
            dadosCli += "CPF: " + dado.get(i).getCpf() + "\n";
            }
            //Imprime os dados cadastrados
            JOptionPane.showMessageDialog(null, dadosCli, "Consecionária", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 7: 
              //Sai do programa
            teste = false;
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos serviços! Volte sempre.");

            break;


           
        default:
            break;
        }
              
          }
        
        }else
            JOptionPane.showMessageDialog(null, "Senha incorreta! ");
               
        }login = false;
            

    }

}
