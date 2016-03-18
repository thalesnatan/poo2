package sistema.beans;

import java.util.List;

import sistema.modelos.Professor;
import sistema.service.ProfessorService;

public class ProfessorManagedBean {

	private Professor professor;
	private ProfessorService service = new ProfessorService();
	
	public void salvar()
	{
		service.Salvar(professor);
		professor = new Professor();
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public List<Professor> getProfessores()
	{
		return service.getProfessores();
	}
}
