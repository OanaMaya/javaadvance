package com.sda.oana.advanced.recapitulare;

import java.util.*;

public class ColectionsMain {
    public static void main(String[] args) {
        Teacher profesor1 = new Teacher(32, "Pop", Gender.MALE);
        Teacher profesor2 = new Teacher(35, "Anabela", Gender.FEMALE);
        Teacher profesor3 = new Teacher(42, "Marian", Gender.MALE);

        List<Teacher> professors = new ArrayList<>();
        professors.add(profesor1);
        professors.add(profesor2);
        professors.add(profesor3);

        System.out.println(professors);

        System.out.println(professors.get(professors.size() - 1));

        //professors.remove(2);

        Set<Teacher> professorsSet = new HashSet<>();
        boolean result = professorsSet.addAll(professors);
        System.out.println(result);
        System.out.println(professorsSet);


//        Set<List<List<>>> elements = new HashSet<>();
//        Set<Map<Map<String, Integer>>>= new HashSet<>()
        //e de evitat situatiile astea si se fac obiecte cu clasa


        Map<String, Teacher> profesorsMap = new HashMap<>();
        profesorsMap.put("Cluj_napoca", profesor1);
        profesorsMap.put("Zalau", profesor2);
        profesorsMap.put("Bistita", profesor3);
        profesorsMap.put("Bistrita", profesor1);

        System.out.println(profesorsMap);

        profesorsMap.entrySet(); // cand nu stii cheia si cauti dupa valoarea
       // cand vreau sa parcurg elementele dar nu stiu ce elemente am si nu stiu cheia
       // entry = un element din map de forma cheie si vsloare
      //  exemplu:
       // entry.getKey() = "Zalau"
      //  entry.getValue() = profesor1

        for(Map.Entry<String,Teacher> entry: profesorsMap.entrySet()){
            entry.getValue();
            entry.getValue();
        }
    }
}
