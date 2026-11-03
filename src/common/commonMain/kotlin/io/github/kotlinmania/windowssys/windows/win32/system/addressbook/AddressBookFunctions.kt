package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR

public fun interface FnCallback {
    public operator fun invoke(cbsize: UInt, lppbuffer: Long): Int
}

public fun interface FnCallback1 {
    public operator fun invoke(cbsize: UInt, lpobject: Long, lppbuffer: Long): Int
}

public fun interface FnCallback2 {
    public operator fun invoke(lpbuffer: Long): UInt
}

public fun interface FnCallback3 {
    public operator fun invoke(param0: Long): BOOL
}

public fun interface FnCallback4 {
    public operator fun invoke(lpvcontext: Long, cnotification: UInt, lpnotifications: Long): Int
}

public fun BuildDisplayTable(lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, hinstance: Foundation.HINSTANCE, cpages: UInt, lppage: Long, ulflags: UInt, lpptable: Long, lpptbldata: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "BuildDisplayTable", longArrayOf(Win32DynamicFfi.objectSlot(lpallocatebuffer), Win32DynamicFfi.objectSlot(lpallocatemore), Win32DynamicFfi.objectSlot(lpfreebuffer), lpmalloc, Win32DynamicFfi.objectSlot(hinstance), cpages.toLong(), lppage, ulflags.toLong(), lpptable, lpptbldata)).toInt()
}

public fun ChangeIdleRoutine(ftg: Long, lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    Win32DynamicFfi.invoke("mapi32.dll", "ChangeIdleRoutine", longArrayOf(ftg, Win32DynamicFfi.objectSlot(lpfnidle), lpvidleparam, priidle.toLong(), csecidle.toLong(), iroidle.toLong(), ircidle.toLong()))
}

public fun CreateIProp(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, lpppropdata: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "CreateIProp", longArrayOf(lpinterface, Win32DynamicFfi.objectSlot(lpallocatebuffer), Win32DynamicFfi.objectSlot(lpallocatemore), Win32DynamicFfi.objectSlot(lpfreebuffer), lpvreserved, lpppropdata)).toInt()
}

public fun CreateTable(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: Long, lpptabledata: Long): Int {
    return Win32DynamicFfi.invoke("rtm.dll", "CreateTable", longArrayOf(lpinterface, Win32DynamicFfi.objectSlot(lpallocatebuffer), Win32DynamicFfi.objectSlot(lpallocatemore), Win32DynamicFfi.objectSlot(lpfreebuffer), lpvreserved, ultabletype.toLong(), ulproptagindexcolumn.toLong(), lpsproptagarraycolumns, lpptabledata)).toInt()
}

public fun DeinitMapiUtil() {
    Win32DynamicFfi.invoke("mapi32.dll", "DeinitMapiUtil", longArrayOf())
}

public fun DeregisterIdleRoutine(ftg: Long) {
    Win32DynamicFfi.invoke("mapi32.dll", "DeregisterIdleRoutine", longArrayOf(ftg))
}

public fun EnableIdleRoutine(ftg: Long, fenable: BOOL) {
    Win32DynamicFfi.invoke("mapi32.dll", "EnableIdleRoutine", longArrayOf(ftg, fenable.toLong()))
}

public fun FEqualNames(lpname1: Long, lpname2: Long): BOOL {
    return Win32DynamicFfi.invoke("mapi32.dll", "FEqualNames", longArrayOf(lpname1, lpname2)).toInt()
}

public fun FPropCompareProp(lpspropvalue1: Long, ulrelop: UInt, lpspropvalue2: Long): BOOL {
    return Win32DynamicFfi.invoke("mapi32.dll", "FPropCompareProp", longArrayOf(lpspropvalue1, ulrelop.toLong(), lpspropvalue2)).toInt()
}

public fun FPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: UInt): BOOL {
    return Win32DynamicFfi.invoke("mapi32.dll", "FPropContainsProp", longArrayOf(lpspropvaluedst, lpspropvaluesrc, ulfuzzylevel.toLong())).toInt()
}

public fun FPropExists(lpmapiprop: Long, ulproptag: UInt): BOOL {
    return Win32DynamicFfi.invoke("mapi32.dll", "FPropExists", longArrayOf(lpmapiprop, ulproptag.toLong())).toInt()
}

public fun FreePadrlist(lpadrlist: Long) {
    Win32DynamicFfi.invoke("mapi32.dll", "FreePadrlist", longArrayOf(lpadrlist))
}

public fun FreeProws(lprows: Long) {
    Win32DynamicFfi.invoke("mapi32.dll", "FreeProws", longArrayOf(lprows))
}

public fun FtAddFt(ftaddend1: Foundation.FILETIME, ftaddend2: Foundation.FILETIME): Foundation.FILETIME {
    Win32DynamicFfi.invoke("mapi32.dll", "FtAddFt", longArrayOf(Win32DynamicFfi.objectSlot(ftaddend1), Win32DynamicFfi.objectSlot(ftaddend2)))
    return Foundation.FILETIME()
}

