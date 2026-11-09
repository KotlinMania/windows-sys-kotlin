package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun DtcGetTransactionManager(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_dwreserved1: UInt, i_wcbreserved2: UShort, i_pvreserved2: Long, o_ppvobject: Long): HRESULT

public expect fun DtcGetTransactionManagerC(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_dwreserved1: UInt, i_wcbreserved2: UShort, i_pvreserved2: Long, o_ppvobject: Long): HRESULT

public expect fun DtcGetTransactionManagerExA(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT

public expect fun DtcGetTransactionManagerExW(i_pwszhost: PCWSTR, i_pwsztmname: PCWSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT
