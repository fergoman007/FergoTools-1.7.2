package fergoman123.mods.fergotools.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class CraftingMaterials {

    public static class ItemObsidianIngot extends Item
    {
        public ItemObsidianIngot()
        {
            super();
        }
    }

    public static class ItemEmeraldCrystal extends Item
    {
        public ItemEmeraldCrystal()
        {
            super();
        }
    }

    public static class ItemLapisCrystal extends Item
    {
        public ItemLapisCrystal()
        {
            super();
        }
    }

    public static class ItemBronzeIngot extends Item
    {
        public ItemBronzeIngot()
        {
            super();
        }
    }

    public static class ItemCoalIngot extends Item{
        public ItemCoalIngot()
        {
            super();
        }
    }

    public static class ItemGlowstoneIngot extends Item{
        public ItemGlowstoneIngot()
        {
            super();
        }
    }

    public static class ItemAdamantiumIngot extends Item{
        public ItemAdamantiumIngot() {
            super();
        }
    }

        public static class ItemExpShard extends Item {
            public ItemExpShard() {
                super();
            }

            public boolean hasEffect(ItemStack stack, int pass)
            {
                return true;
            }
        }

        public static class ItemSilkGem extends Item{
            public ItemSilkGem()
            {
                super();
            }
        }
}
