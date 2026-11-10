package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

public fun interface EnumreslangprocaFn {
    public operator fun invoke(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lparam: Long): Bool
}

public typealias Enumreslangproca = EnumreslangprocaFn?

public fun interface EnumreslangprocwFn {
    public operator fun invoke(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lparam: Long): Bool
}

public typealias Enumreslangprocw = EnumreslangprocwFn?

public fun interface EnumresnameprocaFn {
    public operator fun invoke(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lparam: Long): Bool
}

public typealias Enumresnameproca = EnumresnameprocaFn?

public fun interface EnumresnameprocwFn {
    public operator fun invoke(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lparam: Long): Bool
}

public typealias Enumresnameprocw = EnumresnameprocwFn?

public fun interface EnumrestypeprocaFn {
    public operator fun invoke(hmodule: Hmodule, lptype: Pcstr, lparam: Long): Bool
}

public typealias Enumrestypeproca = EnumrestypeprocaFn?

public fun interface EnumrestypeprocwFn {
    public operator fun invoke(hmodule: Hmodule, lptype: Pcwstr, lparam: Long): Bool
}

public typealias Enumrestypeprocw = EnumrestypeprocwFn?

public typealias LoadLibraryFlags = UInt

public fun interface PgetModuleHandleExaFn {
    public operator fun invoke(dwflags: UInt, lpmodulename: Pcstr, phmodule: COpaquePointer?): Bool
}

public typealias PgetModuleHandleExa = PgetModuleHandleExaFn?

public fun interface PgetModuleHandleExwFn {
    public operator fun invoke(dwflags: UInt, lpmodulename: Pcwstr, phmodule: COpaquePointer?): Bool
}

public typealias PgetModuleHandleExw = PgetModuleHandleExwFn?
