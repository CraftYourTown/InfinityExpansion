package me.mooy1.infinityexpansion.Materials;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mooy1.infinityexpansion.Items;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.annotation.Nonnull;

public class MachineMaterials extends SlimefunItem{

    private final Material material;

    public MachineMaterials(Material material) {
        super(Items.MOOYMACHINES, material.getItem(), RecipeType.ENHANCED_CRAFTING_TABLE, material.getRecipe());
        this.material = material;
    }

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum Material {

        PLATE(Items.MACHINE_PLATE, new ItemStack[] {
                SlimefunItems.STEEL_PLATE, SlimefunItems.REINFORCED_PLATE, SlimefunItems.STEEL_PLATE,
                SlimefunItems.REINFORCED_PLATE, Items.MAGNONIUM_INGOT, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.STEEL_PLATE, SlimefunItems.REINFORCED_PLATE, SlimefunItems.STEEL_PLATE
        }),
        CIRCUIT(Items.MACHINE_CIRCUIT, new ItemStack[] {
                SlimefunItems.COPPER_INGOT, SlimefunItems.GOLD_24K, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.GOLD_24K, SlimefunItems.COPPER_INGOT
        }),
        CORE(Items.MACHINE_CORE, new ItemStack[] {
                SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_PLATE,
                Items.MACHINE_CIRCUIT, new ItemStack(org.bukkit.Material.IRON_BLOCK), Items.MACHINE_CIRCUIT,
                SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_PLATE
        }),
        ICIRCUIT(Items.INFINITE_MACHINE_CIRCUIT, new ItemStack[] {
                Items.INFINITY_INGOT, Items.MAGNONIUM_INGOT, Items.INFINITY_INGOT,
                Items.INFINITY_INGOT, Items.MACHINE_CIRCUIT, Items.INFINITY_INGOT,
                Items.INFINITY_INGOT, Items.MAGNONIUM_INGOT, Items.INFINITY_INGOT
        }),
        ICORE(Items.INFINITE_MACHINE_CORE, new ItemStack[] {
                Items.MACHINE_PLATE, new ItemStack(org.bukkit.Material.NETHER_STAR), Items.MACHINE_PLATE,
                Items.INFINITE_MACHINE_CIRCUIT, Items.MACHINE_CORE, Items.INFINITE_MACHINE_CIRCUIT,
                Items.MACHINE_PLATE, new ItemStack(org.bukkit.Material.NETHER_STAR), Items.MACHINE_PLATE
        });

        @Nonnull
        private final SlimefunItemStack item;
        private final ItemStack[] recipe;
    }
}