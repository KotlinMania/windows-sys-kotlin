@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

public actual fun fCIAddFile(hfci: COpaquePointer?, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fCICreate(perf: COpaquePointer?, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: COpaquePointer?, pv: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fCIDestroy(hfci: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fCIFlushCabinet(hfci: COpaquePointer?, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fCIFlushFolder(hfci: COpaquePointer?, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fDICopy(hfdi: COpaquePointer?, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fDIDestroy(hfdi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fDIIsCabinet(hfdi: COpaquePointer?, hf: Long, pfdici: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fDITruncateCabinet(hfdi: COpaquePointer?, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
