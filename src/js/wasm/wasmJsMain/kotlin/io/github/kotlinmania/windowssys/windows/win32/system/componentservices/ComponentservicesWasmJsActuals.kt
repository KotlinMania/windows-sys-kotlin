@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.com.APTTYPE

public actual fun CoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): HRESULT =
    0

public actual fun CoEnterServiceDomain(pconfigobject: Long): HRESULT =
    0

public actual fun CoGetDefaultContext(apttype: APTTYPE, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CoLeaveServiceDomain(punkstatus: Long) {
}

public actual fun GetDispenserManager(param0: Long): HRESULT =
    0

public actual fun GetManagedExtensions(dwexts: Long): HRESULT =
    0

public actual fun MTSCreateActivity(riid: Long, ppobj: Long): HRESULT =
    0

public actual fun RecycleSurrogate(lreasoncode: Int): HRESULT =
    0

public actual fun SafeRef(rid: Long, punk: Long): Long =
    0L
