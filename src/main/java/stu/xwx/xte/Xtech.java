package stu.xwx.xte;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class Xtech implements ModInitializer {
	//方块注册
		//矿石
		public static final XOre ORE_LEAD_ZINC = new XOre(FabricBlockSettings.of(Material.METAL).hardness(4.0f));//铅锌矿石，石头类型（镐子才能击碎）
		public static final XOre ORE_MALACHITE = new XOre(FabricBlockSettings.of(Material.METAL).hardness(3.0f));//孔雀石矿石
		public static final XOre ORE_AZURITE = new XOre(FabricBlockSettings.of(Material.METAL).hardness(1.0f));//蓝铜矿石
		public static final XOre ORE_COBALT = new XOre(FabricBlockSettings.of(Material.METAL).hardness(4.0f));//钴矿石
	//物品组
		public static final ItemGroup GROUP_ORES = FabricItemGroupBuilder.create( //创建xtebasic:ores ， 矿石物品组
				new Identifier("xtebasic", "ores"))
				.icon(() -> new ItemStack(ORE_LEAD_ZINC))
				.build();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		//注册矿物
		//注册铅锌矿
		Registry.register(Registry.BLOCK, new Identifier("xtebasic", "ore_lead_zinc"), ORE_LEAD_ZINC);//方块
		Registry.register(Registry.ITEM, new Identifier("xtebasic", "ore_lead_zinc"), new BlockItem(ORE_LEAD_ZINC, new Item.Settings().group(GROUP_ORES)));//物品(放进ores物品组)
		//注册孔雀石矿石
		Registry.register(Registry.BLOCK, new Identifier("xtebasic", "ore_malachite"), ORE_MALACHITE);//方块
		Registry.register(Registry.ITEM, new Identifier("xtebasic", "ore_malachite"), new BlockItem(ORE_MALACHITE, new Item.Settings().group(GROUP_ORES)));//物品(放进ores物品组)
		//注册蓝铜矿石
		Registry.register(Registry.BLOCK, new Identifier("xtebasic", "ore_azurite"), ORE_AZURITE);//方块
		Registry.register(Registry.ITEM, new Identifier("xtebasic", "ore_azurite"), new BlockItem(ORE_AZURITE, new Item.Settings().group(GROUP_ORES)));//物品(放进ores物品组)
		//注册钴矿石
		Registry.register(Registry.BLOCK, new Identifier("xtebasic", "ore_cobalt"), ORE_COBALT);//方块
		Registry.register(Registry.ITEM, new Identifier("xtebasic", "ore_cobalt"), new BlockItem(ORE_COBALT, new Item.Settings().group(GROUP_ORES)));//物品(放进ores物品组)
		System.out.println("Thanks for playing xtech mod!");
	}
	
}
