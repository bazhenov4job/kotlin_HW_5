package ru.netology

class Likes (
    counter: Int = 0,
    userLikes: Boolean,
    canLike: Boolean,
    canPublish: Boolean
){
    var counter: Int = counter
        get() {
            return field
        }
        set(value) {
            if (value < 0){
                return
            }
            field = value
        }
}