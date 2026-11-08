package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public data class FILE_UNPROTECT_OPTIONS(public var audit: UByte = 0u)

public data class HTHREAD_NETWORK_CONTEXT(public var ThreadId: UInt = 0u, public var ThreadContext: HANDLE = 0L)
