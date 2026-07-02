package de.avtest.testaufgabe.juniortask.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/copyright")
public class CopyrightController {

  String gameName = " _____ _        _____             _____           \n" +
    "/__   (_) ___  /__   \\__ _  ___  /__   \\___   ___ \n" +
    "  / /\\/ |/ __|   / /\\/ _` |/ __|   / /\\/ _ \\ / _ \\\n" +
    " / /  | | (__   / / | (_| | (__   / / | (_) |  __/\n" +
    " \\/   |_|\\___|  \\/   \\__,_|\\___|  \\/   \\___/ \\___|\n" +
    "                                                  \n";
  String avTest = """
__________         .____                  
\\______   \\___.__. |    |    __ _____  ___
 |    |  _<   |  | |    |   |  |  \\  \\/  /
 |    |   \\\\___  | |    |___|  |  />    <
 |______  // ____| |_______ \\____//__/\\_ \\
        \\/ \\/              \\/           \\/
""";


  @GetMapping(produces = "text/plain")
  public String getCopyright() {
    return gameName + avTest;
  }

}
