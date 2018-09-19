package com.example.demo.model

import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import java.sql.Timestamp
import java.time.Instant
import tornadofx.getValue
import tornadofx.setValue

class Consul{
    val createAtProperty = SimpleObjectProperty<Timestamp>(Timestamp.from(Instant.MIN))
    var createAt by createAtProperty

    val nameProperty = SimpleStringProperty("")
    var name by nameProperty

}
