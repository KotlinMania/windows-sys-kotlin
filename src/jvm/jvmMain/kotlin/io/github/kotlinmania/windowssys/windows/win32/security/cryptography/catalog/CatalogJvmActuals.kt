@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SecurityCryptographyCatalogJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext(phcatadmin: Long, pgsubsystem: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2(phcatadmin: Long, pgsubsystem: Long, pwszhashalgorithm: Long, pstronghashpolicy: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Long, pwszselectbasename: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle(hfile: Long, pcbhash: Long, pbhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Long, pcbhash: Long, pbhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: Long, cbhash: Int, dwflags: Int, phprevcatinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(dwflags: Int, fresume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Long, pscatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose(pcdf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes(pcdf: Long, pmember: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag(pcdf: Long, pwszmembertag: Long, pmember: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes(pcdf: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers(pcdf: Long, pprevmember: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx(pcdf: Long, pwszprevcdftag: Long, pfnparseerror: Long, ppmember: Long, fcontinueonerror: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen(pwszfilepath: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATClose(hcatalog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr(hcatalog: Long, pcatmember: Long, pprevattr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr(hcatalog: Long, pprevattr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember(hcatalog: Long, pprevmember: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo(hcatalog: Long, pcatmember: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo(hcatalog: Long, pcatmember: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore(pcatstore: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen(pwszfilename: Long, fdwopenflags: Int, hprov: Long, dwpublicversion: Int, dwencodingtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore(hcatalog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo(hcatalog: Long, pcatmember: Long, pwszreferencetag: Long, dwattrtypeandaction: Int, cbdata: Int, pbdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo(hcatalog: Long, pwszreferencetag: Long, dwattrtypeandaction: Int, cbdata: Int, pbdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo(hcatalog: Long, pwszfilename: Long, pwszreferencetag: Long, pgsubjecttype: Long, dwcertversion: Int, cbsipindirectdata: Int, pbsipindirectdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle(hcatalog: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_catalog_isCatalogFile(hfile: Long, pwszfilename: Long): Int
}

public actual fun cryptCATAdminAcquireContext(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext((phcatadmin?.value ?: 0L), (pgsubsystem?.value ?: 0L), dwflags.toInt())

public actual fun cryptCATAdminAcquireContext2(phcatadmin: COpaquePointer?, pgsubsystem: COpaquePointer?, pwszhashalgorithm: Pcwstr, pstronghashpolicy: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2((phcatadmin?.value ?: 0L), (pgsubsystem?.value ?: 0L), (pwszhashalgorithm?.value ?: 0L), (pstronghashpolicy?.value ?: 0L), dwflags.toInt())

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(hcatadmin, (pwszcatalogfile?.value ?: 0L), (pwszselectbasename?.value ?: 0L), dwflags.toInt())

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle((hfile?.value ?: 0L), (pcbhash?.value ?: 0L), (pbhash?.value ?: 0L), dwflags.toInt())

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: COpaquePointer?, pbhash: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(hcatadmin, (hfile?.value ?: 0L), (pcbhash?.value ?: 0L), (pbhash?.value ?: 0L), dwflags.toInt())

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: COpaquePointer?, cbhash: UInt, dwflags: UInt, phprevcatinfo: COpaquePointer?): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(hcatadmin, (pbhash?.value ?: 0L), cbhash.toInt(), dwflags.toInt(), (phprevcatinfo?.value ?: 0L))

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume)

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(hcatadmin, hcatinfo, dwflags.toInt())

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(hcatadmin, dwflags.toInt())

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(hcatadmin, (pwszcatalogfile?.value ?: 0L), dwflags.toInt())

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(hcatadmin, (pwszcatalogfile?.value ?: 0L), (pscatinfo?.value ?: 0L), dwflags.toInt())

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo((hcatalog?.value ?: 0L), (pwszreferencetag?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATCDFClose(pcdf: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose((pcdf?.value ?: 0L))

public actual fun cryptCATCDFEnumAttributes(pcdf: COpaquePointer?, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes((pcdf?.value ?: 0L), (pmember?.value ?: 0L), (pprevattr?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: COpaquePointer?, pwszmembertag: Pcwstr, pmember: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag((pcdf?.value ?: 0L), (pwszmembertag?.value ?: 0L), (pmember?.value ?: 0L), (pprevattr?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATCDFEnumCatAttributes(pcdf: COpaquePointer?, pprevattr: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes((pcdf?.value ?: 0L), (pprevattr?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATCDFEnumMembers(pcdf: COpaquePointer?, pprevmember: COpaquePointer?, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers((pcdf?.value ?: 0L), (pprevmember?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: COpaquePointer?, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: COpaquePointer?, fcontinueonerror: Bool, pvreserved: COpaquePointer?): Pwstr =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx((pcdf?.value ?: 0L), (pwszprevcdftag?.value ?: 0L), 0L, (ppmember?.value ?: 0L), fcontinueonerror, (pvreserved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen((pwszfilepath?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(hcatinfo, (pscatinfo?.value ?: 0L), dwflags.toInt())

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATClose((hcatalog?.value ?: 0L))

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: COpaquePointer?, pprevattr: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr((hcatalog?.value ?: 0L), (pcatmember?.value ?: 0L), (pprevattr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr((hcatalog?.value ?: 0L), (pprevattr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember((hcatalog?.value ?: 0L), (pprevmember?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: COpaquePointer?) {
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo((hcatalog?.value ?: 0L), (pcatmember?.value ?: 0L))
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo((hcatalog?.value ?: 0L), (pcatmember?.value ?: 0L), (pwszreferencetag?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo((hcatalog?.value ?: 0L), (pwszreferencetag?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo((hcatalog?.value ?: 0L), (pwszreferencetag?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATHandleFromStore(pcatstore: COpaquePointer?): Handle =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore((pcatstore?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen((pwszfilename?.value ?: 0L), fdwopenflags.toInt(), hprov.toLong(), dwpublicversion.toInt(), dwencodingtype.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore((hcatalog?.value ?: 0L))

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: COpaquePointer?, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo((hcatalog?.value ?: 0L), (pcatmember?.value ?: 0L), (pwszreferencetag?.value ?: 0L), dwattrtypeandaction.toInt(), cbdata.toInt(), (pbdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo((hcatalog?.value ?: 0L), (pwszreferencetag?.value ?: 0L), dwattrtypeandaction.toInt(), cbdata.toInt(), (pbdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: COpaquePointer?, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo((hcatalog?.value ?: 0L), (pwszfilename?.value ?: 0L), (pwszreferencetag?.value ?: 0L), (pgsubjecttype?.value ?: 0L), dwcertversion.toInt(), cbsipindirectdata.toInt(), (pbsipindirectdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): COpaquePointer? =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle((hcatalog?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssys_windows_win32_security_cryptography_catalog_isCatalogFile((hfile?.value ?: 0L), (pwszfilename?.value ?: 0L))
