import java.util.*;

public class PlayWithCollections {


    public static void main(String[] args) {

//        playWithNames();
//        playWithLists();
//        playWithSets();
//        playWithTreeSets();
//        playWithMaps();
    }

    public static void playWithNames() {
        List<String> names = new ArrayList<>();
        //list einai interface,arraylist class
        //ARRAYLIST < LIST < COLLECTION
        //h kathe list exei dikes ths methodous.list kai collection einai interface
        addNamesToList((ArrayList) names);

        ArrayList<String> names2 = new ArrayList<>();
        LinkedList<String> linkedListNames = new LinkedList<>();
        linkedListNames.add("Jack");
        linkedListNames.add("John");
        linkedListNames.addFirst("George");

        for (String linkedNames : linkedListNames) {
            System.out.println(linkedNames);
        }
    }

    public static void playWithLists() {
        List<Student> generalStudents = Student.getLinkedListOfGeneralStudents();
        Student.printListOfStudents(generalStudents, "***** Printing general Students *****");
        List<Student> javaStudents = Student.getListOfJavaStudents(generalStudents);
        Student.printListOfStudents(javaStudents, "***** Printing Java Students *****");
        Student.printListOfStudents(generalStudents, "***** Printing general Students *****");
    }

    public static void addNamesToList(ArrayList list) {
        list.add("Nick");
        list.add("Jack");
        list.add("Mary");
        list.add("Andy");
    }

    public static void forLoopMethodString(Set<String> hashSet) {
        for (String name : hashSet) {
            System.out.println(name);
        }
    }

    public static void forLoopMethodStudent(Set<Student> hashSet) {
        for (Student name : hashSet) {
            System.out.println(name);
        }
    }

    public static void playWithSets() {
        System.out.println("***** PLAY WITH SETS *****");
        Set<String> hashSet = new HashSet<>();
        //set interface / HashSet class
        hashSet.add("Nick");
        hashSet.add("Nick");
        //to hashset den emfanizei diplotypa
        hashSet.add("Mary");
        forLoopMethodString(hashSet);


        Student s1 = new Student("Nick", 15, 70);
        System.out.println("s1 : " + s1);
        Student s2 = new Student("Nick", 15, 95);
        System.out.println("s2 : " + s2);
        Student s3 = new Student("Mary", 18, 85);
        System.out.println("s3 : " + s3);
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));

        List<Student> list = new ArrayList<>();
        list.add(s1);
        System.out.println("list.contains(s1) : " + list.contains(s1));
        System.out.println("list.contains(s2) : " + list.contains(s2));

        Set<Student> setOfStudents = new HashSet<>();
        //TA SET DEN EXOYN GET(INDEX).EINAI SAN SAKOYLES ME DEDOMENA
        //override
        setOfStudents.add(s1);
        setOfStudents.add(s2);
        setOfStudents.add(s3);

        forLoopMethodStudent(setOfStudents);

        System.out.println("***** PLAY WITH SETS *****");
    }

    public static void playWithTreeSets() {
        System.out.println("***** PLAY WITH TREE SETS *****");
        //TreeSet den afinei duplicates kai sortarei ta strings
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Nick");
        treeSet.add("Mary");
        treeSet.add("Nick");
        treeSet.add("Jonathan");
        treeSet.add("Andy");
        System.out.println("***** Printing TreeSet of names ***** ");
        for (String name : treeSet) {
            System.out.println(name);
        }
        Student s1 = new Student("Nick", 15, 70);
        Student s2 = new Student("Nick", 15, 95);
        Student s3 = new Student("Mary", 18, 85);

        Set<Student> treeSetStudents = new TreeSet<>();
        treeSetStudents.add(s1);
        treeSetStudents.add(s2);
        treeSetStudents.add(s3);
        treeSetStudents.add(new Student("Andy", 18, 85));
        //an o andy age = 18 an paw na kanw compare me age ton andy ton kobei giati exie idio age me Mary
        //result = 0 ara de ton ektypwnei
        System.out.println("***** Printing TreeSet of Students *****");
        //petaei error Student cannot be cast to class java.lang.Comparable an paw na kanw for gia println
        //h TreeSet sortarei kai ton Student de mporei na ton sortarei giati de kserei se sxesi me ti na taksinomisei
        //h String class kanei implement tin Class Comparable
        //ara k egw ayto prepei na kanw ston Student
//        for (Student s : treeSetStudents) {
//            System.out.println(s);
//        }
        forLoopMethodStudent(treeSetStudents);

        //an thelw twra na tous taksinomisw kata onoma xwris na allaksw tin compareTo pou eftiaksa
        //ftiaxnw class StudentComparatorName stin opoia kanw pali implement Comparator
        //kai ftiaxnw tin abstract class pou pira apo kei

        StudentComparatorName myStudentComparator = new StudentComparatorName();
        TreeSet<Student> treeSetStudentByName = new TreeSet<>(myStudentComparator); // pairnei comparator san eisodo
        treeSetStudentByName.addAll(treeSetStudents); //bazw sto kainoyrio treeSet to prohgoumeno
        System.out.println("***** Printing TreeSet of Students by name ***** ");

        forLoopMethodStudent(treeSetStudentByName);
        System.out.println("***** PLAY WITH TREE SETS *****");
    }

    public static void playWithMaps() {
        System.out.println("***** PLAYING WITH MAPS *****");
        //antistoixisi metaksu key kai value
        //ta keys einai monadika
        Map<String, Integer> map = new HashMap();
        map.put("Nick", 80);
        map.put("Mary", 60);
        map.put("Jack", 90);
        map.put("Nick", 90);

        boolean exits = map.containsKey("Jonathan");
        System.out.println("Exists : " + exits);
        exits = map.containsKey("Mary");
        System.out.println("Exists : " + exits);

        map.replace("Mary", 100);
        int grade = map.get("Mary");
        System.out.println("grade : " + grade);

        System.out.println("***** Printing Map *****");
        Set<String> keysOfMap = map.keySet();
        for (String key : keysOfMap) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println("**** Printing Only Values ****");
        Collection<Integer> values = map.values();
        for (int value : values) {
            System.out.println(value);
        }

        //to treeMap kanei to idio apla taksinomei kiolas symfwna me ta keys opws to tree set


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " ---->>> " + entry.getValue());
        }
//        Map.Entry<String,Integer> entry = iterator.next();
//        System.out.println(entry.getKey() + " ---->>> " + entry.getValue());
//        entry = iterator.next();
//        System.out.println(entry.getKey() + " ---->>> " + entry.getValue());
//        entry = iterator.next();
//        System.out.println(entry.getKey() + " ---->>> " + entry.getValue());
        //allos tropos
//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " ---> " + entry.getValue());
//        }
        System.out.println("***** Try to remove *****");
        Set<String> names = new HashSet<>();
        names.add("Nick");
        names.add("Jack");
        names.add("John");

        //o monos tropos na diagrapsw kati apo to set einai me iterator
        //alliws pairnw error gia Concurretmodificator

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("Nick")) {
                it.remove();
            }
        }
        System.out.println(names);

//        Set<Integer> set = new HashSet<>();
//        set.add(5);
//        set.add(4);
//        set.add(1);
//        set.add(0);
//
//        for(int number : set){
//            System.out.println(number + ",");
//            if(number == 1){
//                set.remove(number);
//            }
//        }
        //AYTO XTYPAEI GIATI DE ME AFINEI NA DIAGRAPSW KATI AP TO SET GIATI XALAEI TH SEIRA
        //MONO ME ITERATOR GINETAI OPWS PANW STA STRING
        System.out.println("***** PLAYING WITH MAPS *****");
    }
}
