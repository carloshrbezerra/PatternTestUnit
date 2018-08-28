import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyFixure {

	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("este metodo executa uma vez antes do primeiro teste");
	}
	
	@AfterClass
	public static void tearDownAfterClass(){
		System.out.println("este metodo executa uma vez após o último teste");
	}
	
	@Before
	public void setUp(){
		System.err.println("executa antes de cada teste");
	}
	
	@After
	public void tearDown(){
		System.out.println("executa depois de cada teste");
	}
	
	@Test
	public void test() {
		System.out.println("eu sou teste 1");
	}
	
	@Test
	public void test2() {
		System.out.println("eu sou teste 2");
	}

}
