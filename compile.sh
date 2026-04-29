#!/bin/bash
# Compile VivaWebsite.java with JavaFX modules

JAVAFX_PATH="/usr/share/openjfx/lib"

javac --module-path "$JAVAFX_PATH" \
      --add-modules javafx.controls,javafx.graphics \
      VivaWebsite.java

echo "✓ Compilation successful! Run with: ./run.sh"
