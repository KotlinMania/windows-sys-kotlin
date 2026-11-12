@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesCoCreateActivity
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesGetDispenserManager
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesGetManagedExtensions
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesMTSCreateActivity
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesRecycleSurrogate
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssysWindowsWin32SystemComponentservicesSafeRef
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun coCreateActivity(piunknown: MutPtr, riid: ConstPtr, ppobj: MutPtr): Hresult =
    windowssysWindowsWin32SystemComponentservicesCoCreateActivity(piunknown.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppobj.rawAddress.toCPointer<ByteVar>())

public actual fun coEnterServiceDomain(pconfigobject: MutPtr): Hresult =
    windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(pconfigobject.rawAddress.toCPointer<ByteVar>())

public actual fun coGetDefaultContext(apttype: Apttype, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(apttype, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun coLeaveServiceDomain(punkstatus: MutPtr) {
    windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(punkstatus.rawAddress.toCPointer<ByteVar>())
}

public actual fun getDispenserManager(param0: MutPtr): Hresult =
    windowssysWindowsWin32SystemComponentservicesGetDispenserManager(param0.rawAddress.toCPointer<ByteVar>())

public actual fun getManagedExtensions(dwexts: MutPtr): Hresult =
    windowssysWindowsWin32SystemComponentservicesGetManagedExtensions(dwexts.rawAddress.toCPointer<ByteVar>())

public actual fun mTSCreateActivity(riid: ConstPtr, ppobj: MutPtr): Hresult =
    windowssysWindowsWin32SystemComponentservicesMTSCreateActivity(riid.rawAddress.toCPointer<ByteVar>(), ppobj.rawAddress.toCPointer<ByteVar>())

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    windowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode)

public actual fun safeRef(rid: ConstPtr, punk: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemComponentservicesSafeRef(rid.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)
