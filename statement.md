# GameMatch – Game Recommendation System

## 1. Problem Statement

With a large number of video games available across different genres, platforms, game modes, and price ranges, users may find it difficult to choose a game that matches their personal preferences.

GameMatch is designed to solve this problem by providing a Java-based game recommendation system. The system collects user preferences such as preferred genre, platform, game mode, and maximum budget, and uses these preferences to identify and recommend suitable games from a predefined game database.

The system also allows users to search for games, provide feedback, give ratings, and view statistics about the available games.

---

## 2. Scope of the Project

The scope of GameMatch includes the development of a console-based Java application that provides preference-based game recommendations.

The project includes:

- Maintaining a predefined database of games.
- Collecting user preferences.
- Filtering games according to user requirements.
- Calculating recommendation scores.
- Displaying games based on their recommendation scores.
- Searching for games using keywords.
- Applying budget-based filtering.
- Collecting user likes and dislikes.
- Collecting user ratings.
- Displaying user feedback.
- Providing statistics about the game database.
- Validating user input and handling invalid inputs.

The current project focuses on a local Java-based implementation using a predefined game dataset. It does not depend on an online game service or external API.

---

## 3. Target Users

GameMatch is intended for:

### 1. Gamers
Users who want to discover games based on their interests and preferences.

### 2. Casual Players
Users who may not know which game to choose and want recommendations based on simple preferences.

### 3. Preference-Based Game Seekers
Users who want to find games according to specific genres, platforms, game modes, or budget limits.

### 4. Students and Developers
The project can also serve as an educational example of implementing recommendation logic, object-oriented programming, data handling, input validation, and modular Java development.

---

## 4. High-Level Features

### 4.1 Personalized Game Recommendations

The system accepts user preferences including:

- Preferred genre
- Preferred platform
- Preferred game mode
- Maximum budget

The Recommendation Engine processes these preferences and generates suitable game recommendations.

### 4.2 Recommendation Scoring

Each suitable game receives a recommendation score based on factors such as:

- Genre matching
- Platform matching
- Game mode matching
- Budget compatibility
- Game rating
- User feedback

Games are then organized according to their calculated recommendation scores.

### 4.3 Game Database

The application maintains a predefined collection of games containing information such as:

- Game ID
- Game name
- Genre
- Platform
- Game mode
- Release year
- Rating
- Price

### 4.4 Game Search

Users can search the game database using keywords to find specific games.

### 4.5 User Feedback

Users can provide feedback for games through:

- Like
- Dislike
- Rating

The feedback can also be considered by the recommendation system.

### 4.6 Database Statistics

The application provides information such as:

- Total number of games
- Number of free games
- Average game rating
- Average game price
- Highest-rated game
- Cheapest game

### 4.7 Input Validation

The system validates user inputs and handles invalid values to maintain a reliable interaction with the application.

---

## 5. Project Workflow

The high-level workflow of GameMatch is:

```text
User
  ↓
Enter Preferences
  ↓
Genre + Platform + Mode + Budget
  ↓
Recommendation Engine
  ↓
Filter Available Games
  ↓
Calculate Recommendation Scores
  ↓
Sort Suitable Games
  ↓
Display Recommendations
  ↓
User Feedback / Rating
