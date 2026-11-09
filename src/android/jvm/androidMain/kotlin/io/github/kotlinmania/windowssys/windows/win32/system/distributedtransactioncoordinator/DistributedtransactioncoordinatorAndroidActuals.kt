@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32SystemDistributedtransactioncoordinatorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManager(i_pszhost: Long, i_psztmname: Long, i_riid: Long, i_dwreserved1: Int, i_wcbreserved2: Short, i_pvreserved2: Long, o_ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerC(i_pszhost: Long, i_psztmname: Long, i_riid: Long, i_dwreserved1: Int, i_wcbreserved2: Short, i_pvreserved2: Long, o_ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerExA(i_pszhost: Long, i_psztmname: Long, i_riid: Long, i_grfoptions: Int, i_pvconfigparams: Long, o_ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerExW(i_pwszhost: Long, i_pwsztmname: Long, i_riid: Long, i_grfoptions: Int, i_pvconfigparams: Long, o_ppvobject: Long): Int
}

public actual fun DtcGetTransactionManager(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_dwreserved1: UInt, i_wcbreserved2: UShort, i_pvreserved2: Long, o_ppvobject: Long): HRESULT =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManager(i_pszhost, i_psztmname, i_riid, i_dwreserved1.toInt(), i_wcbreserved2.toShort(), i_pvreserved2, o_ppvobject)

public actual fun DtcGetTransactionManagerC(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_dwreserved1: UInt, i_wcbreserved2: UShort, i_pvreserved2: Long, o_ppvobject: Long): HRESULT =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerC(i_pszhost, i_psztmname, i_riid, i_dwreserved1.toInt(), i_wcbreserved2.toShort(), i_pvreserved2, o_ppvobject)

public actual fun DtcGetTransactionManagerExA(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerExA(i_pszhost, i_psztmname, i_riid, i_grfoptions.toInt(), i_pvconfigparams, o_ppvobject)

public actual fun DtcGetTransactionManagerExW(i_pwszhost: PCWSTR, i_pwsztmname: PCWSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerExW(i_pwszhost, i_pwsztmname, i_riid, i_grfoptions.toInt(), i_pvconfigparams, o_ppvobject)
