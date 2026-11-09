@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SecurityCryptographyCatalogJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext(phcatadmin: Long, pgsubsystem: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext2(phcatadmin: Long, pgsubsystem: Long, pwszhashalgorithm: Long, pstronghashpolicy: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Long, pwszselectbasename: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle(hfile: Long, pcbhash: Long, pbhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Long, pcbhash: Long, pbhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: Long, cbhash: Int, dwflags: Int, phprevcatinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminPauseServiceForBackup(dwflags: Int, fresume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseContext(hcatadmin: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Long, pscatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATAllocSortedMemberInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFClose(pcdf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributes(pcdf: Long, pmember: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributesWithCDFTag(pcdf: Long, pwszmembertag: Long, pmember: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumCatAttributes(pcdf: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembers(pcdf: Long, pprevmember: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembersByCDFTagEx(pcdf: Long, pwszprevcdftag: Long, pfnparseerror: Long, ppmember: Long, fcontinueonerror: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFOpen(pwszfilepath: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATClose(hcatalog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateAttr(hcatalog: Long, pcatmember: Long, pprevattr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateCatAttr(hcatalog: Long, pprevattr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateMember(hcatalog: Long, pprevmember: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATFreeSortedMemberInfo(hcatalog: Long, pcatmember: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATGetAttrInfo(hcatalog: Long, pcatmember: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATGetCatAttrInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATGetMemberInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATHandleFromStore(pcatstore: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATOpen(pwszfilename: Long, fdwopenflags: Int, hprov: Long, dwpublicversion: Int, dwencodingtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATPersistStore(hcatalog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATPutAttrInfo(hcatalog: Long, pcatmember: Long, pwszreferencetag: Long, dwattrtypeandaction: Int, cbdata: Int, pbdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATPutCatAttrInfo(hcatalog: Long, pwszreferencetag: Long, dwattrtypeandaction: Int, cbdata: Int, pbdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATPutMemberInfo(hcatalog: Long, pwszfilename: Long, pwszreferencetag: Long, pgsubjecttype: Long, dwcertversion: Int, cbsipindirectdata: Int, pbsipindirectdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_CryptCATStoreFromHandle(hcatalog: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_IsCatalogFile(hfile: Long, pwszfilename: Long): Int
}

public actual fun CryptCATAdminAcquireContext(phcatadmin: Long, pgsubsystem: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext(phcatadmin, pgsubsystem, dwflags.toInt())

public actual fun CryptCATAdminAcquireContext2(phcatadmin: Long, pgsubsystem: Long, pwszhashalgorithm: PCWSTR, pstronghashpolicy: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext2(phcatadmin, pgsubsystem, pwszhashalgorithm, pstronghashpolicy, dwflags.toInt())

public actual fun CryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, pwszselectbasename: PCWSTR, dwflags: UInt): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAddCatalog(hcatadmin, pwszcatalogfile, pwszselectbasename, dwflags.toInt())

public actual fun CryptCATAdminCalcHashFromFileHandle(hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle(hfile, pcbhash, pbhash, dwflags.toInt())

public actual fun CryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle2(hcatadmin, hfile, pcbhash, pbhash, dwflags.toInt())

public actual fun CryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: Long, cbhash: UInt, dwflags: UInt, phprevcatinfo: Long): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminEnumCatalogFromHash(hcatadmin, pbhash, cbhash.toInt(), dwflags.toInt(), phprevcatinfo)

public actual fun CryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: BOOL): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume)

public actual fun CryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseCatalogContext(hcatadmin, hcatinfo, dwflags.toInt())

public actual fun CryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseContext(hcatadmin, dwflags.toInt())

public actual fun CryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminRemoveCatalog(hcatadmin, pwszcatalogfile, dwflags.toInt())

public actual fun CryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: PCWSTR, pscatinfo: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminResolveCatalogPath(hcatadmin, pwszcatalogfile, pscatinfo, dwflags.toInt())

public actual fun CryptCATAllocSortedMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATAllocSortedMemberInfo(hcatalog, pwszreferencetag)

public actual fun CryptCATCDFClose(pcdf: Long): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFClose(pcdf)

public actual fun CryptCATCDFEnumAttributes(pcdf: Long, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributes(pcdf, pmember, pprevattr, pfnparseerror.toLong())

public actual fun CryptCATCDFEnumAttributesWithCDFTag(pcdf: Long, pwszmembertag: PCWSTR, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributesWithCDFTag(pcdf, pwszmembertag, pmember, pprevattr, pfnparseerror.toLong())

public actual fun CryptCATCDFEnumCatAttributes(pcdf: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumCatAttributes(pcdf, pprevattr, pfnparseerror.toLong())

public actual fun CryptCATCDFEnumMembers(pcdf: Long, pprevmember: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembers(pcdf, pprevmember, pfnparseerror.toLong())

public actual fun CryptCATCDFEnumMembersByCDFTagEx(pcdf: Long, pwszprevcdftag: PWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK, ppmember: Long, fcontinueonerror: BOOL, pvreserved: Long): PWSTR =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembersByCDFTagEx(pcdf, pwszprevcdftag, pfnparseerror.toLong(), ppmember, fcontinueonerror, pvreserved)

public actual fun CryptCATCDFOpen(pwszfilepath: PCWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFOpen(pwszfilepath, pfnparseerror.toLong())

public actual fun CryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATCatalogInfoFromContext(hcatinfo, pscatinfo, dwflags.toInt())

public actual fun CryptCATClose(hcatalog: HANDLE): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATClose(hcatalog)

public actual fun CryptCATEnumerateAttr(hcatalog: HANDLE, pcatmember: Long, pprevattr: Long): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateAttr(hcatalog, pcatmember, pprevattr)

public actual fun CryptCATEnumerateCatAttr(hcatalog: HANDLE, pprevattr: Long): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateCatAttr(hcatalog, pprevattr)

public actual fun CryptCATEnumerateMember(hcatalog: HANDLE, pprevmember: Long): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateMember(hcatalog, pprevmember)

public actual fun CryptCATFreeSortedMemberInfo(hcatalog: HANDLE, pcatmember: Long) {
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATFreeSortedMemberInfo(hcatalog, pcatmember)
}

public actual fun CryptCATGetAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetAttrInfo(hcatalog, pcatmember, pwszreferencetag)

public actual fun CryptCATGetCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetCatAttrInfo(hcatalog, pwszreferencetag)

public actual fun CryptCATGetMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATGetMemberInfo(hcatalog, pwszreferencetag)

public actual fun CryptCATHandleFromStore(pcatstore: Long): HANDLE =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATHandleFromStore(pcatstore)

public actual fun CryptCATOpen(pwszfilename: PCWSTR, fdwopenflags: CRYPTCAT_OPEN_FLAGS, hprov: ULong, dwpublicversion: CRYPTCAT_VERSION, dwencodingtype: UInt): HANDLE =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATOpen(pwszfilename, fdwopenflags.toInt(), hprov.toLong(), dwpublicversion.toInt(), dwencodingtype.toInt())

public actual fun CryptCATPersistStore(hcatalog: HANDLE): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATPersistStore(hcatalog)

public actual fun CryptCATPutAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutAttrInfo(hcatalog, pcatmember, pwszreferencetag, dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata)

public actual fun CryptCATPutCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutCatAttrInfo(hcatalog, pwszreferencetag, dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata)

public actual fun CryptCATPutMemberInfo(hcatalog: HANDLE, pwszfilename: PCWSTR, pwszreferencetag: PCWSTR, pgsubjecttype: Long, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: Long): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATPutMemberInfo(hcatalog, pwszfilename, pwszreferencetag, pgsubjecttype, dwcertversion.toInt(), cbsipindirectdata.toInt(), pbsipindirectdata)

public actual fun CryptCATStoreFromHandle(hcatalog: HANDLE): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_CryptCATStoreFromHandle(hcatalog)

public actual fun IsCatalogFile(hfile: HANDLE, pwszfilename: PCWSTR): BOOL =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_IsCatalogFile(hfile, pwszfilename)
