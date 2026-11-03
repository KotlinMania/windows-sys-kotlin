package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.PWSTR

public data class CAINFO(
    public var cbSize: UInt = 0u,
    public var CAType: ENUM_CATYPES = 0,
    public var cCASignatureCerts: UInt = 0u,
    public var cCAExchangeCerts: UInt = 0u,
    public var cExitModules: UInt = 0u,
    public var lPropIdMax: Int = 0,
    public var lRoleSeparationEnabled: Int = 0,
    public var cKRACertUsedCount: UInt = 0u,
    public var cKRACertCount: UInt = 0u,
    public var fAdvancedServer: UInt = 0u,
)

public data class CERTTRANSBLOB(public var cb: UInt = 0u, public var pb: Long = 0L)

public data class CERTVIEWRESTRICTION(
    public var ColumnIndex: UInt = 0u,
    public var SeekOperator: Int = 0,
    public var SortOrder: Int = 0,
    public var pbValue: Long = 0L,
    public var cbValue: UInt = 0u,
)

public data class CSEDB_RSTMAPW(public var pwszDatabaseName: PWSTR = 0L, public var pwszNewDatabaseName: PWSTR = 0L)
