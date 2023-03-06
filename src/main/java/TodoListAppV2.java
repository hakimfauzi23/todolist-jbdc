import repository.TodoListRepository;
import repository.TodoListRepositoryImplementation;
import service.TodoListService;
import service.TodoListServiceImplementation;
import util.DatabaseUtil;
import view.TodoListView;

import javax.sql.DataSource;

public class TodoListAppV2 {

    public static void main(String[] args) {
        DataSource dataSource = DatabaseUtil.getDataSource();

        TodoListRepository todoListRepository = new TodoListRepositoryImplementation(dataSource);
        TodoListService todoListService = new TodoListServiceImplementation(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();

    }
}
