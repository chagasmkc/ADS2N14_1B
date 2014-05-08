package com.senac.example.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import com.senac.example.InvalidNameException;
import com.senac.example.Pessoa;

public class PessoaTest {

	private Pessoa pessoa;
	private Pessoa pessoa2;
	
	@AfterClass
	
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	
	public void setUp() throws Exception {
		 pessoa = new Pessoa("NomePessoa");
	}

	@Test(expected = InvalidNameException.class)
	
	public void testPessoa() throws InvalidNameException{
		Pessoa pessoa2 = null;
		try{
			pessoa2 =  new Pessoa("OutraPessoa");
		}
		catch (Exception e){
			fail("Nome 'OutraPessoa' deveria ser aceito.");
		}
		assertEquals("Teste","OutraPessoa",pessoa2.getNome());
		pessoa2 = new Pessoa("SoPessoa");
	}
	
	@Test
	
	public void testGetNome() {
		assertNotNull(pessoa.getNome());
		assertNotEquals(pessoa.getNome().length(),0,0);
		assertEquals("Valida nome","NomePessoa",pessoa.getNome());
	}
	
	private void assertNotEquals(int length, int i, int j) {
		
	}

	@Test
	public void testGetTelefone() {
		assertNull(pessoa.getTelefone(), null);
	}

}
