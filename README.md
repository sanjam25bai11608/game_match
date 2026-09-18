# game_match
# GameMatch – Game Recommendation System

## 📌 Project Overview

**GameMatch** is a Java-based Game Recommendation System designed to help users find games based on their personal preferences.

The system takes user preferences such as **genre, platform, game mode, and budget** and recommends suitable games from a predefined database of games.

It also provides additional features such as game searching, user feedback, ratings, and database statistics.

---

## 🎯 Objectives

The main objectives of GameMatch are:

- To recommend games according to user preferences.
- To provide a simple and interactive console-based interface.
- To allow users to search for games.
- To consider the user's preferred genre, platform, game mode, and budget.
- To allow users to give likes, dislikes, and ratings.
- To provide useful statistics about the game database.

---

## ✨ Features

### 1. Game Recommendations
Users can enter their:

- Name
- Preferred genre
- Preferred platform
- Preferred game mode
- Maximum budget

The system then calculates recommendation scores and displays suitable games.

### 2. Recommendation Scoring

Games are evaluated based on multiple factors:

- Genre compatibility
- Platform compatibility
- Game mode compatibility
- Budget compatibility
- Game rating
- User feedback

The system generates a score for each suitable game and displays the recommendations in descending order of score.

### 3. View All Games

Users can view all games available in the database.

### 4. Search Games

Users can search for games using a keyword.

### 5. Feedback System

Users can provide:

- 👍 Like
- 👎 Dislike
- ⭐ Rating

The feedback is stored during the program session and is used by the recommendation system.

### 6. Database Statistics

The system provides statistics such as:

- Total number of games
- Number of free games
- Average game rating
- Average game price
- Highest-rated game
- Cheapest game

---

## 🛠️ Technologies Used

- **Java**
- **IntelliJ IDEA**
- **Git**
- **GitHub**
- Object-Oriented Programming (OOP)
- Java Collections
- Console-based User Interface

---

## 🏗️ Project Structure

```text
GameMatch/
│
├── README.md
├── statement.md
│
└── main/
    ├── Main.java
    ├── game.java
    ├── gamedatabase.java
    ├── RecommendationEngine.java
    ├── recommendation.java
    ├── feedback.java
    ├── FeedbackManager.java
    ├── user.java
    ├── inputvalidator.java
    └── filemanager.java
