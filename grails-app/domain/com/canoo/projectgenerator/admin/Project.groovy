package com.canoo.projectgenerator.admin

class Project {

    String name
    String description
    String cloneURL

    static constraints = {
        name(blank: false, matches:"\\w", size: 3..150)
        description(nullable: true)
        cloneURL(nullable: true)

    }
}

