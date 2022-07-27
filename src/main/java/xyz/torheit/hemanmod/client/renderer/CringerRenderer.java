
package xyz.torheit.hemanmod.client.renderer;

import xyz.torheit.hemanmod.entity.CringerEntity;
import xyz.torheit.hemanmod.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CringerRenderer extends MobRenderer<CringerEntity, Modelcustom_model<CringerEntity>> {
	public CringerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CringerEntity entity) {
		return new ResourceLocation("hemanmod:textures/cringer.png");
	}
}
