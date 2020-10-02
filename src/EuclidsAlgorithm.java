
public class EuclidsAlgorithm {

	public static void main(String[] args) {
		 @Test
		    public void firstTest(){
		        EuclidsAlgorithm ea = new EuclidsAlgorithm();
		        int expected = ea.gcd(78, 36);
		        int actual = 6;
		        Assert.assertEquals(expected, actual);
		    }

		    @Test
		    public void secondTest(){
		        EuclidsAlgorithm ea = new EuclidsAlgorithm();
		        int expected = ea.gcd(225, 40);
		        int actual = 5;
		        Assert.assertEquals(expected, actual);
		    }

		
	}

}
