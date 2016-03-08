package tr.edu.gtu.mustafa.akilli.cse222;

import tr.edu.gtu.mustafa.akilli.cse222.SpecList.SpecList;
import tr.edu.gtu.mustafa.akilli.cse222.SpecList.SpecListInt;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class TestScenario
{
    public static void main( String[] args )
    {
        SpecList<Integer> specListInteger;
        specListInteger = new SpecList<Integer>();

        List<Integer> linkedListInteger;
        linkedListInteger = new LinkedList<Integer>();

        List<Integer> increaseSortedLinkedListInteger;
        increaseSortedLinkedListInteger = new LinkedList<Integer>();

        List<Integer> decreaseSortedLinkedListInteger;
        decreaseSortedLinkedListInteger = new LinkedList<Integer>();

        List<Integer> intersectionListInteger;
        intersectionListInteger = new LinkedList<Integer>();

        System.out.println("****TestScenario Integer****\n");

        /*Add element in LinkedList Integer*/
        System.out.println("Added Elements LinkedList Integer: 5,1,3,2,4");
        linkedListInteger.add(5);
        linkedListInteger.add(1);
        linkedListInteger.add(3);
        linkedListInteger.add(2);
        linkedListInteger.add(4);
        System.out.println("LinkedList Integer Elements: ");
        for(int index=0; index <linkedListInteger.size(); ++index)
            System.out.print(linkedListInteger.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Add element in SpecList Integer*/
        System.out.println("Added Elements SpecList Integer: 22,33,44,55");
        specListInteger.add(22);
        specListInteger.add(33);
        specListInteger.add(44);
        specListInteger.add(55);
        System.out.println("SpecList Integer Elements: ");
        for(int index=0; index <specListInteger.size(); ++index)
            System.out.print(specListInteger.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Appends all of the elements in the LinkedListInteger to the head of the SpecList Integer*/
        System.out.println("Appends all of the elements in the LinkedListInteger to the head of the SpecList Integer");
        specListInteger.addAllAtHead(linkedListInteger);
        System.out.println("SpecList Integer Elements: ");
        for(int index=0; index <specListInteger.size(); ++index)
            System.out.print(specListInteger.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Add element in LinkedList Integer*/
        System.out.println("Added Elements LinkedList Integer: 66,99,115");
        linkedListInteger.add(66);
        linkedListInteger.add(99);
        linkedListInteger.add(115);
        System.out.println("LinkedList Integer Elements: ");
        for(int index=0; index <linkedListInteger.size(); ++index)
            System.out.print(linkedListInteger.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*increaseSortedLinkedListInteger for LinkedListInteger*/
        System.out.println("Increase Sorted LinkedList Integer for LinkedList Integer");
        increaseSortedLinkedListInteger = specListInteger.sortList(linkedListInteger, SpecList.INCREASING);
        System.out.println("Increase Sorted LinkedList Integer Elements: ");
        for(int index=0; index <increaseSortedLinkedListInteger.size(); ++index)
            System.out.print(increaseSortedLinkedListInteger.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*decreaseSortedLinkedListInteger for LinkedListInteger*/
        System.out.println("Decrease Sorted LinkedList Integer for LinkedList Integer");
        decreaseSortedLinkedListInteger = specListInteger.sortList(linkedListInteger, SpecList.DECREASING);
        System.out.println("Decrease Sorted LinkedList Integer Elements: ");
        for(int index=0; index <decreaseSortedLinkedListInteger.size(); ++index)
            System.out.print(decreaseSortedLinkedListInteger.get(index)+ ",");

        System.out.println("\n*********************************************");

        /* intersectionListInteger for specListInteger and linkedListInteger */
        System.out.println("Intersection List Integer for specList Integer and linkedList Integer");
        intersectionListInteger = specListInteger.getIntersectList(linkedListInteger);
        System.out.println("Intersection List Integer Elements: ");
        for(int index=0; index <intersectionListInteger.size(); ++index)
            System.out.print(intersectionListInteger.get(index)+ ",");

        System.out.println("\n*********************************************");
        System.out.println("\n*********************************************");
        System.out.println("\n*********************************************");

        SpecList<Double> specListDouble;
        specListDouble = new SpecList<Double>();

        List<Double> linkedListDouble;
        linkedListDouble = new LinkedList<Double>();

        List<Double> increaseSortedlinkedListDouble;
        increaseSortedlinkedListDouble = new LinkedList<Double>();

        List<Double> decreaseSortedlinkedListDouble;
        decreaseSortedlinkedListDouble = new LinkedList<Double>();

        List<Double> intersectionListDouble;
        intersectionListDouble = new LinkedList<Double>();

        System.out.println("****TestScenario Double****\n");

        /*Add element in LinkedList Double*/
        System.out.println("Added Elements LinkedList Double: 4.8, 3.2, 5.8, 7.8, 3.7");
        linkedListDouble.add(4.8);
        linkedListDouble.add(3.2);
        linkedListDouble.add(5.8);
        linkedListDouble.add(7.8);
        linkedListDouble.add(3.7);
        System.out.println("LinkedList Double Elements: ");
        for(int index=0; index <linkedListDouble.size(); ++index)
            System.out.print(linkedListDouble.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Add element in SpecList Double*/
        System.out.println("Added Elements SpecList Double: 22.8,33.6,44.4,55.7");
        specListDouble.add(22.8);
        specListDouble.add(33.6);
        specListDouble.add(44.4);
        specListDouble.add(55.7);
        System.out.println("SpecList Double Elements: ");
        for(int index=0; index <specListDouble.size(); ++index)
            System.out.print(specListDouble.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Appends all of the elements in the LinkedListDouble to the head of the SpecList Double*/
        System.out.println("Appends all of the elements in the LinkedListDouble to the head of the SpecList Double");
        specListDouble.addAllAtHead(linkedListDouble);
        System.out.println("SpecList Double Elements: ");
        for(int index=0; index <specListDouble.size(); ++index)
            System.out.print(specListDouble.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Add element in LinkedList Double*/
        System.out.println("Added Elements LinkedList Double: 115.7,99.9,58.0");
        linkedListDouble.add(115.7);
        linkedListDouble.add(99.9);
        linkedListDouble.add(58.0);
        System.out.println("LinkedList Double Elements: ");
        for(int index=0; index <linkedListDouble.size(); ++index)
            System.out.print(linkedListDouble.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*increaseSortedLinkedListDouble for LinkedListDouble*/
        System.out.println("Increase Sorted LinkedList Double for LinkedList Double");
        increaseSortedlinkedListDouble = specListDouble.sortList(linkedListDouble, SpecList.INCREASING);
        System.out.println("Increase Sorted LinkedList Double Elements: ");
        for(int index=0; index <increaseSortedlinkedListDouble.size(); ++index)
            System.out.print(increaseSortedlinkedListDouble.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*decreaseSortedLinkedListDouble for LinkedListDouble*/
        System.out.println("Decrease Sorted LinkedList Double for LinkedList Double");
        decreaseSortedlinkedListDouble = specListDouble.sortList(linkedListDouble, SpecList.DECREASING);
        System.out.println("Decrease Sorted LinkedList Double Elements: ");
        for(int index=0; index <decreaseSortedlinkedListDouble.size(); ++index)
            System.out.print(decreaseSortedlinkedListDouble.get(index)+ ",");

        System.out.println("\n*********************************************");

        /* intersectionListDouble for specListDouble and linkedListDouble */
        System.out.println("Intersection List Double for specList Double and linkedList Double");
        intersectionListDouble = specListDouble.getIntersectList(linkedListDouble);
        System.out.println("Intersection List Double Elements: ");
        for(int index=0; index <intersectionListDouble.size(); ++index)
            System.out.print(intersectionListDouble.get(index)+ ",");

        System.out.println("\n*********************************************");
        System.out.println("\n*********************************************");
        System.out.println("\n*********************************************");

        SpecList<Character> specListCharacter;
        specListCharacter = new SpecList<Character>();

        List<Character> linkedListCharacter;
        linkedListCharacter = new LinkedList<Character>();

        List<Character> increaseSortedLinkedListCharacter;
        increaseSortedLinkedListCharacter = new LinkedList<Character>();

        List<Character> decreaseSortedLinkedListCharacter;
        decreaseSortedLinkedListCharacter = new LinkedList<Character>();

        List<Character> intersectionListCharacter;
        intersectionListCharacter = new LinkedList<Character>();

        System.out.println("****TestScenario Character****\n");

        /*Add element in LinkedList Character*/
        System.out.println("Added Elements LinkedList Character: e,a,c,d,b");
        linkedListCharacter.add('e');
        linkedListCharacter.add('a');
        linkedListCharacter.add('c');
        linkedListCharacter.add('d');
        linkedListCharacter.add('b');
        System.out.println("LinkedList Character Elements: ");
        for(int index=0; index <linkedListCharacter.size(); ++index)
            System.out.print(linkedListCharacter.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Add element in SpecList Character*/
        System.out.println("Added Elements SpecList Character: t,u,v,y");
        specListCharacter.add('t');
        specListCharacter.add('u');
        specListCharacter.add('v');
        specListCharacter.add('y');
        System.out.println("SpecList Character Elements: ");
        for(int index=0; index <specListCharacter.size(); ++index)
            System.out.print(specListCharacter.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Appends all of the elements in the LinkedListCharacter to the head of the SpecList Character*/
        System.out.println("Appends all of the elements in the LinkedListCharacter to the head of the SpecList Character");
        specListCharacter.addAllAtHead(linkedListCharacter);
        System.out.println("SpecList Character Elements: ");
        for(int index=0; index <specListCharacter.size(); ++index)
            System.out.print(specListCharacter.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*Add element in LinkedList Character*/
        System.out.println("Added Elements LinkedList Character: q,x,w");
        linkedListCharacter.add('q');
        linkedListCharacter.add('x');
        linkedListCharacter.add('w');
        System.out.println("LinkedList Character Elements: ");
        for(int index=0; index <linkedListCharacter.size(); ++index)
            System.out.print(linkedListCharacter.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*increaseSortedLinkedListCharacter for LinkedListCharacter*/
        System.out.println("Increase Sorted LinkedList Character for LinkedList Character");
        increaseSortedLinkedListCharacter = specListCharacter.sortList(linkedListCharacter, SpecList.INCREASING);
        System.out.println("Increase Sorted LinkedList Character Elements: ");
        for(int index=0; index <increaseSortedLinkedListCharacter.size(); ++index)
            System.out.print(increaseSortedLinkedListCharacter.get(index)+ ",");

        System.out.println("\n*********************************************");

        /*decreaseSortedLinkedListCharacter for LinkedListCharacter*/
        System.out.println("Decrease Sorted LinkedList Character for LinkedList Character");
        decreaseSortedLinkedListCharacter = specListCharacter.sortList(linkedListCharacter, SpecList.DECREASING);
        System.out.println("Decrease Sorted LinkedList Character Elements: ");
        for(int index=0; index <decreaseSortedLinkedListCharacter.size(); ++index)
            System.out.print(decreaseSortedLinkedListCharacter.get(index)+ ",");

        System.out.println("\n*********************************************");

        /* intersectionListCharacter for specListCharacter and linkedListCharacter */
        System.out.println("Intersection List Character for specList Character and linkedList Character");
        intersectionListCharacter = specListCharacter.getIntersectList(linkedListCharacter);
        System.out.println("Intersection List Character Elements: ");
        for(int index=0; index <intersectionListCharacter.size(); ++index)
            System.out.print(intersectionListCharacter.get(index)+ ",");

        System.out.println("\n*********************************************");
        System.out.println("\n*********************************************");
        System.out.println("\n*********************************************");
    }
}
