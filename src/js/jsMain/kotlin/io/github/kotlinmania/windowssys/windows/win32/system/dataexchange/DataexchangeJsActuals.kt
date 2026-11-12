@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32SystemDataexchangeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addAtomA(lpstring: Pcstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeAddAtomA(lpstring.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeAddAtomW(lpstring.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeChangeClipboardChain(hwndremove.rawAddress.toString(), hwndnewnext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClipboard(): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeCloseClipboard() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun countClipboardFormats(): Int =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeCountClipboardFormats() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction(idinst.toInt(), hconv.rawAddress.toString(), idtransaction.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: MutPtr): MutPtr =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeAccessData(hdata.rawAddress.toString(), pcbdatasize.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAddData(hdata: Hddedata, psrc: ConstPtr, cb: UInt, cboff: UInt): Hddedata =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeAddData(hdata.rawAddress.toString(), psrc.rawAddress.toString(), cb.toInt(), cboff.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeClientTransaction(pdata: ConstPtr, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: MutPtr): Hddedata =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeClientTransaction(pdata.rawAddress.toString(), cbdata.toInt(), hconv.rawAddress.toString(), hszitem.rawAddress.toString(), wfmt.toInt(), wtype.toInt(), dwtimeout.toInt(), pdwresult.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles(hsz1.rawAddress.toString(), hsz2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: ConstPtr): Hconv =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeConnect(idinst.toInt(), hszservice.rawAddress.toString(), hsztopic.rawAddress.toString(), pcc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: ConstPtr): Hconvlist =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeConnectList(idinst.toInt(), hszservice.rawAddress.toString(), hsztopic.rawAddress.toString(), hconvlist.rawAddress.toString(), pcc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: ConstPtr, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle(idinst.toInt(), psrc.rawAddress.toString(), cb.toInt(), cboff.toInt(), hszitem.rawAddress.toString(), wfmt.toInt(), afcmd.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA(idinst.toInt(), psz.rawAddress.toString(), icodepage) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW(idinst.toInt(), psz.rawAddress.toString(), icodepage) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeDisconnect(hconv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeDisconnectList(hconvlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeEnableCallback(idinst.toInt(), hconv.rawAddress.toString(), wcmd.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle(hdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle(idinst.toInt(), hsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeGetData(hdata: Hddedata, pdst: MutPtr, cbmax: UInt, cboff: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeGetData(hdata.rawAddress.toString(), pdst.rawAddress.toString(), cbmax.toInt(), cboff.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeGetLastError(idinst: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeGetLastError(idinst.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeImpersonateClient(hconv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeInitializeA(pidinst: MutPtr, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeInitializeA(pidinst.rawAddress.toString(), 0L.toString(), afcmd.toInt(), ulres.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeInitializeW(pidinst: MutPtr, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeInitializeW(pidinst.rawAddress.toString(), 0L.toString(), afcmd.toInt(), ulres.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle(idinst.toInt(), hsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeNameService(idinst.toInt(), hsz1.rawAddress.toString(), hsz2.rawAddress.toString(), afcmd.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdePostAdvise(idinst.toInt(), hsztopic.rawAddress.toString(), hszitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: MutPtr): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo(hconv.rawAddress.toString(), idtransaction.toInt(), pconvinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeQueryNextServer(hconvlist.rawAddress.toString(), hconvprev.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeQueryStringA(idinst.toInt(), hsz.rawAddress.toString(), psz.rawAddress.toString(), cchmax.toInt(), icodepage) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeQueryStringW(idinst.toInt(), hsz.rawAddress.toString(), psz.rawAddress.toString(), cchmax.toInt(), icodepage) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeReconnect(hconv.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: ConstPtr, pqosprev: MutPtr): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService(hwndclient.rawAddress.toString(), pqosnew.rawAddress.toString(), pqosprev.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeSetUserHandle(hconv.rawAddress.toString(), id.toInt(), huser.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeUnaccessData(hdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeUninitialize(idinst: UInt): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDdeUninitialize(idinst.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAtom(natom: UShort): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeDeleteAtom(natom.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun emptyClipboard(): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeEmptyClipboard() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumClipboardFormats(format: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(format.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findAtomA(lpstring: Pcstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeFindAtomA(lpstring.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeFindAtomW(lpstring.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeFreeDDElParam(msg.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetAtomNameA(natom.toInt(), lpbuffer.rawAddress.toString(), nsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetAtomNameW(natom.toInt(), lpbuffer.rawAddress.toString(), nsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardData(uformat: UInt): Handle =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetClipboardData(uformat.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA(format.toInt(), lpszformatname.rawAddress.toString(), cchmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW(format.toInt(), lpszformatname.rawAddress.toString(), cchmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardOwner(): Hwnd =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetClipboardOwner() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardSequenceNumber(): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardViewer(): Hwnd =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetClipboardViewer() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenClipboardWindow(): Hwnd =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPriorityClipboardFormat(paformatprioritylist: ConstPtr, cformats: Int): Int =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat(paformatprioritylist.rawAddress.toString(), cformats) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdatedClipboardFormats(lpuiformats: MutPtr, cformats: UInt, pcformatsout: MutPtr): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats(lpuiformats.rawAddress.toString(), cformats.toInt(), pcformatsout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomA(lpstring.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA(lpstring.rawAddress.toString(), flags.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW(lpstring.rawAddress.toString(), flags.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomW(lpstring.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalDeleteAtom(natom: UShort): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(natom.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalFindAtomA(lpstring.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalFindAtomW(lpstring.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA(natom.toInt(), lpbuffer.rawAddress.toString(), nsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW(natom.toInt(), lpbuffer.rawAddress.toString(), nsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow(hwndclient.rawAddress.toString(), hwndserver.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initAtomTable(nsize: UInt): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeInitAtomTable(nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(format.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeOpenClipboard(hwndnewowner.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangePackDDElParam(msg.toInt(), uilo.toString(), uihi.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA(lpszformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW(lpszformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeReuseDDElParam(lparam.toString(), msgin.toInt(), msgout.toInt(), uilo.toString(), uihi.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeSetClipboardData(uformat.toInt(), hmem.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeSetClipboardViewer(hwndnewviewer.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: ConstPtr, hdcref: Hdc, lpmfp: ConstPtr): Henhmetafile =
    if (windowsWin32SystemDataexchangeNapiAddon != null) MutPtr((windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits(nsize.toInt(), lpmeta16data.rawAddress.toString(), hdcref.rawAddress.toString(), lpmfp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: MutPtr, puihi: MutPtr): Bool =
    if (windowsWin32SystemDataexchangeNapiAddon != null) (windowsWin32SystemDataexchangeNapiAddon.windowssysWindowsWin32SystemDataexchangeUnpackDDElParam(msg.toInt(), lparam.toString(), puilo.rawAddress.toString(), puihi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
