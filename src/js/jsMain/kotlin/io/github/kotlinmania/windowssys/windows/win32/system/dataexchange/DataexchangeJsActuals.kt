@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE

private val _windowsWin32SystemDataexchangeNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddAtomA(lpstring: PCSTR): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_AddAtomA(lpstring.toString()) as Int).toUShort() else 0u

public actual fun AddAtomW(lpstring: PCWSTR): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_AddAtomW(lpstring.toString()) as Int).toUShort() else 0u

public actual fun AddClipboardFormatListener(hwnd: HWND): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_AddClipboardFormatListener(hwnd.toString()) as Int) else 0

public actual fun ChangeClipboardChain(hwndremove: HWND, hwndnewnext: HWND): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ChangeClipboardChain(hwndremove.toString(), hwndnewnext.toString()) as Int) else 0

public actual fun CloseClipboard(): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_CloseClipboard() as Int) else 0

public actual fun CountClipboardFormats(): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_CountClipboardFormats() as Int) else 0

public actual fun DdeAbandonTransaction(idinst: UInt, hconv: HCONV, idtransaction: UInt): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeAbandonTransaction(idinst.toInt(), hconv.toString(), idtransaction.toInt()) as Int) else 0

public actual fun DdeAccessData(hdata: HDDEDATA, pcbdatasize: Long): Long =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeAccessData(hdata.toString(), pcbdatasize.toString()) as String).toLong() else 0L

public actual fun DdeAddData(hdata: HDDEDATA, psrc: Long, cb: UInt, cboff: UInt): HDDEDATA =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeAddData(hdata.toString(), psrc.toString(), cb.toInt(), cboff.toInt()) as String).toLong() else 0L

public actual fun DdeClientTransaction(pdata: Long, cbdata: UInt, hconv: HCONV, hszitem: HSZ, wfmt: UInt, wtype: DDE_CLIENT_TRANSACTION_TYPE, dwtimeout: UInt, pdwresult: Long): HDDEDATA =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeClientTransaction(pdata.toString(), cbdata.toInt(), hconv.toString(), hszitem.toString(), wfmt.toInt(), wtype.toInt(), dwtimeout.toInt(), pdwresult.toString()) as String).toLong() else 0L

public actual fun DdeCmpStringHandles(hsz1: HSZ, hsz2: HSZ): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeCmpStringHandles(hsz1.toString(), hsz2.toString()) as Int) else 0

public actual fun DdeConnect(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, pcc: Long): HCONV =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeConnect(idinst.toInt(), hszservice.toString(), hsztopic.toString(), pcc.toString()) as String).toLong() else 0L

public actual fun DdeConnectList(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, hconvlist: HCONVLIST, pcc: Long): HCONVLIST =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeConnectList(idinst.toInt(), hszservice.toString(), hsztopic.toString(), hconvlist.toString(), pcc.toString()) as String).toLong() else 0L

public actual fun DdeCreateDataHandle(idinst: UInt, psrc: Long, cb: UInt, cboff: UInt, hszitem: HSZ, wfmt: UInt, afcmd: UInt): HDDEDATA =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeCreateDataHandle(idinst.toInt(), psrc.toString(), cb.toInt(), cboff.toInt(), hszitem.toString(), wfmt.toInt(), afcmd.toInt()) as String).toLong() else 0L

public actual fun DdeCreateStringHandleA(idinst: UInt, psz: PCSTR, icodepage: Int): HSZ =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleA(idinst.toInt(), psz.toString(), icodepage) as String).toLong() else 0L

public actual fun DdeCreateStringHandleW(idinst: UInt, psz: PCWSTR, icodepage: Int): HSZ =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleW(idinst.toInt(), psz.toString(), icodepage) as String).toLong() else 0L

public actual fun DdeDisconnect(hconv: HCONV): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeDisconnect(hconv.toString()) as Int) else 0

public actual fun DdeDisconnectList(hconvlist: HCONVLIST): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeDisconnectList(hconvlist.toString()) as Int) else 0

public actual fun DdeEnableCallback(idinst: UInt, hconv: HCONV, wcmd: DDE_ENABLE_CALLBACK_CMD): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeEnableCallback(idinst.toInt(), hconv.toString(), wcmd.toInt()) as Int) else 0

public actual fun DdeFreeDataHandle(hdata: HDDEDATA): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeFreeDataHandle(hdata.toString()) as Int) else 0

public actual fun DdeFreeStringHandle(idinst: UInt, hsz: HSZ): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeFreeStringHandle(idinst.toInt(), hsz.toString()) as Int) else 0

public actual fun DdeGetData(hdata: HDDEDATA, pdst: Long, cbmax: UInt, cboff: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeGetData(hdata.toString(), pdst.toString(), cbmax.toInt(), cboff.toInt()) as Int).toUInt() else 0u

