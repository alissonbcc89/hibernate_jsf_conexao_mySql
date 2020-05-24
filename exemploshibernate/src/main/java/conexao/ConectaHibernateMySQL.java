package conexao;

import org.hibernate.Session;

public class ConectaHibernateMySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session sessao = null;
		
		sessao = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Conectou!");
		sessao.close();

	}

}
