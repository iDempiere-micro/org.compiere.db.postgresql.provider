package pg.org.compiere.db

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import software.hsharp.api.icommon.ICConnection
import software.hsharp.api.icommon.IDatabaseSetup
import software.hsharp.db.postgresql.provider.PgDB
import software.hsharp.db.postgresql.provider.PgDatabaseSetup
import java.sql.Driver
import java.sql.DriverManager
import java.util.*

open class PooledPgDB : PgDB() {
}