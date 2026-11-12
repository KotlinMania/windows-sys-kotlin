package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun getExtensionVersion(pver: MutPtr<HseVersionInfo>): Bool

public expect fun getFilterVersion(pver: MutPtr<HttpFilterVersion>): Bool

public expect fun httpExtensionProc(pecb: ConstPtr<ExtensionControlBlock>): UInt

public expect fun httpFilterProc(pfc: MutPtr<HttpFilterContext>, notificationtype: UInt, pvnotification: MutPtr<CVoid>): UInt
