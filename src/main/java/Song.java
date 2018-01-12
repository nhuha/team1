public class Song {

        String singer;
        String nameOfTheSong;
        String time;
        private int timeInSeconds;

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
            song.timeInSeconds = Song.convertTimeInSeconds(song.time);
            return song;
        }

        private static Integer convertTimeInSeconds(String time){
            String[] p = time.split(":");
            Integer minutes = Integer.parseInt(p[0]);
            Integer seconds = Integer.parseInt(p[1]);
            minutes = minutes * 60;
            return minutes + seconds;
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

    public int getTimeInSeconds() {
        return timeInSeconds;
    }

}


