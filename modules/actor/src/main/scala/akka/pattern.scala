package akka

object pattern
    extends org.apache.pekko.pattern.PipeToSupport
    with org.apache.pekko.pattern.AskSupport
    with org.apache.pekko.pattern.GracefulStopSupport
    with org.apache.pekko.pattern.FutureTimeoutSupport
    with org.apache.pekko.pattern.RetrySupport
