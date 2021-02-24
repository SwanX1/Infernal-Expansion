package com.nekomaster1000.infernalexp.init;

import com.nekomaster1000.infernalexp.InfernalExpansion;
import com.nekomaster1000.infernalexp.blocks.BlockItemBase;
import com.nekomaster1000.infernalexp.blocks.DullthornsBlockItem;
import com.nekomaster1000.infernalexp.items.AscusBombItem;
import com.nekomaster1000.infernalexp.items.GlowcoalItem;
import com.nekomaster1000.infernalexp.items.ItemBase;
//import com.nekomaster1000.infernalexp.util.ModItemTier;
import com.nekomaster1000.infernalexp.items.SlurpSoupItem;
import com.nekomaster1000.infernalexp.util.ModSpawnEggItem;
import com.nekomaster1000.infernalexp.util.RegistryHandler;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.SoupItem;
import net.minecraft.item.WallOrFloorItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class IEItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfernalExpansion.MOD_ID);

    // Items
    public static final RegistryObject<Item> GLOWCOAL = ITEMS.register("glowcoal", GlowcoalItem::new);
    public static final RegistryObject<Item> DULLROCKS = ITEMS.register("glownuggets", ItemBase::new);
    public static final RegistryObject<Item> BLINDSIGHT_TONGUE = ITEMS.register("blindsight_tongue", ItemBase::new);

    // Foods
    public static final RegistryObject<SoupItem> BLINDSIGHT_TONGUE_STEW = ITEMS.register("blindsight_tongue_stew",
            () -> new SlurpSoupItem(new Item.Properties().maxStackSize(1).group(InfernalExpansion.TAB)
                    .food(new Food.Builder().hunger(6).saturation(0.6F)
                            .effect(() ->
                                    new EffectInstance(Effects.JUMP_BOOST, 1200, 1), 1.0F)
                                            .build())));


    // Spawn Eggs
    public static final RegistryObject<ModSpawnEggItem> VOLINE_SPAWN_EGG = ITEMS.register("voline_spawn_egg", () -> new ModSpawnEggItem(IEEntityTypes.VOLINE, 0x2E2631, 0x652833, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ModSpawnEggItem> SHROOMLOIN_SPAWN_EGG = ITEMS.register("shroomloin_spawn_egg",() -> new ModSpawnEggItem(IEEntityTypes.SHROOMLOIN, 0x854242, 0xFF6500, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ModSpawnEggItem> WARPBEETLE_SPAWN_EGG = ITEMS.register("warpbeetle_spawn_egg", () -> new ModSpawnEggItem(IEEntityTypes.WARPBEETLE, 0x72EA95, 0x2D3860, new Item.Properties().group(InfernalExpansion.TAB)));
//  public static final RegistryObject<ModSpawnEggItem> CEROBEETLE_SPAWN_EGG = ITEMS.register("cerobeetle_spawn_egg",() -> new ModSpawnEggItem(ModEntityType.CEROBEETLE, 0x73EB96, 0x409089, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ModSpawnEggItem> EMBODY_SPAWN_EGG = ITEMS.register("embody_spawn_egg", () -> new ModSpawnEggItem(IEEntityTypes.EMBODY, 0x796152, 0x6DEDF1, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ModSpawnEggItem> BASALT_GIANT_SPAWN_EGG = ITEMS.register("basalt_giant_spawn_egg", () -> new ModSpawnEggItem(IEEntityTypes.BASALT_GIANT, 0x545454, 0xe36412, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ModSpawnEggItem> SKELETAL_PIGLIN_SPAWN_EGG = ITEMS.register("skeletal_piglin_spawn_egg", () -> new ModSpawnEggItem(IEEntityTypes.SKELETAL_PIGLIN, 0xCBC9C9, 0x423C3C,new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ModSpawnEggItem> GLOWSQUITO_SPAWN_EGG = ITEMS.register("glowsquito_spawn_egg", () -> new ModSpawnEggItem(IEEntityTypes.GLOWSQUITO, 0x383948, 0xe5c092, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ModSpawnEggItem> BLACKSTONE_DWARF_SPAWN_EGG = ITEMS.register ( "blackstone_dwarf_spawn_egg", () -> new ModSpawnEggItem(IEEntityTypes.BLACKSTONE_DWARF, 0x1a1a1c, 0x36313f, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ModSpawnEggItem> BLINDSIGHT_SPAWN_EGG = ITEMS.register("blindsight_spawn_egg", () -> new ModSpawnEggItem(IEEntityTypes.BLINDSIGHT, 0x312c36, 0xfbda74, new Item.Properties().group(InfernalExpansion.TAB)));
//  public static final RegistryObject<ModSpawnEggItem> PYRNO_SPAWN_EGG = ITEMS.register("pyrno_spawn_egg", () -> new ModSpawnEggItem(ModEntityType.PYRNO, 0x5D514B, 0xFEE15E, new Item.Properties().group(InfernalExpansion.TAB)));

    // Block items
    public static final RegistryObject<Item> DIMSTONE = ITEMS.register("dimstone",                                  () -> new BlockItemBase(IEBlocks.DIMSTONE.get()));
    public static final RegistryObject<Item> DULLSTONE = ITEMS.register("dullstone",                                () -> new BlockItemBase(IEBlocks.DULLSTONE.get()));
    public static final RegistryObject<Item> SMOOTH_GLOWSTONE = ITEMS.register("smooth_glowstone",                  () -> new BlockItemBase(IEBlocks.SMOOTH_GLOWSTONE.get()));
    public static final RegistryObject<Item> SMOOTH_DIMSTONE = ITEMS.register("smooth_dimstone",                    () -> new BlockItemBase(IEBlocks.SMOOTH_DIMSTONE.get()));
    public static final RegistryObject<Item> SMOOTH_DULLSTONE = ITEMS.register("smooth_dullstone",                 () -> new BlockItemBase(IEBlocks.SMOOTH_DULLSTONE.get()));
    public static final RegistryObject<Item> GLOWSTONE_BRICK = ITEMS.register("glowstone_brick",                    () -> new BlockItemBase(IEBlocks.GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> DIMSTONE_BRICK = ITEMS.register("dimstone_brick",                      () -> new BlockItemBase(IEBlocks.DIMSTONE_BRICK.get()));
    public static final RegistryObject<Item> DULLSTONE_BRICK = ITEMS.register("dullstone_brick",                    () -> new BlockItemBase(IEBlocks.DULLSTONE_BRICK.get()));
    public static final RegistryObject<Item> CRACKED_GLOWSTONE_BRICK = ITEMS.register("cracked_glowstone_brick",    () -> new BlockItemBase(IEBlocks.CRACKED_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> CRACKED_DIMSTONE_BRICK = ITEMS.register("cracked_dimstone_brick",      () -> new BlockItemBase(IEBlocks.CRACKED_DIMSTONE_BRICK.get()));
    public static final RegistryObject<Item> CRACKED_DULLSTONE_BRICK = ITEMS.register("cracked_dullstone_brick",    () -> new BlockItemBase(IEBlocks.CRACKED_DULLSTONE_BRICK.get()));
    public static final RegistryObject<Item> CHISELED_GLOWSTONE_BRICK = ITEMS.register("chiseled_glowstone_brick",  () -> new BlockItemBase(IEBlocks.CHISELED_GLOWSTONE_BRICK.get()));
    public static final RegistryObject<Item> CHISELED_DIMSTONE_BRICK = ITEMS.register("chiseled_dimstone_brick",    () -> new BlockItemBase(IEBlocks.CHISELED_DIMSTONE_BRICK.get()));
    public static final RegistryObject<Item> CHISELED_DULLSTONE_BRICK = ITEMS.register("chiseled_dullstone_brick",  () -> new BlockItemBase(IEBlocks.CHISELED_DULLSTONE_BRICK.get()));
    public static final RegistryObject<Item> SMOOTH_GLOWSTONE_SLAB = ITEMS.register("smooth_glowstone_slab",        () -> new BlockItemBase(IEBlocks.SMOOTH_GLOWSTONE_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_GLOWSTONE_STAIRS = ITEMS.register("smooth_glowstone_stairs",    () -> new BlockItemBase(IEBlocks.SMOOTH_GLOWSTONE_STAIRS.get()));
    public static final RegistryObject<Item> SMOOTH_DIMSTONE_SLAB = ITEMS.register("smooth_dimstone_slab",          () -> new BlockItemBase(IEBlocks.SMOOTH_DIMSTONE_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_DIMSTONE_STAIRS = ITEMS.register("smooth_dimstone_stairs",      () -> new BlockItemBase(IEBlocks.SMOOTH_DIMSTONE_STAIRS.get()));
    public static final RegistryObject<Item> SMOOTH_DULLSTONE_SLAB = ITEMS.register("smooth_dullstone_slab",        () -> new BlockItemBase(IEBlocks.SMOOTH_DULLSTONE_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_DULLSTONE_STAIRS = ITEMS.register("smooth_dullstone_stairs",    () -> new BlockItemBase(IEBlocks.SMOOTH_DULLSTONE_STAIRS.get()));
    public static final RegistryObject<Item> GLOWSTONE_BRICK_SLAB = ITEMS.register("glowstone_brick_slab",          () -> new BlockItemBase(IEBlocks.GLOWSTONE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GLOWSTONE_BRICK_STAIRS = ITEMS.register("glowstone_brick_stairs",      () -> new BlockItemBase(IEBlocks.GLOWSTONE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> DIMSTONE_BRICK_SLAB = ITEMS.register("dimstone_brick_slab",            () -> new BlockItemBase(IEBlocks.DIMSTONE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> DIMSTONE_BRICK_STAIRS = ITEMS.register("dimstone_brick_stairs",        () -> new BlockItemBase(IEBlocks.DIMSTONE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> DULLSTONE_BRICK_SLAB = ITEMS.register("dullstone_brick_slab",          () -> new BlockItemBase(IEBlocks.DULLSTONE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> DULLSTONE_BRICK_STAIRS = ITEMS.register("dullstone_brick_stairs",      () -> new BlockItemBase(IEBlocks.DULLSTONE_BRICK_STAIRS.get()));

    public static final RegistryObject<Item> GLOWDUST = ITEMS.register("glowdust",                  () -> new BlockItemBase(IEBlocks.GLOWDUST.get()));
    public static final RegistryObject<Item> GLOWDUST_SAND = ITEMS.register("glowdust_sand",            () -> new BlockItemBase(IEBlocks.GLOWDUST_SAND.get()));
    public static final RegistryObject<Item> LUMINOUS_WART_BLOCK = ITEMS.register("luminous_wart_block",            () -> new BlockItemBase(IEBlocks.LUMINOUS_WART_BLOCK.get()));
    public static final RegistryObject<Item> GLOWDUST_STONE = ITEMS.register("glowdust_stone",              () -> new BlockItemBase(IEBlocks.GLOWDUST_STONE.get()));
    public static final RegistryObject<Item> GLOWDUST_STONE_BRICKS = ITEMS.register("glowdust_stone_bricks",    () -> new BlockItemBase(IEBlocks.GLOWDUST_STONE_BRICKS.get()));
    public static final RegistryObject<Item> GLOWDUST_STONE_BRICK_SLAB = ITEMS.register("glowdust_stone_brick_slab",        () -> new BlockItemBase(IEBlocks.GLOWDUST_STONE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GLOWDUST_STONE_BRICK_STAIRS = ITEMS.register("glowdust_stone_brick_stairs",    () -> new BlockItemBase(IEBlocks.GLOWDUST_STONE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> TRAPPED_GLOWDUST_SAND = ITEMS.register("trapped_glowdust_sand",        () -> new BlockItemBase(IEBlocks.TRAPPED_GLOWDUST_SAND.get()));
    public static final RegistryObject<Item> GLOWDUST_SANDSTONE = ITEMS.register("glowdust_sandstone",                  () -> new BlockItemBase(IEBlocks.GLOWDUST_SANDSTONE.get()));
    public static final RegistryObject<Item> CUT_GLOWDUST_SANDSTONE = ITEMS.register("cut_glowdust_sandstone",              () -> new BlockItemBase(IEBlocks.CUT_GLOWDUST_SANDSTONE.get()));
    public static final RegistryObject<Item> CHISELED_GLOWDUST_SANDSTONE = ITEMS.register("chiseled_glowdust_sandstone",        () -> new BlockItemBase(IEBlocks.CHISELED_GLOWDUST_SANDSTONE.get()));
    public static final RegistryObject<Item> SMOOTH_GLOWDUST_SANDSTONE = ITEMS.register("smooth_glowdust_sandstone",                () -> new BlockItemBase(IEBlocks.SMOOTH_GLOWDUST_SANDSTONE.get()));
    public static final RegistryObject<Item> GLOWDUST_SANDSTONE_SLAB = ITEMS.register("glowdust_sandstone_slab",                    () -> new BlockItemBase(IEBlocks.GLOWDUST_SANDSTONE_SLAB.get()));
    public static final RegistryObject<Item> GLOWDUST_SANDSTONE_STAIRS = ITEMS.register("glowdust_sandstone_stairs",                () -> new BlockItemBase(IEBlocks.GLOWDUST_SANDSTONE_STAIRS.get()));
    public static final RegistryObject<Item> CUT_GLOWDUST_SANDSTONE_SLAB = ITEMS.register("cut_glowdust_sandstone_slab",            () -> new BlockItemBase(IEBlocks.CUT_GLOWDUST_SANDSTONE_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_GLOWDUST_SANDSTONE_SLAB = ITEMS.register("smooth_glowdust_sandstone_slab",      () -> new BlockItemBase(IEBlocks.SMOOTH_GLOWDUST_SANDSTONE_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_GLOWDUST_SANDSTONE_STAIRS = ITEMS.register("smooth_glowdust_sandstone_stairs",  () -> new BlockItemBase(IEBlocks.SMOOTH_GLOWDUST_SANDSTONE_STAIRS.get()));
    public static final RegistryObject<Item> GLOWDUST_SANDSTONE_WALL = ITEMS.register("glowdust_sandstone_wall",                    () -> new BlockItemBase(IEBlocks.GLOWDUST_SANDSTONE_WALL.get()));

    public static final RegistryObject<Item> CRUMBLING_BLACKSTONE = ITEMS.register("crumbling_blackstone",  () -> new BlockItemBase(IEBlocks.CRUMBLING_BLACKSTONE.get()));
    public static final RegistryObject<Item> GLIMMERING_BLACKSTONE = ITEMS.register("glimmering_blackstone", () -> new BlockItemBase(IEBlocks.GLIMMERING_BLACKSTONE.get()));
    public static final RegistryObject<Item> SILT = ITEMS.register("silt", () -> new BlockItemBase(IEBlocks.SILT.get()));
    public static final RegistryObject<Item> RUBBLE = ITEMS.register("rubble", () -> new BlockItemBase(IEBlocks.RUBBLE.get()));

    public static final RegistryObject<Item> BASALT_IRON_ORE = ITEMS.register("basalt_iron_ore", () -> new BlockItemBase(IEBlocks.BASALT_IRON_ORE.get()));

    public static final RegistryObject<Item> CRIMSON_FUNGUS_CAP = ITEMS.register("crimson_fungus_cap",  () -> new BlockItemBase(IEBlocks.CRIMSON_FUNGUS_CAP.get()));
    public static final RegistryObject<Item> WARPED_FUNGUS_CAP = ITEMS.register("warped_fungus_cap",    () -> new BlockItemBase(IEBlocks.WARPED_FUNGUS_CAP.get()));
    public static final RegistryObject<Item> LUMINOUS_FUNGUS_CAP = ITEMS.register("luminous_fungus_cap",    () -> new BlockItemBase(IEBlocks.LUMINOUS_FUNGUS_CAP.get()));

    public static final RegistryObject<Item> GLOW_LANTERN = ITEMS.register("lantern_glow",      () -> new BlockItemBase(IEBlocks.GLOW_LANTERN.get()));
    public static final RegistryObject<Item> GLOW_TORCH = ITEMS.register("torch_glow",          () -> new WallOrFloorItem(IEBlocks.GLOW_TORCH.get(), IEBlocks.GLOW_WALL_TORCH.get(), (new Item.Properties()).group(InfernalExpansion.TAB)));
    public static final RegistryObject<Item> GLOW_CAMPFIRE = ITEMS.register("campfire_glow",    () -> new BlockItemBase(IEBlocks.GLOW_CAMPFIRE.get()));

    public static final RegistryObject<Item> SHROOMLIGHT_FUNGUS = ITEMS.register("shroomlight_fungus",      () -> new BlockItemBase(IEBlocks.SHROOMLIGHT_FUNGUS.get()));
    public static final RegistryObject<Item> LUMINOUS_FUNGUS = ITEMS.register("luminous_fungus",    () -> new BlockItemBase(IEBlocks.LUMINOUS_FUNGUS.get()));

    public static final RegistryObject<Item> DULLTHORNS = ITEMS.register("dullthorns",              () -> new DullthornsBlockItem(IEBlocks.DULLTHORNS.get()));
    public static final RegistryObject<Item> DULLTHORNS_BLOCK = ITEMS.register("dullthorns_block",  () -> new BlockItemBase(IEBlocks.DULLTHORNS_BLOCK.get()));

    public static final RegistryObject<Item> ASCUS_BOMB = ITEMS.register("ascus_bomb", AscusBombItem::new);

    // Record Discs
    public static final RegistryObject<Item> MUSIC_DISC_SOUL_SPUNK = ITEMS.register("music_disc_soul_spunk", () -> new MusicDiscItem(8, () -> RegistryHandler.MUSIC_DISC_SOUL_SPUNK, new Item.Properties().group(InfernalExpansion.TAB).rarity(Rarity.RARE).maxStackSize(1)));

    public static final RegistryObject<Item> SOUL_BERRIES = ITEMS.register("soul_berries", () -> new BlockNamedItem(IEBlocks.SOUL_BERRY_BUSH.get(), new Item.Properties().group(InfernalExpansion.TAB).food(new Food.Builder().hunger(2).saturation(0.1F).build())));
    /*
    // Tools
    public static final RegistryObject<SwordItem> FROSTBITTEN_SWORD = ITEMS.register("frostbitten_sword", () -> new SwordItem(ModItemTier.FROSTBITTEN_NETHERITE, 2, -2.4F, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<PickaxeItem> FROSTBITTEN_PICKAXE = ITEMS.register("frostbitten_pickaxe", () -> new PickaxeItem(ModItemTier.FROSTBITTEN_NETHERITE, 1, -2.4F, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<AxeItem> FROSTBITTEN_AXE = ITEMS.register("frostbitten_axe", () -> new AxeItem(ModItemTier.FROSTBITTEN_NETHERITE, 4, -3.1F, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ShovelItem> FROSTBITTEN_SHOVEL = ITEMS.register("frostbitten_shovel", () -> new ShovelItem(ModItemTier.FROSTBITTEN_NETHERITE, -1, -2.4F, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<HoeItem> FROSTBITTEN_HOE = ITEMS.register("frostbitten_hoe", () -> new HoeItem(ModItemTier.FROSTBITTEN_NETHERITE, -2, -1.0F, new Item.Properties().group(InfernalExpansion.TAB)));

 */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        InfernalExpansion.LOGGER.info("Infernal Expansion: Items Registered!");
    }

}
