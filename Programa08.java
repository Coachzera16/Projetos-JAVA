import java.util.Scanner;

//do while
public class Programa08 {
    public static void main(String[] args) {
      int idade = 1;
      String nome;  
        //Recebe dados via teclado
        Scanner teclado = new Scanner(System.in);
        
        //Executa primeiro executar o bloco depois verifica
         do {
            System.out.println("informe seu nome?");
            nome =teclado.nextLine();
            
            System.out.println("Informe sua idade:");
            //idade= teclado.nextInt(); BUG
            idade = Integer.parseInt (teclado.nextLine());

            
            System.out.println(nome +  " tem "  + idade +  " anos ");  
        }while(idade >0);
            
        teclado.close();
   
    }
}
