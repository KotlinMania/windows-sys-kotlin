@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.cinterop.windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun cryptCATAdminAcquireContext(phcatadmin: MutPtr, pgsubsystem: ConstPtr, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(phcatadmin.rawAddress.toCPointer<ByteVar>(), pgsubsystem.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminAcquireContext2(phcatadmin: MutPtr, pgsubsystem: ConstPtr, pwszhashalgorithm: Pcwstr, pstronghashpolicy: ConstPtr, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(phcatadmin.rawAddress.toCPointer<ByteVar>(), pgsubsystem.rawAddress.toCPointer<ByteVar>(), pwszhashalgorithm.rawAddress.toCPointer<ByteVar>(), pstronghashpolicy.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(hcatadmin, pwszcatalogfile.rawAddress.toCPointer<ByteVar>(), pwszselectbasename.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: MutPtr, pbhash: MutPtr, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(hfile.rawAddress.toCPointer<ByteVar>(), pcbhash.rawAddress.toCPointer<ByteVar>(), pbhash.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: MutPtr, pbhash: MutPtr, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(hcatadmin, hfile.rawAddress.toCPointer<ByteVar>(), pcbhash.rawAddress.toCPointer<ByteVar>(), pbhash.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: ConstPtr, cbhash: UInt, dwflags: UInt, phprevcatinfo: MutPtr): Long =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(hcatadmin, pbhash.rawAddress.toCPointer<ByteVar>(), cbhash, dwflags, phprevcatinfo.rawAddress.toCPointer<ByteVar>())

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(dwflags, fresume)

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(hcatadmin, hcatinfo, dwflags)

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(hcatadmin, dwflags)

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(hcatadmin, pwszcatalogfile.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: MutPtr, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(hcatadmin, pwszcatalogfile.rawAddress.toCPointer<ByteVar>(), pscatinfo.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(hcatalog.rawAddress.toCPointer<ByteVar>(), pwszreferencetag.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATCDFClose(pcdf: MutPtr): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(pcdf.rawAddress.toCPointer<ByteVar>())

public actual fun cryptCATCDFEnumAttributes(pcdf: MutPtr, pmember: MutPtr, pprevattr: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(pcdf.rawAddress.toCPointer<ByteVar>(), pmember.rawAddress.toCPointer<ByteVar>(), pprevattr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: ConstPtr, pwszmembertag: Pcwstr, pmember: ConstPtr, pprevattr: ConstPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(pcdf.rawAddress.toCPointer<ByteVar>(), pwszmembertag.rawAddress.toCPointer<ByteVar>(), pmember.rawAddress.toCPointer<ByteVar>(), pprevattr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATCDFEnumCatAttributes(pcdf: MutPtr, pprevattr: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(pcdf.rawAddress.toCPointer<ByteVar>(), pprevattr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATCDFEnumMembers(pcdf: MutPtr, pprevmember: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(pcdf.rawAddress.toCPointer<ByteVar>(), pprevmember.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: ConstPtr, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: ConstPtr, fcontinueonerror: Bool, pvreserved: ConstPtr): Pwstr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(pcdf.rawAddress.toCPointer<ByteVar>(), pwszprevcdftag.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ppmember.rawAddress.toCPointer<ByteVar>(), fcontinueonerror, pvreserved.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(pwszfilepath.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: MutPtr, dwflags: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(hcatinfo, pscatinfo.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(hcatalog.rawAddress.toCPointer<ByteVar>())

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: MutPtr, pprevattr: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(hcatalog.rawAddress.toCPointer<ByteVar>(), pcatmember.rawAddress.toCPointer<ByteVar>(), pprevattr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(hcatalog.rawAddress.toCPointer<ByteVar>(), pprevattr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(hcatalog.rawAddress.toCPointer<ByteVar>(), pprevmember.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: MutPtr) {
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(hcatalog.rawAddress.toCPointer<ByteVar>(), pcatmember.rawAddress.toCPointer<ByteVar>())
}

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: MutPtr, pwszreferencetag: Pcwstr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(hcatalog.rawAddress.toCPointer<ByteVar>(), pcatmember.rawAddress.toCPointer<ByteVar>(), pwszreferencetag.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(hcatalog.rawAddress.toCPointer<ByteVar>(), pwszreferencetag.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(hcatalog.rawAddress.toCPointer<ByteVar>(), pwszreferencetag.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATHandleFromStore(pcatstore: MutPtr): Handle =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(pcatstore.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(pwszfilename.rawAddress.toCPointer<ByteVar>(), fdwopenflags, hprov, dwpublicversion, dwencodingtype)?.toLong() ?: 0L)

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(hcatalog.rawAddress.toCPointer<ByteVar>())

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: MutPtr, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(hcatalog.rawAddress.toCPointer<ByteVar>(), pcatmember.rawAddress.toCPointer<ByteVar>(), pwszreferencetag.rawAddress.toCPointer<ByteVar>(), dwattrtypeandaction, cbdata, pbdata.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(hcatalog.rawAddress.toCPointer<ByteVar>(), pwszreferencetag.rawAddress.toCPointer<ByteVar>(), dwattrtypeandaction, cbdata, pbdata.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: MutPtr, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(hcatalog.rawAddress.toCPointer<ByteVar>(), pwszfilename.rawAddress.toCPointer<ByteVar>(), pwszreferencetag.rawAddress.toCPointer<ByteVar>(), pgsubjecttype.rawAddress.toCPointer<ByteVar>(), dwcertversion, cbsipindirectdata, pbsipindirectdata.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(hcatalog.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(hfile.rawAddress.toCPointer<ByteVar>(), pwszfilename.rawAddress.toCPointer<ByteVar>())
