package duke.command;

import duke.exceptions.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

abstract public class Command {

    /**
     * Executes the duke.command.
     *
     * @param tasks TaskList object.
     * @param ui Ui object.
     * @param storage Storage object.
     * @throws DukeException when duke.command fails the execution.
     */
    abstract public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;

    /**
     * Returns boolean indicator as to whether the current Command should exit the program or not.
     *
     * @return boolean indicating whether to exit the program or not.
     */
    abstract public boolean isExit();

}