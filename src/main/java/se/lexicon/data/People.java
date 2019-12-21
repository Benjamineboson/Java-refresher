package se.lexicon.data;

import se.lexicon.model.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class People {

    private static Person[] personArr = new Person[0];

    public int size(){
        return personArr.length;
    }

    public Person[] findAll(){
        return personArr;
    }

    public Person findById(int personId){
        for (Person person:personArr) {
            if (person.getPersonId() == personId){
                return person;
            }
        }
        return null;
    }




    // Add method to expand personArr and add createdPerson to arr


    public static Person createPerson(String firstName,String lastName){
        Person newPerson = new Person (PersonSequencer.nextPersonid(),firstName,lastName);
        personArr = expandArr(personArr,newPerson);
        return newPerson;
    }

    public static Person[] expandArr(Person[] pArr, Person person){
        int offSet = personArr.length;
        Person [] tempArr = Arrays.copyOf(pArr,offSet + 1);
        for (int i = offSet; i < offSet+1 ; i++) {
            tempArr[i] = person;
        }
        return tempArr;
    }

    public void clear(){
        Person[] tempArr = new Person[0];
        personArr = tempArr;
    }

}
