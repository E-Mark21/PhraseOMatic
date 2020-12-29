class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song: $title by $artist")
    }
    fun stop() {
        println("Stopped playing: $title")
    }
}

fun main() {
    val songOne = Song("The Mesopotamians", "They Mght Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")

    songOne.play()
    songTwo.play()
    songThree.play()
    songThree.stop()
    songTwo.stop()
    songOne.stop()
}