@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: COpaquePointer?, entriesread: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
