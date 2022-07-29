
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.torheit.hemanmod.init;

import xyz.torheit.hemanmod.item.PowerSwordItem;
import xyz.torheit.hemanmod.item.HavokStaffItem;
import xyz.torheit.hemanmod.HemanmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class HemanmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HemanmodMod.MODID);
	public static final RegistryObject<Item> CRINGER = REGISTRY.register("cringer_spawn_egg",
			() -> new ForgeSpawnEggItem(HemanmodModEntities.CRINGER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> POWER_SWORD = REGISTRY.register("power_sword", () -> new PowerSwordItem());
	public static final RegistryObject<Item> HAVOK_STAFF = REGISTRY.register("havok_staff", () -> new HavokStaffItem());
}
