package berry.command;

import berry.exception.BerryException;
import berry.exception.IndexOutOfRangeException;
import berry.storage.Storage;
import berry.task.TaskList;
import berry.ui.Ui;

/**
 * Unmarks the task as done as identified by its last displayed index from the task list.
 */
public class UnmarkCommand extends Command {

    /** The index of the task to be unmarked */
    private static int taskIndex;

    public UnmarkCommand(int taskIndex) {
        this.taskIndex = taskIndex;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) throws BerryException {
        String output = "";
        if (tasks.isIndexWithinRange(taskIndex)) {
            output += ui.showUnmark() + tasks.markTaskNotDone(taskIndex);
        } else {
            throw new IndexOutOfRangeException();
        }
        storage.saveTasks(tasks);
        return output;
    }
}
