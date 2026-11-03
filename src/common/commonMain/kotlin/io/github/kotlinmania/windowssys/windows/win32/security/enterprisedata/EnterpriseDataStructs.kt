package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

public data class FILE_UNPROTECT_OPTIONS(public var audit: UByte = 0u)

public data class HTHREAD_NETWORK_CONTEXT(public var ThreadId: UInt = 0u, public var ThreadContext: Foundation.HANDLE = Foundation.HANDLE())
