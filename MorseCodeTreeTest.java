package MorseCode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MorseCodeTreeTest {
	  
	   MorseCodeTree tree = new MorseCodeTree();

	   @Before
	   public void setUp() throws Exception {
	      
	      
	   }

	   @After
	   public void tearDown() throws Exception {
	      
	       tree = null;
	   }

	   @Test
	   public void testFetch() {
     
	       String letterFetched;
	      
	
	       letterFetched = tree.fetch("-.");
	      
	       assertEquals("n", letterFetched);
	      
	       String letterFetched2;
	      
	       letterFetched2 = tree.fetch("--.-");
	      
	       assertEquals("q", letterFetched2);

	   }


	   @Test
	   public void testToArrayList() {
	      
	       ArrayList<String> list = new ArrayList<String>();
	      
	       list = tree.toArrayList();
	      
	       assertEquals("h", list.get(0));
	       assertEquals("s", list.get(1));
	       assertEquals("v", list.get(2));
	       assertEquals("i", list.get(3));
	       assertEquals("f", list.get(4));
	       assertEquals("u", list.get(5));
	       assertEquals("e", list.get(6));
	       assertEquals("l", list.get(7));
	       assertEquals("r", list.get(8));
	       assertEquals("a", list.get(9));
	       assertEquals("p", list.get(10));
	       assertEquals("w", list.get(11));
	       assertEquals("j", list.get(12));
	       assertEquals("", list.get(13));
	       assertEquals("b", list.get(14));
	       assertEquals("d", list.get(15));
	       assertEquals("x", list.get(16));
	       assertEquals("n", list.get(17));
	       assertEquals("c", list.get(18));
	       assertEquals("k", list.get(19));
	       assertEquals("y", list.get(20));
	       assertEquals("t", list.get(21));
	       assertEquals("z", list.get(22));
	       assertEquals("g", list.get(23));
	       assertEquals("q", list.get(24));
	       assertEquals("m", list.get(25));
	       assertEquals("o", list.get(26));

	   }
	}
