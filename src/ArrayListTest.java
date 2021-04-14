import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
    List<String> strList;
    String[] strs = {"a", "Hello", "Bye", "Money", "Happy"};
    String[] strTemp = {"qwerty", "mama", "papa"};
    List<String> temp = new ArrayList<String>(Arrays.asList(strTemp));

    @Before
    public void setUp() throws Exception {
//		strList = new ArrayList<>();
        strList = new LinkedList<>();
        for(String s : strs) strList.add(s);
//		List<String> linkList = new LinkedList<String>(strList);
//		strList = new ArrayList<String>(linkList);
    }

    @Test
    public void testAdd() {
        assertArrayEquals(strs, strList.toArray());
//		assertEquals(strs.length, strList.size());
//		for(int i = 0; i<strList.size();i++) {
//			assertEquals(strs[i], strList.get(i));
//		}
        assertTrue(strList.add("Hi"));
        assertEquals(strs.length+1, strList.size());
        assertEquals("Hi", strList.get(strList.size()-1));

        assertTrue(strList.add("Hi"));
        assertEquals(strs.length+2, strList.size());
        assertNotEquals(strList.indexOf("Hi"), strList.lastIndexOf("Hi"));

        assertTrue(strList.add(""));
        assertEquals(strs.length+3, strList.size());
        assertEquals("", strList.get(strList.size()-1));

        assertTrue(strList.add(null));
        assertEquals(strs.length+4, strList.size());
        assertEquals(null, strList.get(strList.size()-1));

        //===================================

        strList.add(0, "Turumpumpum");
        assertEquals(strs.length+5, strList.size());
        assertEquals("Turumpumpum", strList.get(0));

    }

    @Test
    public void testAddAll() {
        assertTrue(strList.addAll(temp));
        assertEquals(strs.length + strTemp.length, strList.size());
        for(String s : strTemp) {
            assertTrue(strList.contains(s));
        }
        //======================================
        assertTrue(strList.addAll(0, temp));
        //=====================Var1=================
        assertEquals(strs.length + strTemp.length +  strTemp.length, strList.size());
        for(int i = 0; i<strTemp.length;i++) {
            assertEquals(strTemp[i], strList.get(i));
        }
        //====================Var2==================
        List<String> test = strList.subList(0, 3);
        assertTrue(test.containsAll(temp));

    }

    @Test
    public void test() {
        //	List<String> temp = new ArrayList<String>(Arrays.asList(strTemp));
        List<String> test = Arrays.asList(strTemp);
        System.out.println(test);
        //	test.add("Mumumu");
    }

    @Test
    public void testRemove() {
        assertTrue(strList.contains("a"));
        assertEquals("a", strList.remove(0));
        assertEquals(strs.length-1, strList.size());
        assertFalse(strList.contains("a"));

        assertTrue(strList.remove("Money"));
//		assertEquals(true, strList.remove("Money"));
        assertEquals(strs.length-2, strList.size());
        assertFalse(strList.contains("Money"));

        assertFalse(strList.remove("Money"));
        assertEquals(strs.length-2, strList.size());

    }


}
