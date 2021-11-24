package com.github.jayden666z.template.services

import com.intellij.openapi.project.Project
import com.github.jayden666z.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
