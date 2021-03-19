package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "H");
        p[1] = new Pessoa("Maria", 25, "M");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciante", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        l[0].abrir(); //abrir o livro
        l[0].folhear(200); //folhear até a pagina 200.
        l[0].avacarPag(); //avança uma página
        System.out.println(l[0].detalhes());
        
        System.out.println(" ");
        
        l[1].abrir();
        l[1].folhear(100);
        l[1].voltarPar();
        System.out.println(l[1].detalhes());
        
    }
    
}
