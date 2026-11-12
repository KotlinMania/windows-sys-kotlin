@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFCIAddFile
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFCICreate
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFCIDestroy
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFCIFlushCabinet
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFCIFlushFolder
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFDICopy
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFDICreate
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFDIDestroy
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFDIIsCabinet
import io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssysWindowsWin32StorageCabinetsFDITruncateCabinet
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fCIAddFile(hfci: ConstPtr<CVoid>, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool =
    windowssysWindowsWin32StorageCabinetsFCIAddFile(hfci.rawAddress.toCPointer<ByteVar>(), pszsourcefile.rawAddress.toCPointer<ByteVar>(), pszfilename.rawAddress.toCPointer<ByteVar>(), fexecute, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), typecompress)

public actual fun fCICreate(perf: ConstPtr<Erf>, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: ConstPtr<Ccab>, pv: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32StorageCabinetsFCICreate(perf.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pccab.rawAddress.toCPointer<ByteVar>(), pv.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fCIDestroy(hfci: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32StorageCabinetsFCIDestroy(hfci.rawAddress.toCPointer<ByteVar>())

public actual fun fCIFlushCabinet(hfci: ConstPtr<CVoid>, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    windowssysWindowsWin32StorageCabinetsFCIFlushCabinet(hfci.rawAddress.toCPointer<ByteVar>(), fgetnextcab, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun fCIFlushFolder(hfci: ConstPtr<CVoid>, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    windowssysWindowsWin32StorageCabinetsFCIFlushFolder(hfci.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun fDICopy(hfdi: ConstPtr<CVoid>, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32StorageCabinetsFDICopy(hfdi.rawAddress.toCPointer<ByteVar>(), pszcabinet.rawAddress.toCPointer<ByteVar>(), pszcabpath.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvuser.rawAddress.toCPointer<ByteVar>())

public actual fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: MutPtr<Erf>): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32StorageCabinetsFDICreate(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), cputype, perf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fDIDestroy(hfdi: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32StorageCabinetsFDIDestroy(hfdi.rawAddress.toCPointer<ByteVar>())

public actual fun fDIIsCabinet(hfdi: ConstPtr<CVoid>, hf: Long, pfdici: MutPtr<Fdicabinetinfo>): Bool =
    windowssysWindowsWin32StorageCabinetsFDIIsCabinet(hfdi.rawAddress.toCPointer<ByteVar>(), hf, pfdici.rawAddress.toCPointer<ByteVar>())

public actual fun fDITruncateCabinet(hfdi: ConstPtr<CVoid>, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool =
    windowssysWindowsWin32StorageCabinetsFDITruncateCabinet(hfdi.rawAddress.toCPointer<ByteVar>(), pszcabinetname.rawAddress.toCPointer<ByteVar>(), ifoldertodelete)
