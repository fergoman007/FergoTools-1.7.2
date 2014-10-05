package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.Materials;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorCoal extends ItemArmorFT {

    public ItemArmorCoal(ArmorType type)
    {
        super(ArmorNames.coal, Materials.Armor.coalArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.coalHelmet || stack.getItem() == ModItems.coalChestplate || stack.getItem() == ModItems.coalBoots)
        {
            return Textures.coalArmorLayer1;
        }

        if(stack.getItem() == ModItems.coalLeggings)
        {
            return Textures.coalArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.reductAmount));
            for (int i = 0; i < Names.ArmorTooltipLocale.coalArmor.length; i++)
            {
                list.add(NameHelper.translateToLocal(Names.ArmorTooltipLocale.coalArmor[i]));
            }
        }
        else
        {
            list.add(NameHelper.translateToLocal(Names.Locale.holdShiftMessage));
        }
    }
}