package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(wtype: UInt, wfmt: UInt, hconv: HCONV, hsz1: HSZ, hsz2: HSZ, hdata: HDDEDATA, dwdata1: ULong, dwdata2: ULong): HDDEDATA
}

public fun AddAtomA(lpstring: PCSTR): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddAtomA", longArrayOf(lpstring)).toUShort()
}

public fun AddAtomW(lpstring: PCWSTR): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddAtomW", longArrayOf(lpstring)).toUShort()
}

public fun AddClipboardFormatListener(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AddClipboardFormatListener", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun ChangeClipboardChain(hwndremove: Foundation.HWND, hwndnewnext: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeClipboardChain", longArrayOf(Win32DynamicFfi.objectSlot(hwndremove), Win32DynamicFfi.objectSlot(hwndnewnext))).toInt()
}

public fun CloseClipboard(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CloseClipboard", longArrayOf()).toInt()
}

public fun CountClipboardFormats(): Int {
    return Win32DynamicFfi.invoke("user32.dll", "CountClipboardFormats", longArrayOf()).toInt()
}

public fun DdeAbandonTransaction(idinst: UInt, hconv: HCONV, idtransaction: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeAbandonTransaction", longArrayOf(idinst.toLong(), hconv, idtransaction.toLong())).toInt()
}

public fun DdeAccessData(hdata: HDDEDATA, pcbdatasize: Long): Long {
    return Win32DynamicFfi.invoke("user32.dll", "DdeAccessData", longArrayOf(hdata, pcbdatasize))
}

public fun DdeAddData(hdata: HDDEDATA, psrc: Long, cb: UInt, cboff: UInt): HDDEDATA {
    return Win32DynamicFfi.invoke("user32.dll", "DdeAddData", longArrayOf(hdata, psrc, cb.toLong(), cboff.toLong()))
}

public fun DdeClientTransaction(pdata: Long, cbdata: UInt, hconv: HCONV, hszitem: HSZ, wfmt: UInt, wtype: DDE_CLIENT_TRANSACTION_TYPE, dwtimeout: UInt, pdwresult: Long): HDDEDATA {
    return Win32DynamicFfi.invoke("user32.dll", "DdeClientTransaction", longArrayOf(pdata, cbdata.toLong(), hconv, hszitem, wfmt.toLong(), wtype.toLong(), dwtimeout.toLong(), pdwresult))
}

public fun DdeCmpStringHandles(hsz1: HSZ, hsz2: HSZ): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DdeCmpStringHandles", longArrayOf(hsz1, hsz2)).toInt()
}

public fun DdeConnect(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, pcc: Long): HCONV {
    return Win32DynamicFfi.invoke("user32.dll", "DdeConnect", longArrayOf(idinst.toLong(), hszservice, hsztopic, pcc))
}

public fun DdeConnectList(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, hconvlist: HCONVLIST, pcc: Long): HCONVLIST {
    return Win32DynamicFfi.invoke("user32.dll", "DdeConnectList", longArrayOf(idinst.toLong(), hszservice, hsztopic, hconvlist, pcc))
}

public fun DdeCreateDataHandle(idinst: UInt, psrc: Long, cb: UInt, cboff: UInt, hszitem: HSZ, wfmt: UInt, afcmd: UInt): HDDEDATA {
    return Win32DynamicFfi.invoke("user32.dll", "DdeCreateDataHandle", longArrayOf(idinst.toLong(), psrc, cb.toLong(), cboff.toLong(), hszitem, wfmt.toLong(), afcmd.toLong()))
}

public fun DdeCreateStringHandleA(idinst: UInt, psz: PCSTR, icodepage: Int): HSZ {
    return Win32DynamicFfi.invoke("user32.dll", "DdeCreateStringHandleA", longArrayOf(idinst.toLong(), psz, icodepage.toLong()))
}

public fun DdeCreateStringHandleW(idinst: UInt, psz: PCWSTR, icodepage: Int): HSZ {
    return Win32DynamicFfi.invoke("user32.dll", "DdeCreateStringHandleW", longArrayOf(idinst.toLong(), psz, icodepage.toLong()))
}

public fun DdeDisconnect(hconv: HCONV): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeDisconnect", longArrayOf(hconv)).toInt()
}

public fun DdeDisconnectList(hconvlist: HCONVLIST): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeDisconnectList", longArrayOf(hconvlist)).toInt()
}

public fun DdeEnableCallback(idinst: UInt, hconv: HCONV, wcmd: DDE_ENABLE_CALLBACK_CMD): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeEnableCallback", longArrayOf(idinst.toLong(), hconv, wcmd.toLong())).toInt()
}

public fun DdeFreeDataHandle(hdata: HDDEDATA): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeFreeDataHandle", longArrayOf(hdata)).toInt()
}

public fun DdeFreeStringHandle(idinst: UInt, hsz: HSZ): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeFreeStringHandle", longArrayOf(idinst.toLong(), hsz)).toInt()
}

public fun DdeGetData(hdata: HDDEDATA, pdst: Long, cbmax: UInt, cboff: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "DdeGetData", longArrayOf(hdata, pdst, cbmax.toLong(), cboff.toLong())).toUInt()
}

