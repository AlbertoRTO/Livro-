package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Beto ", 35, "M");
        p[1] = new Pessoa("Maria", 23 , "F");
        
        l[0] = new Livro("Use a Cabeça Java  ", "Kathy Sierra & Bert Bates", 470 , p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo ", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        l[2].abrir();
        l[2].folhear(100);
        l[2].avançarPag();
        
        System.out.println(l[0].detalhes());
        System.out.println("--------------------------------------");
        System.out.println(l[1].detalhes());
        System.out.println("--------------------------------------");
        System.out.println(l[2].detalhes());
        
        
        
        
    }
    
}
