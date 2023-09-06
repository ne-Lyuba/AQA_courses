package example;

import java.util.*;

public class Collection {
    public ArrayList<Integer> createEmptyList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("First task: " + arrayList);
        return arrayList;
    }

    public ArrayList<Integer> fillList(ArrayList<Integer> emptyArrayList, int min, int max){
        int diff = max - min;

        for (int i = 0; i < 10; i++){
            emptyArrayList.add(new Random().nextInt(diff + 1) + min );
        }
        System.out.println("Second task: " + emptyArrayList);
        return emptyArrayList;
    }

    public void copyArrayList(ArrayList<Integer> firstArrayList){
        ArrayList<Integer> firstCopy = new ArrayList<>(firstArrayList);
        System.out.println("The first copy is: " + firstCopy);

        ArrayList<Integer> secondCopy = new ArrayList<>();
        secondCopy.addAll(firstArrayList);
        System.out.println("The second copy is: " + secondCopy);

        ArrayList<Integer> thirdCopy =  (ArrayList<Integer>) firstArrayList.clone();
        System.out.println("The third  copy is: " + thirdCopy );
    }

    public void uniqueValuesCollection(ArrayList<Integer> arrayList){
        Set<Integer> hashSet = new HashSet<>(arrayList);
        System.out.println("Collection with unique values: " + hashSet);
    }

    public void sortedCollection(ArrayList<Integer> arrayList){
        List<Integer> list = new ArrayList<>(arrayList);
        Collections.sort(list);
        System.out.println("Sorted collection: " + list);
    }

    public void findMaxMinValues(ArrayList<Integer> arrayList){
        Integer minValue = Collections.min(arrayList);
        System.out.println("Min value is: " + minValue);

        Integer maxValue = Collections.max(arrayList);
        System.out.println("Max value is: " + maxValue);
    }

    public void findElementsSum(ArrayList<Integer> arrayList){
        int sum = 0;
        for (Integer element : arrayList){
            sum += element;
        }
        System.out.println("Sum of elements: " + sum);
    }

    public void positiveValues(ArrayList<Integer> arrayList){
        List<Integer> positiveValues = new ArrayList<>();
        for (Integer element : arrayList){
            if (element > 0){
                positiveValues.add(element);
            }
        }
        System.out.println("Positive values: " + positiveValues);
    }

    public void isPresent(int i, ArrayList<Integer> arrayList){
        if (arrayList.contains(i)){
            System.out.println("Value " + i + " is present in array = " + true);
        }
        else {
            System.out.println("Value " + i + " isn't in array = " + false);
        }
    }

    public void elementOccurs(int i, ArrayList<Integer> arrayList){
        System.out.println("Value " + i + " is present " + Collections.frequency(arrayList, i) + " times in array");
    }

    public void reverseOrder(ArrayList<Integer> arrayList){
        Collections.sort(arrayList, Collections.reverseOrder()) ;
        System.out.println("Array in reverse: " + arrayList);
    }

    public void swapFirstAndLastElements(ArrayList<Integer> arrayList){
        int firstElement = arrayList.get(0);
        int lastElement = arrayList.get(arrayList.size()-1);

        arrayList.set(0, lastElement);
        arrayList.set((arrayList.size()-1), firstElement);
        System.out.println("After swapping the first and the last elements " + arrayList);
    }

    public void isPalindrome(ArrayList<Integer> arrayList) {
        Collections.reverse(arrayList);
        System.out.println("Is a palindrome? " + arrayList.equals(new ArrayList<Integer>()));

    }

    public void addMillionValues() {
        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long arrayListTime = measureTime(arrayList);
        long linkedListTime = measureTime(linkedList);
        System.out.println(arrayListTime);
        System.out.println(linkedListTime);
    }

    public long measureTime(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        int listSize = list.size();
        for (int i = 0; i < 100000; i++) {
            int randomIndex = random.nextInt(listSize);
            Integer element = list.get(randomIndex);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String... args) {
        Collection myCollection = new Collection();
        ArrayList<Integer> myArrayList = myCollection.createEmptyList();
        myCollection.fillList(myArrayList, -10, 10);
        myCollection.copyArrayList(myArrayList);
        myCollection.uniqueValuesCollection(myArrayList);
        myCollection.sortedCollection(myArrayList);
        myCollection.findMaxMinValues(myArrayList);
        myCollection.findElementsSum(myArrayList);
        myCollection.positiveValues(myArrayList);
        myCollection.isPresent(10, myArrayList);
        myCollection.elementOccurs(4, myArrayList);
        myCollection.reverseOrder(myArrayList);
        myCollection.swapFirstAndLastElements(myArrayList);
        myCollection.isPalindrome(myArrayList);
        myCollection.addMillionValues();
    }
}
