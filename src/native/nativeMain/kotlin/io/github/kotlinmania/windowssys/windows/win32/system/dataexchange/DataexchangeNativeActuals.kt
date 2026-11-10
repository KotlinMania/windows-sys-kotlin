@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addAtomA(lpstring: Pcstr): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_addAtomA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_addAtomW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_addClipboardFormatListener(hwnd?.value?.toCPointer<ByteVar>())

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_changeClipboardChain(hwndremove?.value?.toCPointer<ByteVar>(), hwndnewnext?.value?.toCPointer<ByteVar>())

public actual fun closeClipboard(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_closeClipboard()

public actual fun countClipboardFormats(): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_countClipboardFormats()

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(idinst, hconv?.value?.toCPointer<ByteVar>(), idtransaction)

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeAccessData(hdata?.value?.toCPointer<ByteVar>(), pcbdatasize?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeAddData(hdata: Hddedata, psrc: COpaquePointer?, cb: UInt, cboff: UInt): Hddedata =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeAddData(hdata?.value?.toCPointer<ByteVar>(), psrc?.value?.toCPointer<ByteVar>(), cb, cboff)?.let { COpaquePointer(it.toLong()) }

public actual fun ddeClientTransaction(pdata: COpaquePointer?, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: COpaquePointer?): Hddedata =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeClientTransaction(pdata?.value?.toCPointer<ByteVar>(), cbdata, hconv?.value?.toCPointer<ByteVar>(), hszitem?.value?.toCPointer<ByteVar>(), wfmt, wtype, dwtimeout, pdwresult?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles(hsz1?.value?.toCPointer<ByteVar>(), hsz2?.value?.toCPointer<ByteVar>())

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: COpaquePointer?): Hconv =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeConnect(idinst, hszservice?.value?.toCPointer<ByteVar>(), hsztopic?.value?.toCPointer<ByteVar>(), pcc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: COpaquePointer?): Hconvlist =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeConnectList(idinst, hszservice?.value?.toCPointer<ByteVar>(), hsztopic?.value?.toCPointer<ByteVar>(), hconvlist?.value?.toCPointer<ByteVar>(), pcc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: COpaquePointer?, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(idinst, psrc?.value?.toCPointer<ByteVar>(), cb, cboff, hszitem?.value?.toCPointer<ByteVar>(), wfmt, afcmd)?.let { COpaquePointer(it.toLong()) }

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(idinst, psz?.value?.toCPointer<ByteVar>(), icodepage)?.let { COpaquePointer(it.toLong()) }

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(idinst, psz?.value?.toCPointer<ByteVar>(), icodepage)?.let { COpaquePointer(it.toLong()) }

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeDisconnect(hconv?.value?.toCPointer<ByteVar>())

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeDisconnectList(hconvlist?.value?.toCPointer<ByteVar>())

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeEnableCallback(idinst, hconv?.value?.toCPointer<ByteVar>(), wcmd)

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle(hdata?.value?.toCPointer<ByteVar>())

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(idinst, hsz?.value?.toCPointer<ByteVar>())

public actual fun ddeGetData(hdata: Hddedata, pdst: COpaquePointer?, cbmax: UInt, cboff: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeGetData(hdata?.value?.toCPointer<ByteVar>(), pdst?.value?.toCPointer<ByteVar>(), cbmax, cboff)

public actual fun ddeGetLastError(idinst: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeGetLastError(idinst)

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeImpersonateClient(hconv?.value?.toCPointer<ByteVar>())

public actual fun ddeInitializeA(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeInitializeA(pidinst?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), afcmd, ulres)

public actual fun ddeInitializeW(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeInitializeW(pidinst?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), afcmd, ulres)

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(idinst, hsz?.value?.toCPointer<ByteVar>())

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeNameService(idinst, hsz1?.value?.toCPointer<ByteVar>(), hsz2?.value?.toCPointer<ByteVar>(), afcmd)?.let { COpaquePointer(it.toLong()) }

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddePostAdvise(idinst, hsztopic?.value?.toCPointer<ByteVar>(), hszitem?.value?.toCPointer<ByteVar>())

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo(hconv?.value?.toCPointer<ByteVar>(), idtransaction, pconvinfo?.value?.toCPointer<ByteVar>())

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeQueryNextServer(hconvlist?.value?.toCPointer<ByteVar>(), hconvprev?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeQueryStringA(idinst, hsz?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>(), cchmax, icodepage)

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeQueryStringW(idinst, hsz?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>(), cchmax, icodepage)

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeReconnect(hconv?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: COpaquePointer?, pqosprev: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService(hwndclient?.value?.toCPointer<ByteVar>(), pqosnew?.value?.toCPointer<ByteVar>(), pqosprev?.value?.toCPointer<ByteVar>())

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeSetUserHandle(hconv?.value?.toCPointer<ByteVar>(), id, huser)

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeUnaccessData(hdata?.value?.toCPointer<ByteVar>())

public actual fun ddeUninitialize(idinst: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeUninitialize(idinst)

public actual fun deleteAtom(natom: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_deleteAtom(natom)

public actual fun emptyClipboard(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_emptyClipboard()

public actual fun enumClipboardFormats(format: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_enumClipboardFormats(format)

public actual fun findAtomA(lpstring: Pcstr): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_findAtomA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_findAtomW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_freeDDElParam(msg, lparam)

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getAtomNameA(natom, lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getAtomNameW(natom, lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getClipboardData(uformat: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardData(uformat)?.let { COpaquePointer(it.toLong()) }

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(format, lpszformatname?.value?.toCPointer<ByteVar>(), cchmaxcount)

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(format, lpszformatname?.value?.toCPointer<ByteVar>(), cchmaxcount)

public actual fun getClipboardOwner(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardOwner()?.let { COpaquePointer(it.toLong()) }

public actual fun getClipboardSequenceNumber(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber()

public actual fun getClipboardViewer(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardViewer()?.let { COpaquePointer(it.toLong()) }

public actual fun getOpenClipboardWindow(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow()?.let { COpaquePointer(it.toLong()) }

public actual fun getPriorityClipboardFormat(paformatprioritylist: COpaquePointer?, cformats: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat(paformatprioritylist?.value?.toCPointer<ByteVar>(), cformats)

public actual fun getUpdatedClipboardFormats(lpuiformats: COpaquePointer?, cformats: UInt, pcformatsout: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats(lpuiformats?.value?.toCPointer<ByteVar>(), cformats, pcformatsout?.value?.toCPointer<ByteVar>())

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalAddAtomA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalAddAtomExA(lpstring?.value?.toCPointer<ByteVar>(), flags)

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalAddAtomExW(lpstring?.value?.toCPointer<ByteVar>(), flags)

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalAddAtomW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun globalDeleteAtom(natom: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalDeleteAtom(natom)

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalFindAtomA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalFindAtomW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(natom, lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(natom, lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow(hwndclient?.value?.toCPointer<ByteVar>(), hwndserver?.value?.toCPointer<ByteVar>())

public actual fun initAtomTable(nsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_initAtomTable(nsize)

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(format)

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_openClipboard(hwndnewowner?.value?.toCPointer<ByteVar>())

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_packDDElParam(msg, uilo, uihi)

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_registerClipboardFormatA(lpszformat?.value?.toCPointer<ByteVar>())

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_registerClipboardFormatW(lpszformat?.value?.toCPointer<ByteVar>())

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener(hwnd?.value?.toCPointer<ByteVar>())

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_reuseDDElParam(lparam, msgin, msgout, uilo, uihi)

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_setClipboardData(uformat, hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_setClipboardViewer(hwndnewviewer?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: COpaquePointer?, hdcref: Hdc, lpmfp: COpaquePointer?): Henhmetafile =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(nsize, lpmeta16data?.value?.toCPointer<ByteVar>(), hdcref?.value?.toCPointer<ByteVar>(), lpmfp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: COpaquePointer?, puihi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_unpackDDElParam(msg, lparam, puilo?.value?.toCPointer<ByteVar>(), puihi?.value?.toCPointer<ByteVar>())
