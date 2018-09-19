package com.example.demo.view

import com.example.demo.controller.MainController
import com.example.demo.model.Consul
import com.jfoenix.controls.JFXButton
import com.jfoenix.controls.JFXTreeTableColumn
import com.jfoenix.controls.JFXTreeTableRow
import com.jfoenix.controls.JFXTreeTableView
import com.jfoenix.controls.cells.editors.base.JFXTreeTableCell
import javafx.scene.image.Image
import kfoenix.JFXStylesheet
import kfoenix.JFXStylesheet.Companion.jfxButtonRaised
import kfoenix.JFXStylesheet.Companion.jfxButtonType
import kfoenix.JFXStylesheet.Companion.jfxDisableVisualFocus
import kfoenix.jfxbutton
import tornadofx.*
import java.awt.Color.blue

class MainView : View() {
    val ctrl: MainController by inject()

    init {
        this.title = ctrl.title
    }

    override val root = borderpane {
        style {
            minWidth = ctrl.minWidth
            minHeight = ctrl.minHeight
        }
        top {
            hbox {
                style {
                    paddingTop = 20
                    paddingLeft = 20
                }
                jfxbutton(value = "新会议") {
                    style {
                        jfxButtonRaised
                        jfxDisableVisualFocus
                    }
                    setOnAction {
                        jfxdialog{

                        }
                    }
                }
            }
        }
        center {



        }
    }
}
