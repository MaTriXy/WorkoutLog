package com.arthurnagy.workoutlog.core.model

data class User(
    val id: String = "",
    val displayName: String? = "",
    val email: String? = "",
    var aoge: Int? = 0,
    var weight: Float? = 0f,
    val profilePictureUrl: String = "",
    val activeRoutineId: Int = 0,
    val routines: List<Routine> = emptyList()
) {
    companion object {
        const val REFERENCE = "users"
    }
}