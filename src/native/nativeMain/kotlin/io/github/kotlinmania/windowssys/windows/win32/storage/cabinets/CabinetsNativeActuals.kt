@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun FCIAddFile(hfci: Long, pszsourcefile: PCSTR, pszfilename: PCSTR, fexecute: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS, pfnfcigoi: PFNFCIGETOPENINFO, typecompress: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FCIAddFile(hfci.toCPointer<ByteVar>(), pszsourcefile.toCPointer<ByteVar>(), pszfilename.toCPointer<ByteVar>(), fexecute, pfnfcignc.toLong().toCPointer<ByteVar>(), pfnfcis.toLong().toCPointer<ByteVar>(), pfnfcigoi.toLong().toCPointer<ByteVar>(), typecompress)

public actual fun FCICreate(perf: Long, pfnfcifp: PFNFCIFILEPLACED, pfna: PFNFCIALLOC, pfnf: PFNFCIFREE, pfnopen: PFNFCIOPEN, pfnread: PFNFCIREAD, pfnwrite: PFNFCIWRITE, pfnclose: PFNFCICLOSE, pfnseek: PFNFCISEEK, pfndelete: PFNFCIDELETE, pfnfcigtf: PFNFCIGETTEMPFILE, pccab: Long, pv: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FCICreate(perf.toCPointer<ByteVar>(), pfnfcifp.toLong().toCPointer<ByteVar>(), pfna.toLong().toCPointer<ByteVar>(), pfnf.toLong().toCPointer<ByteVar>(), pfnopen.toLong().toCPointer<ByteVar>(), pfnread.toLong().toCPointer<ByteVar>(), pfnwrite.toLong().toCPointer<ByteVar>(), pfnclose.toLong().toCPointer<ByteVar>(), pfnseek.toLong().toCPointer<ByteVar>(), pfndelete.toLong().toCPointer<ByteVar>(), pfnfcigtf.toLong().toCPointer<ByteVar>(), pccab.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FCIDestroy(hfci: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FCIDestroy(hfci.toCPointer<ByteVar>())

public actual fun FCIFlushCabinet(hfci: Long, fgetnextcab: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FCIFlushCabinet(hfci.toCPointer<ByteVar>(), fgetnextcab, pfnfcignc.toLong().toCPointer<ByteVar>(), pfnfcis.toLong().toCPointer<ByteVar>())

public actual fun FCIFlushFolder(hfci: Long, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FCIFlushFolder(hfci.toCPointer<ByteVar>(), pfnfcignc.toLong().toCPointer<ByteVar>(), pfnfcis.toLong().toCPointer<ByteVar>())

public actual fun FDICopy(hfdi: Long, pszcabinet: PCSTR, pszcabpath: PCSTR, flags: Int, pfnfdin: PFNFDINOTIFY, pfnfdid: PFNFDIDECRYPT, pvuser: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FDICopy(hfdi.toCPointer<ByteVar>(), pszcabinet.toCPointer<ByteVar>(), pszcabpath.toCPointer<ByteVar>(), flags, pfnfdin.toLong().toCPointer<ByteVar>(), pfnfdid.toLong().toCPointer<ByteVar>(), pvuser.toCPointer<ByteVar>())

public actual fun FDICreate(pfnalloc: PFNALLOC, pfnfree: PFNFREE, pfnopen: PFNOPEN, pfnread: PFNREAD, pfnwrite: PFNWRITE, pfnclose: PFNCLOSE, pfnseek: PFNSEEK, cputype: FDICREATE_CPU_TYPE, perf: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FDICreate(pfnalloc.toLong().toCPointer<ByteVar>(), pfnfree.toLong().toCPointer<ByteVar>(), pfnopen.toLong().toCPointer<ByteVar>(), pfnread.toLong().toCPointer<ByteVar>(), pfnwrite.toLong().toCPointer<ByteVar>(), pfnclose.toLong().toCPointer<ByteVar>(), pfnseek.toLong().toCPointer<ByteVar>(), cputype, perf.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FDIDestroy(hfdi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FDIDestroy(hfdi.toCPointer<ByteVar>())

public actual fun FDIIsCabinet(hfdi: Long, hf: Long, pfdici: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FDIIsCabinet(hfdi.toCPointer<ByteVar>(), hf, pfdici.toCPointer<ByteVar>())

public actual fun FDITruncateCabinet(hfdi: Long, pszcabinetname: PCSTR, ifoldertodelete: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.cabinets.cinterop.windowssys_windows_win32_storage_cabinets_FDITruncateCabinet(hfdi.toCPointer<ByteVar>(), pszcabinetname.toCPointer<ByteVar>(), ifoldertodelete)
