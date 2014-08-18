package fergoman123.mods.fergotools.command;

import net.minecraft.command.ICommand;

import java.util.LinkedList;
import java.util.List;

public class FergoCommands
{
    public static List<ICommand> commands;

    public static void registerCommand(ICommand command)
    {
        if (commands == null)
        {
            commands = new LinkedList();
        }
        commands.add(command);
    }
}
