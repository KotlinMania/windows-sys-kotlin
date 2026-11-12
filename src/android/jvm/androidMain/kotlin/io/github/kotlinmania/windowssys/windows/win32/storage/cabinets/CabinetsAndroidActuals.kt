@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

private object WindowsWin32StorageCabinetsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFCIAddFile(hfci: Long, pszsourcefile: Long, pszfilename: Long, fexecute: Int, pfnfcignc: Long, pfnfcis: Long, pfnfcigoi: Long, typecompress: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFCICreate(perf: Long, pfnfcifp: Long, pfna: Long, pfnf: Long, pfnopen: Long, pfnread: Long, pfnwrite: Long, pfnclose: Long, pfnseek: Long, pfndelete: Long, pfnfcigtf: Long, pccab: Long, pv: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFCIDestroy(hfci: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFCIFlushCabinet(hfci: Long, fgetnextcab: Int, pfnfcignc: Long, pfnfcis: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFCIFlushFolder(hfci: Long, pfnfcignc: Long, pfnfcis: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFDICopy(hfdi: Long, pszcabinet: Long, pszcabpath: Long, flags: Int, pfnfdin: Long, pfnfdid: Long, pvuser: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFDICreate(pfnalloc: Long, pfnfree: Long, pfnopen: Long, pfnread: Long, pfnwrite: Long, pfnclose: Long, pfnseek: Long, cputype: Int, perf: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFDIDestroy(hfdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFDIIsCabinet(hfdi: Long, hf: Long, pfdici: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCabinetsFDITruncateCabinet(hfdi: Long, pszcabinetname: Long, ifoldertodelete: Short): Int
}

public actual fun fCIAddFile(hfci: ConstPtr<CVoid>, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFCIAddFile(hfci.rawAddress, pszsourcefile.rawAddress, pszfilename.rawAddress, fexecute, 0L, 0L, 0L, typecompress.toShort())

public actual fun fCICreate(perf: ConstPtr<Erf>, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: ConstPtr<Ccab>, pv: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFCICreate(perf.rawAddress, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pccab.rawAddress, pv.rawAddress))

public actual fun fCIDestroy(hfci: ConstPtr<CVoid>): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFCIDestroy(hfci.rawAddress)

public actual fun fCIFlushCabinet(hfci: ConstPtr<CVoid>, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFCIFlushCabinet(hfci.rawAddress, fgetnextcab, 0L, 0L)

public actual fun fCIFlushFolder(hfci: ConstPtr<CVoid>, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFCIFlushFolder(hfci.rawAddress, 0L, 0L)

public actual fun fDICopy(hfdi: ConstPtr<CVoid>, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: ConstPtr<CVoid>): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFDICopy(hfdi.rawAddress, pszcabinet.rawAddress, pszcabpath.rawAddress, flags, 0L, 0L, pvuser.rawAddress)

public actual fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: MutPtr<Erf>): MutPtr<CVoid> =
    MutPtr(WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFDICreate(0L, 0L, 0L, 0L, 0L, 0L, 0L, cputype, perf.rawAddress))

public actual fun fDIDestroy(hfdi: ConstPtr<CVoid>): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFDIDestroy(hfdi.rawAddress)

public actual fun fDIIsCabinet(hfdi: ConstPtr<CVoid>, hf: Long, pfdici: MutPtr<Fdicabinetinfo>): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFDIIsCabinet(hfdi.rawAddress, hf, pfdici.rawAddress)

public actual fun fDITruncateCabinet(hfdi: ConstPtr<CVoid>, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool =
    WindowsWin32StorageCabinetsJniBridge.windowssysWindowsWin32StorageCabinetsFDITruncateCabinet(hfdi.rawAddress, pszcabinetname.rawAddress, ifoldertodelete.toShort())
