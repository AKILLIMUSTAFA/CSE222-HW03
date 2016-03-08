package tr.edu.gtu.mustafa.akilli.cse222.SpecList;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   SpecList
 *
 * Description:
 *
 * SpecList Class
 *
 * @author Mustafa_Akilli
 * @since Sunday 07 March 2016 by Mustafa_Akilli
 */
public class SpecList<E extends Comparable<E>> extends LinkedList<E> implements SpecListInt<E>{

    LinkedList<E> linkedList;

    /**
     * Appends all of the elements in the specified collection to the head of the list.
     *
     * @param collection 's elements appends to the head of the list.
     * @return if the process appends is succesful then return true, otherwise return false
     */
    public Boolean addAllAtHead(Collection<? extends E> collection) {
        Iterator<E> iter = (Iterator<E>) collection.iterator(); /*Iterator */
        Boolean checkAnyElementAddToTheHeadOfTheList = false; /*Check Any Element Add To The Head Of The List*/
        Boolean result; /* Result of Appends */

        /*Appends all of the elements in the specified collection to the head of the list.*/
        while(iter.hasNext()){
            addFirst(iter.next());
            checkAnyElementAddToTheHeadOfTheList = true;
        }

        if(checkAnyElementAddToTheHeadOfTheList == true)
            result = true;
        else
            result = false;

        return result;
    }//end method addAllAtHead

    /**
     * Finds and returns intersection list (list of unique elements available in both collections)
     *
     * @param collection
     * @return intersection list
     */
    public List<E> getIntersectList(Collection<? extends E> collection) {
        List<E> intersectList = new LinkedList<E>(); /*IntersectList*/
        Iterator<E> iter = (Iterator<E>) collection.iterator(); /*Iterator */

        /*Finds and add unique elements into intersection list*/
        while(iter.hasNext()){
            E nextElement = iter.next();
            for(int index=0; index<size(); ++index)
                if(nextElement.equals(get(index)))
                    intersectList.add(get(index));
        }

        return intersectList;/* returns intersection list */
    }//end method getIntersectList

    /**
     * Sorts and returns list
     *
     * @param collection
     * @param decreasingOrIncreasing Select your choice
     * @return decreasing list or increasing list
     * @throws IllegalArgumentException if the parameter decreasing_or_increasing is wrong.
     */
    public List<E> sortList(Collection<? extends E> collection, int decreasingOrIncreasing) throws IllegalArgumentException{
        LinkedList<E> increasingSortedList = new LinkedList<E>(); /*SortsList*/
        LinkedList<E> decreasingSortedList = new LinkedList<E>(); /*SortsList*/
        Iterator<E> iterCollection = (Iterator<E>) collection.iterator(); /*Iterator */
        int sequence;

        /* Sequence */
        if(SpecList.INCREASING == decreasingOrIncreasing || SpecList.DECREASING == decreasingOrIncreasing)
            sequence = decreasingOrIncreasing;
        else
            throw new IllegalArgumentException();

        /*Appends all of the elements in the collection*/
        while(iterCollection.hasNext())
            increasingSortedList.add(iterCollection.next());

        boolean swapped;
        do {
            swapped = false;
            for (int index =0; index<=  increasingSortedList.size()-2; ++index) {
                if (increasingSortedList.get(index).compareTo(increasingSortedList.get(index+1)) > 0) {
                    //test whether the two elements are in the wrong order
                    E temp = increasingSortedList.get(index);
                    E temp_oth = increasingSortedList.get(index+1);

                    increasingSortedList.remove(index);
                    increasingSortedList.remove(index);

                    increasingSortedList.add(index,temp);
                    increasingSortedList.add(index,temp_oth);
                    swapped = true;
                }
            }
            if (!swapped) {
                //we can exit the outer loop here if no swaps occurred.
                break;
            }
            swapped = false;
            for (int index= increasingSortedList.size()-2; index>=0 ; --index) {
                if (increasingSortedList.get(index).compareTo(increasingSortedList.get(index+1)) > 0) {
                    E temp = increasingSortedList.get(index);
                    E temp_oth = increasingSortedList.get(index+1);

                    increasingSortedList.remove(index);
                    increasingSortedList.remove(index);

                    increasingSortedList.add(index,temp);
                    increasingSortedList.add(index,temp_oth);
                    swapped = true;
                }
            }
            //if no elements have been swapped, then the list is sorted
        } while (swapped);

        Iterator<E> iterIncreasingSortedList = (Iterator<E>) increasingSortedList.iterator(); /*Iterator */
        if(sequence == SpecList.DECREASING){
            while(iterIncreasingSortedList.hasNext())
                decreasingSortedList.addFirst(iterIncreasingSortedList.next());

            return decreasingSortedList;
        }

        return increasingSortedList;
    }//end method sortList
}