public fun FtMulDw(ftmultiplier: UInt, ftmultiplicand: Foundation.FILETIME): Foundation.FILETIME {
    Win32DynamicFfi.invoke("mapi32.dll", "FtMulDw", longArrayOf(ftmultiplier.toLong(), Win32DynamicFfi.objectSlot(ftmultiplicand)))
    return Foundation.FILETIME()
}

public fun FtMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Foundation.FILETIME {
    Win32DynamicFfi.invoke("mapi32.dll", "FtMulDwDw", longArrayOf(ftmultiplicand.toLong(), ftmultiplier.toLong()))
    return Foundation.FILETIME()
}

public fun FtNegFt(ft: Foundation.FILETIME): Foundation.FILETIME {
    Win32DynamicFfi.invoke("mapi32.dll", "FtNegFt", longArrayOf(Win32DynamicFfi.objectSlot(ft)))
    return Foundation.FILETIME()
}

public fun FtSubFt(ftminuend: Foundation.FILETIME, ftsubtrahend: Foundation.FILETIME): Foundation.FILETIME {
    Win32DynamicFfi.invoke("mapi32.dll", "FtSubFt", longArrayOf(Win32DynamicFfi.objectSlot(ftminuend), Win32DynamicFfi.objectSlot(ftsubtrahend)))
    return Foundation.FILETIME()
}

public fun FtgRegisterIdleRoutine(lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort): Long {
    return Win32DynamicFfi.invoke("mapi32.dll", "FtgRegisterIdleRoutine", longArrayOf(Win32DynamicFfi.objectSlot(lpfnidle), lpvidleparam, priidle.toLong(), csecidle.toLong(), iroidle.toLong()))
}

public fun HrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrAddColumns", longArrayOf(lptbl, lpproptagcolumnsnew, Win32DynamicFfi.objectSlot(lpallocatebuffer), Win32DynamicFfi.objectSlot(lpfreebuffer))).toInt()
}

public fun HrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, lpfnfiltercolumns: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrAddColumnsEx", longArrayOf(lptbl, lpproptagcolumnsnew, Win32DynamicFfi.objectSlot(lpallocatebuffer), Win32DynamicFfi.objectSlot(lpfreebuffer), lpfnfiltercolumns)).toInt()
}

public fun HrAllocAdviseSink(lpfncallback: LPNOTIFCALLBACK, lpvcontext: Long, lppadvisesink: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrAllocAdviseSink", longArrayOf(Win32DynamicFfi.objectSlot(lpfncallback), lpvcontext, lppadvisesink)).toInt()
}

public fun HrDispatchNotifications(ulflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrDispatchNotifications", longArrayOf(ulflags.toLong())).toInt()
}

public fun HrGetOneProp(lpmapiprop: Long, ulproptag: UInt, lppprop: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrGetOneProp", longArrayOf(lpmapiprop, ulproptag.toLong(), lppprop)).toInt()
}

public fun HrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: UInt, lppstorageout: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrIStorageFromStream", longArrayOf(lpunkin, lpinterface, ulflags.toLong(), lppstorageout)).toInt()
}

public fun HrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrQueryAllRows", longArrayOf(lptable, lpproptags, lprestriction, lpsortorderset, crowsmax.toLong(), lpprows)).toInt()
}

public fun HrSetOneProp(lpmapiprop: Long, lpprop: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrSetOneProp", longArrayOf(lpmapiprop, lpprop)).toInt()
}

public fun HrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "HrThisThreadAdviseSink", longArrayOf(lpadvisesink, lppadvisesink)).toInt()
}

public fun LPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "LPropCompareProp", longArrayOf(lpspropvaluea, lpspropvalueb)).toInt()
}

public fun LpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: Long): Long {
    return Win32DynamicFfi.invoke("mapi32.dll", "LpValFindProp", longArrayOf(ulproptag.toLong(), cvalues.toLong(), lpproparray))
}

public fun MAPIDeinitIdle() {
    Win32DynamicFfi.invoke("mapi32.dll", "MAPIDeinitIdle", longArrayOf())
}

public fun MAPIGetDefaultMalloc(): Long {
    return Win32DynamicFfi.invoke("mapi32.dll", "MAPIGetDefaultMalloc", longArrayOf())
}

public fun MAPIInitIdle(lpvreserved: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "MAPIInitIdle", longArrayOf(lpvreserved)).toInt()
}

public fun OpenStreamOnFile(lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, ulflags: UInt, lpszfilename: Long, lpszprefix: Long, lppstream: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "OpenStreamOnFile", longArrayOf(Win32DynamicFfi.objectSlot(lpallocatebuffer), Win32DynamicFfi.objectSlot(lpfreebuffer), ulflags.toLong(), lpszfilename, lpszprefix, lppstream)).toInt()
}

