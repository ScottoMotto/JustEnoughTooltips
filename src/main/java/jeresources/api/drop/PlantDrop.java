package jeresources.api.drop;

import net.minecraft.item.ItemStack;

public class PlantDrop
{
	private final ItemStack drop;
	private int itemWeight;
	private int minDrop, maxDrop;
	private float chance;
	private final DropKind dropKind;

	public enum DropKind
	{
		chance, weight, minMax
	}

	/**
	 * DON'T USE!
	 * This constructor is meant for registering grass
	 * Which get auto collected by NER
	 *
	 * @param drop       the The drop an {@link net.minecraft.item.ItemStack}
	 * @param itemWeight The Weight of the drop
	 */
	public PlantDrop(final ItemStack drop, final int itemWeight)
	{
		this.drop = drop;
		this.itemWeight = itemWeight;
		this.dropKind = DropKind.weight;
	}

	/**
	 * Use this for registering seeds that have a chance less then one to drop
	 *
	 * @param drop   The drop an {@link net.minecraft.item.ItemStack}
	 * @param chance the chance as float
	 */
	public PlantDrop(final ItemStack drop, final float chance)
	{
		this.drop = drop;
		this.chance = chance;
		this.dropKind = DropKind.chance;
	}

	/**
	 * Use this for registering seeds that have a chance of dropping more then one time
	 *
	 * @param drop    The drop an {@link net.minecraft.item.ItemStack}
	 * @param minDrop minimum of seeds dropped
	 * @param maxDrop maximum of seeds dropped
	 */
	public PlantDrop(final ItemStack drop, final int minDrop, final int maxDrop)
	{
		this.drop = drop;
		this.minDrop = minDrop;
		this.maxDrop = maxDrop;
		this.dropKind = DropKind.minMax;
	}

	public ItemStack getDrop()
	{
		return this.drop;
	}

	public int getWeight()
	{
		return this.itemWeight;
	}

	public int getMinDrop()
	{
		return this.minDrop;
	}

	public int getMaxDrop()
	{
		return this.maxDrop;
	}

	public float getChance()
	{
		return this.chance;
	}

	public DropKind getDropKind()
	{
		return this.dropKind;
	}
}
