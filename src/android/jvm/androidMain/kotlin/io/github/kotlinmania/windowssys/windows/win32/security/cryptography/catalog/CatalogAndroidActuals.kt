@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertStrongSignPara

private object WindowsWin32SecurityCryptographyCatalogJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(phcatadmin: Long, pgsubsystem: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(phcatadmin: Long, pgsubsystem: Long, pwszhashalgorithm: Long, pstronghashpolicy: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Long, pwszselectbasename: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(hfile: Long, pcbhash: Long, pbhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Long, pcbhash: Long, pbhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: Long, cbhash: Int, dwflags: Int, phprevcatinfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(dwflags: Int, fresume: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(hcatadmin: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Long, pscatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(pcdf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(pcdf: Long, pmember: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(pcdf: Long, pwszmembertag: Long, pmember: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(pcdf: Long, pprevattr: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(pcdf: Long, pprevmember: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(pcdf: Long, pwszprevcdftag: Long, pfnparseerror: Long, ppmember: Long, fcontinueonerror: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(pwszfilepath: Long, pfnparseerror: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(hcatalog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(hcatalog: Long, pcatmember: Long, pprevattr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(hcatalog: Long, pprevattr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(hcatalog: Long, pprevmember: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(hcatalog: Long, pcatmember: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(hcatalog: Long, pcatmember: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(hcatalog: Long, pwszreferencetag: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(pcatstore: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(pwszfilename: Long, fdwopenflags: Int, hprov: Long, dwpublicversion: Int, dwencodingtype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(hcatalog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(hcatalog: Long, pcatmember: Long, pwszreferencetag: Long, dwattrtypeandaction: Int, cbdata: Int, pbdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(hcatalog: Long, pwszreferencetag: Long, dwattrtypeandaction: Int, cbdata: Int, pbdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(hcatalog: Long, pwszfilename: Long, pwszreferencetag: Long, pgsubjecttype: Long, dwcertversion: Int, cbsipindirectdata: Int, pbsipindirectdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(hcatalog: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(hfile: Long, pwszfilename: Long): Int
}

public actual fun cryptCATAdminAcquireContext(phcatadmin: MutPtr<Long>, pgsubsystem: ConstPtr<Guid>, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(phcatadmin.rawAddress, pgsubsystem.rawAddress, dwflags.toInt())

public actual fun cryptCATAdminAcquireContext2(phcatadmin: MutPtr<Long>, pgsubsystem: ConstPtr<Guid>, pwszhashalgorithm: Pcwstr, pstronghashpolicy: ConstPtr<CertStrongSignPara>, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(phcatadmin.rawAddress, pgsubsystem.rawAddress, pwszhashalgorithm.rawAddress, pstronghashpolicy.rawAddress, dwflags.toInt())

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(hcatadmin, pwszcatalogfile.rawAddress, pwszselectbasename.rawAddress, dwflags.toInt())

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: MutPtr<UInt>, pbhash: MutPtr<UByte>, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(hfile.rawAddress, pcbhash.rawAddress, pbhash.rawAddress, dwflags.toInt())

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: MutPtr<UInt>, pbhash: MutPtr<UByte>, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(hcatadmin, hfile.rawAddress, pcbhash.rawAddress, pbhash.rawAddress, dwflags.toInt())

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: ConstPtr<UByte>, cbhash: UInt, dwflags: UInt, phprevcatinfo: MutPtr<Long>): Long =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(hcatadmin, pbhash.rawAddress, cbhash.toInt(), dwflags.toInt(), phprevcatinfo.rawAddress)

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume)

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(hcatadmin, hcatinfo, dwflags.toInt())

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(hcatadmin, dwflags.toInt())

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(hcatadmin, pwszcatalogfile.rawAddress, dwflags.toInt())

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: MutPtr<CatalogInfo>, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(hcatadmin, pwszcatalogfile.rawAddress, pscatinfo.rawAddress, dwflags.toInt())

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatmember> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(hcatalog.rawAddress, pwszreferencetag.rawAddress))

public actual fun cryptCATCDFClose(pcdf: MutPtr<Cryptcatcdf>): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(pcdf.rawAddress)

public actual fun cryptCATCDFEnumAttributes(pcdf: MutPtr<Cryptcatcdf>, pmember: MutPtr<Cryptcatmember>, pprevattr: MutPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(pcdf.rawAddress, pmember.rawAddress, pprevattr.rawAddress, 0L))

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: ConstPtr<Cryptcatcdf>, pwszmembertag: Pcwstr, pmember: ConstPtr<Cryptcatmember>, pprevattr: ConstPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(pcdf.rawAddress, pwszmembertag.rawAddress, pmember.rawAddress, pprevattr.rawAddress, 0L))

public actual fun cryptCATCDFEnumCatAttributes(pcdf: MutPtr<Cryptcatcdf>, pprevattr: MutPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(pcdf.rawAddress, pprevattr.rawAddress, 0L))

public actual fun cryptCATCDFEnumMembers(pcdf: MutPtr<Cryptcatcdf>, pprevmember: MutPtr<Cryptcatmember>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatmember> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(pcdf.rawAddress, pprevmember.rawAddress, 0L))

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: ConstPtr<Cryptcatcdf>, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: ConstPtr<ConstPtr<Cryptcatmember>>, fcontinueonerror: Bool, pvreserved: ConstPtr<CVoid>): Pwstr =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(pcdf.rawAddress, pwszprevcdftag.rawAddress, 0L, ppmember.rawAddress, fcontinueonerror, pvreserved.rawAddress))

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatcdf> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(pwszfilepath.rawAddress, 0L))

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: MutPtr<CatalogInfo>, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(hcatinfo, pscatinfo.rawAddress, dwflags.toInt())

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(hcatalog.rawAddress)

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pprevattr: MutPtr<Cryptcatattribute>): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(hcatalog.rawAddress, pcatmember.rawAddress, pprevattr.rawAddress))

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: MutPtr<Cryptcatattribute>): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(hcatalog.rawAddress, pprevattr.rawAddress))

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: MutPtr<Cryptcatmember>): MutPtr<Cryptcatmember> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(hcatalog.rawAddress, pprevmember.rawAddress))

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>) {
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(hcatalog.rawAddress, pcatmember.rawAddress)
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pwszreferencetag: Pcwstr): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(hcatalog.rawAddress, pcatmember.rawAddress, pwszreferencetag.rawAddress))

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(hcatalog.rawAddress, pwszreferencetag.rawAddress))

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatmember> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(hcatalog.rawAddress, pwszreferencetag.rawAddress))

public actual fun cryptCATHandleFromStore(pcatstore: MutPtr<Cryptcatstore>): Handle =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(pcatstore.rawAddress))

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(pwszfilename.rawAddress, fdwopenflags.toInt(), hprov.toLong(), dwpublicversion.toInt(), dwencodingtype.toInt()))

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(hcatalog.rawAddress)

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr<UByte>): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(hcatalog.rawAddress, pcatmember.rawAddress, pwszreferencetag.rawAddress, dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata.rawAddress))

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr<UByte>): MutPtr<Cryptcatattribute> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(hcatalog.rawAddress, pwszreferencetag.rawAddress, dwattrtypeandaction.toInt(), cbdata.toInt(), pbdata.rawAddress))

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: MutPtr<Guid>, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: MutPtr<UByte>): MutPtr<Cryptcatmember> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(hcatalog.rawAddress, pwszfilename.rawAddress, pwszreferencetag.rawAddress, pgsubjecttype.rawAddress, dwcertversion.toInt(), cbsipindirectdata.toInt(), pbsipindirectdata.rawAddress))

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): MutPtr<Cryptcatstore> =
    MutPtr(WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(hcatalog.rawAddress))

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyCatalogJniBridge.windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(hfile.rawAddress, pwszfilename.rawAddress)
