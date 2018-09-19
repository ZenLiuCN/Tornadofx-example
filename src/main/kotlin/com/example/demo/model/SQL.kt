package com.example.demo.model

import org.jooq.Table
import org.jooq.impl.DSL
import java.io.File
import java.sql.DriverManager

object SQL {
    val ctx by lazy {
        Class.forName("org.h2.Driver")
        File(System.getProperty("user.dir") + "/config").apply { if (!exists()) mkdirs() }
        DSL.using(DriverManager.getConnection("jdbc:h2:${System.getProperty("user.dir")}/config/conf", "123", "123"))
    }

    init {
        ctx.execute("""
            CREATE TABLE IF NOT EXISTS `CONSULT`(
                `createAt` TIMESTAMP NOT NULL PRIMARY KEY DEFAULT CURRENT_TIMESTAMP(),
                `name` VARCHAR(255) NOT NULL
            )
        """.trimIndent())
    }
}
