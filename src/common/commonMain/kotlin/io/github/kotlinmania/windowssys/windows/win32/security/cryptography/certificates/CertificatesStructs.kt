package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pwstr

public data class Cainfo(
    public var cbSize: UInt = 0u,
    public var cAType: EnumCatypes = 0,
    public var cCASignatureCerts: UInt = 0u,
    public var cCAExchangeCerts: UInt = 0u,
    public var cExitModules: UInt = 0u,
    public var lPropIdMax: Int = 0,
    public var lRoleSeparationEnabled: Int = 0,
    public var cKRACertUsedCount: UInt = 0u,
    public var cKRACertCount: UInt = 0u,
    public var fAdvancedServer: UInt = 0u,
)

public data class Certtransblob(public var cb: UInt = 0u, public var pb: COpaquePointer? = null)

public data class Certviewrestriction(
    public var columnIndex: UInt = 0u,
    public var seekOperator: Int = 0,
    public var sortOrder: Int = 0,
    public var pbValue: COpaquePointer? = null,
    public var cbValue: UInt = 0u,
)

public data class CsedbRstmapw(public var pwszDatabaseName: Pwstr = null, public var pwszNewDatabaseName: Pwstr = null)
