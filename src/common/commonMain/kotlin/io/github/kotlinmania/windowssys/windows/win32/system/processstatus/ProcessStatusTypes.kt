package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias EnumProcessModulesExFlags = UInt

public fun interface PenumPageFileCallbackaFn {
    public operator fun invoke(pcontext: COpaquePointer?, ppagefileinfo: COpaquePointer?, lpfilename: Pcstr): Bool
}

public typealias PenumPageFileCallbacka = PenumPageFileCallbackaFn?

public fun interface PenumPageFileCallbackwFn {
    public operator fun invoke(pcontext: COpaquePointer?, ppagefileinfo: COpaquePointer?, lpfilename: Pcwstr): Bool
}

public typealias PenumPageFileCallbackw = PenumPageFileCallbackwFn?
