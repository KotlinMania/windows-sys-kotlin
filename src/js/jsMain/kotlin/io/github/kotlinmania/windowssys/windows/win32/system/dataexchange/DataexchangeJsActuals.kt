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

private val _windowsWin32SystemDataexchangeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addAtomA(lpstring: Pcstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_addAtomA((lpstring?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_addAtomW((lpstring?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_addClipboardFormatListener((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_changeClipboardChain((hwndremove?.value ?: 0L).toString(), (hwndnewnext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClipboard(): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_closeClipboard() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun countClipboardFormats(): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_countClipboardFormats() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(idinst.toInt(), (hconv?.value ?: 0L).toString(), idtransaction.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeAccessData((hdata?.value ?: 0L).toString(), (pcbdatasize?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAddData(hdata: Hddedata, psrc: COpaquePointer?, cb: UInt, cboff: UInt): Hddedata =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeAddData((hdata?.value ?: 0L).toString(), (psrc?.value ?: 0L).toString(), cb.toInt(), cboff.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeClientTransaction(pdata: COpaquePointer?, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: COpaquePointer?): Hddedata =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeClientTransaction((pdata?.value ?: 0L).toString(), cbdata.toInt(), (hconv?.value ?: 0L).toString(), (hszitem?.value ?: 0L).toString(), wfmt.toInt(), wtype.toInt(), dwtimeout.toInt(), (pdwresult?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles((hsz1?.value ?: 0L).toString(), (hsz2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: COpaquePointer?): Hconv =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeConnect(idinst.toInt(), (hszservice?.value ?: 0L).toString(), (hsztopic?.value ?: 0L).toString(), (pcc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: COpaquePointer?): Hconvlist =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeConnectList(idinst.toInt(), (hszservice?.value ?: 0L).toString(), (hsztopic?.value ?: 0L).toString(), (hconvlist?.value ?: 0L).toString(), (pcc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: COpaquePointer?, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(idinst.toInt(), (psrc?.value ?: 0L).toString(), cb.toInt(), cboff.toInt(), (hszitem?.value ?: 0L).toString(), wfmt.toInt(), afcmd.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(idinst.toInt(), (psz?.value ?: 0L).toString(), icodepage) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(idinst.toInt(), (psz?.value ?: 0L).toString(), icodepage) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeDisconnect((hconv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeDisconnectList((hconvlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeEnableCallback(idinst.toInt(), (hconv?.value ?: 0L).toString(), wcmd.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle((hdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(idinst.toInt(), (hsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeGetData(hdata: Hddedata, pdst: COpaquePointer?, cbmax: UInt, cboff: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeGetData((hdata?.value ?: 0L).toString(), (pdst?.value ?: 0L).toString(), cbmax.toInt(), cboff.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeGetLastError(idinst: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeGetLastError(idinst.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeImpersonateClient((hconv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeInitializeA(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeInitializeA((pidinst?.value ?: 0L).toString(), 0L.toString(), afcmd.toInt(), ulres.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeInitializeW(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeInitializeW((pidinst?.value ?: 0L).toString(), 0L.toString(), afcmd.toInt(), ulres.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(idinst.toInt(), (hsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeNameService(idinst.toInt(), (hsz1?.value ?: 0L).toString(), (hsz2?.value ?: 0L).toString(), afcmd.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddePostAdvise(idinst.toInt(), (hsztopic?.value ?: 0L).toString(), (hszitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo((hconv?.value ?: 0L).toString(), idtransaction.toInt(), (pconvinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeQueryNextServer((hconvlist?.value ?: 0L).toString(), (hconvprev?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeQueryStringA(idinst.toInt(), (hsz?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), cchmax.toInt(), icodepage) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeQueryStringW(idinst.toInt(), (hsz?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), cchmax.toInt(), icodepage) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeReconnect((hconv?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: COpaquePointer?, pqosprev: COpaquePointer?): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService((hwndclient?.value ?: 0L).toString(), (pqosnew?.value ?: 0L).toString(), (pqosprev?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeSetUserHandle((hconv?.value ?: 0L).toString(), id.toInt(), huser.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeUnaccessData((hdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeUninitialize(idinst: UInt): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_ddeUninitialize(idinst.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAtom(natom: UShort): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_deleteAtom(natom.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun emptyClipboard(): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_emptyClipboard() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumClipboardFormats(format: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_enumClipboardFormats(format.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findAtomA(lpstring: Pcstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_findAtomA((lpstring?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_findAtomW((lpstring?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_freeDDElParam(msg.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getAtomNameA(natom.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getAtomNameW(natom.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardData(uformat: UInt): Handle =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getClipboardData(uformat.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(format.toInt(), (lpszformatname?.value ?: 0L).toString(), cchmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(format.toInt(), (lpszformatname?.value ?: 0L).toString(), cchmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardOwner(): Hwnd =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getClipboardOwner() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardSequenceNumber(): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardViewer(): Hwnd =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getClipboardViewer() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenClipboardWindow(): Hwnd =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPriorityClipboardFormat(paformatprioritylist: COpaquePointer?, cformats: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat((paformatprioritylist?.value ?: 0L).toString(), cformats) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdatedClipboardFormats(lpuiformats: COpaquePointer?, cformats: UInt, pcformatsout: COpaquePointer?): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats((lpuiformats?.value ?: 0L).toString(), cformats.toInt(), (pcformatsout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalAddAtomA((lpstring?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalAddAtomExA((lpstring?.value ?: 0L).toString(), flags.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalAddAtomExW((lpstring?.value ?: 0L).toString(), flags.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalAddAtomW((lpstring?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalDeleteAtom(natom: UShort): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalDeleteAtom(natom.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalFindAtomA((lpstring?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalFindAtomW((lpstring?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(natom.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(natom.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow((hwndclient?.value ?: 0L).toString(), (hwndserver?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initAtomTable(nsize: UInt): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_initAtomTable(nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(format.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_openClipboard((hwndnewowner?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_packDDElParam(msg.toInt(), uilo.toString(), uihi.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_registerClipboardFormatA((lpszformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_registerClipboardFormatW((lpszformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_reuseDDElParam(lparam.toString(), msgin.toInt(), msgout.toInt(), uilo.toString(), uihi.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_setClipboardData(uformat.toInt(), (hmem?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_setClipboardViewer((hwndnewviewer?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: COpaquePointer?, hdcref: Hdc, lpmfp: COpaquePointer?): Henhmetafile =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(nsize.toInt(), (lpmeta16data?.value ?: 0L).toString(), (hdcref?.value ?: 0L).toString(), (lpmfp?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: COpaquePointer?, puihi: COpaquePointer?): Bool =
    if (_windowsWin32SystemDataexchangeNapiAddon != null) (_windowsWin32SystemDataexchangeNapiAddon.windowssys_windows_win32_system_dataexchange_unpackDDElParam(msg.toInt(), lparam.toString(), (puilo?.value ?: 0L).toString(), (puihi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
