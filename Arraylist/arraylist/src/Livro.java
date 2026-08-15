public class Livro {
    String nome;
    int ano;
    int paginas;
    double preco;
    String autor;

    public Livro(String nome, int ano, int paginas, double preco, String autor){
        this.nome = nome;
        this.ano = ano;
        this.paginas = paginas;
        this.preco = preco;
        this.autor = autor;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
