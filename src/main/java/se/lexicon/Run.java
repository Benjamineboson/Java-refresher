package se.lexicon;

import se.lexicon.data.People;
import se.lexicon.data.PersonSequencer;
import se.lexicon.model.Person;

public class Run {
    public void run(){
        People people = new People();
        people.createPerson("Ben","Boson");
        people.createPerson("Sven","Svensson");
        people.createPerson("Ren","Svensson");
        people.createPerson("Glen","Svensson");


        Person[]temp = people.findAll();
        for (Person p:temp){
            System.out.println(p.getPersonId());
        }
        people.clear();
        for (Person p:people.findAll()){
            System.out.println(p.getPersonId());
        }
    }
}
