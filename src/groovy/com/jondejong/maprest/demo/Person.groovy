package com.jondejong.maprest.demo

class Person {

    Boolean adminRequest

    String firstName
    String lastName
    String socialSecurityNumber
    Integer age

    Person() {
        adminRequest = false
    }

    public transformToMap() {
        def propertyMap = [
                "@fullName": "${firstName} ${lastName}",
                firstName: firstName,
                lastName: lastName,
                age: age
        ]

        if (adminRequest) {
            propertyMap.put("socialSecurityNumber", socialSecurityNumber)
        }

        propertyMap
    }
}