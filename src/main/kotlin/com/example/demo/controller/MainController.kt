package com.example.demo.controller

import com.example.demo.model.SQL
import tornadofx.*

class MainController:Controller(){
    val title="系统共"
    val minWidth=600.px
    val minHeight=480.px
    val consul by lazy { SQL }
    fun save(name:String){
        SQL.ctx.execute("INSERT INTO COUNSUL(`name`) VALUES('$name')")
    }
}
