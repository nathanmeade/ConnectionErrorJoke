package com.meadetechnologies.connectionerrorjoke

import kotlin.random.Random

class ConnectionErrorJoke {



    companion object {
        private val jokes = listOf<String>(
            "Looks like someone forgot to pay the internet bill!",
            "Did your dog chew through your ethernet cable?",
            "Did you try to wash your wireless router?"
        )
        fun getJoke(): String {
            val randomIndex = Random.nextInt(jokes.size)
            return jokes[randomIndex]
        }
    }

}
