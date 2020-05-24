package entidade;

import java.sql.Date;
import java.util.List;
import org.hibernate.*;
import org.hibernate.query.Query;


public class ContatoCrudAnnotations {
	
	private Session sessao;

	public ContatoCrudAnnotations(Session sessao) {
		
		this.sessao = sessao;
	}
	
	public void salvar(Contato contato)
	{
		sessao.save(contato);
	}
	
	public void excluir(Contato contato)
	{
		sessao.delete(contato);
	}
	
	public  List<Contato> listar()
	{
		Query<?> consulta = sessao.createQuery("from Contato");
		
		return (List<Contato>) consulta.list();
	}
	
	public Contato buscarContato(int valor)
	{
		Query<?> consulta  = sessao.createQuery("from Contato where codigo = :parametro");
		consulta.setParameter("parametro", valor);
		return (Contato) consulta.uniqueResult();
		
	}
	


}
