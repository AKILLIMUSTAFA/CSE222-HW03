package tr.edu.gtu.mustafa.akilli.cse222.SpecList;

import java.util.Collection;
import java.util.List;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   SpecListInt
 *
 * Description:
 *
 * SpecListInt Interface
 *
 * @author Mustafa_Akilli
 * @since Sunday 06 March 2016, 23:32 by Mustafa_Akilli
 */
public interface SpecListInt<E>{

    int DECREASING = -1; // For sortList decreasing
    int INCREASING = 1; // For sortList increasing

    /**
     * Appends all of the elements in the specified collection to the head of the list.
     *
     * @param collection 's elements appends to the head of the list.
     * @return if the process appends is succesful then return true, otherwise return false
     */
    Boolean addAllAtHead(Collection<? extends E> collection);

    /**
     * Finds and returns intersection list (list of unique elements available in both collections)
     *
     * @param collection
     * @return intersection list
     */
    List<E> getIntersectList (Collection<? extends E>  collection);

    /**
     * Sorts and returns list
     *
     * @param collection
     * @param decreasing_or_increasing Select your choice
     * @return decreasing list or increasing list
     */
    List<E> sortList(Collection<? extends E> collection, int decreasing_or_increasing);
}
