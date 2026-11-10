package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias CryptcatattributeFlags = UInt

public typealias CryptcatOpenFlags = UInt

public typealias CryptcatVersion = UInt

public fun interface PfnCdfParseErrorCallbackFn {
    public operator fun invoke(dwerrorarea: UInt, dwlocalerror: UInt, pwszline: Pcwstr)
}

public typealias PfnCdfParseErrorCallback = PfnCdfParseErrorCallbackFn?
