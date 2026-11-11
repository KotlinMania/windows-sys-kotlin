@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATClose
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_isCatalogFile
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun cryptCATAdminAcquireContext(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext(phcatadmin?.value?.toCPointer<ByteVar>(), pgsubsystem?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminAcquireContext2(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, pwszhashalgorithm: Pcwstr, pstronghashpolicy: COpaquePointer?, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2(phcatadmin?.value?.toCPointer<ByteVar>(), pgsubsystem?.value?.toCPointer<ByteVar>(), pwszhashalgorithm?.value?.toCPointer<ByteVar>(), pstronghashpolicy?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(hcatadmin, pwszcatalogfile?.value?.toCPointer<ByteVar>(), pwszselectbasename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle(hfile?.value?.toCPointer<ByteVar>(), pcbhash?.value?.toCPointer<ByteVar>(), pbhash?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(hcatadmin, hfile?.value?.toCPointer<ByteVar>(), pcbhash?.value?.toCPointer<ByteVar>(), pbhash?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: COpaquePointer?, cbhash: UInt, dwflags: UInt, phprevcatinfo: COpaquePointer?): Long =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(hcatadmin, pbhash?.value?.toCPointer<ByteVar>(), cbhash, dwflags, phprevcatinfo?.value?.toCPointer<ByteVar>())

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(dwflags, fresume)

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(hcatadmin, hcatinfo, dwflags)

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(hcatadmin, dwflags)

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(hcatadmin, pwszcatalogfile?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(hcatadmin, pwszcatalogfile?.value?.toCPointer<ByteVar>(), pscatinfo?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo(hcatalog?.value?.toCPointer<ByteVar>(), pwszreferencetag?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATCDFClose(pcdf: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose(pcdf?.value?.toCPointer<ByteVar>())

public actual fun cryptCATCDFEnumAttributes(pcdf: COpaquePointer?, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes(pcdf?.value?.toCPointer<ByteVar>(), pmember?.value?.toCPointer<ByteVar>(), pprevattr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: COpaquePointer?, pwszmembertag: Pcwstr, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag(pcdf?.value?.toCPointer<ByteVar>(), pwszmembertag?.value?.toCPointer<ByteVar>(), pmember?.value?.toCPointer<ByteVar>(), pprevattr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATCDFEnumCatAttributes(pcdf: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes(pcdf?.value?.toCPointer<ByteVar>(), pprevattr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATCDFEnumMembers(pcdf: COpaquePointer?, pprevmember: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers(pcdf?.value?.toCPointer<ByteVar>(), pprevmember?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: COpaquePointer?, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: COpaquePointer?, fcontinueonerror: Bool, pvreserved: COpaquePointer?): Pwstr =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx(pcdf?.value?.toCPointer<ByteVar>(), pwszprevcdftag?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ppmember?.value?.toCPointer<ByteVar>(), fcontinueonerror, pvreserved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen(pwszfilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(hcatinfo, pscatinfo?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATClose(hcatalog?.value?.toCPointer<ByteVar>())

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: COpaquePointer?, pprevattr: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr(hcatalog?.value?.toCPointer<ByteVar>(), pcatmember?.value?.toCPointer<ByteVar>(), pprevattr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr(hcatalog?.value?.toCPointer<ByteVar>(), pprevattr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember(hcatalog?.value?.toCPointer<ByteVar>(), pprevmember?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: COpaquePointer?) {
    windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo(hcatalog?.value?.toCPointer<ByteVar>(), pcatmember?.value?.toCPointer<ByteVar>())
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo(hcatalog?.value?.toCPointer<ByteVar>(), pcatmember?.value?.toCPointer<ByteVar>(), pwszreferencetag?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo(hcatalog?.value?.toCPointer<ByteVar>(), pwszreferencetag?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo(hcatalog?.value?.toCPointer<ByteVar>(), pwszreferencetag?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATHandleFromStore(pcatstore: COpaquePointer?): Handle =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore(pcatstore?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen(pwszfilename?.value?.toCPointer<ByteVar>(), fdwopenflags, hprov, dwpublicversion, dwencodingtype)?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore(hcatalog?.value?.toCPointer<ByteVar>())

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo(hcatalog?.value?.toCPointer<ByteVar>(), pcatmember?.value?.toCPointer<ByteVar>(), pwszreferencetag?.value?.toCPointer<ByteVar>(), dwattrtypeandaction, cbdata, pbdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo(hcatalog?.value?.toCPointer<ByteVar>(), pwszreferencetag?.value?.toCPointer<ByteVar>(), dwattrtypeandaction, cbdata, pbdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: COpaquePointer?, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo(hcatalog?.value?.toCPointer<ByteVar>(), pwszfilename?.value?.toCPointer<ByteVar>(), pwszreferencetag?.value?.toCPointer<ByteVar>(), pgsubjecttype?.value?.toCPointer<ByteVar>(), dwcertversion, cbsipindirectdata, pbsipindirectdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): COpaquePointer? =
    windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle(hcatalog?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    windowssys_windows_win32_security_cryptography_catalog_isCatalogFile(hfile?.value?.toCPointer<ByteVar>(), pwszfilename?.value?.toCPointer<ByteVar>())
