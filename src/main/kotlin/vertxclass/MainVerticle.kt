package vertxclass

import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx

class App: AbstractVerticle()
{

    override fun start()
    {
        print("Verticle App Started")
    }
    override fun stop()
    {
        print("Verticle App Stopped")
    }
}


fun main() {
    //println("Hello, World")
    val vertx = Vertx.vertx()
    vertx.deployVerticle(App())

}