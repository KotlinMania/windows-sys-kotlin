package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun fCIAddFile(hfci: ConstPtr, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool

public expect fun fCICreate(perf: ConstPtr, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: ConstPtr, pv: ConstPtr): MutPtr

public expect fun fCIDestroy(hfci: ConstPtr): Bool

public expect fun fCIFlushCabinet(hfci: ConstPtr, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool

public expect fun fCIFlushFolder(hfci: ConstPtr, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool

public expect fun fDICopy(hfdi: ConstPtr, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: ConstPtr): Bool

public expect fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: MutPtr): MutPtr

public expect fun fDIDestroy(hfdi: ConstPtr): Bool

public expect fun fDIIsCabinet(hfdi: ConstPtr, hf: Long, pfdici: MutPtr): Bool

public expect fun fDITruncateCabinet(hfdi: ConstPtr, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool
