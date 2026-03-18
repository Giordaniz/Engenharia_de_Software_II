package pessoa;

public class Administrativo extends Funcionario{
    private String setor;
    private boolean uniforme;

    public Administrativo() {
        super();
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isUniforme() {
        return uniforme;
    }

    public void setUniforme(boolean uniforme) {
        this.uniforme = uniforme;
    }

    
    
   
    //METODO
     public void cadastrar(String nome, int matricula, double salario,
    String disciplina, String turno, int cargaHoraria){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario(salario);
        this.setSetor(setor);
        this.setUniforme(uniforme);
    }
    
    
    
    public void mostrar(){
        System.out.println("##### INFORMAÇÕES ####");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Uniforme: " + this.isUniforme());
        System.out.println("##### FIM ####");
    }
    
    
}