package fergoman123.mods.fergotools.item;

import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.lib.textures.BowTextures;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

import static cpw.mods.fml.relauncher.Side.CLIENT;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class Bows {

    public static class ItemQuartzBow extends ItemBow {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture = new IIcon[3];
        public ItemQuartzBow()
        {
            super();
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public int getEnchantability()
        {
            return 1;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(BowTextures.quartzBowStandy);
            this.texture = new IIcon[pullArray.length];

            this.texture[0] = register.registerIcon(BowTextures.quartzBowPull1);
            this.texture[1] = register.registerIcon(BowTextures.quartzBowPull2);
            this.texture[2] = register.registerIcon(BowTextures.quartzBowPull3);
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

    }

    public static class ItemObsidianBow extends ItemBow {

        public static final String[] pullArray = new String [] {"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture = new IIcon[3];


        public ItemObsidianBow()
        {
            super();
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public int getEnchantability()
        {
            return 1;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(BowTextures.obsidianBowStandy);
            this.texture = new IIcon[pullArray.length];

            this.texture[0] = register.registerIcon(BowTextures.obsidianBowPull1);
            this.texture[1] = register.registerIcon(BowTextures.obsidianBowPull2);
            this.texture[2] = register.registerIcon(BowTextures.obsidianBowPull3);
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

    }

    public static class ItemEmeraldBow extends ItemBow {

        public static final String[] pullArray = new String[] {"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture = new IIcon[3];

        public ItemEmeraldBow()
        {
            super();
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public int getEnchantability()
        {
            return 1;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(BowTextures.emeraldBowStandy);
            this.texture = new IIcon[pullArray.length];

            this.texture[0] = register.registerIcon(BowTextures.emeraldBowPull1);
            this.texture[1] = register.registerIcon(BowTextures.emeraldBowPull2);
            this.texture[2] = register.registerIcon(BowTextures.emeraldBowPull3);
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

    }

    public static class ItemLapisBow extends ItemBow {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture;
        public ItemLapisBow()
        {
            super();
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public int getEnchantability()
        {
            return 1;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(BowTextures.lapisBowStandy);
            this.texture = new IIcon[pullArray.length];

            this.texture[0] = register.registerIcon(BowTextures.lapisBowPull1);
            this.texture[1] = register.registerIcon(BowTextures.lapisBowPull2);
            this.texture[2] = register.registerIcon(BowTextures.lapisBowPull3);
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

    }

    public static class ItemBronzeBow extends ItemBow {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture = new IIcon[3];
        public ItemBronzeBow()
        {
            super();
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public int getEnchantability()
        {
            return 1;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(BowTextures.bronzeBowStandy);
            this.texture = new IIcon[pullArray.length];

            this.texture[0] = register.registerIcon(BowTextures.bronzeBowPull1);
            this.texture[1] = register.registerIcon(BowTextures.bronzeBowPull2);
            this.texture[2] = register.registerIcon(BowTextures.bronzeBowPull3);
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

    }

    public static class ItemCoalBow extends ItemBow {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture = new IIcon[3];
        public ItemCoalBow()
        {
            super();
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public int getEnchantability()
        {
            return 1;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(BowTextures.coalBowStandy);
            this.texture = new IIcon[pullArray.length];

            this.texture[0] = register.registerIcon(BowTextures.coalBowPull1);
            this.texture[1] = register.registerIcon(BowTextures.coalBowPull2);
            this.texture[2] = register.registerIcon(BowTextures.coalBowPull3);
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

    }

    public static class ItemGlowstoneBow extends ItemBow {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture = new IIcon[3];
        public ItemGlowstoneBow()
        {
            super();
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public int getEnchantability()
        {
            return 1;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(BowTextures.glowstoneBowStandy);
            this.texture = new IIcon[pullArray.length];

            this.texture[0] = register.registerIcon(BowTextures.glowstoneBowPull1);
            this.texture[1] = register.registerIcon(BowTextures.glowstoneBowPull2);
            this.texture[2] = register.registerIcon(BowTextures.glowstoneBowPull3);
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

    }

    public static class ItemAdamantiumBow extends ItemBow {

        public static final String[] pullArray = new String[]{"_1", "_2", "_3"};

        @SideOnly(CLIENT)
        private IIcon[] texture = new IIcon[3];
        public ItemAdamantiumBow()
        {
            super();
        }

        public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4)
        {
            int j = this.getMaxItemUseDuration(stack) - par4;

            ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.isCanceled())
            {
                return;
            }
            j = event.charge;

            boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

            if (flag || player.inventory.hasItem(Items.arrow))
            {
                float f = (float)j / 20.0F;
                f = (f * f + f * 2.0F) / 3.0F;

                if ((double)f < 0.1D)
                {
                    return;
                }

                if (f > 1.0F)
                {
                    f = 1.0F;
                }

                EntityArrow entityarrow = new EntityArrow(world, player, f * 2.0F);

                if (f == 1.0F)
                {
                    entityarrow.setIsCritical(true);
                }

                int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

                if (k > 0)
                {
                    entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
                }

                int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

                if (l > 0)
                {
                    entityarrow.setKnockbackStrength(l);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
                {
                    entityarrow.setFire(100);
                }

                stack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (flag)
                {
                    entityarrow.canBePickedUp = 2;
                }
                else
                {
                    player.inventory.consumeInventoryItem(Items.arrow);
                }

                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(entityarrow);
                }
            }
        }

        public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
        {
            return stack;
        }

        public int getMaxItemUseDuration(ItemStack stack)
        {
            return 72000;
        }

        public EnumAction getItemUseAction(ItemStack stack)
        {
            return EnumAction.bow;
        }

        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
        {
            ArrowNockEvent event = new ArrowNockEvent(player, stack);
            MinecraftForge.EVENT_BUS.post(event);
            if(!event.isCancelable())
            {
                return event.result;
            }

            if(player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
            {
                player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
            }
            return stack;
        }

        public int getEnchantability()
        {
            return 1;
        }

        public void registerIcons(IIconRegister register)
        {
            this.itemIcon = register.registerIcon(BowTextures.adamantiumBowStandy);
            this.texture = new IIcon[pullArray.length];

            this.texture[0] = register.registerIcon(BowTextures.adamantiumBowPull1);
            this.texture[1] = register.registerIcon(BowTextures.adamantiumBowPull2);
            this.texture[2] = register.registerIcon(BowTextures.adamantiumBowPull3);
        }

        public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
        {
            if(player.getItemInUse() == null) return this.itemIcon;
            int pulling = stack.getMaxItemUseDuration() - useRemaining;
            if(pulling >= 18)
            {
                return texture[2];
            }
            else if(pulling > 13)
            {
                return texture[1];
            }
            else if(pulling > 0)
            {
                return texture[0];
            }
            return this.itemIcon;
        }

    }


}
