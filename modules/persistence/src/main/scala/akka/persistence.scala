package akka

package object persistence {
  type SnapshotSelectionCriteria =
    org.apache.pekko.persistence.SnapshotSelectionCriteria
  val SnapshotSelectionCriteria
      : org.apache.pekko.persistence.SnapshotSelectionCriteria.type =
    org.apache.pekko.persistence.SnapshotSelectionCriteria
}
