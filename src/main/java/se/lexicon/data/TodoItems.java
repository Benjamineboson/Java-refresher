package se.lexicon.data;

import se.lexicon.model.Person;
import se.lexicon.model.Todo;

import java.util.Arrays;

public class TodoItems {

    private static Todo[] todoArr = new Todo[0];

    public int size(){
        return todoArr.length;
    }

    public Todo[] findAll(){
        return todoArr;
    }

    public Todo findById(int personId){
        for (Todo todo:todoArr) {
            if (todo.getTodold() == personId){
                return todo;
            }
        }
        return null;
    }




    // Add method to expand personArr and add createdPerson to arr


    public static Todo createTodo(String description){
        Todo newTodo = new Todo (TodoSequencer.nextTodol(),description);
        todoArr = expandArr(todoArr,newTodo);
        return newTodo;
    }

    public static Todo[] expandArr(Todo[] tArr, Todo todo){
        int offSet = todoArr.length;
        Todo [] tempArr = Arrays.copyOf(tArr,offSet + 1);
        for (int i = offSet; i < offSet+1 ; i++) {
            tempArr[i] = todo;
        }
        return tempArr;
    }

    public void clear(){
        Todo[] tempArr = new Todo[0];
        todoArr = tempArr;
    }



}