public actual fun DdeGetLastError(idinst: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeGetLastError(idinst.toInt()) as Int).toUInt() else 0u

public actual fun DdeImpersonateClient(hconv: HCONV): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeImpersonateClient(hconv.toString()) as Int) else 0

public actual fun DdeInitializeA(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeInitializeA(pidinst.toString(), pfncallback.toLong().toString(), afcmd.toInt(), ulres.toInt()) as Int).toUInt() else 0u

public actual fun DdeInitializeW(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeInitializeW(pidinst.toString(), pfncallback.toLong().toString(), afcmd.toInt(), ulres.toInt()) as Int).toUInt() else 0u

public actual fun DdeKeepStringHandle(idinst: UInt, hsz: HSZ): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeKeepStringHandle(idinst.toInt(), hsz.toString()) as Int) else 0

public actual fun DdeNameService(idinst: UInt, hsz1: HSZ, hsz2: HSZ, afcmd: DDE_NAME_SERVICE_CMD): HDDEDATA =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeNameService(idinst.toInt(), hsz1.toString(), hsz2.toString(), afcmd.toInt()) as String).toLong() else 0L

public actual fun DdePostAdvise(idinst: UInt, hsztopic: HSZ, hszitem: HSZ): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdePostAdvise(idinst.toInt(), hsztopic.toString(), hszitem.toString()) as Int) else 0

public actual fun DdeQueryConvInfo(hconv: HCONV, idtransaction: UInt, pconvinfo: Long): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeQueryConvInfo(hconv.toString(), idtransaction.toInt(), pconvinfo.toString()) as Int).toUInt() else 0u

public actual fun DdeQueryNextServer(hconvlist: HCONVLIST, hconvprev: HCONV): HCONV =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeQueryNextServer(hconvlist.toString(), hconvprev.toString()) as String).toLong() else 0L

public actual fun DdeQueryStringA(idinst: UInt, hsz: HSZ, psz: PSTR, cchmax: UInt, icodepage: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeQueryStringA(idinst.toInt(), hsz.toString(), psz.toString(), cchmax.toInt(), icodepage) as Int).toUInt() else 0u

public actual fun DdeQueryStringW(idinst: UInt, hsz: HSZ, psz: PWSTR, cchmax: UInt, icodepage: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeQueryStringW(idinst.toInt(), hsz.toString(), psz.toString(), cchmax.toInt(), icodepage) as Int).toUInt() else 0u

public actual fun DdeReconnect(hconv: HCONV): HCONV =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeReconnect(hconv.toString()) as String).toLong() else 0L

public actual fun DdeSetQualityOfService(hwndclient: HWND, pqosnew: Long, pqosprev: Long): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeSetQualityOfService(hwndclient.toString(), pqosnew.toString(), pqosprev.toString()) as Int) else 0

public actual fun DdeSetUserHandle(hconv: HCONV, id: UInt, huser: ULong): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeSetUserHandle(hconv.toString(), id.toInt(), huser.toString()) as Int) else 0

public actual fun DdeUnaccessData(hdata: HDDEDATA): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeUnaccessData(hdata.toString()) as Int) else 0

public actual fun DdeUninitialize(idinst: UInt): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DdeUninitialize(idinst.toInt()) as Int) else 0

public actual fun DeleteAtom(natom: UShort): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_DeleteAtom(natom.toInt()) as Int).toUShort() else 0u

public actual fun EmptyClipboard(): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_EmptyClipboard() as Int) else 0

public actual fun EnumClipboardFormats(format: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_EnumClipboardFormats(format.toInt()) as Int).toUInt() else 0u

public actual fun FindAtomA(lpstring: PCSTR): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_FindAtomA(lpstring.toString()) as Int).toUShort() else 0u

public actual fun FindAtomW(lpstring: PCWSTR): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_FindAtomW(lpstring.toString()) as Int).toUShort() else 0u

public actual fun FreeDDElParam(msg: UInt, lparam: LPARAM): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_FreeDDElParam(msg.toInt(), lparam.toString()) as Int) else 0

public actual fun GetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetAtomNameA(natom.toInt(), lpbuffer.toString(), nsize) as Int).toUInt() else 0u

public actual fun GetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetAtomNameW(natom.toInt(), lpbuffer.toString(), nsize) as Int).toUInt() else 0u

public actual fun GetClipboardData(uformat: UInt): HANDLE =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetClipboardData(uformat.toInt()) as String).toLong() else 0L

public actual fun GetClipboardFormatNameA(format: UInt, lpszformatname: PSTR, cchmaxcount: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameA(format.toInt(), lpszformatname.toString(), cchmaxcount) as Int) else 0

public actual fun GetClipboardFormatNameW(format: UInt, lpszformatname: PWSTR, cchmaxcount: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameW(format.toInt(), lpszformatname.toString(), cchmaxcount) as Int) else 0

