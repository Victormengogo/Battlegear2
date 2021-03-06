package mods.battlegear2.common.inventory;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.battlegear2.common.utils.BattlegearConfig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StringTranslate;

public class CreativeTabMB_B_2 extends CreativeTabs{

	ItemStack stack = null;
	
	public CreativeTabMB_B_2(String label) {
		super(label);
	}
	@SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return StringTranslate.getInstance().translateKey("name.title");
    }
	@Override
	public ItemStack getIconItemStack() {
		if(stack == null){
			stack = new ItemStack(BattlegearConfig.heradricItem);
		}
		return stack;
	}
	

}
