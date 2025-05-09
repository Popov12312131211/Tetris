package com.example.tetrisgame.storage

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(ctx: Context) {
    private var data: SharedPreferences = ctx.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)

    fun saveHighScore(highScore: Int) {
        data.edit().putInt("HIGH_SCORE", highScore).apply()
    }

    fun getHighScore(): Int {
        return data.getInt("HIGH_SCORE", 0)
    }

    fun clearHighScore() {
        data.edit().putInt("HIGH_SCORE", 0).apply()
    }

    fun saveCurrentScore(score: Int) {
        data.edit().putInt("CURRENT_SCORE", score).apply()
    }

    fun getCurrentScore(): Int {
        return data.getInt("CURRENT_SCORE", 0)
    }

}
