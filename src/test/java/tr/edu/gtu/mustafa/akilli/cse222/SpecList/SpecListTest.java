package tr.edu.gtu.mustafa.akilli.cse222.SpecList;

import junit.framework.TestCase;
import java.util.List;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   SpecList
 *
 * Description:
 *
 * SpecList jUnit Test for SpecList
 *
 * @author Mustafa_Akilli
 * @since Sunday 07 March 2016 by Mustafa_Akilli
 */
public class SpecListTest extends TestCase {

    /**
     * No parameter constructor
     *
     * @throws Exception when not setUp.
     */
    public void setUp() throws Exception {
        super.setUp();
    }//end no parameter constructor

    /**
     * Tear Down
     *
     * @throws Exception when not tearDown.
     */
    public void tearDown() throws Exception {}

    /**
     * Test for AddAllAtHead method.
     * This test wait true result.
     *
     */
    public void testAddAllAtHead(){
        boolean result = true;

        SpecList<Integer> firstList = new SpecList<Integer>();
        SpecList<Integer> secondList = new SpecList<Integer>();
        SpecList<Integer> secondListPlusFirstList = new SpecList<Integer>();

        /* Add Element fistList */
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);

        /* Add Element secondList */
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);

        /* Add Element secondListPlusfirstList */
        secondListPlusFirstList.add(7);
        secondListPlusFirstList.add(6);
        secondListPlusFirstList.add(5);
        secondListPlusFirstList.add(1);
        secondListPlusFirstList.add(2);
        secondListPlusFirstList.add(3);


        /*Appends all of the elements in the secondList to the head of the firstList*/
        firstList.addAllAtHead(secondList);

        /* Check */
        for(int index =0;index<firstList.size();++index){
            if(!firstList.get(index).equals(secondListPlusFirstList.get(index)))
                result = false;
        }

        assertEquals(true,result);
    }//end method testAddAllAtHead

    /**
     * Test for AddAllAtHead method.
     * This test wait false result.
     *
     */
    public void testAddAllAtHeadSecond(){
        boolean result = true;

        SpecList<Integer> firstList = new SpecList<Integer>();
        SpecList<Integer> secondList = new SpecList<Integer>();
        SpecList<Integer> secondListPlusFirstList = new SpecList<Integer>();

        /* Add Element fistList */
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);

        /* Add Element secondList */
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);

        /* Add Element secondListPlusfirstList */
        secondListPlusFirstList.add(8);
        secondListPlusFirstList.add(9);
        secondListPlusFirstList.add(10);
        secondListPlusFirstList.add(1);
        secondListPlusFirstList.add(2);
        secondListPlusFirstList.add(3);


        /*Appends all of the elements in the secondList to the head of the firstList*/
        firstList.addAllAtHead(secondList);

        /* Check */
        for(int index =0;index<firstList.size();++index){
            if(!firstList.get(index).equals(secondListPlusFirstList.get(index)))
                result = false;
        }

        assertEquals(false,result);
    }//end method testAddAllAtHeadSecond

    /**
     * Test for GetIntersectList method.
     * This test wait true result.
     *
     */
    public void testGetIntersectList(){
        boolean result = true;
        boolean checkContain;

        SpecList<Integer> firstList = new SpecList<Integer>();
        SpecList<Integer> secondList = new SpecList<Integer>();
        SpecList<Integer> intersectListforFirstListSecondList = new SpecList<Integer>();

        /* Add Element fistList */
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        /* Add Element secondList */
        secondList.add(4);
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);

        /* Add Element intersectListforFirstListSecondList */
        intersectListforFirstListSecondList.add(4);
        intersectListforFirstListSecondList.add(5);


        /* intersectListforFirstListSecondList for firstList and secondList */
        firstList.getIntersectList(secondList);

        /* Check */
        for(int index =0;index<intersectListforFirstListSecondList.size();++index){
            checkContain = false;
            for(int j =0;j<firstList.size();++j)
                if(intersectListforFirstListSecondList.get(index).equals(firstList.get(j)))
                    checkContain = true;

            if(checkContain == false)
                result = false;
        }

        assertEquals(true,result);
    }//end method testGetIntersectList

    /**
     * Test for GetIntersectList method.
     * This test wait false result.
     *
     */
    public void testGetIntersectListSecond(){
        boolean result = true;
        boolean checkContain;

        SpecList<Integer> firstList = new SpecList<Integer>();
        SpecList<Integer> secondList = new SpecList<Integer>();
        SpecList<Integer> intersectListforFirstListSecondList = new SpecList<Integer>();

        /* Add Element fistList */
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        /* Add Element secondList */
        secondList.add(4);
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);

        /* Add Element intersectListforFirstListSecondList */
        intersectListforFirstListSecondList.add(8);
        intersectListforFirstListSecondList.add(5);


        /* intersectListforFirstListSecondList for firstList and secondList */
        firstList.getIntersectList(secondList);

        /* Check */
        for(int index =0;index<intersectListforFirstListSecondList.size();++index){
            checkContain = false;
            for(int j =0;j<firstList.size();++j)
                if(intersectListforFirstListSecondList.get(index).equals(firstList.get(j)))
                    checkContain = true;

            if(checkContain == false)
                result = false;
        }

        assertEquals(false,result);
    }//end method testGetIntersectListSecond

    /**
     * Test for SortList method.
     * This test wait true result.
     *
     */
    public void testSortList(){
        boolean result = true;

        SpecList<Integer> testList = new SpecList<Integer>();
        SpecList<Integer> firstList = new SpecList<Integer>();
        List<Integer> sortedFirstList = new SpecList<Integer>();
        SpecList<Integer> sortedList = new SpecList<Integer>();

        /* Add Element fistList */
        firstList.add(10);
        firstList.add(8);
        firstList.add(15);
        firstList.add(7);
        firstList.add(9);

        /* Add Element sortedList */
        sortedList.add(7);
        sortedList.add(8);
        sortedList.add(9);
        sortedList.add(10);
        sortedList.add(15);

        /* sortedFirstList for firstList */
        sortedFirstList = testList.sortList(firstList,SpecList.INCREASING);

        /* Check */
        for(int index =0;index<sortedFirstList.size();++index){
            if(!sortedFirstList.get(index).equals(sortedList.get(index)))
                result = false;
        }

        assertEquals(true,result);
    }//end method testSortList

    /**
     * Test for SortList method.
     * This test wait false result.
     *
     */
    public void testSortListSecond(){
        boolean result = true;

        SpecList<Integer> testList = new SpecList<Integer>();
        SpecList<Integer> firstList = new SpecList<Integer>();
        List<Integer> sortedFirstList = new SpecList<Integer>();
        SpecList<Integer> sortedList = new SpecList<Integer>();

        /* Add Element fistList */
        firstList.add(10);
        firstList.add(8);
        firstList.add(15);
        firstList.add(7);
        firstList.add(9);

        /* Add Element sortedList */
        sortedList.add(25);
        sortedList.add(65);
        sortedList.add(9);
        sortedList.add(11);
        sortedList.add(15);

        /* sortedFirstList for firstList */
        sortedFirstList = testList.sortList(firstList,SpecList.INCREASING);

        /* Check */
        for(int index =0;index<sortedFirstList.size();++index){
            if(!sortedFirstList.get(index).equals(sortedList.get(index)))
                result = false;
        }

        assertEquals(false,result);
    }//end method testSortListSecond
}