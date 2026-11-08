package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM

public typealias BROADCAST_SYSTEM_MESSAGE_FLAGS = UInt

public typealias BROADCAST_SYSTEM_MESSAGE_INFO = UInt

public fun interface DESKTOPENUMPROCAFn {
    public operator fun invoke(param0: PCSTR, param1: LPARAM): BOOL
}

public typealias DESKTOPENUMPROCA = DESKTOPENUMPROCAFn?

public fun interface DESKTOPENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR, param1: LPARAM): BOOL
}

public typealias DESKTOPENUMPROCW = DESKTOPENUMPROCWFn?

public typealias DESKTOP_ACCESS_FLAGS = UInt

public typealias DESKTOP_CONTROL_FLAGS = UInt

public typealias HDESK = Long

public typealias HWINSTA = Long

public typealias USER_OBJECT_INFORMATION_INDEX = Int

public fun interface WINSTAENUMPROCAFn {
    public operator fun invoke(param0: PCSTR, param1: LPARAM): BOOL
}

public typealias WINSTAENUMPROCA = WINSTAENUMPROCAFn?

public fun interface WINSTAENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR, param1: LPARAM): BOOL
}

public typealias WINSTAENUMPROCW = WINSTAENUMPROCWFn?
