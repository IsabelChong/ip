package berry.command;

import berry.exception.BerryException;
import berry.exception.IndexOutOfRangeException;
import berry.storage.Storage;
import berry.task.TaskList;
import berry.ui.Ui;

/**
 * Deletes a task identified by its last displayed index from the task list.
 */
public class DeleteCommand extends Command {

    /** The index of the task to be deleted */
    private static int taskIndex;

    public DeleteCommand(int taskIndex) {
        this.taskIndex = taskIndex;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) throws BerryException {
        assert tasks != null : "Tasks should not be null";
        assert ui != null : "Ui should not be null";
        assert storage != null : "Storage should not be null";

        String output = "";
        if (tasks.isIndexWithinRange(taskIndex)) {
            output += ui.showDelete();
            output += tasks.deleteTask(taskIndex);
        } else {
            throw new IndexOutOfRangeException();
        }
        storage.saveTasks(tasks);
        return output;
    }
}
