package com.example.criminalintent

import java.util.*
//import java.util.Date

data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)