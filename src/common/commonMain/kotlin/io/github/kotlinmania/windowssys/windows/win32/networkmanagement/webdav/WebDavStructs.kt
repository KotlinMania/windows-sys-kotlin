package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

public data class DavCallbackAuthBlob(
    public var pBuffer: COpaquePointer? = null,
    public var ulSize: UInt = 0u,
    public var ulType: UInt = 0u,
)

public data class DavCallbackAuthUnp(
    public var pszUserName: Pwstr = null,
    public var ulUserNameLength: UInt = 0u,
    public var pszPassword: Pwstr = null,
    public var ulPasswordLength: UInt = 0u,
)

public data class DavCallbackCred(
    public var authBlob: DavCallbackAuthBlob = DavCallbackAuthBlob(),
    public var uNPBlob: DavCallbackAuthUnp = DavCallbackAuthUnp(),
    public var bAuthBlobValid: Bool = 0,
    public var bSave: Bool = 0,
)
