package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR

public fun interface FnCallback {
    public operator fun invoke(pccab: Long, cbprevcab: UInt, pv: Long): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(typestatus: UInt, cb1: UInt, cb2: UInt, pv: Long): Int
}

public fun interface FnCallback2 {
    public operator fun invoke(pszname: PCSTR, pdate: Long, ptime: Long, pattribs: Long, err: Long, pv: Long): Long
}

public fun interface FnCallback3 {
    public operator fun invoke(pccab: Long, pszfile: PCSTR, cbfile: Int, fcontinuation: BOOL, pv: Long): Int
}

public fun interface FnCallback4 {
    public operator fun invoke(cb: UInt): Long
}

public fun interface FnCallback5 {
    public operator fun invoke(memory: Long)
}

public fun interface FnCallback6 {
    public operator fun invoke(pszfile: PCSTR, oflag: Int, pmode: Int, err: Long, pv: Long): Long
}

public fun interface FnCallback7 {
    public operator fun invoke(hf: Long, memory: Long, cb: UInt, err: Long, pv: Long): UInt
}

public fun interface FnCallback8 {
    public operator fun invoke(hf: Long, err: Long, pv: Long): Int
}

public fun interface FnCallback9 {
    public operator fun invoke(hf: Long, dist: Int, seektype: Int, err: Long, pv: Long): Int
}

public fun interface FnCallback10 {
    public operator fun invoke(pszfile: PCSTR, err: Long, pv: Long): Int
}

public fun interface FnCallback11 {
    public operator fun invoke(psztempname: PSTR, cbtempname: Int, pv: Long): BOOL
}

public fun interface FnCallback12 {
    public operator fun invoke(fdint: FDINOTIFICATIONTYPE, pfdin: Long): Long
}

public fun interface FnCallback13 {
    public operator fun invoke(pfdid: Long): Int
}

public fun interface FnCallback14 {
    public operator fun invoke(pszfile: PCSTR, oflag: Int, pmode: Int): Long
}

public fun interface FnCallback15 {
    public operator fun invoke(hf: Long, pv: Long, cb: UInt): UInt
}

public fun interface FnCallback16 {
    public operator fun invoke(hf: Long, dist: Int, seektype: Int): Int
}

public fun FCIAddFile(hfci: Long, pszsourcefile: PCSTR, pszfilename: PCSTR, fexecute: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS, pfnfcigoi: PFNFCIGETOPENINFO, typecompress: UShort): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "FCIAddFile", longArrayOf(hfci, pszsourcefile, pszfilename, fexecute.toLong(), Win32DynamicFfi.objectSlot(pfnfcignc), Win32DynamicFfi.objectSlot(pfnfcis), Win32DynamicFfi.objectSlot(pfnfcigoi), typecompress.toLong())).toInt()
}

public fun FCICreate(perf: Long, pfnfcifp: PFNFCIFILEPLACED, pfna: PFNFCIALLOC, pfnf: PFNFCIFREE, pfnopen: PFNFCIOPEN, pfnread: PFNFCIREAD, pfnwrite: PFNFCIWRITE, pfnclose: PFNFCICLOSE, pfnseek: PFNFCISEEK, pfndelete: PFNFCIDELETE, pfnfcigtf: PFNFCIGETTEMPFILE, pccab: Long, pv: Long): Long {
    return Win32DynamicFfi.invoke("cabinet.dll", "FCICreate", longArrayOf(perf, Win32DynamicFfi.objectSlot(pfnfcifp), Win32DynamicFfi.objectSlot(pfna), Win32DynamicFfi.objectSlot(pfnf), Win32DynamicFfi.objectSlot(pfnopen), Win32DynamicFfi.objectSlot(pfnread), Win32DynamicFfi.objectSlot(pfnwrite), Win32DynamicFfi.objectSlot(pfnclose), Win32DynamicFfi.objectSlot(pfnseek), Win32DynamicFfi.objectSlot(pfndelete), Win32DynamicFfi.objectSlot(pfnfcigtf), pccab, pv))
}

public fun FCIDestroy(hfci: Long): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "FCIDestroy", longArrayOf(hfci)).toInt()
}

public fun FCIFlushCabinet(hfci: Long, fgetnextcab: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "FCIFlushCabinet", longArrayOf(hfci, fgetnextcab.toLong(), Win32DynamicFfi.objectSlot(pfnfcignc), Win32DynamicFfi.objectSlot(pfnfcis))).toInt()
}

public fun FCIFlushFolder(hfci: Long, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "FCIFlushFolder", longArrayOf(hfci, Win32DynamicFfi.objectSlot(pfnfcignc), Win32DynamicFfi.objectSlot(pfnfcis))).toInt()
}

public fun FDICopy(hfdi: Long, pszcabinet: PCSTR, pszcabpath: PCSTR, flags: Int, pfnfdin: PFNFDINOTIFY, pfnfdid: PFNFDIDECRYPT, pvuser: Long): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "FDICopy", longArrayOf(hfdi, pszcabinet, pszcabpath, flags.toLong(), Win32DynamicFfi.objectSlot(pfnfdin), Win32DynamicFfi.objectSlot(pfnfdid), pvuser)).toInt()
}

public fun FDICreate(pfnalloc: PFNALLOC, pfnfree: PFNFREE, pfnopen: PFNOPEN, pfnread: PFNREAD, pfnwrite: PFNWRITE, pfnclose: PFNCLOSE, pfnseek: PFNSEEK, cputype: FDICREATE_CPU_TYPE, perf: Long): Long {
    return Win32DynamicFfi.invoke("cabinet.dll", "FDICreate", longArrayOf(Win32DynamicFfi.objectSlot(pfnalloc), Win32DynamicFfi.objectSlot(pfnfree), Win32DynamicFfi.objectSlot(pfnopen), Win32DynamicFfi.objectSlot(pfnread), Win32DynamicFfi.objectSlot(pfnwrite), Win32DynamicFfi.objectSlot(pfnclose), Win32DynamicFfi.objectSlot(pfnseek), cputype.toLong(), perf))
}

public fun FDIDestroy(hfdi: Long): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "FDIDestroy", longArrayOf(hfdi)).toInt()
}

public fun FDIIsCabinet(hfdi: Long, hf: Long, pfdici: Long): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "FDIIsCabinet", longArrayOf(hfdi, hf, pfdici)).toInt()
}

public fun FDITruncateCabinet(hfdi: Long, pszcabinetname: PCSTR, ifoldertodelete: UShort): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "FDITruncateCabinet", longArrayOf(hfdi, pszcabinetname, ifoldertodelete.toLong())).toInt()
}
