package se.lexicon;

import se.lexicon.data.People;
import se.lexicon.data.PersonSequencer;
import se.lexicon.data.TodoItems;
import se.lexicon.model.Person;
import se.lexicon.model.Todo;

public class Run {
    public void run(){
        People people = new People();
        TodoItems todo = new TodoItems();
        people.createPerson("Ben","Boson");
        people.createPerson("Sven","Svensson");
        people.createPerson("Ren","Svensson");
        people.createPerson("Glen","Svensson");
        todo.createTodo("First thing");
        todo.createTodo("Second thing");
        todo.createTodo("Third thing");
        todo.createTodo("Fourth thing");



        for (Person p:people.findAll()){
            System.out.println(p.getPersonId());
        }
        people.clear();
        for (Person p:people.findAll()){
            System.out.println(p.getPersonId());
        }

        for (Todo t:todo.findAll()){
            System.out.println(t.getDescription());
        }
        todo.clear();

        for (Todo t:todo.findAll()){
            System.out.println(t.getDescription());
        }
    }
}
