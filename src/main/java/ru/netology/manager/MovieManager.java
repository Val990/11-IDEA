package ru.netology.manager;

import ru.netology.domain.Movie;

    public class MovieManager {

        private int countMovies = 10;
        private Movie[] items = new Movie[0];


        public int getCountMovies() {
            return countMovies;
        }

        public void setCountMovies(int countMovies) {
            this.countMovies = countMovies;
        }


        public MovieManager() {
        }

        public MovieManager(int countMovies) {
            this.countMovies = countMovies;
        }


        public void add(Movie item) {  //1) новый массив на 1 больше
            int length = items.length + 1;
            Movie[] tmp = new Movie[length]; // новый массив на 1 больше
            for (int i = 0; i < items.length; i++) { //условие, копируем фильмы поэтапно
                tmp[i] = items[i];
            }
            int lastIndex = tmp.length - 1; //добавляем последний элемент в Movie[]
            tmp[lastIndex] = item;
            items = tmp;
        }

        public Movie[] getAll() {  //2) подсчет фильмов в обратном порядке из Movie[]

            Movie[] result;

            if (items.length > countMovies) { // последние 10 фильмов
                result = new Movie[countMovies];
            }
            else {
                result = new Movie[items.length];
            }
                for (int i = 0; i < result.length; i++) { // перебираем массив
                    int index = items.length - i - 1; //кладем результат в обратном порядке
                    result[i] = items[index];
                }
                return result;
            }
        }





