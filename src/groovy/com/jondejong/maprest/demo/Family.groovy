package com.jondejong.maprest.demo

class Family {
    Address address
    def parents = []
    def children = []

    public transformToMap() {
        return [
                address: address ? address.transformToMap() : '',
                parents: parents ? parents.collect { it.transformToMap() } : [],
                children: children ? children.collect { it.transformToMap() }.each {it.put('elementName', 'child')}: []
        ]
    }
}