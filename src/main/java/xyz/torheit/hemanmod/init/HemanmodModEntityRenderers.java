
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.torheit.hemanmod.init;

import xyz.torheit.hemanmod.client.renderer.CringerRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HemanmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HemanmodModEntities.CRINGER.get(), CringerRenderer::new);
	}
}
