package com.thetempestsbox.ttb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class TTBMod implements ModInitializer {

  public static final Logger LOGGER = LoggerFactory.getLogger("TTB");

  @Override
  public void onInitialize() {
    LOGGER.info("Hello Minecraft!");
  }

}
