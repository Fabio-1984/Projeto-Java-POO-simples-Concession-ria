public class Cliente { 

    String nome;
    int idade;
    String rg;
    String cpf;
    



Cliente(String nome, int idade, String rg, String cpf){ // Construtor com parametro
    this.nome = nome;
    this.idade = idade;
    this.rg = rg;
    this.cpf = cpf;



}
  public Cliente(){ //Construtor vasio


  }


  //Encapsulamento

  public void setNome(String n) {
    this.nome = n;

  }

  public String getNome() {
    return this.nome;

  }

  public void setIdade(Integer i) {
    this.idade = i;

  }

  public Integer getIdade() {
    return this.idade;

  }

  public void setRg(String r) {
    this.rg = r;

  }

  public String getRg() {
    return this.rg;

  }

  public void setCpf(String c) {
    this.cpf = c;
  }


  public String getCpf() {
    return this.cpf;

  }


}

 


