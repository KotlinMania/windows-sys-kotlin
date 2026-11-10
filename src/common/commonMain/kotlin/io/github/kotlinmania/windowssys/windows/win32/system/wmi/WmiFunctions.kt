package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.windowssys.COpaquePointer

public expect fun miApplicationInitializeV1(flags: UInt, applicationid: COpaquePointer?, extendederror: COpaquePointer?, application: COpaquePointer?): MiResult
