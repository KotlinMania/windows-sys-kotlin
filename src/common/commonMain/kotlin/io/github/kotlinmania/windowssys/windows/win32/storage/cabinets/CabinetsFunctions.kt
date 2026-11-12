package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun fCIAddFile(hfci: ConstPtr<CVoid>, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool

public expect fun fCICreate(perf: ConstPtr<Erf>, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: ConstPtr<Ccab>, pv: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun fCIDestroy(hfci: ConstPtr<CVoid>): Bool

public expect fun fCIFlushCabinet(hfci: ConstPtr<CVoid>, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool

public expect fun fCIFlushFolder(hfci: ConstPtr<CVoid>, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool

public expect fun fDICopy(hfdi: ConstPtr<CVoid>, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: ConstPtr<CVoid>): Bool

public expect fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: MutPtr<Erf>): MutPtr<CVoid>

public expect fun fDIDestroy(hfdi: ConstPtr<CVoid>): Bool

public expect fun fDIIsCabinet(hfdi: ConstPtr<CVoid>, hf: Long, pfdici: MutPtr<Fdicabinetinfo>): Bool

public expect fun fDITruncateCabinet(hfdi: ConstPtr<CVoid>, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool
