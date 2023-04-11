import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import kotlin.concurrent.thread

class SimpleThread: Thread() {
    public override fun run() {
        println("${currentThread()} has run")
    }
}

class SimpleRunnable: Runnable {
    override fun run() {
        println("${Thread.currentThread()} has run")
    }

}

fun main(args: Array<String>) {
}