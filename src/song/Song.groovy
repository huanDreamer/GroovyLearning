package song

class Song {

    def name;

    def singer;

    def length;

    def getSigner() {
        singer?.toUpperCase()
    }

    @Override
    String toString() {
        "${name}: ${singer}, ${length}s"
    }
}
