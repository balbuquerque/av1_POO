import java.util.Optional;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Aplicativo {
    public static void main(final String[] args) {
        final ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
        Pessoas.add(new Pessoa(1, "Joao", 10));
        Pessoas.add(new Pessoa(2, "Alice", 5));
        Pessoas.add(new Pessoa(3, "Fernando", 27));
        Pessoas.add(new Pessoa(4, "Carlos", 12));
        Pessoas.add(new Pessoa(5, "Priscila", 31));
        final Cachepessoa cache = new Cachepessoa();

        int option = 1;
        
        Scanner input = new Scanner(System.in);
        Scanner searchScanner = new Scanner(System.in);
    
        while(option != 0){
            
            System.out.println("digite 1 para buscar todas as pessoas ordenadas com base na idade");
            System.out.println("digite 2 buscar uma pessoa especifica com base no seu id");
            System.out.println("caso queira sair, digite qualquer numero diferente de 1 e 2");
            option = input.nextInt();

            switch(option){
                case 1: 
                
                Pessoas.sort(Comparator.comparing(Pessoa::getAge));
                Pessoas.forEach(elemento -> {
                System.out.println("ID: " + elemento.getId() + " Name: " + elemento.getName() + ", Age: " + elemento.getAge());
                });
                
                break;

                case 2:
                
                System.out.println("digite o ID da pessoa que você quer achar: ");
                
                final int search = searchScanner.nextInt();
        
                Optional<Pessoa> optPessoa = cache.retornaPessoa(search);
              
                if(optPessoa.isPresent()){
                  System.out.println("buscando na lista de cache");
                  Pessoa pessoa = optPessoa.get();
                  System.out.println("Nome: " + pessoa.getName() + ", Idade: " + pessoa.getAge());
                }
                else{
                  System.out.println("varrendo a lista de pessoas");
                  Pessoas.forEach(pessoa -> {
                    if(pessoa.getId() == search){
                      System.out.println("Nome: " + pessoa.getName() + ", Idade: " + pessoa.getAge());
                      cache.Cachepessoas.add(pessoa);
                    }
                  });
                }
                break;
                
                default: option = 0;
            }
        }
        input.close();
        searchScanner.close();
    }
}