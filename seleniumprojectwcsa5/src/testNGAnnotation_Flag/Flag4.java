package testNGAnnotation_Flag;

import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void f()
  {
  System.out.println("f"); 
  }
  
  @Test(priority = 6)
  public void i()
  {
	System.out.println("i");  
  }

  @Test(priority = 4)
  public void z()
  {
	  System.out.println("z");   
  }
  
  @Test(priority = 5)
  public void p()
  {
	  System.out.println("p"); 
  
}
  
  @Test(priority = 2)
  public void s()
  {
	  System.out.println("s"); 
  }

  
  @Test(priority = 3)
  public void k()
  {
	  System.out.println("k");
	  }
  
  @Test(priority = 0)
  public void a()
  {
	  System.out.println("a"); 
  }
  
  
  @Test(priority = 1)
  public void c()
  {
	  System.out.println("c"); 
  }
}