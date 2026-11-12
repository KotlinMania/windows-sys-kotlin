package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

public typealias BroadcastSystemMessageFlags = UInt

public typealias BroadcastSystemMessageInfo = UInt

public fun interface DesktopenumprocaFn {
    public operator fun invoke(param0: Pcstr, param1: Lparam): Bool
}

public typealias Desktopenumproca = DesktopenumprocaFn?

public fun interface DesktopenumprocwFn {
    public operator fun invoke(param0: Pcwstr, param1: Lparam): Bool
}

public typealias Desktopenumprocw = DesktopenumprocwFn?

public typealias DesktopAccessFlags = UInt

public typealias DesktopControlFlags = UInt

public typealias Hdesk = MutPtr<CVoid>

public typealias Hwinsta = MutPtr<CVoid>

public typealias UserObjectInformationIndex = Int

public fun interface WinstaenumprocaFn {
    public operator fun invoke(param0: Pcstr, param1: Lparam): Bool
}

public typealias Winstaenumproca = WinstaenumprocaFn?

public fun interface WinstaenumprocwFn {
    public operator fun invoke(param0: Pcwstr, param1: Lparam): Bool
}

public typealias Winstaenumprocw = WinstaenumprocwFn?
