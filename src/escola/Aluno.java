package escola;

public class Aluno {

    /**
     * @return the notas
     */
    public int[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    private String nome;
    private int idade;
    private int matricula;
    private String[] disciplina = new String[5];
    private int[] notas = new int[5];

    public void imprimeTela(Aluno a) {
        System.out.println("Aluno: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Matricula: " + a.getMatricula());
        
        for (int i = 0; i < a.getDisciplina().length; i++) {
            System.out.println("Disciplinas: " + a.getDisciplina()[i] + " Notas " + a.getNotas()[i]);
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the disciplina
     */
    public String[] getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

}

