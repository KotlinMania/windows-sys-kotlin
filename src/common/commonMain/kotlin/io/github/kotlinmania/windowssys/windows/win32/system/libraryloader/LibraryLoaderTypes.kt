package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

public fun interface ENUMRESLANGPROCAFn {
    public operator fun invoke(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lparam: Long): BOOL
}

public typealias ENUMRESLANGPROCA = ENUMRESLANGPROCAFn?

public fun interface ENUMRESLANGPROCWFn {
    public operator fun invoke(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lparam: Long): BOOL
}

public typealias ENUMRESLANGPROCW = ENUMRESLANGPROCWFn?

public fun interface ENUMRESNAMEPROCAFn {
    public operator fun invoke(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lparam: Long): BOOL
}

public typealias ENUMRESNAMEPROCA = ENUMRESNAMEPROCAFn?

public fun interface ENUMRESNAMEPROCWFn {
    public operator fun invoke(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lparam: Long): BOOL
}

public typealias ENUMRESNAMEPROCW = ENUMRESNAMEPROCWFn?

public fun interface ENUMRESTYPEPROCAFn {
    public operator fun invoke(hmodule: HMODULE, lptype: PCSTR, lparam: Long): BOOL
}

public typealias ENUMRESTYPEPROCA = ENUMRESTYPEPROCAFn?

public fun interface ENUMRESTYPEPROCWFn {
    public operator fun invoke(hmodule: HMODULE, lptype: PCWSTR, lparam: Long): BOOL
}

public typealias ENUMRESTYPEPROCW = ENUMRESTYPEPROCWFn?

public typealias LOAD_LIBRARY_FLAGS = UInt

public fun interface PGET_MODULE_HANDLE_EXAFn {
    public operator fun invoke(dwflags: UInt, lpmodulename: PCSTR, phmodule: Long): BOOL
}

public typealias PGET_MODULE_HANDLE_EXA = PGET_MODULE_HANDLE_EXAFn?

public fun interface PGET_MODULE_HANDLE_EXWFn {
    public operator fun invoke(dwflags: UInt, lpmodulename: PCWSTR, phmodule: Long): BOOL
}

public typealias PGET_MODULE_HANDLE_EXW = PGET_MODULE_HANDLE_EXWFn?
