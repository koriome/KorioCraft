// Here is the groovy file for screen elements
info("Hello From 'Slight' Gui Modifications cts script")

mainMenu {
    enabled = true // Set to true to enable this module

    splashText {
        enabled = true // Set to true to enable this module
        splashesEnabled = true // Set to false to disable splashes entirely

        customSplashes {
            enabled = true // Set to true to enable this module
            // You can put either "override" or "append" here to declare how you want to provide custom splashes
            applyMode = "override"
            defineCustom(["This is a lot like Squid Games", "Subscribe to Koriome!", "you got the whole squad laughing", "RIP BOZO #PACKWATCH", "Drop a comment if you want the sack!"])
        }
    }

     background {
         clearBackgrounds() // This line removes the rotating cube
         backgroundStayLength = 10000 // This sets the length a background would stay
         backgroundFadeLength = 10000 // This sets the fade duration to another background
         renderGradientShade = false // This sets whether the slight shade should be rendered
          image {
            texture = file("config/slightguimodifications/background.png") // Remember to use forward slash to support unix!
        }
    }

    // Uncomment these to remove aspects of the title screen
     removeMinecraftLogo()
    // removeEditionBadge()

    // Clear all buttons already on screen
    // clearAllButtons()
    clearAllLabels()

    label {
        position {
            x = 2
            y { it - 22 }
        }

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("KorioCraft 1.0 // Minecraft 1.18.1")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Color of the text, default is 0xFFFFFF
        color = 0xFFFFFF
        // Whether the label has a shadow, default is false
        shadow = true
        // Mouse Hovered Color of the text, default is 0xFFFFFF
        hoveredColor = 0xFFFFFF
        // Mouse Click Function, default is nothing, here's a list of options
        onClicked = nothing()
        onClicked = url("https://www.google.com")
        onClicked = modMenu()
        onClicked = language()
        onClicked = options()
        onClicked = exit()
        onClicked = accessibility()
        onClicked = singleplayer()
        onClicked = multiplayer()
        onClicked = realms()
        onClicked = reloadCts()
    }

    label {
        position {
            x { it - 2 }
            y { it - 22 }
        }

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Click here for more!")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "right"
        // Color of the text, default is 0xFFFFFF
        color = 0xFFFFFF
        // Whether the label has a shadow, default is false
        shadow = true
        // Mouse Hovered Color of the text, default is 0xFFFFFF
        hoveredColor = 0xFFD1D3
        // Mouse Click Function, default is nothing, here's a list of options
        onClicked = url("https://korio.me")
    }

}