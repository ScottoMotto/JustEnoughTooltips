package jeresources.api.render;

import net.minecraft.entity.EntityLivingBase;

public interface IMobRenderHook<T extends EntityLivingBase>
{
	class RenderInfo
	{
		public int x, y;
		public float scale, yaw, pitch;

		public RenderInfo(final int x, final int y, final float scale, final float yaw, final float pitch)
		{
			this.x = x;
			this.y = y;
			this.scale = scale;
			this.yaw = yaw;
			this.pitch = pitch;
		}
	}

	/**
	 * This method will be called up drawing mobs in the view
	 *
	 * @param renderInfo contains info about the current render context see {@link RenderInfo}
	 * @param entity the entity that will be rendered
	 * @return the given {@link RenderInfo} with possible changes
	 */
	RenderInfo transform(RenderInfo renderInfo, T entity);
}
