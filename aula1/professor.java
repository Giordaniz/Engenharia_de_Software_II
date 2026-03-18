package pessoa;
public class Professor extends Funcionario{
    private String disciplina;
    private String turno;
    private int cargaHoraria;

    public Professor() {
        super();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
    
    //METODO
    public void cadastrar(String nome, int matricula, double salario,
    String disciplina, String turno, int cargaHoraria){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario(salario);
        this.setDisciplina(disciplina);
        this.setTurno(turno);
        this.setCargaHoraria(cargaHoraria);
    }
    
    
    
    public void mostrar(){
        System.out.println("##### INFORMAÇÕES ####");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Turno: " + this.getTurno());
        System.out.println("Carha Horária: " + getCargaHoraria());
        System.out.println("##### FIM ####");
    }
    
}