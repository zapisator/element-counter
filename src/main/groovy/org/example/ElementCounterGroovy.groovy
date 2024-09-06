package org.example

import groovy.transform.TypeChecked

class ElementCounterGroovy {

    @TypeChecked
    static Map countElements(List list) {
        if (list.contains(null)) {
            throw new NullPointerException("List cannot contain null elements.")
        }
        list.countBy { it }
    }
}