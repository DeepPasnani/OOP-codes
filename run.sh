#!/bin/bash
# Run VivaWebsite JavaFX application

JAVAFX_PATH="/usr/share/openjfx/lib"

# Check if running in headless environment (no display)
if [ -z "$DISPLAY" ]; then
    echo "Running in headless mode. Starting virtual display with Xvfb..."
    # Start Xvfb on display :99 in background
    Xvfb :99 -screen 0 1024x768x24 > /dev/null 2>&1 &
    XVFB_PID=$!
    export DISPLAY=:99
    sleep 2  # Give Xvfb time to start
fi

# Run JavaFX app with software rendering for headless environments
java --module-path "$JAVAFX_PATH" \
     --add-modules javafx.controls,javafx.graphics \
     -Djavafx.graphics.debug=true \
     -Dprism.order=sw \
     VivaWebsite

# Cleanup Xvfb if we started it
if [ ! -z "$XVFB_PID" ]; then
    kill $XVFB_PID 2>/dev/null || true
fi
