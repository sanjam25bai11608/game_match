import java.util.ArrayList;
import java.util.List;

public class gamedatabase {

    private final List<game> games = new ArrayList<>();

    public gamedatabase() {
        loadGames();
    }

    private void loadGames() {

        games.add(new game(1, "Grand Theft Auto V", "Action", "PC", "Both", 9.5, 1499, 2013));
        games.add(new game(2, "Red Dead Redemption 2", "Adventure", "PC", "Singleplayer", 9.7, 1599, 2018));
        games.add(new game(3, "The Witcher 3", "RPG", "PC", "Singleplayer", 9.6, 999, 2015));
        games.add(new game(4, "Elden Ring", "RPG", "PC", "Both", 9.5, 2499, 2022));
        games.add(new game(5, "Cyberpunk 2077", "RPG", "PC", "Singleplayer", 9.0, 2499, 2020));
        games.add(new game(6, "Forza Horizon 5", "Racing", "Xbox", "Both", 9.2, 2999, 2021));
        games.add(new game(7, "God of War", "Action", "PC", "Singleplayer", 9.5, 2499, 2018));
        games.add(new game(8, "Horizon Zero Dawn", "Adventure", "PC", "Singleplayer", 9.1, 1999, 2017));
        games.add(new game(9, "Spider-Man Remastered", "Action", "PC", "Singleplayer", 9.4, 3999, 2022));
        games.add(new game(10, "Minecraft", "Adventure", "PC", "Both", 9.3, 1999, 2011));

        games.add(new game(11, "Counter Strike 2", "Shooter", "PC", "Multiplayer", 9.1, 0, 2023));
        games.add(new game(12, "Valorant", "Shooter", "PC", "Multiplayer", 8.8, 0, 2020));
        games.add(new game(13, "PUBG", "Shooter", "PC", "Multiplayer", 8.7, 999, 2017));
        games.add(new game(14, "Apex Legends", "Shooter", "PC", "Multiplayer", 8.9, 0, 2019));
        games.add(new game(15, "Overwatch 2", "Shooter", "PC", "Multiplayer", 8.5, 0, 2022));
        games.add(new game(16, "Call of Duty Modern Warfare", "Shooter", "PC", "Both", 8.9, 2999, 2019));
        games.add(new game(17, "Battlefield 2042", "Shooter", "PC", "Multiplayer", 7.8, 1999, 2021));
        games.add(new game(18, "DOOM Eternal", "Shooter", "PC", "Singleplayer", 9.0, 1999, 2020));
        games.add(new game(19, "Halo Infinite", "Shooter", "Xbox", "Both", 8.5, 0, 2021));
        games.add(new game(20, "Rainbow Six Siege", "Shooter", "PC", "Multiplayer", 8.8, 999, 2015));

        games.add(new game(21, "FIFA 24", "Sports", "PC", "Both", 8.4, 3499, 2023));
        games.add(new game(22, "EA Sports FC 25", "Sports", "PC", "Both", 8.5, 3999, 2024));
        games.add(new game(23, "NBA 2K24", "Sports", "PC", "Both", 8.0, 2999, 2023));
        games.add(new game(24, "Cricket 24", "Sports", "PC", "Both", 7.9, 2499, 2023));
        games.add(new game(25, "WWE 2K24", "Sports", "PC", "Both", 8.2, 2999, 2024));
        games.add(new game(26, "Rocket League", "Sports", "PC", "Multiplayer", 8.8, 0, 2015));
        games.add(new game(27, "Tony Hawk Pro Skater", "Sports", "PC", "Both", 8.7, 1999, 2020));
        games.add(new game(28, "NBA 2K23", "Sports", "PC", "Both", 8.0, 2499, 2022));
        games.add(new game(29, "WWE 2K23", "Sports", "PC", "Both", 8.1, 2499, 2023));
        games.add(new game(30, "eFootball", "Sports", "PC", "Multiplayer", 7.7, 0, 2022));

        games.add(new game(31, "Need for Speed Heat", "Racing", "PC", "Both", 8.5, 1999, 2019));
        games.add(new game(32, "Need for Speed Unbound", "Racing", "PC", "Both", 8.2, 2499, 2022));
        games.add(new game(33, "Forza Motorsport", "Racing", "Xbox", "Both", 8.8, 2999, 2023));
        games.add(new game(34, "Gran Turismo 7", "Racing", "PlayStation", "Both", 9.0, 3999, 2022));
        games.add(new game(35, "Dirt Rally 2.0", "Racing", "PC", "Both", 8.7, 1499, 2019));
        games.add(new game(36, "F1 24", "Racing", "PC", "Both", 8.2, 3499, 2024));
        games.add(new game(37, "Assetto Corsa", "Racing", "PC", "Both", 8.9, 999, 2014));
        games.add(new game(38, "The Crew Motorfest", "Racing", "PC", "Both", 8.1, 2999, 2023));
        games.add(new game(39, "Trackmania", "Racing", "PC", "Multiplayer", 8.5, 0, 2020));
        games.add(new game(40, "Wreckfest", "Racing", "PC", "Both", 8.6, 1499, 2018));

        games.add(new game(41, "Baldur's Gate 3", "RPG", "PC", "Both", 9.8, 2999, 2023));
        games.add(new game(42, "Final Fantasy VII Rebirth", "RPG", "PlayStation", "Singleplayer", 9.3, 3999, 2024));
        games.add(new game(43, "Final Fantasy XVI", "RPG", "PlayStation", "Singleplayer", 9.0, 3999, 2023));
        games.add(new game(44, "Persona 5 Royal", "RPG", "PC", "Singleplayer", 9.5, 2499, 2019));
        games.add(new game(45, "Dragon Age Inquisition", "RPG", "PC", "Singleplayer", 8.8, 999, 2014));
        games.add(new game(46, "Monster Hunter World", "RPG", "PC", "Both", 9.2, 1999, 2018));
        games.add(new game(47, "Dark Souls III", "RPG", "PC", "Both", 9.4, 1999, 2016));
        games.add(new game(48, "Diablo IV", "RPG", "PC", "Both", 8.7, 3999, 2023));
        games.add(new game(49, "Starfield", "RPG", "PC", "Singleplayer", 8.4, 3499, 2023));
        games.add(new game(50, "Fallout 4", "RPG", "PC", "Singleplayer", 9.0, 999, 2015));

        games.add(new game(51, "Resident Evil 4", "Horror", "PC", "Singleplayer", 9.5, 2999, 2023));
        games.add(new game(52, "Resident Evil Village", "Horror", "PC", "Singleplayer", 9.0, 2499, 2021));
        games.add(new game(53, "Resident Evil 2", "Horror", "PC", "Singleplayer", 9.3, 1999, 2019));
        games.add(new game(54, "Outlast", "Horror", "PC", "Singleplayer", 8.7, 499, 2013));
        games.add(new game(55, "Outlast 2", "Horror", "PC", "Singleplayer", 8.2, 699, 2017));
        games.add(new game(56, "Amnesia The Dark Descent", "Horror", "PC", "Singleplayer", 8.8, 499, 2010));
        games.add(new game(57, "Dead Space", "Horror", "PC", "Singleplayer", 9.1, 2499, 2023));
        games.add(new game(58, "Alan Wake 2", "Horror", "PC", "Singleplayer", 9.2, 2999, 2023));
        games.add(new game(59, "Phasmophobia", "Horror", "PC", "Multiplayer", 8.8, 799, 2020));
        games.add(new game(60, "Little Nightmares", "Horror", "PC", "Singleplayer", 8.6, 699, 2017));

        games.add(new game(61, "Civilization VI", "Strategy", "PC", "Both", 9.1, 999, 2016));
        games.add(new game(62, "Age of Empires IV", "Strategy", "PC", "Both", 8.8, 1999, 2021));
        games.add(new game(63, "StarCraft II", "Strategy", "PC", "Multiplayer", 9.3, 0, 2010));
        games.add(new game(64, "Total War Warhammer III", "Strategy", "PC", "Both", 8.7, 2999, 2022));
        games.add(new game(65, "XCOM 2", "Strategy", "PC", "Singleplayer", 9.0, 1499, 2016));
        games.add(new game(66, "Company of Heroes 3", "Strategy", "PC", "Both", 8.0, 2499, 2023));
        games.add(new game(67, "Crusader Kings III", "Strategy", "PC", "Singleplayer", 9.0, 1999, 2020));
        games.add(new game(68, "Cities Skylines", "Simulation", "PC", "Singleplayer", 8.9, 999, 2015));
        games.add(new game(69, "Cities Skylines II", "Simulation", "PC", "Singleplayer", 7.8, 2999, 2023));
        games.add(new game(70, "Planet Zoo", "Simulation", "PC", "Singleplayer", 8.8, 1999, 2019));

        games.add(new game(71, "The Sims 4", "Simulation", "PC", "Singleplayer", 8.2, 0, 2014));
        games.add(new game(72, "Microsoft Flight Simulator", "Simulation", "PC", "Singleplayer", 9.0, 3999, 2020));
        games.add(new game(73, "Euro Truck Simulator 2", "Simulation", "PC", "Singleplayer", 9.2, 799, 2012));
        games.add(new game(74, "Stardew Valley", "Simulation", "PC", "Both", 9.4, 499, 2016));
        games.add(new game(75, "Terraria", "Adventure", "PC", "Both", 9.3, 399, 2011));
        games.add(new game(76, "Subnautica", "Adventure", "PC", "Singleplayer", 9.2, 999, 2018));
        games.add(new game(77, "No Man's Sky", "Adventure", "PC", "Both", 8.9, 1999, 2016));
        games.add(new game(78, "Sea of Thieves", "Adventure", "PC", "Multiplayer", 8.8, 2499, 2018));
        games.add(new game(79, "It Takes Two", "Adventure", "PC", "Multiplayer", 9.3, 1999, 2021));
        games.add(new game(80, "A Way Out", "Adventure", "PC", "Multiplayer", 8.8, 1499, 2018));

        games.add(new game(81, "Tekken 8", "Fighting", "PC", "Both", 9.0, 3999, 2024));
        games.add(new game(82, "Street Fighter 6", "Fighting", "PC", "Both", 9.2, 3499, 2023));
        games.add(new game(83, "Mortal Kombat 1", "Fighting", "PC", "Both", 8.5, 3499, 2023));
        games.add(new game(84, "Guilty Gear Strive", "Fighting", "PC", "Both", 8.9, 2499, 2021));
        games.add(new game(85, "Dragon Ball FighterZ", "Fighting", "PC", "Both", 8.7, 1499, 2018));

        games.add(new game(86, "Hades", "Indie", "PC", "Singleplayer", 9.5, 999, 2020));
        games.add(new game(87, "Hollow Knight", "Indie", "PC", "Singleplayer", 9.6, 499, 2017));
        games.add(new game(88, "Celeste", "Indie", "PC", "Singleplayer", 9.2, 499, 2018));
        games.add(new game(89, "Dead Cells", "Indie", "PC", "Singleplayer", 9.1, 799, 2018));
        games.add(new game(90, "Cuphead", "Indie", "PC", "Both", 8.9, 999, 2017));

        games.add(new game(91, "Portal 2", "Adventure", "PC", "Both", 9.6, 399, 2011));
        games.add(new game(92, "Half Life 2", "Shooter", "PC", "Singleplayer", 9.7, 399, 2004));
        games.add(new game(93, "Left 4 Dead 2", "Shooter", "PC", "Multiplayer", 9.2, 399, 2009));
        games.add(new game(94, "Dota 2", "Strategy", "PC", "Multiplayer", 9.0, 0, 2013));
        games.add(new game(95, "League of Legends", "Strategy", "PC", "Multiplayer", 8.9, 0, 2009));
        games.add(new game(96, "Among Us", "Indie", "PC", "Multiplayer", 8.5, 199, 2018));
        games.add(new game(97, "Fall Guys", "Sports", "PC", "Multiplayer", 8.1, 0, 2020));
        games.add(new game(98, "Palworld", "Adventure", "PC", "Both", 8.4, 1499, 2024));
        games.add(new game(99, "Valheim", "Adventure", "PC", "Both", 8.8, 999, 2021));
        games.add(new game(100, "Raft", "Adventure", "PC", "Both", 8.7, 999, 2022));
    }

    public List<game> getGames() {
        return games;
    }

    public void displayAllGames() {

        System.out.println("\n================ ALL 100 GAMES ================\n");

        for (game g : games) {
            System.out.println(g);
        }
    }

    public List<game> search(String keyword) {

        List<game> result = new ArrayList<>();

        keyword = keyword.toLowerCase();

        for (game g : games) {

            if (g.getName().toLowerCase().contains(keyword)
                    || g.getGenre().toLowerCase().contains(keyword)) {

                result.add(g);
            }
        }

        return result;
    }
}