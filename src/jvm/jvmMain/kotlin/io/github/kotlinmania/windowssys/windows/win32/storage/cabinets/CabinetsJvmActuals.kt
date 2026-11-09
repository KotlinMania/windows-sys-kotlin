@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

private object WindowsWin32StorageCabinetsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FCIAddFile(hfci: Long, pszsourcefile: Long, pszfilename: Long, fexecute: Int, pfnfcignc: Long, pfnfcis: Long, pfnfcigoi: Long, typecompress: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FCICreate(perf: Long, pfnfcifp: Long, pfna: Long, pfnf: Long, pfnopen: Long, pfnread: Long, pfnwrite: Long, pfnclose: Long, pfnseek: Long, pfndelete: Long, pfnfcigtf: Long, pccab: Long, pv: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FCIDestroy(hfci: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FCIFlushCabinet(hfci: Long, fgetnextcab: Int, pfnfcignc: Long, pfnfcis: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FCIFlushFolder(hfci: Long, pfnfcignc: Long, pfnfcis: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FDICopy(hfdi: Long, pszcabinet: Long, pszcabpath: Long, flags: Int, pfnfdin: Long, pfnfdid: Long, pvuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FDICreate(pfnalloc: Long, pfnfree: Long, pfnopen: Long, pfnread: Long, pfnwrite: Long, pfnclose: Long, pfnseek: Long, cputype: Int, perf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FDIDestroy(hfdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FDIIsCabinet(hfdi: Long, hf: Long, pfdici: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_FDITruncateCabinet(hfdi: Long, pszcabinetname: Long, ifoldertodelete: Short): Int
}

public actual fun FCIAddFile(hfci: Long, pszsourcefile: PCSTR, pszfilename: PCSTR, fexecute: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS, pfnfcigoi: PFNFCIGETOPENINFO, typecompress: UShort): BOOL =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FCIAddFile(hfci, pszsourcefile, pszfilename, fexecute, pfnfcignc.toLong(), pfnfcis.toLong(), pfnfcigoi.toLong(), typecompress.toShort())

public actual fun FCICreate(perf: Long, pfnfcifp: PFNFCIFILEPLACED, pfna: PFNFCIALLOC, pfnf: PFNFCIFREE, pfnopen: PFNFCIOPEN, pfnread: PFNFCIREAD, pfnwrite: PFNFCIWRITE, pfnclose: PFNFCICLOSE, pfnseek: PFNFCISEEK, pfndelete: PFNFCIDELETE, pfnfcigtf: PFNFCIGETTEMPFILE, pccab: Long, pv: Long): Long =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FCICreate(perf, pfnfcifp.toLong(), pfna.toLong(), pfnf.toLong(), pfnopen.toLong(), pfnread.toLong(), pfnwrite.toLong(), pfnclose.toLong(), pfnseek.toLong(), pfndelete.toLong(), pfnfcigtf.toLong(), pccab, pv)

public actual fun FCIDestroy(hfci: Long): BOOL =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FCIDestroy(hfci)

public actual fun FCIFlushCabinet(hfci: Long, fgetnextcab: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FCIFlushCabinet(hfci, fgetnextcab, pfnfcignc.toLong(), pfnfcis.toLong())

public actual fun FCIFlushFolder(hfci: Long, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FCIFlushFolder(hfci, pfnfcignc.toLong(), pfnfcis.toLong())

public actual fun FDICopy(hfdi: Long, pszcabinet: PCSTR, pszcabpath: PCSTR, flags: Int, pfnfdin: PFNFDINOTIFY, pfnfdid: PFNFDIDECRYPT, pvuser: Long): BOOL =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FDICopy(hfdi, pszcabinet, pszcabpath, flags, pfnfdin.toLong(), pfnfdid.toLong(), pvuser)

public actual fun FDICreate(pfnalloc: PFNALLOC, pfnfree: PFNFREE, pfnopen: PFNOPEN, pfnread: PFNREAD, pfnwrite: PFNWRITE, pfnclose: PFNCLOSE, pfnseek: PFNSEEK, cputype: FDICREATE_CPU_TYPE, perf: Long): Long =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FDICreate(pfnalloc.toLong(), pfnfree.toLong(), pfnopen.toLong(), pfnread.toLong(), pfnwrite.toLong(), pfnclose.toLong(), pfnseek.toLong(), cputype, perf)

public actual fun FDIDestroy(hfdi: Long): BOOL =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FDIDestroy(hfdi)

public actual fun FDIIsCabinet(hfdi: Long, hf: Long, pfdici: Long): BOOL =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FDIIsCabinet(hfdi, hf, pfdici)

public actual fun FDITruncateCabinet(hfdi: Long, pszcabinetname: PCSTR, ifoldertodelete: UShort): BOOL =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_FDITruncateCabinet(hfdi, pszcabinetname, ifoldertodelete.toShort())
