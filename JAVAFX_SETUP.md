# VivaWebsite JavaFX Application - Setup & Troubleshooting

## Quick Start

### 1. **Compile** (Works in any environment)
```bash
./compile.sh
```
✓ This successfully compiles your JavaFX code.

### 2. **Run** (Requires display server)
```bash
./run.sh
```

---

## Runtime Environment Requirements

JavaFX is a **graphical framework** that requires:
- A display server (X11, Wayland, Windows, macOS display)
- Hardware graphics support or software rendering backend
- Native glass libraries for your OS

### Current Environment Status
- ✓ **Compilation**: Works perfectly
- ✗ **GUI Execution**: Fails (no display server + missing native libraries)

---

## Solutions

### **Option 1: Run on Your Local Machine** (RECOMMENDED)
This is the easiest solution:

1. Copy `VivaWebsite.java` to your local machine
2. Install Java 21+ and JavaFX SDK
3. Compile and run with the module-path flags:

```bash
# On Windows/Mac/Linux with display:
javac --module-path /path/to/javafx-sdk/lib \
      --add-modules javafx.controls,javafx.graphics \
      VivaWebsite.java

java --module-path /path/to/javafx-sdk/lib \
     --add-modules javafx.controls,javafx.graphics \
     VivaWebsite
```

### **Option 2: Use Remote Display** (For this container)
Connect to a remote X11 display:

```bash
export DISPLAY=your.remote.display:0
./run.sh
```

### **Option 3: Run in VS Code Dev Container with GUI**
Extend the `.devcontainer/devcontainer.json` to forward X11:

```json
{
  "forwardPorts": [],
  "features": {
    "ghcr.io/devcontainers/features/desktop-lite:1": {}
  },
  "mounts": [
    "source=/tmp/.X11-unix,target=/tmp/.X11-unix,type=bind"
  ],
  "remoteEnv": {
    "DISPLAY": ":1"
  }
}
```

Then run: `./run.sh`

---

## Direct Compile & Run Commands

### **Compile only** (this works everywhere)
```bash
javac --module-path /usr/share/openjfx/lib \
      --add-modules javafx.controls,javafx.graphics \
      VivaWebsite.java
```

### **Run with all flags** (on machine with display)
```bash
java --module-path /usr/share/openjfx/lib \
     --add-modules javafx.controls,javafx.graphics \
     VivaWebsite
```

---

## Troubleshooting

### Error: "package javafx.* does not exist"
→ Add `--module-path` and `--add-modules` flags to javac

### Error: "No toolkit found" / "no suitable pipeline found"  
→ No display server available (run on local machine instead)

### Error: "restricted methods will be blocked"
→ Add `--enable-native-access=javafx.graphics` to java command  
(Not needed for basic functionality)

### Error: "Graphics Device initialization failed"
→ Install the full JavaFX SDK from [Gluon](https://gluonhq.com/products/javafx/) instead of Ubuntu package

---

## Verification

✓ Verify compilation works:
```bash
./compile.sh
```

✓ Verify class file created:
```bash
ls -l VivaWebsite.class
```

Both commands should complete without errors. The `VivaWebsite.class` file proves your code is syntactically correct and compiles successfully.

---

## What This App Does

When you run it with a display:
- Creates a JavaFX window (900×600)
- Displays a professional website-style layout
- Header: Logo + Navigation buttons (Home, About, Contact)
- Sidebar: Menu items (Dashboard, Settings, Profile)  
- Content area: Welcome message with description
