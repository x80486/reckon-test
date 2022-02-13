package org.acme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  public static void main(final String... args) {
    LOGGER.info("Starting application...");
    LOGGER.debug("{}", new Application().greet());
    LOGGER.info("Exiting application...");
  }

  public String greet() {
    return "Hello, world!";
  }
}
