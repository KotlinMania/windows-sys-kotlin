package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Colorref = UInt

public typealias DuplicateHandleOptions = UInt

public fun interface FarprocFn {
    public operator fun invoke(): Long
}

public typealias Farproc = FarprocFn?

public typealias GenericAccessRights = UInt

public typealias Handle = MutPtr

public typealias HandleFlags = UInt

public typealias HandlePtr = Int

public typealias Hglobal = MutPtr

public typealias Hinstance = MutPtr

public typealias Hlocal = MutPtr

public typealias Hlsurf = MutPtr

public typealias Hmodule = MutPtr

public typealias Hrsrc = MutPtr

public typealias Hsprite = MutPtr

public typealias Hstr = MutPtr

public typealias Humpd = MutPtr

public typealias Hwnd = MutPtr

public typealias Lparam = Long

public typealias Lresult = Long

public fun interface NearprocFn {
    public operator fun invoke(): Long
}

public typealias Nearproc = NearprocFn?

public typealias Ntstatus = Int

public typealias NtstatusFacilityCode = UInt

public typealias NtstatusSeverityCode = UInt

public typealias ObjectAttributeFlags = UInt

public fun interface PapcfuncFn {
    public operator fun invoke(parameter: ULong)
}

public typealias Papcfunc = PapcfuncFn?

public fun interface ProcFn {
    public operator fun invoke(): Long
}

public typealias Proc = ProcFn?

public typealias ShandlePtr = Long

public typealias VariantBool = Short

public typealias WaitEvent = UInt

public typealias Win32Error = UInt

public typealias Wparam = ULong
