@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

private object WindowsWin32StorageCabinetsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fCIAddFile(hfci: Long, pszsourcefile: Long, pszfilename: Long, fexecute: Int, pfnfcignc: Long, pfnfcis: Long, pfnfcigoi: Long, typecompress: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fCICreate(perf: Long, pfnfcifp: Long, pfna: Long, pfnf: Long, pfnopen: Long, pfnread: Long, pfnwrite: Long, pfnclose: Long, pfnseek: Long, pfndelete: Long, pfnfcigtf: Long, pccab: Long, pv: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fCIDestroy(hfci: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fCIFlushCabinet(hfci: Long, fgetnextcab: Int, pfnfcignc: Long, pfnfcis: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fCIFlushFolder(hfci: Long, pfnfcignc: Long, pfnfcis: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fDICopy(hfdi: Long, pszcabinet: Long, pszcabpath: Long, flags: Int, pfnfdin: Long, pfnfdid: Long, pvuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fDICreate(pfnalloc: Long, pfnfree: Long, pfnopen: Long, pfnread: Long, pfnwrite: Long, pfnclose: Long, pfnseek: Long, cputype: Int, perf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fDIDestroy(hfdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fDIIsCabinet(hfdi: Long, hf: Long, pfdici: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_cabinets_fDITruncateCabinet(hfdi: Long, pszcabinetname: Long, ifoldertodelete: Short): Int
}

public actual fun fCIAddFile(hfci: COpaquePointer?, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fCIAddFile((hfci?.value ?: 0L), (pszsourcefile?.value ?: 0L), (pszfilename?.value ?: 0L), fexecute, 0L, 0L, 0L, typecompress.toShort())

public actual fun fCICreate(perf: COpaquePointer?, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: COpaquePointer?, pv: COpaquePointer?): COpaquePointer? =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fCICreate((perf?.value ?: 0L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, (pccab?.value ?: 0L), (pv?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fCIDestroy(hfci: COpaquePointer?): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fCIDestroy((hfci?.value ?: 0L))

public actual fun fCIFlushCabinet(hfci: COpaquePointer?, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fCIFlushCabinet((hfci?.value ?: 0L), fgetnextcab, 0L, 0L)

public actual fun fCIFlushFolder(hfci: COpaquePointer?, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fCIFlushFolder((hfci?.value ?: 0L), 0L, 0L)

public actual fun fDICopy(hfdi: COpaquePointer?, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: COpaquePointer?): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fDICopy((hfdi?.value ?: 0L), (pszcabinet?.value ?: 0L), (pszcabpath?.value ?: 0L), flags, 0L, 0L, (pvuser?.value ?: 0L))

public actual fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: COpaquePointer?): COpaquePointer? =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fDICreate(0L, 0L, 0L, 0L, 0L, 0L, 0L, cputype, (perf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fDIDestroy(hfdi: COpaquePointer?): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fDIDestroy((hfdi?.value ?: 0L))

public actual fun fDIIsCabinet(hfdi: COpaquePointer?, hf: Long, pfdici: COpaquePointer?): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fDIIsCabinet((hfdi?.value ?: 0L), hf, (pfdici?.value ?: 0L))

public actual fun fDITruncateCabinet(hfdi: COpaquePointer?, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssys_windows_win32_storage_cabinets_fDITruncateCabinet((hfdi?.value ?: 0L), (pszcabinetname?.value ?: 0L), ifoldertodelete.toShort())
