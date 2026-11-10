package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun fCIAddFile(hfci: COpaquePointer?, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool

public expect fun fCICreate(perf: COpaquePointer?, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: COpaquePointer?, pv: COpaquePointer?): COpaquePointer?

public expect fun fCIDestroy(hfci: COpaquePointer?): Bool

public expect fun fCIFlushCabinet(hfci: COpaquePointer?, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool

public expect fun fCIFlushFolder(hfci: COpaquePointer?, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool

public expect fun fDICopy(hfdi: COpaquePointer?, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: COpaquePointer?): Bool

public expect fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: COpaquePointer?): COpaquePointer?

public expect fun fDIDestroy(hfdi: COpaquePointer?): Bool

public expect fun fDIIsCabinet(hfdi: COpaquePointer?, hf: Long, pfdici: COpaquePointer?): Bool

public expect fun fDITruncateCabinet(hfdi: COpaquePointer?, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool
