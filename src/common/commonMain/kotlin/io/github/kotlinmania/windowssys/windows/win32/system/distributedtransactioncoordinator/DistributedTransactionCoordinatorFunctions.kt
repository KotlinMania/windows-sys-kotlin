package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun DtcGetTransactionManager(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_dwreserved1: UInt, i_wcbreserved2: UShort, i_pvreserved2: Long, o_ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("xolehlp.dll", "DtcGetTransactionManager", longArrayOf(i_pszhost, i_psztmname, i_riid, i_dwreserved1.toLong(), i_wcbreserved2.toLong(), i_pvreserved2, o_ppvobject)).toInt()
}

public fun DtcGetTransactionManagerC(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_dwreserved1: UInt, i_wcbreserved2: UShort, i_pvreserved2: Long, o_ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("xolehlp.dll", "DtcGetTransactionManagerC", longArrayOf(i_pszhost, i_psztmname, i_riid, i_dwreserved1.toLong(), i_wcbreserved2.toLong(), i_pvreserved2, o_ppvobject)).toInt()
}

public fun DtcGetTransactionManagerExA(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("xolehlp.dll", "DtcGetTransactionManagerExA", longArrayOf(i_pszhost, i_psztmname, i_riid, i_grfoptions.toLong(), i_pvconfigparams, o_ppvobject)).toInt()
}

public fun DtcGetTransactionManagerExW(i_pwszhost: PCWSTR, i_pwsztmname: PCWSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("xolehlp.dll", "DtcGetTransactionManagerExW", longArrayOf(i_pwszhost, i_pwsztmname, i_riid, i_grfoptions.toLong(), i_pvconfigparams, o_ppvobject)).toInt()
}
