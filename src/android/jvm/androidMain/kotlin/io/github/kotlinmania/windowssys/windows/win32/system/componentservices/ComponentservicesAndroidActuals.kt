@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

private object WindowsWin32SystemComponentservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesCoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(pconfigobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(apttype: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(punkstatus: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesGetDispenserManager(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesGetManagedExtensions(dwexts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesMTSCreateActivity(riid: Long, ppobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesSafeRef(rid: Long, punk: Long): Long
}

public actual fun coCreateActivity(piunknown: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppobj: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesCoCreateActivity(piunknown.rawAddress, riid.rawAddress, ppobj.rawAddress)

public actual fun coEnterServiceDomain(pconfigobject: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(pconfigobject.rawAddress)

public actual fun coGetDefaultContext(apttype: Apttype, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(apttype, riid.rawAddress, ppv.rawAddress)

public actual fun coLeaveServiceDomain(punkstatus: MutPtr<CVoid>) {
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(punkstatus.rawAddress)
}

public actual fun getDispenserManager(param0: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesGetDispenserManager(param0.rawAddress)

public actual fun getManagedExtensions(dwexts: MutPtr<UInt>): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesGetManagedExtensions(dwexts.rawAddress)

public actual fun mTSCreateActivity(riid: ConstPtr<Guid>, ppobj: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesMTSCreateActivity(riid.rawAddress, ppobj.rawAddress)

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode)

public actual fun safeRef(rid: ConstPtr<Guid>, punk: MutPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesSafeRef(rid.rawAddress, punk.rawAddress))
