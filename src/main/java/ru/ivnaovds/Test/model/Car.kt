package ru.ivnaovds.Test.model

data class Car(val model: String, val age: Int): Comparable<Car> {
    override fun compareTo(other: Car): Int {
        return this.age - other.age
    }

    override fun toString(): String {
        return "Car(model='$model', age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        if (model != other.model) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = model.hashCode()
        result = 31 * result + age
        return result
    }
}
