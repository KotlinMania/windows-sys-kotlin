@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CryptCATAdminAcquireContext(phcatadmin: Long, pgsubsystem: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext(phcatadmin.toCPointer<ByteVar>(), pgsubsystem.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCATAdminAcquireContext2(phcatadmin: Long, pgsubsystem: Long, pwszhashalgorithm: PCWSTR, pstronghashpolicy: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext2(phcatadmin.toCPointer<ByteVar>(), pgsubsystem.toCPointer<ByteVar>(), pwszhashalgorithm.toCPointer<ByteVar>(), pstronghashpolicy.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, pwszselectbasename: PCWSTR, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAddCatalog(hcatadmin, pwszcatalogfile.toCPointer<ByteVar>(), pwszselectbasename.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCATAdminCalcHashFromFileHandle(hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle(hfile.toCPointer<ByteVar>(), pcbhash.toCPointer<ByteVar>(), pbhash.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle2(hcatadmin, hfile.toCPointer<ByteVar>(), pcbhash.toCPointer<ByteVar>(), pbhash.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: Long, cbhash: UInt, dwflags: UInt, phprevcatinfo: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminEnumCatalogFromHash(hcatadmin, pbhash.toCPointer<ByteVar>(), cbhash, dwflags, phprevcatinfo.toCPointer<ByteVar>())

public actual fun CryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminPauseServiceForBackup(dwflags, fresume)

public actual fun CryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseCatalogContext(hcatadmin, hcatinfo, dwflags)

public actual fun CryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseContext(hcatadmin, dwflags)

public actual fun CryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminRemoveCatalog(hcatadmin, pwszcatalogfile.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: PCWSTR, pscatinfo: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminResolveCatalogPath(hcatadmin, pwszcatalogfile.toCPointer<ByteVar>(), pscatinfo.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCATAllocSortedMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATAllocSortedMemberInfo(hcatalog.toCPointer<ByteVar>(), pwszreferencetag.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATCDFClose(pcdf: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFClose(pcdf.toCPointer<ByteVar>())

public actual fun CryptCATCDFEnumAttributes(pcdf: Long, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributes(pcdf.toCPointer<ByteVar>(), pmember.toCPointer<ByteVar>(), pprevattr.toCPointer<ByteVar>(), pfnparseerror.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATCDFEnumAttributesWithCDFTag(pcdf: Long, pwszmembertag: PCWSTR, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributesWithCDFTag(pcdf.toCPointer<ByteVar>(), pwszmembertag.toCPointer<ByteVar>(), pmember.toCPointer<ByteVar>(), pprevattr.toCPointer<ByteVar>(), pfnparseerror.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATCDFEnumCatAttributes(pcdf: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumCatAttributes(pcdf.toCPointer<ByteVar>(), pprevattr.toCPointer<ByteVar>(), pfnparseerror.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATCDFEnumMembers(pcdf: Long, pprevmember: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembers(pcdf.toCPointer<ByteVar>(), pprevmember.toCPointer<ByteVar>(), pfnparseerror.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATCDFEnumMembersByCDFTagEx(pcdf: Long, pwszprevcdftag: PWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK, ppmember: Long, fcontinueonerror: BOOL, pvreserved: Long): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembersByCDFTagEx(pcdf.toCPointer<ByteVar>(), pwszprevcdftag.toCPointer<ByteVar>(), pfnparseerror.toLong().toCPointer<ByteVar>(), ppmember.toCPointer<ByteVar>(), fcontinueonerror, pvreserved.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATCDFOpen(pwszfilepath: PCWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFOpen(pwszfilepath.toCPointer<ByteVar>(), pfnparseerror.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATCatalogInfoFromContext(hcatinfo, pscatinfo.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCATClose(hcatalog: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATClose(hcatalog.toCPointer<ByteVar>())

public actual fun CryptCATEnumerateAttr(hcatalog: HANDLE, pcatmember: Long, pprevattr: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateAttr(hcatalog.toCPointer<ByteVar>(), pcatmember.toCPointer<ByteVar>(), pprevattr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATEnumerateCatAttr(hcatalog: HANDLE, pprevattr: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateCatAttr(hcatalog.toCPointer<ByteVar>(), pprevattr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATEnumerateMember(hcatalog: HANDLE, pprevmember: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateMember(hcatalog.toCPointer<ByteVar>(), pprevmember.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATFreeSortedMemberInfo(hcatalog: HANDLE, pcatmember: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATFreeSortedMemberInfo(hcatalog.toCPointer<ByteVar>(), pcatmember.toCPointer<ByteVar>())
}

public actual fun CryptCATGetAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetAttrInfo(hcatalog.toCPointer<ByteVar>(), pcatmember.toCPointer<ByteVar>(), pwszreferencetag.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATGetCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetCatAttrInfo(hcatalog.toCPointer<ByteVar>(), pwszreferencetag.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATGetMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetMemberInfo(hcatalog.toCPointer<ByteVar>(), pwszreferencetag.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATHandleFromStore(pcatstore: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATHandleFromStore(pcatstore.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATOpen(pwszfilename: PCWSTR, fdwopenflags: CRYPTCAT_OPEN_FLAGS, hprov: ULong, dwpublicversion: CRYPTCAT_VERSION, dwencodingtype: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATOpen(pwszfilename.toCPointer<ByteVar>(), fdwopenflags, hprov, dwpublicversion, dwencodingtype)?.toLong() ?: 0L

public actual fun CryptCATPersistStore(hcatalog: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATPersistStore(hcatalog.toCPointer<ByteVar>())

public actual fun CryptCATPutAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutAttrInfo(hcatalog.toCPointer<ByteVar>(), pcatmember.toCPointer<ByteVar>(), pwszreferencetag.toCPointer<ByteVar>(), dwattrtypeandaction, cbdata, pbdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATPutCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutCatAttrInfo(hcatalog.toCPointer<ByteVar>(), pwszreferencetag.toCPointer<ByteVar>(), dwattrtypeandaction, cbdata, pbdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATPutMemberInfo(hcatalog: HANDLE, pwszfilename: PCWSTR, pwszreferencetag: PCWSTR, pgsubjecttype: Long, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutMemberInfo(hcatalog.toCPointer<ByteVar>(), pwszfilename.toCPointer<ByteVar>(), pwszreferencetag.toCPointer<ByteVar>(), pgsubjecttype.toCPointer<ByteVar>(), dwcertversion, cbsipindirectdata, pbsipindirectdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptCATStoreFromHandle(hcatalog: HANDLE): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_CryptCATStoreFromHandle(hcatalog.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IsCatalogFile(hfile: HANDLE, pwszfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssys_windows_win32_security_cryptography_catalog_IsCatalogFile(hfile.toCPointer<ByteVar>(), pwszfilename.toCPointer<ByteVar>())
