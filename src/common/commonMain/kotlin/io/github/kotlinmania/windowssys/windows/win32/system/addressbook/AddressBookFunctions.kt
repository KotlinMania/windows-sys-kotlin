package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

public expect fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr, hinstance: Hinstance, cpages: UInt, lppage: MutPtr, ulflags: UInt, lpptable: MutPtr, lpptbldata: MutPtr): Hresult

public expect fun changeIdleRoutine(ftg: MutPtr, lpfnidle: Pfnidle, lpvidleparam: MutPtr, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort)

public expect fun createIProp(lpinterface: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr, lpppropdata: MutPtr): Int

public expect fun createTable(lpinterface: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: MutPtr, lpptabledata: MutPtr): Int

public expect fun deinitMapiUtil()

public expect fun deregisterIdleRoutine(ftg: MutPtr)

public expect fun enableIdleRoutine(ftg: MutPtr, fenable: Bool)

public expect fun fEqualNames(lpname1: MutPtr, lpname2: MutPtr): Bool

public expect fun fPropCompareProp(lpspropvalue1: MutPtr, ulrelop: UInt, lpspropvalue2: MutPtr): Bool

public expect fun fPropContainsProp(lpspropvaluedst: MutPtr, lpspropvaluesrc: MutPtr, ulfuzzylevel: UInt): Bool

public expect fun fPropExists(lpmapiprop: MutPtr, ulproptag: UInt): Bool

public expect fun freePadrlist(lpadrlist: MutPtr)

public expect fun freeProws(lprows: MutPtr)

public expect fun ftAddFt(ftaddend1: Filetime, ftaddend2: Filetime): Filetime

public expect fun ftMulDw(ftmultiplier: UInt, ftmultiplicand: Filetime): Filetime

public expect fun ftMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Filetime

public expect fun ftNegFt(ft: Filetime): Filetime

public expect fun ftSubFt(ftminuend: Filetime, ftsubtrahend: Filetime): Filetime

public expect fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: MutPtr, priidle: Short, csecidle: UInt, iroidle: UShort): MutPtr

public expect fun hrAddColumns(lptbl: MutPtr, lpproptagcolumnsnew: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult

public expect fun hrAddColumnsEx(lptbl: MutPtr, lpproptagcolumnsnew: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult

public expect fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: MutPtr, lppadvisesink: MutPtr): Hresult

public expect fun hrDispatchNotifications(ulflags: UInt): Hresult

public expect fun hrGetOneProp(lpmapiprop: MutPtr, ulproptag: UInt, lppprop: MutPtr): Hresult

public expect fun hrIStorageFromStream(lpunkin: MutPtr, lpinterface: MutPtr, ulflags: UInt, lppstorageout: MutPtr): Hresult

public expect fun hrQueryAllRows(lptable: MutPtr, lpproptags: MutPtr, lprestriction: MutPtr, lpsortorderset: MutPtr, crowsmax: Int, lpprows: MutPtr): Hresult

public expect fun hrSetOneProp(lpmapiprop: MutPtr, lpprop: MutPtr): Hresult

public expect fun hrThisThreadAdviseSink(lpadvisesink: MutPtr, lppadvisesink: MutPtr): Hresult

public expect fun lPropCompareProp(lpspropvaluea: MutPtr, lpspropvalueb: MutPtr): Int

public expect fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: MutPtr): MutPtr

public expect fun mAPIDeinitIdle()

public expect fun mAPIGetDefaultMalloc(): MutPtr

public expect fun mAPIInitIdle(lpvreserved: MutPtr): Int

public expect fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr, lpszprefix: ConstPtr, lppstream: MutPtr): Hresult

public expect fun ppropFindProp(lpproparray: MutPtr, cvalues: UInt, ulproptag: UInt): MutPtr

public expect fun propCopyMore(lpspropvaluedest: MutPtr, lpspropvaluesrc: MutPtr, lpfallocmore: Lpallocatemore, lpvobject: MutPtr): Int

public expect fun rTFSync(lpmessage: MutPtr, ulflags: UInt, lpfmessageupdated: MutPtr): Hresult

public expect fun scCopyNotifications(cnotification: Int, lpnotifications: MutPtr, lpvdst: MutPtr, lpcb: MutPtr): Int

public expect fun scCopyProps(cvalues: Int, lpproparray: MutPtr, lpvdst: MutPtr, lpcb: MutPtr): Int

public expect fun scCountNotifications(cnotifications: Int, lpnotifications: MutPtr, lpcb: MutPtr): Int

public expect fun scCountProps(cvalues: Int, lpproparray: MutPtr, lpcb: MutPtr): Int

public expect fun scCreateConversationIndex(cbparent: UInt, lpbparent: MutPtr, lpcbconvindex: MutPtr, lppbconvindex: MutPtr): Int

public expect fun scDupPropset(cvalues: Int, lpproparray: MutPtr, lpallocatebuffer: Lpallocatebuffer, lppproparray: MutPtr): Int

public expect fun scInitMapiUtil(ulflags: UInt): Int

public expect fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int

public expect fun scRelocNotifications(cnotification: Int, lpnotifications: MutPtr, lpvbaseold: MutPtr, lpvbasenew: MutPtr, lpcb: MutPtr): Int

public expect fun scRelocProps(cvalues: Int, lpproparray: MutPtr, lpvbaseold: MutPtr, lpvbasenew: MutPtr, lpcb: MutPtr): Int

public expect fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int

public expect fun szFindCh(lpsz: MutPtr, ch: UShort): MutPtr

public expect fun szFindLastCh(lpsz: MutPtr, ch: UShort): MutPtr

public expect fun szFindSz(lpsz: MutPtr, lpszkey: MutPtr): MutPtr

public expect fun uFromSz(lpsz: MutPtr): UInt

public expect fun ulAddRef(lpunk: MutPtr): UInt

public expect fun ulPropSize(lpspropvalue: MutPtr): UInt

public expect fun ulRelease(lpunk: MutPtr): UInt

public expect fun wrapCompressedRTFStream(lpcompressedrtfstream: MutPtr, ulflags: UInt, lpuncompressedrtfstream: MutPtr): Hresult

public expect fun wrapStoreEntryID(ulflags: UInt, lpszdllname: ConstPtr, cborigentry: UInt, lporigentry: ConstPtr, lpcbwrappedentry: MutPtr, lppwrappedentry: MutPtr): Hresult
