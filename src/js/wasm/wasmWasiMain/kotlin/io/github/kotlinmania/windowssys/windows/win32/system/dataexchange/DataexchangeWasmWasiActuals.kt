@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addAtomA(lpstring: Pcstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeAddAtomA")

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeAddAtomW")

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener")

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeChangeClipboardChain")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeCloseClipboard")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeCloseClipboard(): Int

public actual fun closeClipboard(): Bool =
    wasiWindowssysWindowsWin32SystemDataexchangeCloseClipboard()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeCountClipboardFormats")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeCountClipboardFormats(): Int

public actual fun countClipboardFormats(): Int =
    wasiWindowssysWindowsWin32SystemDataexchangeCountClipboardFormats()

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction")

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: MutPtr<UInt>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeAccessData")

public actual fun ddeAddData(hdata: Hddedata, psrc: ConstPtr<UByte>, cb: UInt, cboff: UInt): Hddedata =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeAddData")

public actual fun ddeClientTransaction(pdata: ConstPtr<UByte>, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: MutPtr<UInt>): Hddedata =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeClientTransaction")

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles")

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: ConstPtr<Convcontext>): Hconv =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeConnect")

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: ConstPtr<Convcontext>): Hconvlist =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeConnectList")

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: ConstPtr<UByte>, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle")

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA")

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW")

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeDisconnect")

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeDisconnectList")

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeEnableCallback")

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle")

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle")

public actual fun ddeGetData(hdata: Hddedata, pdst: MutPtr<UByte>, cbmax: UInt, cboff: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeGetData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeDdeGetLastError")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeDdeGetLastError(idinst: Int): Int

public actual fun ddeGetLastError(idinst: UInt): UInt =
    wasiWindowssysWindowsWin32SystemDataexchangeDdeGetLastError(idinst.toInt()).toUInt()

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeImpersonateClient")

public actual fun ddeInitializeA(pidinst: MutPtr<UInt>, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeInitializeA")

public actual fun ddeInitializeW(pidinst: MutPtr<UInt>, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeInitializeW")

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle")

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeNameService")

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdePostAdvise")

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: MutPtr<Convinfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo")

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeQueryNextServer")

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeQueryStringA")

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeQueryStringW")

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeReconnect")

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: ConstPtr<SecurityQualityOfService>, pqosprev: MutPtr<SecurityQualityOfService>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService")

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeSetUserHandle")

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeDdeUnaccessData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeDdeUninitialize")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeDdeUninitialize(idinst: Int): Int

public actual fun ddeUninitialize(idinst: UInt): Bool =
    wasiWindowssysWindowsWin32SystemDataexchangeDdeUninitialize(idinst.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeDeleteAtom")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeDeleteAtom(natom: Int): Int

public actual fun deleteAtom(natom: UShort): UShort =
    wasiWindowssysWindowsWin32SystemDataexchangeDeleteAtom(natom.toInt()).toUShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeEmptyClipboard")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeEmptyClipboard(): Int

public actual fun emptyClipboard(): Bool =
    wasiWindowssysWindowsWin32SystemDataexchangeEmptyClipboard()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeEnumClipboardFormats")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(format: Int): Int

public actual fun enumClipboardFormats(format: UInt): UInt =
    wasiWindowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(format.toInt()).toUInt()

public actual fun findAtomA(lpstring: Pcstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeFindAtomA")

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeFindAtomW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeFreeDDElParam")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeFreeDDElParam(msg: Int, lparam: Long): Int

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    wasiWindowssysWindowsWin32SystemDataexchangeFreeDDElParam(msg.toInt(), lparam)

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetAtomNameA")

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetAtomNameW")

public actual fun getClipboardData(uformat: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetClipboardData")

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA")

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW")

public actual fun getClipboardOwner(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetClipboardOwner")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber(): Int

public actual fun getClipboardSequenceNumber(): UInt =
    wasiWindowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber().toUInt()

public actual fun getClipboardViewer(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetClipboardViewer")

public actual fun getOpenClipboardWindow(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow")

public actual fun getPriorityClipboardFormat(paformatprioritylist: ConstPtr<UInt>, cformats: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat")

public actual fun getUpdatedClipboardFormats(lpuiformats: MutPtr<UInt>, cformats: UInt, pcformatsout: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats")

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGlobalAddAtomA")

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA")

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW")

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGlobalAddAtomW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(natom: Int): Int

public actual fun globalDeleteAtom(natom: UShort): UShort =
    wasiWindowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(natom.toInt()).toUShort()

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGlobalFindAtomA")

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGlobalFindAtomW")

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA")

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW")

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeInitAtomTable")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeInitAtomTable(nsize: Int): Int

public actual fun initAtomTable(nsize: UInt): Bool =
    wasiWindowssysWindowsWin32SystemDataexchangeInitAtomTable(nsize.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(format: Int): Int

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    wasiWindowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(format.toInt())

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeOpenClipboard")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangePackDDElParam")
private external fun wasiWindowssysWindowsWin32SystemDataexchangePackDDElParam(msg: Int, uilo: Long, uihi: Long): Long

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    wasiWindowssysWindowsWin32SystemDataexchangePackDDElParam(msg.toInt(), uilo.toLong(), uihi.toLong())

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA")

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW")

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDataexchangeReuseDDElParam")
private external fun wasiWindowssysWindowsWin32SystemDataexchangeReuseDDElParam(lparam: Long, msgin: Int, msgout: Int, uilo: Long, uihi: Long): Long

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    wasiWindowssysWindowsWin32SystemDataexchangeReuseDDElParam(lparam, msgin.toInt(), msgout.toInt(), uilo.toLong(), uihi.toLong())

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeSetClipboardData")

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeSetClipboardViewer")

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: ConstPtr<UByte>, hdcref: Hdc, lpmfp: ConstPtr<Metafilepict>): Henhmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits")

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: MutPtr<ULong>, puihi: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDataexchangeUnpackDDElParam")
