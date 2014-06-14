package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.block.BlockPortalFT;
import fergoman123.mods.fergotools.handler.WorldHandler;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.util.UtilServer;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFTIgnitor extends Item {

    public static BlockPortalFT portal;

    public ItemFTIgnitor()
    {
        this.setCreativeTab(Tabs.tabFergoTools);
        this.setUnlocalizedName("ignitor");
        this.setMaxDamage(64);
        this.setMaxStackSize(1);
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ){

        if (side == 0){y--;}
        if (side == 1){y++;}
        if (side == 2){z--;}
        if (side == 3){z++;}
        if (side == 4){x--;}
        if (side == 5){x++;}

        if (!player.canPlayerEdit(x, y, z, side, stack)) {return false;}

        Block var11 = world.getBlock(x, y, z);

        if (var11 == Blocks.air){
            byte ar5 = 0;
            byte ar6 = 0;

            if ((world.getBlock(x - 1, y, z) == Blocks.stone) || (world.getBlock(x + 1, y, z) == Blocks.stone))
            {
                ar5 = 1;
            }

            if ((world.getBlock(x, y, z - 1) == Blocks.stone) || (world.getBlock(x, y, z + 1) == Blocks.stone))
            {
                ar6 = 1;
            }

            if (ar5 == ar6)
            {
                return false;
            }

            if (world.getBlock(x - ar5, y, z - ar6) == Blocks.air)
            {
                x -= ar5;
                z -= ar6;
            }

            for (int var7 = -1; var7 <= 2; var7++)
            {
                for (int var8 = -1; var8 <= 3; var8++)
                {
                    boolean var9 = (var7 == -1) || (var7 == 2) || (var8 == -1) || (var8 == 3);

                    if (((var7 != -1) && (var7 != 2)) || ((var8 != -1) && (var8 != 3))) {
                    Block var10 = world.getBlock(x + ar5 * var7, y + var8, z + ar6 * var7);

                            if (var9)
                            {
                                if (var10 != Blocks.stone)
                                {
                                    return false;
                                }
                            }
                            else if (var10 != Blocks.air)
                            {
                                return false;
                            }
                }
              }
            }

            for (int var7 = 0; var7 < 2; var7++)
            {
                for (int var8 = 0; var8 < 3; var8++)
                {
                    world.setBlock(x + ar5 * var7, y + var8, z + ar6 * var7, WorldHandler.portal, 0, 2);

            }

        if (var7 == 0) {
           stack.damageItem(1, player);
            if (!world.isRemote) {
            player.addChatMessage(UtilServer.getChatForString("Walk Through Portal"));
                }

              }

            }

        return true;
          }

      return true;
        }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }
}
