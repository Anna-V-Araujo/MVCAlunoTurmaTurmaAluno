package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20131D12GR0028
 */
public class Turma {
    
    String nome;
    List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
}
