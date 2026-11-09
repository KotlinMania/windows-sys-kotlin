package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.com.APTTYPE

public expect fun CoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): HRESULT

public expect fun CoEnterServiceDomain(pconfigobject: Long): HRESULT

public expect fun CoGetDefaultContext(apttype: APTTYPE, riid: Long, ppv: Long): HRESULT

public expect fun CoLeaveServiceDomain(punkstatus: Long)

public expect fun GetDispenserManager(param0: Long): HRESULT

public expect fun GetManagedExtensions(dwexts: Long): HRESULT

public expect fun MTSCreateActivity(riid: Long, ppobj: Long): HRESULT

public expect fun RecycleSurrogate(lreasoncode: Int): HRESULT

public expect fun SafeRef(rid: Long, punk: Long): Long
