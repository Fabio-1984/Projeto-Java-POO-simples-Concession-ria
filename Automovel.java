


public class Automovel {

 String tipo;
 String marca;
 String modelo;
 String cor;
 float km;
 int ano;
 String placa;
 float valor;
  
 
  
 
  // Métodos diferenciados

    Automovel(String tipo, String marca, String modelo, String cor, float km, int ano, String placa, float valor) { // Construtor com parametro
    this.tipo = tipo;
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.km = km;
    this.ano = ano;
    this.placa = placa;
    this.valor = valor;
   

  }

  public Automovel() { //Construtor vasio
    }

  
  //Encapsulamento
  // Metodos get e set - Consulta e escrita / metodos de acesso
  //GET: pega um valor armazenado
  //SET:  Atribui valores 

  public void setTipo(String t) {
    this.tipo = t;

  }

  public String getTipo() {
    return this.tipo;

  }

  public void setMarca(String m) {
    this.marca = m;

  }

  public String getMarca() {
    return this.marca;

  }

  public void setModelo(String mo) {
    this.modelo = mo;

  }

  public String getModelo() {
    return this.modelo;

  }

  public void setCor(String c) {
    this.cor = c;
  }

  public String getCor() {
    return this.cor;

  }
  public void setKm(Float k) {
    this.km = k;
  }

  public Float getKm() {
    return this.km;

  }
  public void setAno(Integer a) {
    this.ano = a;
  }

  public Integer getAno() {
    return this.ano;

  }

  public void setPlaca(String p) {
    this.placa = p;

  }

  public String getPlaca() {
    return this.placa;

  }

  public void setValor(Float v) {
    this.valor = v;
  }

  public float getValor() {
    return this.valor;
  }

  

 

}
