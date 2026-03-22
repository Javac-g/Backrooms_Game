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
---

## World Model

The game world is composed of **independent procedural levels**.

- Each level is generated from a deterministic seed
- Only active levels are loaded in memory
- Levels are connected through a transition graph
- The world is effectively infinite

---

## Level Structure

Each level consists of two layers:

### Geometric Layer
- Tile grid (walls, floors, doors, transitions)

### Semantic Layer
- Room types (office, corridor, storage, etc.)
- Spawn zones
- Loot zones
- Anomaly zones

This dual structure allows both gameplay logic and meaningful procedural generation.

---

## Procedural Generation Pipeline

1. Level descriptor creation
2. Room graph generation
3. Spatial layout construction
4. Tile grid rasterization
5. Semantic tagging
6. Entity placement
7. Item placement
8. Transition placement
9. Validation

---

## Gameplay Loop

1. Player enters generated level
2. Explores environment
3. Discovers map and objects
4. Collects items
5. Avoids entities
6. Finds transition to next level
7. Descends deeper into the system

---

## Entity Model

All in-world objects are represented as entities:

- Player
- Creatures
- Items
- Static objects

Entities are state-driven and processed by simulation systems.

---

## Simulation Systems

Game logic is handled by systems:

- Movement and collision
- Interaction handling
- AI behavior
- Exploration tracking
- Spawn control
- Level transitions
- Difficulty scaling

---


