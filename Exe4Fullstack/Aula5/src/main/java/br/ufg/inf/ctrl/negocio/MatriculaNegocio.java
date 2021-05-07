package br.ufg.inf.ctrl.negocio;

import java.util.List;

import br.ufg.inf.ctrl.exception.MatriculaException;
import br.ufg.inf.model.dao.MatriculaDAO;
import br.ufg.inf.model.entities.Matricula;

public class MatriculaNegocio {

	MatriculaDAO dao = new MatriculaDAO();

	public Matricula inserir(Matricula matricula) throws MatriculaException {
		this.validarMatricula(matricula);
		dao.inserir(matricula);
		return matricula;
	}
	
	// READ
	public List<Matricula> buscaTodos() throws MatriculaException{
		return dao.buscaTodos();	
	}
	
	public Matricula buscaPorId(Integer id) throws MatriculaException {		
		return dao.buscaPorId(id);
	}
	
	
	// UPDATE
	
	public Matricula alterar(Matricula matricula) throws MatriculaException {		
		this.validarMatricula(matricula);
		return dao.alterar(matricula);
	}
	
	// DELETE
	
	public void excluir(Integer id) throws MatriculaException {
		dao.excluir(id);
	}
	
	private void validarMatricula(Matricula matricula) throws MatriculaException {
	}
}

