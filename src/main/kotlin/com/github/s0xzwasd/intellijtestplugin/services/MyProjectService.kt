package com.github.s0xzwasd.intellijtestplugin.services

import com.github.s0xzwasd.intellijtestplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