public fun DdeGetLastError(idinst: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "DdeGetLastError", longArrayOf(idinst.toLong())).toUInt()
}

public fun DdeImpersonateClient(hconv: HCONV): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeImpersonateClient", longArrayOf(hconv)).toInt()
}

public fun DdeInitializeA(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "DdeInitializeA", longArrayOf(pidinst, Win32DynamicFfi.objectSlot(pfncallback), afcmd.toLong(), ulres.toLong())).toUInt()
}

public fun DdeInitializeW(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "DdeInitializeW", longArrayOf(pidinst, Win32DynamicFfi.objectSlot(pfncallback), afcmd.toLong(), ulres.toLong())).toUInt()
}

public fun DdeKeepStringHandle(idinst: UInt, hsz: HSZ): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeKeepStringHandle", longArrayOf(idinst.toLong(), hsz)).toInt()
}

public fun DdeNameService(idinst: UInt, hsz1: HSZ, hsz2: HSZ, afcmd: DDE_NAME_SERVICE_CMD): HDDEDATA {
    return Win32DynamicFfi.invoke("user32.dll", "DdeNameService", longArrayOf(idinst.toLong(), hsz1, hsz2, afcmd.toLong()))
}

public fun DdePostAdvise(idinst: UInt, hsztopic: HSZ, hszitem: HSZ): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdePostAdvise", longArrayOf(idinst.toLong(), hsztopic, hszitem)).toInt()
}

public fun DdeQueryConvInfo(hconv: HCONV, idtransaction: UInt, pconvinfo: Long): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "DdeQueryConvInfo", longArrayOf(hconv, idtransaction.toLong(), pconvinfo)).toUInt()
}

public fun DdeQueryNextServer(hconvlist: HCONVLIST, hconvprev: HCONV): HCONV {
    return Win32DynamicFfi.invoke("user32.dll", "DdeQueryNextServer", longArrayOf(hconvlist, hconvprev))
}

public fun DdeQueryStringA(idinst: UInt, hsz: HSZ, psz: PSTR, cchmax: UInt, icodepage: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "DdeQueryStringA", longArrayOf(idinst.toLong(), hsz, psz, cchmax.toLong(), icodepage.toLong())).toUInt()
}

public fun DdeQueryStringW(idinst: UInt, hsz: HSZ, psz: PWSTR, cchmax: UInt, icodepage: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "DdeQueryStringW", longArrayOf(idinst.toLong(), hsz, psz, cchmax.toLong(), icodepage.toLong())).toUInt()
}

public fun DdeReconnect(hconv: HCONV): HCONV {
    return Win32DynamicFfi.invoke("user32.dll", "DdeReconnect", longArrayOf(hconv))
}

public fun DdeSetQualityOfService(hwndclient: Foundation.HWND, pqosnew: Long, pqosprev: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeSetQualityOfService", longArrayOf(Win32DynamicFfi.objectSlot(hwndclient), pqosnew, pqosprev)).toInt()
}

public fun DdeSetUserHandle(hconv: HCONV, id: UInt, huser: ULong): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeSetUserHandle", longArrayOf(hconv, id.toLong(), huser.toLong())).toInt()
}

public fun DdeUnaccessData(hdata: HDDEDATA): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeUnaccessData", longArrayOf(hdata)).toInt()
}

public fun DdeUninitialize(idinst: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DdeUninitialize", longArrayOf(idinst.toLong())).toInt()
}

public fun DeleteAtom(natom: UShort): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteAtom", longArrayOf(natom.toLong())).toUShort()
}

public fun EmptyClipboard(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EmptyClipboard", longArrayOf()).toInt()
}

public fun EnumClipboardFormats(format: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "EnumClipboardFormats", longArrayOf(format.toLong())).toUInt()
}

public fun FindAtomA(lpstring: PCSTR): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindAtomA", longArrayOf(lpstring)).toUShort()
}

public fun FindAtomW(lpstring: PCWSTR): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindAtomW", longArrayOf(lpstring)).toUShort()
}

public fun FreeDDElParam(msg: UInt, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "FreeDDElParam", longArrayOf(msg.toLong(), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun GetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetAtomNameA", longArrayOf(natom.toLong(), lpbuffer, nsize.toLong())).toUInt()
}

public fun GetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetAtomNameW", longArrayOf(natom.toLong(), lpbuffer, nsize.toLong())).toUInt()
}

public fun GetClipboardData(uformat: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "GetClipboardData", longArrayOf(uformat.toLong()))
    return Foundation.HANDLE()
}

public fun GetClipboardFormatNameA(format: UInt, lpszformatname: PSTR, cchmaxcount: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetClipboardFormatNameA", longArrayOf(format.toLong(), lpszformatname, cchmaxcount.toLong())).toInt()
}

public fun GetClipboardFormatNameW(format: UInt, lpszformatname: PWSTR, cchmaxcount: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetClipboardFormatNameW", longArrayOf(format.toLong(), lpszformatname, cchmaxcount.toLong())).toInt()
}

