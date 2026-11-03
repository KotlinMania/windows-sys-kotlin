package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public data class DAV_CALLBACK_AUTH_BLOB(
    public var pBuffer: Long = 0L,
    public var ulSize: UInt = 0u,
    public var ulType: UInt = 0u,
)

public data class DAV_CALLBACK_AUTH_UNP(
    public var pszUserName: PWSTR = 0L,
    public var ulUserNameLength: UInt = 0u,
    public var pszPassword: PWSTR = 0L,
    public var ulPasswordLength: UInt = 0u,
)

public data class DAV_CALLBACK_CRED(
    public var AuthBlob: DAV_CALLBACK_AUTH_BLOB = DAV_CALLBACK_AUTH_BLOB(),
    public var UNPBlob: DAV_CALLBACK_AUTH_UNP = DAV_CALLBACK_AUTH_UNP(),
    public var bAuthBlobValid: BOOL = 0,
    public var bSave: BOOL = 0,
)
