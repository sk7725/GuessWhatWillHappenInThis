package fr.anatom3000.gwwhit.materials.silo;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SiloArmorMaterial implements ArmorMaterial {
    public static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    public static final int[] PROTECTION_VALUES = new int[]{1, 2, 3, 1};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 104;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 7;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(SiloRoot.SILO);
    }

    @Override
    public String getName() {
        return "silo";
    }

    @Override
    public float getToughness() {
        return 1.8891061737132837f;
    }

    @Override
    public float getKnockbackResistance() {
        return 2.646901954565927f;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }
}