public actual fun GetClipboardOwner(): HWND =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetClipboardOwner() as String).toLong() else 0L

public actual fun GetClipboardSequenceNumber(): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetClipboardSequenceNumber() as Int).toUInt() else 0u

public actual fun GetClipboardViewer(): HWND =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetClipboardViewer() as String).toLong() else 0L

public actual fun GetOpenClipboardWindow(): HWND =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetOpenClipboardWindow() as String).toLong() else 0L

public actual fun GetPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetPriorityClipboardFormat(paformatprioritylist.toString(), cformats) as Int) else 0

public actual fun GetUpdatedClipboardFormats(lpuiformats: Long, cformats: UInt, pcformatsout: Long): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GetUpdatedClipboardFormats(lpuiformats.toString(), cformats.toInt(), pcformatsout.toString()) as Int) else 0

public actual fun GlobalAddAtomA(lpstring: PCSTR): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalAddAtomA(lpstring.toString()) as Int).toUShort() else 0u

public actual fun GlobalAddAtomExA(lpstring: PCSTR, flags: UInt): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalAddAtomExA(lpstring.toString(), flags.toInt()) as Int).toUShort() else 0u

public actual fun GlobalAddAtomExW(lpstring: PCWSTR, flags: UInt): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalAddAtomExW(lpstring.toString(), flags.toInt()) as Int).toUShort() else 0u

public actual fun GlobalAddAtomW(lpstring: PCWSTR): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalAddAtomW(lpstring.toString()) as Int).toUShort() else 0u

public actual fun GlobalDeleteAtom(natom: UShort): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalDeleteAtom(natom.toInt()) as Int).toUShort() else 0u

public actual fun GlobalFindAtomA(lpstring: PCSTR): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalFindAtomA(lpstring.toString()) as Int).toUShort() else 0u

public actual fun GlobalFindAtomW(lpstring: PCWSTR): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalFindAtomW(lpstring.toString()) as Int).toUShort() else 0u

public actual fun GlobalGetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameA(natom.toInt(), lpbuffer.toString(), nsize) as Int).toUInt() else 0u

public actual fun GlobalGetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameW(natom.toInt(), lpbuffer.toString(), nsize) as Int).toUInt() else 0u

public actual fun ImpersonateDdeClientWindow(hwndclient: HWND, hwndserver: HWND): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ImpersonateDdeClientWindow(hwndclient.toString(), hwndserver.toString()) as Int) else 0

public actual fun InitAtomTable(nsize: UInt): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_InitAtomTable(nsize.toInt()) as Int) else 0

public actual fun IsClipboardFormatAvailable(format: UInt): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_IsClipboardFormatAvailable(format.toInt()) as Int) else 0

public actual fun OpenClipboard(hwndnewowner: HWND): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_OpenClipboard(hwndnewowner.toString()) as Int) else 0

public actual fun PackDDElParam(msg: UInt, uilo: ULong, uihi: ULong): LPARAM =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_PackDDElParam(msg.toInt(), uilo.toString(), uihi.toString()) as String).toLong() else 0L

public actual fun RegisterClipboardFormatA(lpszformat: PCSTR): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatA(lpszformat.toString()) as Int).toUInt() else 0u

public actual fun RegisterClipboardFormatW(lpszformat: PCWSTR): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatW(lpszformat.toString()) as Int).toUInt() else 0u

public actual fun RemoveClipboardFormatListener(hwnd: HWND): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_RemoveClipboardFormatListener(hwnd.toString()) as Int) else 0

public actual fun ReuseDDElParam(lparam: LPARAM, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): LPARAM =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ReuseDDElParam(lparam.toString(), msgin.toInt(), msgout.toInt(), uilo.toString(), uihi.toString()) as String).toLong() else 0L

public actual fun SetClipboardData(uformat: UInt, hmem: HANDLE): HANDLE =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_SetClipboardData(uformat.toInt(), hmem.toString()) as String).toLong() else 0L

public actual fun SetClipboardViewer(hwndnewviewer: HWND): HWND =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_SetClipboardViewer(hwndnewviewer.toString()) as String).toLong() else 0L

public actual fun SetWinMetaFileBits(nsize: UInt, lpmeta16data: Long, hdcref: HDC, lpmfp: Long): HENHMETAFILE =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_SetWinMetaFileBits(nsize.toInt(), lpmeta16data.toString(), hdcref.toString(), lpmfp.toString()) as String).toLong() else 0L

public actual fun UnpackDDElParam(msg: UInt, lparam: LPARAM, puilo: Long, puihi: Long): BOOL =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_UnpackDDElParam(msg.toInt(), lparam.toString(), puilo.toString(), puihi.toString()) as Int) else 0
