package com.example.instagram.model

import android.provider.ContactsContract.CommonDataKinds.Email

class user {
    var image:String?=null
    var name:String?=null
    var Email:String?=null
    var password:String?=null
    constructor()
    constructor(image: String?, name: String?, Email: String?, password: String?) {
        this.image = image
        this.name = name
        this.Email = Email
        this.password = password
    }

    constructor(name: String?, Email: String?, password: String?) {
        this.name = name
        this.Email = Email
        this.password = password
    }

}