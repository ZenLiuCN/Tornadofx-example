package com.example.demo.app

import com.example.demo.view.MainView
import javafx.scene.image.Image
import javafx.stage.Stage
import tornadofx.*

class Application : App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        stage.icons += Image(javaClass.getResourceAsStream("/images/icon.png"))
        super.start(stage)
    }
}
