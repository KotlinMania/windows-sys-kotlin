@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemDistributedtransactioncoordinatorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManager(iPszhost: Long, iPsztmname: Long, iRiid: Long, iDwreserved1: Int, iWcbreserved2: Short, iPvreserved2: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerC(iPszhost: Long, iPsztmname: Long, iRiid: Long, iDwreserved1: Int, iWcbreserved2: Short, iPvreserved2: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExA(iPszhost: Long, iPsztmname: Long, iRiid: Long, iGrfoptions: Int, iPvconfigparams: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExW(iPwszhost: Long, iPwsztmname: Long, iRiid: Long, iGrfoptions: Int, iPvconfigparams: Long, oPpvobject: Long): Int
}

public actual fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManager((iPszhost?.value ?: 0L), (iPsztmname?.value ?: 0L), (iRiid?.value ?: 0L), iDwreserved1.toInt(), iWcbreserved2.toShort(), (iPvreserved2?.value ?: 0L), (oPpvobject?.value ?: 0L))

public actual fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerC((iPszhost?.value ?: 0L), (iPsztmname?.value ?: 0L), (iRiid?.value ?: 0L), iDwreserved1.toInt(), iWcbreserved2.toShort(), (iPvreserved2?.value ?: 0L), (oPpvobject?.value ?: 0L))

public actual fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iGrfoptions: UInt, iPvconfigparams: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExA((iPszhost?.value ?: 0L), (iPsztmname?.value ?: 0L), (iRiid?.value ?: 0L), iGrfoptions.toInt(), (iPvconfigparams?.value ?: 0L), (oPpvobject?.value ?: 0L))

public actual fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: COpaquePointer?, iGrfoptions: UInt, iPvconfigparams: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExW((iPwszhost?.value ?: 0L), (iPwsztmname?.value ?: 0L), (iRiid?.value ?: 0L), iGrfoptions.toInt(), (iPvconfigparams?.value ?: 0L), (oPpvobject?.value ?: 0L))
