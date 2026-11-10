package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class FileUnprotectOptions(
    public var audit: UByte = 0u,
)

public data class HthreadNetworkContext(
    public var threadId: UInt = 0u,
    public var threadContext: Handle = null,
)
