package fergoman123.mods.fergotools.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import fergoman123.mods.fergotools.client.settings.KeyBindings;
import fergoman123.mods.fergotools.helper.LogHelper;
import fergoman123.mods.fergotools.reference.Key;
import fergoman123.mods.fergoutil.util.DelayedGuiDisplay;

public class EventHandler
{
    public static final class OnPlayerLoggedInEvent
    {
        @SubscribeEvent
        public void onPlayerLoggedIn(PlayerLoggedInEvent evt)
        {
            LogHelper.info(evt.player.getDisplayName() + " has Logged In!!");
            LogHelper.info("FergoTools Successfully Added Into Game");
        }
    }

    public static final class OnKeyPressedEvent
    {
        private static Key getPressedKeyBinding()
        {
            if (KeyBindings.ftConfig.isPressed())
            {
                return Key.PRESSED;
            }
            return Key.UNKNOWN;
        }

        @SubscribeEvent
        public void handleKeyInput(KeyInputEvent evt)
        {
            LogHelper.info(getPressedKeyBinding());
        }
    }
}
