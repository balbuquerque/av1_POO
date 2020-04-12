import java.util.ArrayList;
import java.util.Optional;

public class Cachepessoa {
    
    public ArrayList<Pessoa> Cachepessoas;

    public Cachepessoa() {
        this.Cachepessoas = new ArrayList<Pessoa>();
    }

    public Optional<Pessoa> retornaPessoa(int id){
        return Cachepessoas.stream().filter(p -> p.id == id).findFirst();
    }
}