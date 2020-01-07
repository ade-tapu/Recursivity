package com.sdacademy.oop;

public class Dog {
    private String name;
    private int age;
    private Boolean gender;
    private String race;
    private int weight;

    public Dog(String name, int age, Boolean gender, String race, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.setWeight(weight); // creeam constructorul apeland metoda a.i sa respecte conditia
    }
    public Dog(Boolean gender, String race) {
            // this.gender = gender;
            //  this.race = race;
            this("fara nume", 1, gender, race, 1); // creeam un constructor care apeleaza constructorul din main
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            if (age > 0) {
                this.age = age;
            }

        }

        public int getWight () {
            return weight;
        }

        public void setWeight ( int weight){
            if (weight > 0) {  // conditia ca greutatea sa fie mai mare ca sa poata fi setata
                this.weight = weight;
            }
        }

        public Boolean isMale () {
            return gender;
        }

}
