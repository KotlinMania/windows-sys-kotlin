package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

public expect fun coCreateActivity(piunknown: COpaquePointer?, riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult

public expect fun coEnterServiceDomain(pconfigobject: COpaquePointer?): Hresult

public expect fun coGetDefaultContext(apttype: Apttype, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun coLeaveServiceDomain(punkstatus: COpaquePointer?)

public expect fun getDispenserManager(param0: COpaquePointer?): Hresult

public expect fun getManagedExtensions(dwexts: COpaquePointer?): Hresult

public expect fun mTSCreateActivity(riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult

public expect fun recycleSurrogate(lreasoncode: Int): Hresult

public expect fun safeRef(rid: COpaquePointer?, punk: COpaquePointer?): COpaquePointer?
