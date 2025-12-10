package com.cursee.examplemod;

import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {

  @Override
  public void onInitialize() {

    // bind before init

    ExampleMod.init();
  }
}
