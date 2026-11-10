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

public actual fun addAtomA(lpstring: Pcstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeClipboard(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun countClipboardFormats(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeAddData(hdata: Hddedata, psrc: COpaquePointer?, cb: UInt, cboff: UInt): Hddedata =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeClientTransaction(pdata: COpaquePointer?, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: COpaquePointer?): Hddedata =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: COpaquePointer?): Hconv =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: COpaquePointer?): Hconvlist =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: COpaquePointer?, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeGetData(hdata: Hddedata, pdst: COpaquePointer?, cbmax: UInt, cboff: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeGetLastError(idinst: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeInitializeA(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeInitializeW(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: COpaquePointer?, pqosprev: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddeUninitialize(idinst: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteAtom(natom: UShort): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun emptyClipboard(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumClipboardFormats(format: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findAtomA(lpstring: Pcstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipboardData(uformat: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipboardOwner(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipboardSequenceNumber(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipboardViewer(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getOpenClipboardWindow(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPriorityClipboardFormat(paformatprioritylist: COpaquePointer?, cformats: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUpdatedClipboardFormats(lpuiformats: COpaquePointer?, cformats: UInt, pcformatsout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalDeleteAtom(natom: UShort): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initAtomTable(nsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: COpaquePointer?, hdcref: Hdc, lpmfp: COpaquePointer?): Henhmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: COpaquePointer?, puihi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
