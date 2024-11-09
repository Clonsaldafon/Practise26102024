package ru.clonsaldafon.practise26_10_2024.domain

import ru.clonsaldafon.practise26_10_2024.data.model.Intercom

interface GetIntercomUseCase {
    suspend operator fun invoke(): List<Intercom>
}