public fun GetClipboardOwner(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetClipboardOwner", longArrayOf())
    return Foundation.HWND()
}

public fun GetClipboardSequenceNumber(): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetClipboardSequenceNumber", longArrayOf()).toUInt()
}

public fun GetClipboardViewer(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetClipboardViewer", longArrayOf())
    return Foundation.HWND()
}

public fun GetOpenClipboardWindow(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetOpenClipboardWindow", longArrayOf())
    return Foundation.HWND()
}

public fun GetPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetPriorityClipboardFormat", longArrayOf(paformatprioritylist, cformats.toLong())).toInt()
}

public fun GetUpdatedClipboardFormats(lpuiformats: Long, cformats: UInt, pcformatsout: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetUpdatedClipboardFormats", longArrayOf(lpuiformats, cformats.toLong(), pcformatsout)).toInt()
}

public fun GlobalAddAtomA(lpstring: PCSTR): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalAddAtomA", longArrayOf(lpstring)).toUShort()
}

public fun GlobalAddAtomExA(lpstring: PCSTR, flags: UInt): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalAddAtomExA", longArrayOf(lpstring, flags.toLong())).toUShort()
}

public fun GlobalAddAtomExW(lpstring: PCWSTR, flags: UInt): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalAddAtomExW", longArrayOf(lpstring, flags.toLong())).toUShort()
}

public fun GlobalAddAtomW(lpstring: PCWSTR): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalAddAtomW", longArrayOf(lpstring)).toUShort()
}

public fun GlobalDeleteAtom(natom: UShort): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalDeleteAtom", longArrayOf(natom.toLong())).toUShort()
}

public fun GlobalFindAtomA(lpstring: PCSTR): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalFindAtomA", longArrayOf(lpstring)).toUShort()
}

public fun GlobalFindAtomW(lpstring: PCWSTR): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalFindAtomW", longArrayOf(lpstring)).toUShort()
}

public fun GlobalGetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalGetAtomNameA", longArrayOf(natom.toLong(), lpbuffer, nsize.toLong())).toUInt()
}

public fun GlobalGetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalGetAtomNameW", longArrayOf(natom.toLong(), lpbuffer, nsize.toLong())).toUInt()
}

public fun ImpersonateDdeClientWindow(hwndclient: Foundation.HWND, hwndserver: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ImpersonateDdeClientWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwndclient), Win32DynamicFfi.objectSlot(hwndserver))).toInt()
}

public fun InitAtomTable(nsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitAtomTable", longArrayOf(nsize.toLong())).toInt()
}

public fun IsClipboardFormatAvailable(format: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsClipboardFormatAvailable", longArrayOf(format.toLong())).toInt()
}

public fun OpenClipboard(hwndnewowner: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "OpenClipboard", longArrayOf(Win32DynamicFfi.objectSlot(hwndnewowner))).toInt()
}

public fun PackDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Foundation.LPARAM {
    Win32DynamicFfi.invoke("user32.dll", "PackDDElParam", longArrayOf(msg.toLong(), uilo.toLong(), uihi.toLong()))
    return Foundation.LPARAM()
}

public fun RegisterClipboardFormatA(lpszformat: PCSTR): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterClipboardFormatA", longArrayOf(lpszformat)).toUInt()
}

public fun RegisterClipboardFormatW(lpszformat: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterClipboardFormatW", longArrayOf(lpszformat)).toUInt()
}

public fun RemoveClipboardFormatListener(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RemoveClipboardFormatListener", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun ReuseDDElParam(lparam: Foundation.LPARAM, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Foundation.LPARAM {
    Win32DynamicFfi.invoke("user32.dll", "ReuseDDElParam", longArrayOf(Win32DynamicFfi.objectSlot(lparam), msgin.toLong(), msgout.toLong(), uilo.toLong(), uihi.toLong()))
    return Foundation.LPARAM()
}

public fun SetClipboardData(uformat: UInt, hmem: Foundation.HANDLE): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "SetClipboardData", longArrayOf(uformat.toLong(), Win32DynamicFfi.objectSlot(hmem)))
    return Foundation.HANDLE()
}

public fun SetClipboardViewer(hwndnewviewer: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "SetClipboardViewer", longArrayOf(Win32DynamicFfi.objectSlot(hwndnewviewer)))
    return Foundation.HWND()
}

public fun SetWinMetaFileBits(nsize: UInt, lpmeta16data: Long, hdcref: Graphics.Gdi.HDC, lpmfp: Long): Graphics.Gdi.HENHMETAFILE {
    Win32DynamicFfi.invoke("gdi32.dll", "SetWinMetaFileBits", longArrayOf(nsize.toLong(), lpmeta16data, Win32DynamicFfi.objectSlot(hdcref), lpmfp))
    return Graphics.Gdi.HENHMETAFILE()
}

public fun UnpackDDElParam(msg: UInt, lparam: Foundation.LPARAM, puilo: Long, puihi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnpackDDElParam", longArrayOf(msg.toLong(), Win32DynamicFfi.objectSlot(lparam), puilo, puihi)).toInt()
}
