# Backrooms Procedural Exploration Game

## Overview

This project is a top-down procedural horror exploration game set in an infinite Backrooms-like environment. The game focuses on atmospheric tension, exploration, and dynamic procedural generation rather than combat-heavy gameplay.

Core pillars:

- Infinite procedurally generated levels
- Exploration-driven gameplay loop
- Minimalist horror (loneliness, uncertainty, anomalies)
- Dynamic sound design
- Player-driven map discovery (minimap system)

---

## Core Features

- Procedural level generation (rooms, corridors, anomalies)
- Infinite progression with increasing complexity
- Entity system (player, creatures, items, static objects)
- Rare anomaly mechanics (non-Euclidean spaces, loops, distortions)
- Exploration-based minimap
- Level transition system (stairs, elevators, etc.)
- Dynamic ambient and reactive audio system
- Save system using deterministic seeds + delta state

---

## Architecture Overview

The project follows a **data-driven, layered architecture**:

- Game state is independent from rendering
- Procedural generation is deterministic (seed-based)
- Simulation is handled by systems, not entities
- Rendering only visualizes the current state
- Persistence uses base generation + delta changes

---

## Project Structure

```
core/
  GameLoop
  GameContext
  GameState
  SceneMode

world/
  WorldManager
  LevelManager
  LevelRepository
  World
  Level
  WorldGraph
  LevelTransition

generation/
  LevelGenerator
  RoomGraphGenerator
  LayoutGenerator
  SpawnGenerator
  LootGenerator
  GenerationValidator
  LevelDescriptor

simulation/
  SimulationEngine
  MovementSystem
  CollisionSystem
  InteractionSystem
  AISystem
  ExplorationSystem
  SpawnSystem
  TransitionSystem
  DifficultySystem

entity/
  Entity
  Player
  Creature
  ItemEntity
  StaticObject
  EntityManager

map/
  ExplorationState
  MinimapModel
  AtlasModel
  MapMarker
  MapService

render/
  CameraController
  LevelRenderer
  EntityRenderer
  MinimapRenderer
  HudRenderer

save/
  SaveManager
  WorldSnapshot
  LevelDelta
  SerializationService

config/
  GenerationConfig
  DifficultyConfig
  SpawnTables
  ThemeDefinitions
```

