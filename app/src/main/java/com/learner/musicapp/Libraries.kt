package com.learner.musicapp

import androidx.annotation.DrawableRes

data class Libraries(@DrawableRes val icon: Int, val name:String)

val libraries = listOf<Libraries>(
    Libraries(R.drawable.baseline_list_24, "Playlist"),
    Libraries(R.drawable.baseline_person_24,"Artists"),
    Libraries(R.drawable.baseline_album_24,"Album"),
    Libraries(R.drawable.baseline_library_music_24,"Songs"),
    Libraries(R.drawable.baseline_vertical_split_24,"Genre")
)