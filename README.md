# 🔬 Learn & Play — Hydrogen Spectroscopy

An interactive Java desktop application that teaches the physics of hydrogen emission spectra through a hands-on simulation and a spectrum-matching game. Built with Java Swing, it lets students explore electron transitions, photon energy levels, and spectral series without any lab equipment.

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Application Structure](#application-structure)
- [How It Works](#how-it-works)
  - [Hydrogen Simulation](#hydrogen-simulation)
  - [Spectrum Game](#spectrum-game)
- [Physics Behind It](#physics-behind-it)
- [File Structure](#file-structure)
- [Requirements](#requirements)
- [Running the Application](#running-the-application)

---

## Overview

This project is a two-mode educational tool designed to make atomic physics intuitive and engaging. Students can either run a guided simulation of photon absorption and electron emission, or test their knowledge in a drag-sorting game where they must match five elements to their correct emission spectra.

---

## Features

- **Interactive electron-photon simulation** — watch a photon travel from an emitter, be absorbed by a hydrogen electron, and see the electron jump to a higher orbit before falling back and emitting light
- **Real energy level values** — the eV slider shows accurate photon energies (10.2 eV, 12.1 eV, 12.8 eV, 13.1 eV for Lyman; 1.9 eV, 2.6 eV, 2.8 eV for Balmer; 0.7 eV, 1.0 eV for Paschen)
- **Spectral series feedback** — after emission, the correct spectrum image (Lyman, Balmer, or Paschen) appears automatically
- **Visual validation** — the energy label turns green when a valid transition energy is selected, white otherwise
- **Spectrum identification game** — five scrambled element spectrum bars (Hydrogen, Helium, Neon, Sodium, Mercury) must be sorted into the correct order
- **Win/fail feedback** — animated pop-up responses when the game answer is submitted
- **Reset controls** — return the simulation to its initial state at any time

---

## Application Structure

```
Hydrogenspectroscopy.java   ← Main entry point and window manager
Simulation.java             ← Simulation panel with controls and spectrum display
Hydrogen.java               ← Animated canvas drawing orbits, electron, and photon
game.java                   ← Spectrum sorting game panel
Simulation.form             ← NetBeans GUI form descriptor
```

**Supporting assets:**

| File | Purpose |
|---|---|
| `Agif.gif` | Animated hydrogen atom shown on the home screen |
| `Lyman.jpg` | Lyman series spectrum image (UV, n→1 transitions) |
| `Balmer.jpg` | Balmer series spectrum image (visible, n→2 transitions) |
| `Paschen.jpg` | Paschen series spectrum image (infrared, n→3 transitions) |
| `NoSeries.jpg` | Shown when the selected energy does not match any transition |
| `1.jpg – 5.jpg` | Emission spectrum bars for Hydrogen, Helium, Neon, Sodium, Mercury |
| `21.jpg` | Win graphic displayed in the game pop-up |
| `22.jpg` | Fail graphic displayed in the game pop-up |
| `main1.png` | Reference spectrum image shown in the game panel |

---

## How It Works

### Hydrogen Simulation

The simulation is split across two classes working together:

**`Simulation.java`** manages the control panel — it handles the orbit selector dropdown (n = 1, 2, 3), the photon energy slider (range and labels change per orbit), the Emit button, and the spectrum label that displays the result.

**`Hydrogen.java`** is the animated drawing canvas. A `javax.swing.Timer` fires every 4 ms to update positions:

1. A yellow photon moves from the emitter (left side) rightward toward the selected electron orbit.
2. When the photon reaches the orbit, it disappears and the electron moves from its ground orbit outward to the excited orbit (absorption).
3. The electron then falls back inward to the final orbit (emission), representing the release of a photon as light.

The slider validates energy selection in real time — the label background turns green only when the chosen eV value matches a real transition for the selected orbit:

| Target orbit (n) | Valid energies |
|---|---|
| n = 1 (Lyman) | 10.2 eV, 12.1 eV, 12.8 eV, 13.1 eV |
| n = 2 (Balmer) | 1.9 eV, 2.6 eV, 2.8 eV |
| n = 3 (Paschen) | 0.7 eV, 1.0 eV |

After clicking Emit, the corresponding series spectrum image appears in the right panel of the control area. Selecting a non-matching energy shows the `NoSeries` image instead.

### Spectrum Game

`game.java` displays five element spectrum bars stacked vertically, initially scrambled. Each bar is a clickable button. Clicking a button swaps it with the one above it in a fixed rotation:

- Neon → swaps with Sodium
- Hydrogen → swaps with Neon
- Mercury → swaps with Hydrogen
- Helium → swaps with Mercury
- Sodium → swaps with Helium

The `main1.png` reference image on the right shows the correct ordering. Clicking the large centre button checks whether all five bars are in the correct positions. A win dialog (with the win image) appears on success; a "Try again" dialog (with the fail image) appears otherwise.

---

## Physics Behind It

The Bohr model of hydrogen defines discrete electron energy levels:

```
En = −13.6 eV / n²
```

A photon is absorbed when its energy exactly matches the gap between two levels. The emitted photon on return produces a characteristic spectral line:

- **Lyman series** — transitions to n = 1, ultraviolet range
- **Balmer series** — transitions to n = 2, visible light range
- **Paschen series** — transitions to n = 3, infrared range

This application makes those transitions directly visible and interactive, linking the slider energy value to the real physics of which series is produced.

---

## File Structure

```
Learn-play-Hydrogenspectroscopy/
├── Hydrogenspectroscopy.java   ← Main window; routes between simulation and game
├── Simulation.java             ← Control panel + spectrum feedback
├── Hydrogen.java               ← Animated orbit canvas
├── game.java                   ← Spectrum sorting game
├── Simulation.form             ← NetBeans GUI builder form
├── Agif.gif                    ← Home screen animation
├── Lyman.jpg                   ← Lyman spectrum image
├── Balmer.jpg                  ← Balmer spectrum image
├── Paschen.jpg                 ← Paschen spectrum image
├── NoSeries.jpg                ← Invalid energy feedback image
├── 1.jpg – 5.jpg               ← Element spectrum bars (H, He, Ne, Na, Hg)
├── 21.jpg                      ← Win image
├── 22.jpg                      ← Fail image
└── main1.png                   ← Reference spectrum for game
```

---

## Requirements

- Java SE 8 or higher
- NetBeans IDE (recommended — the `.form` file is a NetBeans GUI Builder descriptor)

No external libraries are required. Everything uses the Java standard library (`javax.swing`, `java.awt`).

---

## Running the Application

### From NetBeans

1. Open NetBeans and choose **File → Open Project**.
2. Navigate to the cloned folder and open it as a project.
3. Right-click the project → **Run**.

### From the command line

```bash
# Compile all Java files from the project root
javac -d out hydrogenspectroscopy/*.java

# Run the main class
java -cp out hydrogenspectroscopy.Hydrogenspectroscopy
```

> **Important:** the image and GIF assets (`Agif.gif`, `Lyman.jpg`, `Balmer.jpg`, `Paschen.jpg`, `NoSeries.jpg`, `1.jpg`–`5.jpg`, `21.jpg`, `22.jpg`, `main1.png`) must be in the **working directory** when the application is launched. If running from the command line, run from the folder that contains those files.

---

