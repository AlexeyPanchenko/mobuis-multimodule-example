package ru.alexeypanchenko.donorapp.detail

import java.io.Serializable

data class DetailItem(
    val id: Int,
    val title: String,
    val description: String,
    val additionalText: String? = null
) : Serializable