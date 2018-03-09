package tcc.example.worldpet;

public class Animal {
	String foto;
	String raca;
	String coloracao;
	String expectativaVida;
	String nivelEnergia;
	String qualidades;
	String tamanho;
    double preco;
    
    public Animal(){
    
    }
    
    public Animal(String foto, String raca, String coloracao, String expectativaVida, String nivelEnergia,String qualidades,String tamanho,double preco) {
        super();
        this.foto = foto;
        this.raca = raca;
        this.coloracao = coloracao;
        this.expectativaVida = expectativaVida;
        this.nivelEnergia = nivelEnergia;
        this.qualidades = qualidades;
        this.tamanho = tamanho;
        this.preco = preco;
    }
    
    public String getfoto() {
        return foto;
    }
 
    public void setfoto(String foto) {
        this.foto = foto;
    }
 
    public String getraca() {
        return raca;
    }
 
    public void setraca(String raca) {
        this.raca = raca;
    }
 
    public String getcoloracao() {
        return coloracao;
    }
 
    public void setexpectativaVida(String expectativaVida) {
        this.expectativaVida = expectativaVida;
    }
     
    public String getnivelEnergia() {
        return nivelEnergia;
    }
     
    public void setnivelEnergia(String nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }
        public double getpreco() {
            return preco;
        }
        public void setpreco(double preco) {
            this.preco = preco;
        }
   
     
   
 
    public String toString() {
        return foto + " " +  raca + " " + coloracao + " "+ expectativaVida + " "+ nivelEnergia + ""+ preco + " "  ;
    }
}