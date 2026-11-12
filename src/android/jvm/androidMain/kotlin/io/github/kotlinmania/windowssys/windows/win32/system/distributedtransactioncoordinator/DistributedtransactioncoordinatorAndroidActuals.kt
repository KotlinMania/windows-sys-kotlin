@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemDistributedtransactioncoordinatorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(iPszhost: Long, iPsztmname: Long, iRiid: Long, iDwreserved1: Int, iWcbreserved2: Short, iPvreserved2: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(iPszhost: Long, iPsztmname: Long, iRiid: Long, iDwreserved1: Int, iWcbreserved2: Short, iPvreserved2: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(iPszhost: Long, iPsztmname: Long, iRiid: Long, iGrfoptions: Int, iPvconfigparams: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(iPwszhost: Long, iPwsztmname: Long, iRiid: Long, iGrfoptions: Int, iPvconfigparams: Long, oPpvobject: Long): Int
}

public actual fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr, oPpvobject: MutPtr): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(iPszhost.rawAddress, iPsztmname.rawAddress, iRiid.rawAddress, iDwreserved1.toInt(), iWcbreserved2.toShort(), iPvreserved2.rawAddress, oPpvobject.rawAddress)

public actual fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr, oPpvobject: MutPtr): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(iPszhost.rawAddress, iPsztmname.rawAddress, iRiid.rawAddress, iDwreserved1.toInt(), iWcbreserved2.toShort(), iPvreserved2.rawAddress, oPpvobject.rawAddress)

public actual fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(iPszhost.rawAddress, iPsztmname.rawAddress, iRiid.rawAddress, iGrfoptions.toInt(), iPvconfigparams.rawAddress, oPpvobject.rawAddress)

public actual fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(iPwszhost.rawAddress, iPwsztmname.rawAddress, iRiid.rawAddress, iGrfoptions.toInt(), iPvconfigparams.rawAddress, oPpvobject.rawAddress)
