package io.github.kotlinmania.windowssys.windows.win32.system.systemservices

import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logpalette

public data class UserHmetafilepict(public var fContext: Int = 0, public var u: UserHmetafilepict0 = UserHmetafilepict0())

public data class UserHmetafilepict0(
    public var hInproc: Int = 0,
    public var hRemote: RemoteMetafilepict? = null,
    public var hInproc64: Long = 0L,
)

public data class UserHpalette(public var fContext: Int = 0, public var u: UserHpalette0 = UserHpalette0())

public data class UserHpalette0(
    public var hInproc: Int = 0,
    public var hRemote: Logpalette? = null,
    public var hInproc64: Long = 0L,
)
