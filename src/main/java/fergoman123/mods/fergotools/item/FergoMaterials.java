package fergoman123.mods.fergotools.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.lib.Strings.ItemStrings;
import fergoman123.mods.fergotools.tabs.Tabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

/**
 * Created by Fergoman123 on 04/05/2014.
 */
public class FergoMaterials extends Item{


    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public FergoMaterials()
    {
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName("ft");
        this.setCreativeTab(Tabs.tabFergoItems);
    }

    @SuppressWarnings({"unchecked"})
    public boolean hasEffect(ItemStack stack, int pass)
    {
        return stack.getItemDamage() > 6 && stack.getItemDamage() < 8;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIconFromDamage(int par1)
    {
        int j = MathHelper.clamp_int(par1, 0, ItemStrings.materials.length - 1);
        return this.icons[j];
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        int i = MathHelper.clamp_int(stack.getItemDamage(), 0, ItemStrings.materials.length - 1);
        return super.getUnlocalizedName() + "." + ItemStrings.materials[i];
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < ItemStrings.materials.length; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public void registerIcons(IIconRegister register)
    {
        this.icons = new IIcon[ItemStrings.materials.length];

        for (int i = 0; i < ItemStrings.materials.length; ++i)
        {
            this.icons[i] = register.registerIcon(Reference.textureLoc + ItemStrings.materials[i]);
        }
    }
}
