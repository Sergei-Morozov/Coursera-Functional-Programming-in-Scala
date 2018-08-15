val w = "axbccd"

val group = (w.toLowerCase() groupBy identity)
val map = group map {case (ch, str) => (ch, str.length)}
val sorted = map.toList.sortBy(_._1)

