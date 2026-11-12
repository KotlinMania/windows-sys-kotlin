package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

public expect fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, hinstance: Hinstance, cpages: UInt, lppage: MutPtr<Dtpage>, ulflags: UInt, lpptable: MutPtr<MutPtr<CVoid>>, lpptbldata: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun changeIdleRoutine(ftg: MutPtr<CVoid>, lpfnidle: Pfnidle, lpvidleparam: MutPtr<CVoid>, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort)

public expect fun createIProp(lpinterface: MutPtr<Guid>, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr<CVoid>, lpppropdata: MutPtr<MutPtr<CVoid>>): Int

public expect fun createTable(lpinterface: MutPtr<Guid>, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr<CVoid>, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: MutPtr<SPropTagArray>, lpptabledata: MutPtr<MutPtr<CVoid>>): Int

public expect fun deinitMapiUtil()

public expect fun deregisterIdleRoutine(ftg: MutPtr<CVoid>)

public expect fun enableIdleRoutine(ftg: MutPtr<CVoid>, fenable: Bool)

public expect fun fEqualNames(lpname1: MutPtr<Mapinameid>, lpname2: MutPtr<Mapinameid>): Bool

public expect fun fPropCompareProp(lpspropvalue1: MutPtr<SPropValue>, ulrelop: UInt, lpspropvalue2: MutPtr<SPropValue>): Bool

public expect fun fPropContainsProp(lpspropvaluedst: MutPtr<SPropValue>, lpspropvaluesrc: MutPtr<SPropValue>, ulfuzzylevel: UInt): Bool

public expect fun fPropExists(lpmapiprop: MutPtr<CVoid>, ulproptag: UInt): Bool

public expect fun freePadrlist(lpadrlist: MutPtr<Adrlist>)

public expect fun freeProws(lprows: MutPtr<SRowSet>)

public expect fun ftAddFt(ftaddend1: Filetime, ftaddend2: Filetime): Filetime

public expect fun ftMulDw(ftmultiplier: UInt, ftmultiplicand: Filetime): Filetime

public expect fun ftMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Filetime

public expect fun ftNegFt(ft: Filetime): Filetime

public expect fun ftSubFt(ftminuend: Filetime, ftsubtrahend: Filetime): Filetime

public expect fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: MutPtr<CVoid>, priidle: Short, csecidle: UInt, iroidle: UShort): MutPtr<CVoid>

public expect fun hrAddColumns(lptbl: MutPtr<CVoid>, lpproptagcolumnsnew: MutPtr<SPropTagArray>, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult

public expect fun hrAddColumnsEx(lptbl: MutPtr<CVoid>, lpproptagcolumnsnew: MutPtr<SPropTagArray>, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult

public expect fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: MutPtr<CVoid>, lppadvisesink: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hrDispatchNotifications(ulflags: UInt): Hresult

public expect fun hrGetOneProp(lpmapiprop: MutPtr<CVoid>, ulproptag: UInt, lppprop: MutPtr<MutPtr<SPropValue>>): Hresult

public expect fun hrIStorageFromStream(lpunkin: MutPtr<CVoid>, lpinterface: MutPtr<Guid>, ulflags: UInt, lppstorageout: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hrQueryAllRows(lptable: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lprestriction: MutPtr<SRestriction>, lpsortorderset: MutPtr<SSortOrderSet>, crowsmax: Int, lpprows: MutPtr<MutPtr<SRowSet>>): Hresult

public expect fun hrSetOneProp(lpmapiprop: MutPtr<CVoid>, lpprop: MutPtr<SPropValue>): Hresult

public expect fun hrThisThreadAdviseSink(lpadvisesink: MutPtr<CVoid>, lppadvisesink: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun lPropCompareProp(lpspropvaluea: MutPtr<SPropValue>, lpspropvalueb: MutPtr<SPropValue>): Int

public expect fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: MutPtr<SPropValue>): MutPtr<SPropValue>

public expect fun mAPIDeinitIdle()

public expect fun mAPIGetDefaultMalloc(): MutPtr<CVoid>

public expect fun mAPIInitIdle(lpvreserved: MutPtr<CVoid>): Int

public expect fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr<Byte>, lpszprefix: ConstPtr<Byte>, lppstream: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ppropFindProp(lpproparray: MutPtr<SPropValue>, cvalues: UInt, ulproptag: UInt): MutPtr<SPropValue>

public expect fun propCopyMore(lpspropvaluedest: MutPtr<SPropValue>, lpspropvaluesrc: MutPtr<SPropValue>, lpfallocmore: Lpallocatemore, lpvobject: MutPtr<CVoid>): Int

public expect fun rTFSync(lpmessage: MutPtr<CVoid>, ulflags: UInt, lpfmessageupdated: MutPtr<Bool>): Hresult

public expect fun scCopyNotifications(cnotification: Int, lpnotifications: MutPtr<Notification>, lpvdst: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int

public expect fun scCopyProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpvdst: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int

public expect fun scCountNotifications(cnotifications: Int, lpnotifications: MutPtr<Notification>, lpcb: MutPtr<UInt>): Int

public expect fun scCountProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpcb: MutPtr<UInt>): Int

public expect fun scCreateConversationIndex(cbparent: UInt, lpbparent: MutPtr<UByte>, lpcbconvindex: MutPtr<UInt>, lppbconvindex: MutPtr<MutPtr<UByte>>): Int

public expect fun scDupPropset(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpallocatebuffer: Lpallocatebuffer, lppproparray: MutPtr<MutPtr<SPropValue>>): Int

public expect fun scInitMapiUtil(ulflags: UInt): Int

public expect fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int

public expect fun scRelocNotifications(cnotification: Int, lpnotifications: MutPtr<Notification>, lpvbaseold: MutPtr<CVoid>, lpvbasenew: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int

public expect fun scRelocProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpvbaseold: MutPtr<CVoid>, lpvbasenew: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int

public expect fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int

public expect fun szFindCh(lpsz: MutPtr<Byte>, ch: UShort): MutPtr<Byte>

public expect fun szFindLastCh(lpsz: MutPtr<Byte>, ch: UShort): MutPtr<Byte>

public expect fun szFindSz(lpsz: MutPtr<Byte>, lpszkey: MutPtr<Byte>): MutPtr<Byte>

public expect fun uFromSz(lpsz: MutPtr<Byte>): UInt

public expect fun ulAddRef(lpunk: MutPtr<CVoid>): UInt

public expect fun ulPropSize(lpspropvalue: MutPtr<SPropValue>): UInt

public expect fun ulRelease(lpunk: MutPtr<CVoid>): UInt

public expect fun wrapCompressedRTFStream(lpcompressedrtfstream: MutPtr<CVoid>, ulflags: UInt, lpuncompressedrtfstream: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wrapStoreEntryID(ulflags: UInt, lpszdllname: ConstPtr<Byte>, cborigentry: UInt, lporigentry: ConstPtr<Entryid>, lpcbwrappedentry: MutPtr<UInt>, lppwrappedentry: MutPtr<MutPtr<Entryid>>): Hresult
