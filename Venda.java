public class Venda {

    String nomeCliente;
    int idadeCliente;
    String cpfCliente;
    String vTipo;
    String vMarca;
    String vPlaca;
    float vValor;



    Venda(String nomeCliente, int idadeCliente, String cpfCliente, String vTipo, String vMarca, String vPlaca, float vValor){ // Construtor com parametro
         this.nomeCliente = nomeCliente;
         this.idadeCliente = idadeCliente;
         this.cpfCliente = cpfCliente;
         this.vTipo = vTipo;
         this.vMarca = vMarca;
         this.vPlaca = vPlaca;
         this.vValor = vValor;


    }


    public Venda(){//Construtor vasio


    }

     //Encapsulamento

  public void setnomeCliente(String nc){
      this.nomeCliente = nc;
  }

  public String getnomeCliente(){
       return this.nomeCliente;

  }

  public void setidadeCliente(Integer ic){
     this.idadeCliente = ic;
 }

 public Integer getidadeCliente(){
      return this.idadeCliente;

 }

 public void setcpfCliente(String cc){
     this.cpfCliente = cc;
 }

 public String getcpfCliente(){
      return this.cpfCliente;

 }

 public void setvTipo(String vt){
     this.vTipo = vt;
 }

 public String getvTipo(){
      return this.vTipo;

 }

 public void setvMarca(String vm){
     this.vMarca = vm;
 }

 public String getvMarca(){
      return this.vMarca;

 }

 public void setvPlaca(String vp){
     this.vPlaca = vp;
 }

 public String getvPlaca(){
      return this.vPlaca;

 }

 public void setvValor(Float vv){
     this.vValor = vv;
 }

 public Float getvValor(){
      return this.vValor;

 }

  

    
}


