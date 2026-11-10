@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ldapGetLastError(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetLastError()

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapMapErrorToWin32(ldaperror)

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapUTF8ToUnicode(lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpdeststr?.value?.toCPointer<ByteVar>(), cchdest)

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapUnicodeToUTF8(lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpdeststr?.value?.toCPointer<ByteVar>(), cchdest)

public actual fun berAllocT(options: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berAllocT(options)?.let { COpaquePointer(it.toLong()) }

public actual fun berBvdup(pberval: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berBvdup(pberval?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun berBvecfree(pberval: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berBvecfree(pberval?.value?.toCPointer<ByteVar>())
}

public actual fun berBvfree(bv: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berBvfree(bv?.value?.toCPointer<ByteVar>())
}

public actual fun berFirstElement(pberelement: COpaquePointer?, plen: COpaquePointer?, ppopaque: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berFirstElement(pberelement?.value?.toCPointer<ByteVar>(), plen?.value?.toCPointer<ByteVar>(), ppopaque?.value?.toCPointer<ByteVar>())

public actual fun berFlatten(pberelement: COpaquePointer?, pberval: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berFlatten(pberelement?.value?.toCPointer<ByteVar>(), pberval?.value?.toCPointer<ByteVar>())

public actual fun berFree(pberelement: COpaquePointer?, fbuf: Int) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berFree(pberelement?.value?.toCPointer<ByteVar>(), fbuf)
}

public actual fun berInit(pberval: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berInit(pberval?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun berNextElement(pberelement: COpaquePointer?, plen: COpaquePointer?, opaque: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berNextElement(pberelement?.value?.toCPointer<ByteVar>(), plen?.value?.toCPointer<ByteVar>(), opaque?.value?.toCPointer<ByteVar>())

public actual fun berPeekTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berPeekTag(pberelement?.value?.toCPointer<ByteVar>(), plen?.value?.toCPointer<ByteVar>())

public actual fun berPrintf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berPrintf(pberelement?.value?.toCPointer<ByteVar>(), fmt?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun berScanf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berScanf(pberelement?.value?.toCPointer<ByteVar>(), fmt?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun berSkipTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_berSkipTag(pberelement?.value?.toCPointer<ByteVar>(), plen?.value?.toCPointer<ByteVar>())

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_cldapOpen(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_cldapOpenA(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_cldapOpenW(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapAbandon(ld: COpaquePointer?, msgid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAbandon(ld?.value?.toCPointer<ByteVar>(), msgid)

public actual fun ldapAdd(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAdd(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>())

public actual fun ldapAddA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>())

public actual fun ldapAddW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>())

public actual fun ldapAddExt(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddExt(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapAddExtA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddExtA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapAddExtW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddExtW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapAddExtS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddExtS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapAddExtSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddExtSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapAddExtSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddExtSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapAddS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>())

public actual fun ldapAddSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>())

public actual fun ldapAddSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapAddSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>())

public actual fun ldapBind(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapBind(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), method)

public actual fun ldapBindA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapBindA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), method)

public actual fun ldapBindW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapBindW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), method)

public actual fun ldapBindS(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapBindS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), method)

public actual fun ldapBindSA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapBindSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), method)

public actual fun ldapBindSW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapBindSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), method)

public actual fun ldapCheckFilterA(ld: COpaquePointer?, searchfilter: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCheckFilterA(ld?.value?.toCPointer<ByteVar>(), searchfilter?.value?.toCPointer<ByteVar>())

public actual fun ldapCheckFilterW(ld: COpaquePointer?, searchfilter: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCheckFilterW(ld?.value?.toCPointer<ByteVar>(), searchfilter?.value?.toCPointer<ByteVar>())

public actual fun ldapCleanup(hinstance: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCleanup(hinstance?.value?.toCPointer<ByteVar>())

public actual fun ldapCloseExtendedOp(ld: COpaquePointer?, messagenumber: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCloseExtendedOp(ld?.value?.toCPointer<ByteVar>(), messagenumber)

public actual fun ldapCompare(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompare(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareExt(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareExt(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareExtA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareExtA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareExtW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareExtW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareExtS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareExtS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareExtSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareExtSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareExtSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareExtSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun ldapCompareSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCompareSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun ldapConnFromMsg(primaryconn: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapConnFromMsg(primaryconn?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapConnect(ld: COpaquePointer?, timeout: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapConnect(ld?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun ldapControlFree(control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapControlFree(control?.value?.toCPointer<ByteVar>())

public actual fun ldapControlFreeA(controls: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapControlFreeA(controls?.value?.toCPointer<ByteVar>())

public actual fun ldapControlFreeW(control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapControlFreeW(control?.value?.toCPointer<ByteVar>())

public actual fun ldapControlsFree(controls: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapControlsFree(controls?.value?.toCPointer<ByteVar>())

public actual fun ldapControlsFreeA(controls: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapControlsFreeA(controls?.value?.toCPointer<ByteVar>())

public actual fun ldapControlsFreeW(control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapControlsFreeW(control?.value?.toCPointer<ByteVar>())

public actual fun ldapCountEntries(ld: COpaquePointer?, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCountEntries(ld?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun ldapCountReferences(ld: COpaquePointer?, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCountReferences(ld?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun ldapCountValues(vals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCountValues(vals?.value?.toCPointer<ByteVar>())

public actual fun ldapCountValuesA(vals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCountValuesA(vals?.value?.toCPointer<ByteVar>())

public actual fun ldapCountValuesW(vals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCountValuesW(vals?.value?.toCPointer<ByteVar>())

public actual fun ldapCountValuesLen(vals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCountValuesLen(vals?.value?.toCPointer<ByteVar>())

public actual fun ldapCreatePageControl(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCreatePageControl(externalhandle?.value?.toCPointer<ByteVar>(), pagesize, cookie?.value?.toCPointer<ByteVar>(), iscritical, control?.value?.toCPointer<ByteVar>())

public actual fun ldapCreatePageControlA(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCreatePageControlA(externalhandle?.value?.toCPointer<ByteVar>(), pagesize, cookie?.value?.toCPointer<ByteVar>(), iscritical, control?.value?.toCPointer<ByteVar>())

public actual fun ldapCreatePageControlW(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCreatePageControlW(externalhandle?.value?.toCPointer<ByteVar>(), pagesize, cookie?.value?.toCPointer<ByteVar>(), iscritical, control?.value?.toCPointer<ByteVar>())

public actual fun ldapCreateSortControl(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCreateSortControl(externalhandle?.value?.toCPointer<ByteVar>(), sortkeys?.value?.toCPointer<ByteVar>(), iscritical, control?.value?.toCPointer<ByteVar>())

public actual fun ldapCreateSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCreateSortControlA(externalhandle?.value?.toCPointer<ByteVar>(), sortkeys?.value?.toCPointer<ByteVar>(), iscritical, control?.value?.toCPointer<ByteVar>())

public actual fun ldapCreateSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCreateSortControlW(externalhandle?.value?.toCPointer<ByteVar>(), sortkeys?.value?.toCPointer<ByteVar>(), iscritical, control?.value?.toCPointer<ByteVar>())

public actual fun ldapCreateVlvControlA(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCreateVlvControlA(externalhandle?.value?.toCPointer<ByteVar>(), vlvinfo?.value?.toCPointer<ByteVar>(), iscritical, control?.value?.toCPointer<ByteVar>())

public actual fun ldapCreateVlvControlW(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapCreateVlvControlW(externalhandle?.value?.toCPointer<ByteVar>(), vlvinfo?.value?.toCPointer<ByteVar>(), iscritical, control?.value?.toCPointer<ByteVar>())

public actual fun ldapDelete(ld: COpaquePointer?, dn: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDelete(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteA(ld: COpaquePointer?, dn: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteW(ld: COpaquePointer?, dn: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteExt(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteExt(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteExtA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteExtA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteExtW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteExtW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteExtS(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteExtS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteExtSA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteExtSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteExtSW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteExtSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteS(ld: COpaquePointer?, dn: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteSA(ld: COpaquePointer?, dn: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>())

public actual fun ldapDeleteSW(ld: COpaquePointer?, dn: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDeleteSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>())

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDn2ufn(dn?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDn2ufnA(dn?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapDn2ufnW(dn?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapEncodeSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapEncodeSortControlA(externalhandle?.value?.toCPointer<ByteVar>(), sortkeys?.value?.toCPointer<ByteVar>(), control?.value?.toCPointer<ByteVar>(), criticality)

public actual fun ldapEncodeSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapEncodeSortControlW(externalhandle?.value?.toCPointer<ByteVar>(), sortkeys?.value?.toCPointer<ByteVar>(), control?.value?.toCPointer<ByteVar>(), criticality)

public actual fun ldapErr2string(err: UInt): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapErr2string(err)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapErr2stringA(err: UInt): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapErr2stringA(err)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapErr2stringW(err)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElement(sourcefilterelement?.value?.toCPointer<ByteVar>(), sourcelength, destfilterelement?.value?.toCPointer<ByteVar>(), destlength)

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementA(sourcefilterelement?.value?.toCPointer<ByteVar>(), sourcelength, destfilterelement?.value?.toCPointer<ByteVar>(), destlength)

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementW(sourcefilterelement?.value?.toCPointer<ByteVar>(), sourcelength, destfilterelement?.value?.toCPointer<ByteVar>(), destlength)

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapExplodeDn(dn?.value?.toCPointer<ByteVar>(), notypes)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapExplodeDnA(dn?.value?.toCPointer<ByteVar>(), notypes)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapExplodeDnW(dn?.value?.toCPointer<ByteVar>(), notypes)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapExtendedOperation(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapExtendedOperation(ld?.value?.toCPointer<ByteVar>(), oid?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapExtendedOperationA(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapExtendedOperationA(ld?.value?.toCPointer<ByteVar>(), oid?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapExtendedOperationW(ld: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapExtendedOperationW(ld?.value?.toCPointer<ByteVar>(), oid?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapExtendedOperationSA(externalhandle: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapExtendedOperationSA(externalhandle?.value?.toCPointer<ByteVar>(), oid?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), returnedoid?.value?.toCPointer<ByteVar>(), returneddata?.value?.toCPointer<ByteVar>())

public actual fun ldapExtendedOperationSW(externalhandle: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapExtendedOperationSW(externalhandle?.value?.toCPointer<ByteVar>(), oid?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), returnedoid?.value?.toCPointer<ByteVar>(), returneddata?.value?.toCPointer<ByteVar>())

public actual fun ldapFirstAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapFirstAttribute(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapFirstAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapFirstAttributeA(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapFirstAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapFirstAttributeW(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapFirstEntry(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapFirstEntry(ld?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapFirstReference(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapFirstReference(ld?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapFreeControls(controls: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapFreeControls(controls?.value?.toCPointer<ByteVar>())

public actual fun ldapFreeControlsA(controls: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapFreeControlsA(controls?.value?.toCPointer<ByteVar>())

public actual fun ldapFreeControlsW(controls: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapFreeControlsW(controls?.value?.toCPointer<ByteVar>())

public actual fun ldapGetDn(ld: COpaquePointer?, entry: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetDn(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapGetDnA(ld: COpaquePointer?, entry: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetDnA(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapGetDnW(ld: COpaquePointer?, entry: COpaquePointer?): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetDnW(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapGetNextPage(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetNextPage(externalhandle?.value?.toCPointer<ByteVar>(), searchhandle.toLong(), pagesize, messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapGetNextPageS(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, timeout: COpaquePointer?, pagesize: UInt, totalcount: COpaquePointer?, results: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetNextPageS(externalhandle?.value?.toCPointer<ByteVar>(), searchhandle.toLong(), timeout?.value?.toCPointer<ByteVar>(), pagesize, totalcount?.value?.toCPointer<ByteVar>(), results?.value?.toCPointer<ByteVar>())

public actual fun ldapGetOption(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetOption(ld?.value?.toCPointer<ByteVar>(), option, outvalue?.value?.toCPointer<ByteVar>())

public actual fun ldapGetOptionW(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetOptionW(ld?.value?.toCPointer<ByteVar>(), option, outvalue?.value?.toCPointer<ByteVar>())

public actual fun ldapGetPagedCount(externalhandle: COpaquePointer?, searchblock: PLDAPSearch, totalcount: COpaquePointer?, results: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetPagedCount(externalhandle?.value?.toCPointer<ByteVar>(), searchblock.toLong(), totalcount?.value?.toCPointer<ByteVar>(), results?.value?.toCPointer<ByteVar>())

public actual fun ldapGetValues(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetValues(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapGetValuesA(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetValuesA(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapGetValuesW(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcwstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetValuesW(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapGetValuesLen(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetValuesLen(externalhandle?.value?.toCPointer<ByteVar>(), message?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapGetValuesLenA(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetValuesLenA(externalhandle?.value?.toCPointer<ByteVar>(), message?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapGetValuesLenW(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcwstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapGetValuesLenW(externalhandle?.value?.toCPointer<ByteVar>(), message?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapInit(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapInitA(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapInitW(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapMemfree(block: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapMemfree(block?.value?.toCPointer<ByteVar>())
}

public actual fun ldapMemfreeA(block: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapMemfreeA(block?.value?.toCPointer<ByteVar>())
}

public actual fun ldapMemfreeW(block: Pcwstr) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapMemfreeW(block?.value?.toCPointer<ByteVar>())
}

public actual fun ldapModify(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModify(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyExt(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyExt(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyExtA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyExtA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyExtW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyExtW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyExtS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyExtS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyExtSA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyExtSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyExtSW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyExtSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapModifyS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifyS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>())

public actual fun ldapModifySA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifySA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>())

public actual fun ldapModifySW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModifySW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), mods?.value?.toCPointer<ByteVar>())

public actual fun ldapModrdn(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdn(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>())

public actual fun ldapModrdn2(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdn2(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2A(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdn2A(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2W(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdn2W(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2S(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdn2S(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2SA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdn2SA(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2SW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdn2SW(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdnA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdnA(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>())

public actual fun ldapModrdnW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdnW(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>())

public actual fun ldapModrdnS(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdnS(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>())

public actual fun ldapModrdnSA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdnSA(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>())

public actual fun ldapModrdnSW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapModrdnSW(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), newdistinguishedname?.value?.toCPointer<ByteVar>())

public actual fun ldapMsgfree(res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapMsgfree(res?.value?.toCPointer<ByteVar>())

public actual fun ldapNextAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapNextAttribute(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapNextAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapNextAttributeA(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapNextAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapNextAttributeW(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapNextEntry(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapNextEntry(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapNextReference(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapNextReference(ld?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapOpen(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapOpenA(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapOpenW(hostname?.value?.toCPointer<ByteVar>(), portnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapParseExtendedResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseExtendedResultA(connection?.value?.toCPointer<ByteVar>(), resultmessage?.value?.toCPointer<ByteVar>(), resultoid?.value?.toCPointer<ByteVar>(), resultdata?.value?.toCPointer<ByteVar>(), freeit)

public actual fun ldapParseExtendedResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseExtendedResultW(connection?.value?.toCPointer<ByteVar>(), resultmessage?.value?.toCPointer<ByteVar>(), resultoid?.value?.toCPointer<ByteVar>(), resultdata?.value?.toCPointer<ByteVar>(), freeit)

public actual fun ldapParsePageControl(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParsePageControl(externalhandle?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), totalcount?.value?.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>())

public actual fun ldapParsePageControlA(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParsePageControlA(externalhandle?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), totalcount?.value?.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>())

public actual fun ldapParsePageControlW(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParsePageControlW(externalhandle?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), totalcount?.value?.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>())

public actual fun ldapParseReference(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseReference(connection?.value?.toCPointer<ByteVar>(), resultmessage?.value?.toCPointer<ByteVar>(), referrals?.value?.toCPointer<ByteVar>())

public actual fun ldapParseReferenceA(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseReferenceA(connection?.value?.toCPointer<ByteVar>(), resultmessage?.value?.toCPointer<ByteVar>(), referrals?.value?.toCPointer<ByteVar>())

public actual fun ldapParseReferenceW(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseReferenceW(connection?.value?.toCPointer<ByteVar>(), resultmessage?.value?.toCPointer<ByteVar>(), referrals?.value?.toCPointer<ByteVar>())

public actual fun ldapParseResult(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseResult(connection?.value?.toCPointer<ByteVar>(), resultmessage?.value?.toCPointer<ByteVar>(), returncode?.value?.toCPointer<ByteVar>(), matcheddns?.value?.toCPointer<ByteVar>(), errormessage?.value?.toCPointer<ByteVar>(), referrals?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), freeit)

public actual fun ldapParseResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseResultA(connection?.value?.toCPointer<ByteVar>(), resultmessage?.value?.toCPointer<ByteVar>(), returncode?.value?.toCPointer<ByteVar>(), matcheddns?.value?.toCPointer<ByteVar>(), errormessage?.value?.toCPointer<ByteVar>(), referrals?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), freeit)

public actual fun ldapParseResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseResultW(connection?.value?.toCPointer<ByteVar>(), resultmessage?.value?.toCPointer<ByteVar>(), returncode?.value?.toCPointer<ByteVar>(), matcheddns?.value?.toCPointer<ByteVar>(), errormessage?.value?.toCPointer<ByteVar>(), referrals?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), freeit)

public actual fun ldapParseSortControl(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseSortControl(externalhandle?.value?.toCPointer<ByteVar>(), control?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), attribute?.value?.toCPointer<ByteVar>())

public actual fun ldapParseSortControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseSortControlA(externalhandle?.value?.toCPointer<ByteVar>(), control?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), attribute?.value?.toCPointer<ByteVar>())

public actual fun ldapParseSortControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseSortControlW(externalhandle?.value?.toCPointer<ByteVar>(), control?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), attribute?.value?.toCPointer<ByteVar>())

public actual fun ldapParseVlvControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseVlvControlA(externalhandle?.value?.toCPointer<ByteVar>(), control?.value?.toCPointer<ByteVar>(), targetpos?.value?.toCPointer<ByteVar>(), listcount?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), errcode?.value?.toCPointer<ByteVar>())

public actual fun ldapParseVlvControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapParseVlvControlW(externalhandle?.value?.toCPointer<ByteVar>(), control?.value?.toCPointer<ByteVar>(), targetpos?.value?.toCPointer<ByteVar>(), listcount?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), errcode?.value?.toCPointer<ByteVar>())

public actual fun ldapPerror(ld: COpaquePointer?, msg: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapPerror(ld?.value?.toCPointer<ByteVar>(), msg?.value?.toCPointer<ByteVar>())
}

public actual fun ldapRenameExt(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapRenameExt(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), newrdn?.value?.toCPointer<ByteVar>(), newparent?.value?.toCPointer<ByteVar>(), deleteoldrdn, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapRenameExtA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapRenameExtA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), newrdn?.value?.toCPointer<ByteVar>(), newparent?.value?.toCPointer<ByteVar>(), deleteoldrdn, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapRenameExtW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapRenameExtW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), newrdn?.value?.toCPointer<ByteVar>(), newparent?.value?.toCPointer<ByteVar>(), deleteoldrdn, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapRenameExtS(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapRenameExtS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), newrdn?.value?.toCPointer<ByteVar>(), newparent?.value?.toCPointer<ByteVar>(), deleteoldrdn, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapRenameExtSA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapRenameExtSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), newrdn?.value?.toCPointer<ByteVar>(), newparent?.value?.toCPointer<ByteVar>(), deleteoldrdn, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapRenameExtSW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapRenameExtSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), newrdn?.value?.toCPointer<ByteVar>(), newparent?.value?.toCPointer<ByteVar>(), deleteoldrdn, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapResult(ld: COpaquePointer?, msgid: UInt, all: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapResult(ld?.value?.toCPointer<ByteVar>(), msgid, all, timeout?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun ldapResult2error(ld: COpaquePointer?, res: COpaquePointer?, freeit: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapResult2error(ld?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>(), freeit)

public actual fun ldapSaslBindA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSaslBindA(externalhandle?.value?.toCPointer<ByteVar>(), distname?.value?.toCPointer<ByteVar>(), authmechanism?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), serverctrls?.value?.toCPointer<ByteVar>(), clientctrls?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapSaslBindW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSaslBindW(externalhandle?.value?.toCPointer<ByteVar>(), distname?.value?.toCPointer<ByteVar>(), authmechanism?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), serverctrls?.value?.toCPointer<ByteVar>(), clientctrls?.value?.toCPointer<ByteVar>(), messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapSaslBindSA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSaslBindSA(externalhandle?.value?.toCPointer<ByteVar>(), distname?.value?.toCPointer<ByteVar>(), authmechanism?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), serverctrls?.value?.toCPointer<ByteVar>(), clientctrls?.value?.toCPointer<ByteVar>(), serverdata?.value?.toCPointer<ByteVar>())

public actual fun ldapSaslBindSW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSaslBindSW(externalhandle?.value?.toCPointer<ByteVar>(), distname?.value?.toCPointer<ByteVar>(), authmechanism?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>(), serverctrls?.value?.toCPointer<ByteVar>(), clientctrls?.value?.toCPointer<ByteVar>(), serverdata?.value?.toCPointer<ByteVar>())

public actual fun ldapSearch(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearch(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly)

public actual fun ldapSearchA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchA(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly)

public actual fun ldapSearchW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchW(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly)

public actual fun ldapSearchAbandonPage(externalhandle: COpaquePointer?, searchblock: PLDAPSearch): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchAbandonPage(externalhandle?.value?.toCPointer<ByteVar>(), searchblock.toLong())

public actual fun ldapSearchExt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchExt(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchExtA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchExtA(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchExtW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchExtW(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchExtS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchExtS(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), sizelimit, res?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchExtSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchExtSA(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), sizelimit, res?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchExtSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchExtSW(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), sizelimit, res?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchInitPage(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchInitPage(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), scopeofsearch, searchfilter?.value?.toCPointer<ByteVar>(), attributelist?.value?.toCPointer<ByteVar>(), attributesonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchInitPageA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchInitPageA(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), scopeofsearch, searchfilter?.value?.toCPointer<ByteVar>(), attributelist?.value?.toCPointer<ByteVar>(), attributesonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchInitPageW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchInitPageW(externalhandle?.value?.toCPointer<ByteVar>(), distinguishedname?.value?.toCPointer<ByteVar>(), scopeofsearch, searchfilter?.value?.toCPointer<ByteVar>(), attributelist?.value?.toCPointer<ByteVar>(), attributesonly, servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchS(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, res?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchSA(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, res?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchSW(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, res?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchSt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchSt(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, timeout?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchStA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchStA(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, timeout?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun ldapSearchStW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSearchStW(ld?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), scope, filter?.value?.toCPointer<ByteVar>(), attrs?.value?.toCPointer<ByteVar>(), attrsonly, timeout?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSetDbgFlags(newflags)

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSetDbgRoutine(0L.toCPointer<ByteVar>())
}

public actual fun ldapSetOption(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSetOption(ld?.value?.toCPointer<ByteVar>(), option, invalue?.value?.toCPointer<ByteVar>())

public actual fun ldapSetOptionW(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSetOptionW(ld?.value?.toCPointer<ByteVar>(), option, invalue?.value?.toCPointer<ByteVar>())

public actual fun ldapSimpleBind(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSimpleBind(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), passwd?.value?.toCPointer<ByteVar>())

public actual fun ldapSimpleBindA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSimpleBindA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), passwd?.value?.toCPointer<ByteVar>())

public actual fun ldapSimpleBindW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSimpleBindW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), passwd?.value?.toCPointer<ByteVar>())

public actual fun ldapSimpleBindS(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSimpleBindS(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), passwd?.value?.toCPointer<ByteVar>())

public actual fun ldapSimpleBindSA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSimpleBindSA(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), passwd?.value?.toCPointer<ByteVar>())

public actual fun ldapSimpleBindSW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSimpleBindSW(ld?.value?.toCPointer<ByteVar>(), dn?.value?.toCPointer<ByteVar>(), passwd?.value?.toCPointer<ByteVar>())

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSslinit(hostname?.value?.toCPointer<ByteVar>(), portnumber, secure)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSslinitA(hostname?.value?.toCPointer<ByteVar>(), portnumber, secure)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapSslinitW(hostname?.value?.toCPointer<ByteVar>(), portnumber, secure)?.let { COpaquePointer(it.toLong()) }

public actual fun ldapStartTlsSA(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapStartTlsSA(externalhandle?.value?.toCPointer<ByteVar>(), serverreturnvalue?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapStartTlsSW(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapStartTlsSW(externalhandle?.value?.toCPointer<ByteVar>(), serverreturnvalue?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), servercontrols?.value?.toCPointer<ByteVar>(), clientcontrols?.value?.toCPointer<ByteVar>())

public actual fun ldapStartup(version: COpaquePointer?, instance: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapStartup(version?.value?.toCPointer<ByteVar>(), instance?.value?.toCPointer<ByteVar>())

public actual fun ldapStopTlsS(externalhandle: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapStopTlsS(externalhandle?.value?.toCPointer<ByteVar>())

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapUfn2dn(ufn?.value?.toCPointer<ByteVar>(), pdn?.value?.toCPointer<ByteVar>())

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapUfn2dnA(ufn?.value?.toCPointer<ByteVar>(), pdn?.value?.toCPointer<ByteVar>())

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapUfn2dnW(ufn?.value?.toCPointer<ByteVar>(), pdn?.value?.toCPointer<ByteVar>())

public actual fun ldapUnbind(ld: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapUnbind(ld?.value?.toCPointer<ByteVar>())

public actual fun ldapUnbindS(ld: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapUnbindS(ld?.value?.toCPointer<ByteVar>())

public actual fun ldapValueFree(vals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapValueFree(vals?.value?.toCPointer<ByteVar>())

public actual fun ldapValueFreeA(vals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapValueFreeA(vals?.value?.toCPointer<ByteVar>())

public actual fun ldapValueFreeW(vals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapValueFreeW(vals?.value?.toCPointer<ByteVar>())

public actual fun ldapValueFreeLen(vals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldapValueFreeLen(vals?.value?.toCPointer<ByteVar>())
