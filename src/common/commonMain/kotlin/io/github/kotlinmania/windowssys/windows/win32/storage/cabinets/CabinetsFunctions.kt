package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

public expect fun FCIAddFile(hfci: Long, pszsourcefile: PCSTR, pszfilename: PCSTR, fexecute: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS, pfnfcigoi: PFNFCIGETOPENINFO, typecompress: UShort): BOOL

public expect fun FCICreate(perf: Long, pfnfcifp: PFNFCIFILEPLACED, pfna: PFNFCIALLOC, pfnf: PFNFCIFREE, pfnopen: PFNFCIOPEN, pfnread: PFNFCIREAD, pfnwrite: PFNFCIWRITE, pfnclose: PFNFCICLOSE, pfnseek: PFNFCISEEK, pfndelete: PFNFCIDELETE, pfnfcigtf: PFNFCIGETTEMPFILE, pccab: Long, pv: Long): Long

public expect fun FCIDestroy(hfci: Long): BOOL

public expect fun FCIFlushCabinet(hfci: Long, fgetnextcab: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL

public expect fun FCIFlushFolder(hfci: Long, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL

public expect fun FDICopy(hfdi: Long, pszcabinet: PCSTR, pszcabpath: PCSTR, flags: Int, pfnfdin: PFNFDINOTIFY, pfnfdid: PFNFDIDECRYPT, pvuser: Long): BOOL

public expect fun FDICreate(pfnalloc: PFNALLOC, pfnfree: PFNFREE, pfnopen: PFNOPEN, pfnread: PFNREAD, pfnwrite: PFNWRITE, pfnclose: PFNCLOSE, pfnseek: PFNSEEK, cputype: FDICREATE_CPU_TYPE, perf: Long): Long

public expect fun FDIDestroy(hfdi: Long): BOOL

public expect fun FDIIsCabinet(hfdi: Long, hf: Long, pfdici: Long): BOOL

public expect fun FDITruncateCabinet(hfdi: Long, pszcabinetname: PCSTR, ifoldertodelete: UShort): BOOL
