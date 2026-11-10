@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemDataexchangeJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_addAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_addAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_addClipboardFormatListener(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_changeClipboardChain(hwndremove: Long, hwndnewnext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_closeClipboard(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_countClipboardFormats(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(idinst: Int, hconv: Long, idtransaction: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeAccessData(hdata: Long, pcbdatasize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeAddData(hdata: Long, psrc: Long, cb: Int, cboff: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeClientTransaction(pdata: Long, cbdata: Int, hconv: Long, hszitem: Long, wfmt: Int, wtype: Int, dwtimeout: Int, pdwresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles(hsz1: Long, hsz2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeConnect(idinst: Int, hszservice: Long, hsztopic: Long, pcc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeConnectList(idinst: Int, hszservice: Long, hsztopic: Long, hconvlist: Long, pcc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(idinst: Int, psrc: Long, cb: Int, cboff: Int, hszitem: Long, wfmt: Int, afcmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(idinst: Int, psz: Long, icodepage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(idinst: Int, psz: Long, icodepage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeDisconnect(hconv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeDisconnectList(hconvlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeEnableCallback(idinst: Int, hconv: Long, wcmd: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle(hdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(idinst: Int, hsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeGetData(hdata: Long, pdst: Long, cbmax: Int, cboff: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeGetLastError(idinst: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeImpersonateClient(hconv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeInitializeA(pidinst: Long, pfncallback: Long, afcmd: Int, ulres: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeInitializeW(pidinst: Long, pfncallback: Long, afcmd: Int, ulres: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(idinst: Int, hsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeNameService(idinst: Int, hsz1: Long, hsz2: Long, afcmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddePostAdvise(idinst: Int, hsztopic: Long, hszitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo(hconv: Long, idtransaction: Int, pconvinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeQueryNextServer(hconvlist: Long, hconvprev: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeQueryStringA(idinst: Int, hsz: Long, psz: Long, cchmax: Int, icodepage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeQueryStringW(idinst: Int, hsz: Long, psz: Long, cchmax: Int, icodepage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeReconnect(hconv: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService(hwndclient: Long, pqosnew: Long, pqosprev: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeSetUserHandle(hconv: Long, id: Int, huser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeUnaccessData(hdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ddeUninitialize(idinst: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_deleteAtom(natom: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_emptyClipboard(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_enumClipboardFormats(format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_findAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_findAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_freeDDElParam(msg: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getAtomNameA(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getAtomNameW(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getClipboardData(uformat: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(format: Int, lpszformatname: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(format: Int, lpszformatname: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getClipboardOwner(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getClipboardViewer(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats(lpuiformats: Long, cformats: Int, pcformatsout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalAddAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalAddAtomExA(lpstring: Long, flags: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalAddAtomExW(lpstring: Long, flags: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalAddAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalDeleteAtom(natom: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalFindAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalFindAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow(hwndclient: Long, hwndserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_initAtomTable(nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_openClipboard(hwndnewowner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_packDDElParam(msg: Int, uilo: Long, uihi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_registerClipboardFormatA(lpszformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_registerClipboardFormatW(lpszformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_reuseDDElParam(lparam: Long, msgin: Int, msgout: Int, uilo: Long, uihi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_setClipboardData(uformat: Int, hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_setClipboardViewer(hwndnewviewer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(nsize: Int, lpmeta16data: Long, hdcref: Long, lpmfp: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_unpackDDElParam(msg: Int, lparam: Long, puilo: Long, puihi: Long): Int
}

public actual fun addAtomA(lpstring: Pcstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_addAtomA((lpstring?.value ?: 0L)).toUShort()

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_addAtomW((lpstring?.value ?: 0L)).toUShort()

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_addClipboardFormatListener((hwnd?.value ?: 0L))

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_changeClipboardChain((hwndremove?.value ?: 0L), (hwndnewnext?.value ?: 0L))

public actual fun closeClipboard(): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_closeClipboard()

public actual fun countClipboardFormats(): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_countClipboardFormats()

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(idinst.toInt(), (hconv?.value ?: 0L), idtransaction.toInt())

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeAccessData((hdata?.value ?: 0L), (pcbdatasize?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeAddData(hdata: Hddedata, psrc: COpaquePointer?, cb: UInt, cboff: UInt): Hddedata =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeAddData((hdata?.value ?: 0L), (psrc?.value ?: 0L), cb.toInt(), cboff.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeClientTransaction(pdata: COpaquePointer?, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: COpaquePointer?): Hddedata =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeClientTransaction((pdata?.value ?: 0L), cbdata.toInt(), (hconv?.value ?: 0L), (hszitem?.value ?: 0L), wfmt.toInt(), wtype.toInt(), dwtimeout.toInt(), (pdwresult?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles((hsz1?.value ?: 0L), (hsz2?.value ?: 0L))

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: COpaquePointer?): Hconv =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeConnect(idinst.toInt(), (hszservice?.value ?: 0L), (hsztopic?.value ?: 0L), (pcc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: COpaquePointer?): Hconvlist =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeConnectList(idinst.toInt(), (hszservice?.value ?: 0L), (hsztopic?.value ?: 0L), (hconvlist?.value ?: 0L), (pcc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: COpaquePointer?, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(idinst.toInt(), (psrc?.value ?: 0L), cb.toInt(), cboff.toInt(), (hszitem?.value ?: 0L), wfmt.toInt(), afcmd.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(idinst.toInt(), (psz?.value ?: 0L), icodepage).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(idinst.toInt(), (psz?.value ?: 0L), icodepage).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeDisconnect((hconv?.value ?: 0L))

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeDisconnectList((hconvlist?.value ?: 0L))

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeEnableCallback(idinst.toInt(), (hconv?.value ?: 0L), wcmd.toInt())

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle((hdata?.value ?: 0L))

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(idinst.toInt(), (hsz?.value ?: 0L))

public actual fun ddeGetData(hdata: Hddedata, pdst: COpaquePointer?, cbmax: UInt, cboff: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeGetData((hdata?.value ?: 0L), (pdst?.value ?: 0L), cbmax.toInt(), cboff.toInt()).toUInt()

public actual fun ddeGetLastError(idinst: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeGetLastError(idinst.toInt()).toUInt()

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeImpersonateClient((hconv?.value ?: 0L))

public actual fun ddeInitializeA(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeInitializeA((pidinst?.value ?: 0L), 0L, afcmd.toInt(), ulres.toInt()).toUInt()

public actual fun ddeInitializeW(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeInitializeW((pidinst?.value ?: 0L), 0L, afcmd.toInt(), ulres.toInt()).toUInt()

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(idinst.toInt(), (hsz?.value ?: 0L))

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeNameService(idinst.toInt(), (hsz1?.value ?: 0L), (hsz2?.value ?: 0L), afcmd.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddePostAdvise(idinst.toInt(), (hsztopic?.value ?: 0L), (hszitem?.value ?: 0L))

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: COpaquePointer?): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo((hconv?.value ?: 0L), idtransaction.toInt(), (pconvinfo?.value ?: 0L)).toUInt()

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeQueryNextServer((hconvlist?.value ?: 0L), (hconvprev?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeQueryStringA(idinst.toInt(), (hsz?.value ?: 0L), (psz?.value ?: 0L), cchmax.toInt(), icodepage).toUInt()

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeQueryStringW(idinst.toInt(), (hsz?.value ?: 0L), (psz?.value ?: 0L), cchmax.toInt(), icodepage).toUInt()

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeReconnect((hconv?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: COpaquePointer?, pqosprev: COpaquePointer?): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService((hwndclient?.value ?: 0L), (pqosnew?.value ?: 0L), (pqosprev?.value ?: 0L))

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeSetUserHandle((hconv?.value ?: 0L), id.toInt(), huser.toLong())

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeUnaccessData((hdata?.value ?: 0L))

public actual fun ddeUninitialize(idinst: UInt): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ddeUninitialize(idinst.toInt())

public actual fun deleteAtom(natom: UShort): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_deleteAtom(natom.toShort()).toUShort()

public actual fun emptyClipboard(): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_emptyClipboard()

public actual fun enumClipboardFormats(format: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_enumClipboardFormats(format.toInt()).toUInt()

public actual fun findAtomA(lpstring: Pcstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_findAtomA((lpstring?.value ?: 0L)).toUShort()

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_findAtomW((lpstring?.value ?: 0L)).toUShort()

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_freeDDElParam(msg.toInt(), lparam)

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getAtomNameA(natom.toShort(), (lpbuffer?.value ?: 0L), nsize).toUInt()

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getAtomNameW(natom.toShort(), (lpbuffer?.value ?: 0L), nsize).toUInt()

public actual fun getClipboardData(uformat: UInt): Handle =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getClipboardData(uformat.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(format.toInt(), (lpszformatname?.value ?: 0L), cchmaxcount)

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(format.toInt(), (lpszformatname?.value ?: 0L), cchmaxcount)

public actual fun getClipboardOwner(): Hwnd =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getClipboardOwner().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getClipboardSequenceNumber(): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber().toUInt()

public actual fun getClipboardViewer(): Hwnd =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getClipboardViewer().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getOpenClipboardWindow(): Hwnd =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getPriorityClipboardFormat(paformatprioritylist: COpaquePointer?, cformats: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat((paformatprioritylist?.value ?: 0L), cformats)

public actual fun getUpdatedClipboardFormats(lpuiformats: COpaquePointer?, cformats: UInt, pcformatsout: COpaquePointer?): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats((lpuiformats?.value ?: 0L), cformats.toInt(), (pcformatsout?.value ?: 0L))

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalAddAtomA((lpstring?.value ?: 0L)).toUShort()

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalAddAtomExA((lpstring?.value ?: 0L), flags.toInt()).toUShort()

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalAddAtomExW((lpstring?.value ?: 0L), flags.toInt()).toUShort()

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalAddAtomW((lpstring?.value ?: 0L)).toUShort()

public actual fun globalDeleteAtom(natom: UShort): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalDeleteAtom(natom.toShort()).toUShort()

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalFindAtomA((lpstring?.value ?: 0L)).toUShort()

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalFindAtomW((lpstring?.value ?: 0L)).toUShort()

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(natom.toShort(), (lpbuffer?.value ?: 0L), nsize).toUInt()

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(natom.toShort(), (lpbuffer?.value ?: 0L), nsize).toUInt()

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow((hwndclient?.value ?: 0L), (hwndserver?.value ?: 0L))

public actual fun initAtomTable(nsize: UInt): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_initAtomTable(nsize.toInt())

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(format.toInt())

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_openClipboard((hwndnewowner?.value ?: 0L))

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_packDDElParam(msg.toInt(), uilo.toLong(), uihi.toLong())

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_registerClipboardFormatA((lpszformat?.value ?: 0L)).toUInt()

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_registerClipboardFormatW((lpszformat?.value ?: 0L)).toUInt()

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener((hwnd?.value ?: 0L))

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_reuseDDElParam(lparam, msgin.toInt(), msgout.toInt(), uilo.toLong(), uihi.toLong())

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_setClipboardData(uformat.toInt(), (hmem?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_setClipboardViewer((hwndnewviewer?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: COpaquePointer?, hdcref: Hdc, lpmfp: COpaquePointer?): Henhmetafile =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(nsize.toInt(), (lpmeta16data?.value ?: 0L), (hdcref?.value ?: 0L), (lpmfp?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: COpaquePointer?, puihi: COpaquePointer?): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_unpackDDElParam(msg.toInt(), lparam, (puilo?.value ?: 0L), (puihi?.value ?: 0L))