public fun PpropFindProp(lpproparray: Long, cvalues: UInt, ulproptag: UInt): Long {
    return Win32DynamicFfi.invoke("mapi32.dll", "PpropFindProp", longArrayOf(lpproparray, cvalues.toLong(), ulproptag.toLong()))
}

public fun PropCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: LPALLOCATEMORE, lpvobject: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "PropCopyMore", longArrayOf(lpspropvaluedest, lpspropvaluesrc, Win32DynamicFfi.objectSlot(lpfallocmore), lpvobject)).toInt()
}

public fun RTFSync(lpmessage: Long, ulflags: UInt, lpfmessageupdated: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "RTFSync", longArrayOf(lpmessage, ulflags.toLong(), lpfmessageupdated)).toInt()
}

public fun ScCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScCopyNotifications", longArrayOf(cnotification.toLong(), lpnotifications, lpvdst, lpcb)).toInt()
}

public fun ScCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScCopyProps", longArrayOf(cvalues.toLong(), lpproparray, lpvdst, lpcb)).toInt()
}

public fun ScCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScCountNotifications", longArrayOf(cnotifications.toLong(), lpnotifications, lpcb)).toInt()
}

public fun ScCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScCountProps", longArrayOf(cvalues.toLong(), lpproparray, lpcb)).toInt()
}

public fun ScCreateConversationIndex(cbparent: UInt, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScCreateConversationIndex", longArrayOf(cbparent.toLong(), lpbparent, lpcbconvindex, lppbconvindex)).toInt()
}

public fun ScDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: LPALLOCATEBUFFER, lppproparray: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScDupPropset", longArrayOf(cvalues.toLong(), lpproparray, Win32DynamicFfi.objectSlot(lpallocatebuffer), lppproparray)).toInt()
}

public fun ScInitMapiUtil(ulflags: UInt): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScInitMapiUtil", longArrayOf(ulflags.toLong())).toInt()
}

public fun ScLocalPathFromUNC(lpszunc: PCSTR, lpszlocal: PCSTR, cchlocal: UInt): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScLocalPathFromUNC", longArrayOf(lpszunc, lpszlocal, cchlocal.toLong())).toInt()
}

public fun ScRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScRelocNotifications", longArrayOf(cnotification.toLong(), lpnotifications, lpvbaseold, lpvbasenew, lpcb)).toInt()
}

public fun ScRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScRelocProps", longArrayOf(cvalues.toLong(), lpproparray, lpvbaseold, lpvbasenew, lpcb)).toInt()
}

public fun ScUNCFromLocalPath(lpszlocal: PCSTR, lpszunc: PCSTR, cchunc: UInt): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "ScUNCFromLocalPath", longArrayOf(lpszlocal, lpszunc, cchunc.toLong())).toInt()
}

public fun SzFindCh(lpsz: Long, ch: UShort): Long {
    return Win32DynamicFfi.invoke("mapi32.dll", "SzFindCh", longArrayOf(lpsz, ch.toLong()))
}

public fun SzFindLastCh(lpsz: Long, ch: UShort): Long {
    return Win32DynamicFfi.invoke("mapi32.dll", "SzFindLastCh", longArrayOf(lpsz, ch.toLong()))
}

public fun SzFindSz(lpsz: Long, lpszkey: Long): Long {
    return Win32DynamicFfi.invoke("mapi32.dll", "SzFindSz", longArrayOf(lpsz, lpszkey))
}

public fun UFromSz(lpsz: Long): UInt {
    return Win32DynamicFfi.invoke("mapi32.dll", "UFromSz", longArrayOf(lpsz)).toUInt()
}

public fun UlAddRef(lpunk: Long): UInt {
    return Win32DynamicFfi.invoke("mapi32.dll", "UlAddRef", longArrayOf(lpunk)).toUInt()
}

public fun UlPropSize(lpspropvalue: Long): UInt {
    return Win32DynamicFfi.invoke("mapi32.dll", "UlPropSize", longArrayOf(lpspropvalue)).toUInt()
}

public fun UlRelease(lpunk: Long): UInt {
    return Win32DynamicFfi.invoke("mapi32.dll", "UlRelease", longArrayOf(lpunk)).toUInt()
}

public fun WrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: UInt, lpuncompressedrtfstream: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "WrapCompressedRTFStream", longArrayOf(lpcompressedrtfstream, ulflags.toLong(), lpuncompressedrtfstream)).toInt()
}

public fun WrapStoreEntryID(ulflags: UInt, lpszdllname: Long, cborigentry: UInt, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "WrapStoreEntryID", longArrayOf(ulflags.toLong(), lpszdllname, cborigentry.toLong(), lporigentry, lpcbwrappedentry, lppwrappedentry)).toInt()
}
