package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias EnumProcessModulesExFlags = UInt

public fun interface PenumPageFileCallbackaFn {
    public operator fun invoke(pcontext: MutPtr<CVoid>, ppagefileinfo: MutPtr<EnumPageFileInformation>, lpfilename: Pcstr): Bool
}

public typealias PenumPageFileCallbacka = PenumPageFileCallbackaFn?

public fun interface PenumPageFileCallbackwFn {
    public operator fun invoke(pcontext: MutPtr<CVoid>, ppagefileinfo: MutPtr<EnumPageFileInformation>, lpfilename: Pcwstr): Bool
}

public typealias PenumPageFileCallbackw = PenumPageFileCallbackwFn?
