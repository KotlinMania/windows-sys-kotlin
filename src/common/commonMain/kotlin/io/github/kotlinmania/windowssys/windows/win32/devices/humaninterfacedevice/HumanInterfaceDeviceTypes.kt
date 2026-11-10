package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public typealias GpiobuttonsButtonType = Int

public typealias HidpKeyboardDirection = Int

public typealias HidpReportType = Int

public fun interface LpdiconfiguredevicescallbackFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdiconfiguredevicescallback = LpdiconfiguredevicescallbackFn?

public fun interface LpdienumcreatedeffectobjectscallbackFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdienumcreatedeffectobjectscallback = LpdienumcreatedeffectobjectscallbackFn?

public fun interface LpdienumdeviceobjectscallbackaFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdienumdeviceobjectscallbacka = LpdienumdeviceobjectscallbackaFn?

public fun interface LpdienumdeviceobjectscallbackwFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdienumdeviceobjectscallbackw = LpdienumdeviceobjectscallbackwFn?

public fun interface LpdienumdevicesbysemanticscbaFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: UInt, param3: UInt, param4: COpaquePointer?): Bool
}

public typealias Lpdienumdevicesbysemanticscba = LpdienumdevicesbysemanticscbaFn?

public fun interface LpdienumdevicesbysemanticscbwFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: UInt, param3: UInt, param4: COpaquePointer?): Bool
}

public typealias Lpdienumdevicesbysemanticscbw = LpdienumdevicesbysemanticscbwFn?

public fun interface LpdienumdevicescallbackaFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdienumdevicescallbacka = LpdienumdevicescallbackaFn?

public fun interface LpdienumdevicescallbackwFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdienumdevicescallbackw = LpdienumdevicescallbackwFn?

public fun interface LpdienumeffectscallbackaFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdienumeffectscallbacka = LpdienumeffectscallbackaFn?

public fun interface LpdienumeffectscallbackwFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdienumeffectscallbackw = LpdienumeffectscallbackwFn?

public fun interface LpdienumeffectsinfilecallbackFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Lpdienumeffectsinfilecallback = LpdienumeffectsinfilecallbackFn?

public fun interface LpdijoytypecallbackFn {
    public operator fun invoke(param0: Pcwstr, param1: COpaquePointer?): Bool
}

public typealias Lpdijoytypecallback = LpdijoytypecallbackFn?

public fun interface LpfnshowjoycplFn {
    public operator fun invoke(hwnd: Hwnd)
}

public typealias Lpfnshowjoycpl = LpfnshowjoycplFn?

public fun interface PfnHidPGetVersionInternalFn {
    public operator fun invoke(version: COpaquePointer?): Ntstatus
}

public typealias PfnHidPGetVersionInternal = PfnHidPGetVersionInternalFn?

public fun interface PhidpInsertScancodesFn {
    public operator fun invoke(context: COpaquePointer?, newscancodes: Pcstr, length: UInt): Boolean
}

public typealias PhidpInsertScancodes = PhidpInsertScancodesFn?

public typealias PhidpPreparsedData = Long
