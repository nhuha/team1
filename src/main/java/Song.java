public class Song {

        String singer;
        String nameOfTheSong;
        String time;

        /**
         * Method parseSong extract the information about the song from a text line
         * @param str - line of the text file with the information about song
         * @return object of the class Song
         */
        public static Song parseSong(String str){
            Song song = new Song();
            String[] parts = str.split(": ");
            song.singer = parts[0];
            song.nameOfTheSong = parts[1].replaceAll("[^a-zA-Z ]", "");
            song.time = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
            return song;
        }

        public String getSinger() {
            return singer;
        }


        public String getNameOfTheSong() {
            return nameOfTheSong;
        }


        public String getTime() {
            return time;
        }


    }


