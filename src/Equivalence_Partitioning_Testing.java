import org.junit.Assert;
import org.junit.Test;

public class Equivalence_Partitioning_Testing {
	letterGrade test=new letterGrade();
	@Test
	public void TestforCharX(){
		Assert.assertEquals('X', test.letterGrade(-1));
		Assert.assertEquals('X', test.letterGrade(101));
	}
	@Test
	public void TestforCharF(){
		Assert.assertEquals('F', test.letterGrade(30));
	}
	@Test
	public void TestforCharD(){
		Assert.assertEquals('D', test.letterGrade(65));
	}
	@Test
	public void TestforCharC(){
		Assert.assertEquals('C', test.letterGrade(75));
	}
	@Test
	public void TestforCharB(){
		Assert.assertEquals('B', test.letterGrade(85));
	}
	@Test
	public void TestforCharA(){
		Assert.assertEquals('A', test.letterGrade(95));
	}

}
