package com.meadetechnologies.connectionerrorknockknockjokes

import kotlin.random.Random

class ConnectionErrorKnockKnockJokes {
    companion object {
        private val knockKnockJokes = listOf<String>(
            "Knock knock. Who's there? Error code 404!",
            "Knock knock. Who's there? Not your internet connection!"
        )
        fun getKnockKnockJoke(): String {
            val randomIndex = Random.nextInt(knockKnockJokes.size)
            return knockKnockJokes[randomIndex]
        }
    }
}
