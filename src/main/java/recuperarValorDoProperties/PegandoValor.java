package recuperarValorDoProperties;

public class PegandoValor {
	 
    public static void main(String args[]){
 
       String primeiroValor = PropertiesUtil.getProperty("PRIMEIROVALOR");
       String segundoValor = PropertiesUtil.getProperty("SEGUNDOVALOR");
 
       System.out.println("MeuProperties, " + primeiroValor + " " + segundoValor);
    }
}