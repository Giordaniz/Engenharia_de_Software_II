
package pessoa;

public class Pessoa {

     public static void main(String[] args) {
    
         Professor prof = new Professor();
         
         prof.cadastrar("Adalto Sparremberger", 2666669, 1570.00, "Estrutura de Dados I", 
                 "Manhã", 15);
        
         prof.mostrar();
         
         Administrativo admin = new Administrativo();
         
         admin.cadastrar("Marina dos Reis", 123456, 9564.80, "Comercial", false);
     
         admin.mostrar();
    }
    
}