package com.cursee.examplemod;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLModContainer;

@Mod(Constants.MOD_ID)
public class ExampleModNeoForge {

  public static IEventBus eventBus;

  public ExampleModNeoForge(IEventBus eventBus, ModContainer modContainer, FMLModContainer fmlModContainer, Dist dist) {

    ExampleModNeoForge.eventBus = eventBus;

    // bind before init

    ExampleMod.init();

    if (dist == Dist.CLIENT) {
      new ExampleModClientNeoForge();
    }
  }
}