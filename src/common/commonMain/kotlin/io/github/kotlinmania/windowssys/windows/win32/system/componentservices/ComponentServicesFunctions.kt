package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

public expect fun coCreateActivity(piunknown: MutPtr, riid: ConstPtr, ppobj: MutPtr): Hresult

public expect fun coEnterServiceDomain(pconfigobject: MutPtr): Hresult

public expect fun coGetDefaultContext(apttype: Apttype, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun coLeaveServiceDomain(punkstatus: MutPtr)

public expect fun getDispenserManager(param0: MutPtr): Hresult

public expect fun getManagedExtensions(dwexts: MutPtr): Hresult

public expect fun mTSCreateActivity(riid: ConstPtr, ppobj: MutPtr): Hresult

public expect fun recycleSurrogate(lreasoncode: Int): Hresult

public expect fun safeRef(rid: ConstPtr, punk: MutPtr): MutPtr
