package com.sdacademy.oop;

import java.lang.reflect.Member;
import java.util.SortedMap;

public class ConferenceRoom {
    private Members[] membrii = new Members[9];
    private int counter = 0;

    public void AdaugareMembrii(Members persoana) {
        membrii[counter] = persoana; // adaugam persoana pe prima pozitie
        counter++;


    }

    public void AfisareMembrii() {
      //  for (Members member:membrii) {
      //  if (member!= 0)
      //      System.out.println(member.getNume());

      //  }

        for (int i = 0; i < membrii.length; i++) {
         Members member = membrii[i];
         System.out.println("Numele"+ member.getNume() + "prenumele:"+member.getPrenume());



        }




    }


}
