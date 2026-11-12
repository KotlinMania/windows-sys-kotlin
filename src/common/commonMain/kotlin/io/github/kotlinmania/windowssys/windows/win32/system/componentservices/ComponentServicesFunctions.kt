package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

public expect fun coCreateActivity(piunknown: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coEnterServiceDomain(pconfigobject: MutPtr<CVoid>): Hresult

public expect fun coGetDefaultContext(apttype: Apttype, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coLeaveServiceDomain(punkstatus: MutPtr<CVoid>)

public expect fun getDispenserManager(param0: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun getManagedExtensions(dwexts: MutPtr<UInt>): Hresult

public expect fun mTSCreateActivity(riid: ConstPtr<Guid>, ppobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun recycleSurrogate(lreasoncode: Int): Hresult

public expect fun safeRef(rid: ConstPtr<Guid>, punk: MutPtr<CVoid>): MutPtr<CVoid>
