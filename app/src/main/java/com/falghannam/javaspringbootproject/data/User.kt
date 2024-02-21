package com.falghannam.javaspringbootproject.data

data class User(
    var username: String,
    var password: String,
    var medicalRecord: String?,
    var age: Int,
    var address: String,


    ) {
    constructor (username: String, password: String) : this(username, password, "", 23, "")
    constructor (username: String, age: Int) : this(username, "", "", 24, "")
}

