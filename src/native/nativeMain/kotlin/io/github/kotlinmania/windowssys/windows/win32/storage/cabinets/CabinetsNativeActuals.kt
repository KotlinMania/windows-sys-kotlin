@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fCIAddFile(hfci: COpaquePointer?, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fCIAddFile(hfci?.value?.toCPointer<ByteVar>(), pszsourcefile?.value?.toCPointer<ByteVar>(), pszfilename?.value?.toCPointer<ByteVar>(), fexecute, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), typecompress)

public actual fun fCICreate(perf: COpaquePointer?, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: COpaquePointer?, pv: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fCICreate(perf?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pccab?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fCIDestroy(hfci: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fCIDestroy(hfci?.value?.toCPointer<ByteVar>())

public actual fun fCIFlushCabinet(hfci: COpaquePointer?, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fCIFlushCabinet(hfci?.value?.toCPointer<ByteVar>(), fgetnextcab, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun fCIFlushFolder(hfci: COpaquePointer?, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fCIFlushFolder(hfci?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun fDICopy(hfdi: COpaquePointer?, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fDICopy(hfdi?.value?.toCPointer<ByteVar>(), pszcabinet?.value?.toCPointer<ByteVar>(), pszcabpath?.value?.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvuser?.value?.toCPointer<ByteVar>())

public actual fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fDICreate(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), cputype, perf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fDIDestroy(hfdi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fDIDestroy(hfdi?.value?.toCPointer<ByteVar>())

public actual fun fDIIsCabinet(hfdi: COpaquePointer?, hf: Long, pfdici: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fDIIsCabinet(hfdi?.value?.toCPointer<ByteVar>(), hf, pfdici?.value?.toCPointer<ByteVar>())

public actual fun fDITruncateCabinet(hfdi: COpaquePointer?, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_fDITruncateCabinet(hfdi?.value?.toCPointer<ByteVar>(), pszcabinetname?.value?.toCPointer<ByteVar>(), ifoldertodelete)
