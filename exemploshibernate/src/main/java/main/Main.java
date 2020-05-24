package main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import conexao.HibernateUtil;
import entidade.Contato;
import entidade.ContatoCrudAnnotations;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transacao = sessao.beginTransaction();
		
		ContatoCrudAnnotations contatoCrud = new ContatoCrudAnnotations(sessao);
		
		Contato contato1 = new Contato();
		
		
		
		

	}

}
