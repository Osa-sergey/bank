package osdev.serg.fsp.repository

import osdev.serg.fsp.model.Account

import java.util.UUID
import scala.concurrent.Future

trait AccountRepository {
  def create(account: Account): Future[Account]
  def delete(id: UUID): Future[Unit]
  def get(id: UUID): Future[Account]
  def find(id: UUID): Future[Option[Account]]
  def getAll(): Future[Seq[Account]]
  def updateUsername(account: Account): Future[Option[Account]]
  def updateBalance(account: Account): Future[Option[Account]]

}
