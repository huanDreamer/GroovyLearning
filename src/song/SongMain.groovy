package song

class SongMain {

    static void main(String[] args) {

        Song song = new Song(name: 'jay', length: 300);

        println(song)

        println(song.getSigner())

        song.setSinger 'jay'

        println(song.getSigner())
    }
}
