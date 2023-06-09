package todo.tasks.user.service;

import org.springframework.stereotype.Service;
import todo.tasks.user.controller.model.ToDoInput;
import todo.tasks.user.repository.ToDoRepository;
import todo.tasks.user.repository.model.ToDo;
import todo.tasks.user.repository.model.ToDoStatus;

import java.util.List;

@Service
public class ToDoService
{

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository)
    {
        this.toDoRepository = toDoRepository;
    }

    public void createToDo(ToDoInput toDoInput)
    {
        toDoRepository.createToDo(toDoInput.userId(), toDoInput.name(), toDoInput.summary(), toDoInput.status());
    }

    public void updateToDoStatus(int id, ToDoStatus status)
    {
        toDoRepository.updateToDoStatus(id, status);
    }

    public List<ToDo> getUserToDos(int userId)
    {
        return toDoRepository.getUserToDos(userId);
    }

    public void deleteToDo(int id)
    {
        toDoRepository.deleteToDo(id);
    }

    public void updateToDo(int id, ToDoInput toDoInput)
    {
        toDoRepository.updateToDo(id, toDoInput.userId(), toDoInput.name(), toDoInput.summary(), toDoInput.status());
    }
}
