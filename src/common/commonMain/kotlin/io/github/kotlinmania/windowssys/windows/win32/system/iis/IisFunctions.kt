package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun getExtensionVersion(pver: MutPtr): Bool

public expect fun getFilterVersion(pver: MutPtr): Bool

public expect fun httpExtensionProc(pecb: ConstPtr): UInt

public expect fun httpFilterProc(pfc: MutPtr, notificationtype: UInt, pvnotification: MutPtr): UInt
