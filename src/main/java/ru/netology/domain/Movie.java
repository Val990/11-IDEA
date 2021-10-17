package ru.netology.domain;

    public class Movie {

        private int id;
        private int movieId;
        private String movieName;
        private String movieGenre;
        private boolean premierTomorrow;

        public Movie(int id, int movieId, String movieName, String movieGenre, boolean premierTomorrow) {
            this.id = id;
            this.movieId = movieId;
            this.movieName = movieName;
            this.movieGenre = movieGenre;
            this.premierTomorrow = premierTomorrow;
        }

        public Movie() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getMovieGenre() {
            return movieGenre;
        }

        public void setMovieGenre(String movieGenre) {
            this.movieGenre = movieGenre;
        }

        public boolean isPremierTomorrow() {
            return premierTomorrow;
        }

        public void setPremierTomorrow(boolean premierTomorrow) {
            this.premierTomorrow = premierTomorrow;
        }
    }
