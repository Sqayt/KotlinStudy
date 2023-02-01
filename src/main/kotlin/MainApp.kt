/*
 * Copyright 2022 B-1336, Inc.
 *
 * ...
 */

import java.lang.Thread.sleep
import java.util.Arrays

/**
 * A group of *members*.
 *
 * This class has no useful logic; it's for study example.
 *
 * @param T the type of member in this group.
 * @property name the name of this group.
 * @constructor Creates an empty group.
 */

class Group<T>(val name: String) {
    /**
     * Adds a [member] to this group.
     * @return the new size of group.
     */

    fun add(member: T): Int {
        return 0
    }
}

class Solution {
    fun isPalindrome(s: String): Boolean {
        val re = Regex("[^A-Za-z]")
        val word = re.replace(s, "")
        val res = word.map { it.lowercase() }
        return res == res.reversed()
    }

    fun majorityElement(nums: IntArray): Int {
        Arrays.sort(nums)
        return nums[nums.size / 2]
    }
}

fun main(args: Array<String>) {
    var z = 1000

    while(z > 6) {
        println("$z - 7 = ${z - 7}")
        z -= 7
        sleep(50)
    }

    println("Я ... гуль ...")
}