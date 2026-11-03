package io.github.kotlinmania.windowssys.windows.win32.foundation

public typealias COLORREF = UInt

public typealias DUPLICATE_HANDLE_OPTIONS = UInt

public fun interface FARPROCFn {
    public operator fun invoke(): Long
}

public typealias FARPROC = FARPROCFn?

public typealias GENERIC_ACCESS_RIGHTS = UInt

public typealias HANDLE = Long

public typealias HANDLE_FLAGS = UInt

public typealias HANDLE_PTR = ULong

public typealias HGLOBAL = Long

public typealias HINSTANCE = Long

public typealias HLOCAL = Long

public typealias HLSURF = Long

public typealias HMODULE = Long

public typealias HRSRC = Long

public typealias HSPRITE = Long

public typealias HSTR = Long

public typealias HUMPD = Long

public typealias HWND = Long

public typealias LPARAM = Long

public typealias LRESULT = Long

public fun interface NEARPROCFn {
    public operator fun invoke(): Long
}

public typealias NEARPROC = NEARPROCFn?

public typealias NTSTATUS = Int

public typealias NTSTATUS_FACILITY_CODE = UInt

public typealias NTSTATUS_SEVERITY_CODE = UInt

public typealias OBJECT_ATTRIBUTE_FLAGS = UInt

public fun interface PAPCFUNCFn {
    public operator fun invoke(parameter: ULong)
}

public typealias PAPCFUNC = PAPCFUNCFn?

public fun interface PROCFn {
    public operator fun invoke(): Long
}

public typealias PROC = PROCFn?

public typealias SHANDLE_PTR = Long

public typealias VARIANT_BOOL = Short

public typealias WAIT_EVENT = UInt

public typealias WIN32_ERROR = UInt

public typealias WPARAM = ULong
