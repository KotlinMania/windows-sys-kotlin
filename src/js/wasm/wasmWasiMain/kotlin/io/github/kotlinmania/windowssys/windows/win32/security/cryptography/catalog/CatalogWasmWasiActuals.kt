@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun cryptCATAdminAcquireContext(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminAcquireContext2(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, pwszhashalgorithm: Pcwstr, pstronghashpolicy: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: COpaquePointer?, cbhash: UInt, dwflags: UInt, phprevcatinfo: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATCDFClose(pcdf: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATCDFEnumAttributes(pcdf: COpaquePointer?, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: COpaquePointer?, pwszmembertag: Pcwstr, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATCDFEnumCatAttributes(pcdf: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATCDFEnumMembers(pcdf: COpaquePointer?, pprevmember: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: COpaquePointer?, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: COpaquePointer?, fcontinueonerror: Bool, pvreserved: COpaquePointer?): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: COpaquePointer?, pprevattr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATHandleFromStore(pcatstore: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: COpaquePointer?, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
