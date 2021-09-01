package duke.command;

import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

public class ListCommand extends Command {
    private static final String MESSAGE_LIST = "Here is the list of your tasks: ";

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        String message = MESSAGE_LIST + "\n" + tasks.toString();
        ui.print(message);
    }

    @Override
    public boolean isExit() {
        return false;
    }

}
