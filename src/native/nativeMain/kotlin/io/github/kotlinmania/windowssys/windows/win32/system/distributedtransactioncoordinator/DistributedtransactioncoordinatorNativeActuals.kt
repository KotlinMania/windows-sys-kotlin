@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DtcGetTransactionManager(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_dwreserved1: UInt, i_wcbreserved2: UShort, i_pvreserved2: Long, o_ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManager(i_pszhost.toCPointer<ByteVar>(), i_psztmname.toCPointer<ByteVar>(), i_riid.toCPointer<ByteVar>(), i_dwreserved1, i_wcbreserved2, i_pvreserved2.toCPointer<ByteVar>(), o_ppvobject.toCPointer<ByteVar>())

public actual fun DtcGetTransactionManagerC(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_dwreserved1: UInt, i_wcbreserved2: UShort, i_pvreserved2: Long, o_ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerC(i_pszhost.toCPointer<ByteVar>(), i_psztmname.toCPointer<ByteVar>(), i_riid.toCPointer<ByteVar>(), i_dwreserved1, i_wcbreserved2, i_pvreserved2.toCPointer<ByteVar>(), o_ppvobject.toCPointer<ByteVar>())

public actual fun DtcGetTransactionManagerExA(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerExA(i_pszhost.toCPointer<ByteVar>(), i_psztmname.toCPointer<ByteVar>(), i_riid.toCPointer<ByteVar>(), i_grfoptions, i_pvconfigparams.toCPointer<ByteVar>(), o_ppvobject.toCPointer<ByteVar>())

public actual fun DtcGetTransactionManagerExW(i_pwszhost: PCWSTR, i_pwsztmname: PCWSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssys_windows_win32_system_distributedtransactioncoordinator_DtcGetTransactionManagerExW(i_pwszhost.toCPointer<ByteVar>(), i_pwsztmname.toCPointer<ByteVar>(), i_riid.toCPointer<ByteVar>(), i_grfoptions, i_pvconfigparams.toCPointer<ByteVar>(), o_ppvobject.toCPointer<ByteVar>())
