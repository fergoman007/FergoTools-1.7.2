package fergoman123.mods.fergotools.command;

import fergoman123.mods.fergotools.client.FTGuiConfig;
import fergoman123.mods.fergoutil.command.FergoCommand;
import fergoman123.mods.fergoutil.util.DelayedGuiDisplay;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class CommandFergoTools extends FergoCommand
{

    @Override
    public String getCommandName() {
        return "ftconfig";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "commands.FergoTools:ftconfig.usage";
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 1;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] stringArray)
    {

    }

    @Override
    public int compareTo(Object object)
    {
        if (object instanceof CommandBase)
        {
            return this.getCommandName().compareTo(((CommandBase) object).getCommandName());
        }
        return 0;
    }
}
