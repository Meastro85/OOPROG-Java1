import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Vincent Verboven
 * 7/12/2022
 */
public class TodoList {
    private List<TodoItem> items;

    public TodoList() {
        items = new LinkedList<>();
    }

    public void addTodoItem(String description, int priority, String deadline){
        if(items.isEmpty() || items.size() < priority){
            items.add(new TodoItem(description,Priority.values()[priority],LocalDate.parse(deadline)));
        } else {
            items.add(priority, new TodoItem(description, Priority.values()[priority], LocalDate.parse(deadline)));
        }
    }

    public void toon(){
        for (TodoItem item : items) {
            System.out.println(item);
        }
    }
}
