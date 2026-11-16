package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun cryptCATAdminAcquireContext(phcatadmin: MutPtr, pgsubsystem: ConstPtr, dwflags: UInt): Bool

public expect fun cryptCATAdminAcquireContext2(phcatadmin: MutPtr, pgsubsystem: ConstPtr, pwszhashalgorithm: Pcwstr, pstronghashpolicy: ConstPtr, dwflags: UInt): Bool

public expect fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long

public expect fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: MutPtr, pbhash: MutPtr, dwflags: UInt): Bool

public expect fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: MutPtr, pbhash: MutPtr, dwflags: UInt): Bool

public expect fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: ConstPtr, cbhash: UInt, dwflags: UInt, phprevcatinfo: MutPtr): Long

public expect fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool

public expect fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool

public expect fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool

public expect fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool

public expect fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: MutPtr, dwflags: UInt): Bool

public expect fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr

public expect fun cryptCATCDFClose(pcdf: MutPtr): Bool

public expect fun cryptCATCDFEnumAttributes(pcdf: MutPtr, pmember: MutPtr, pprevattr: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr

public expect fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: ConstPtr, pwszmembertag: Pcwstr, pmember: ConstPtr, pprevattr: ConstPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr

public expect fun cryptCATCDFEnumCatAttributes(pcdf: MutPtr, pprevattr: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr

public expect fun cryptCATCDFEnumMembers(pcdf: MutPtr, pprevmember: MutPtr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr

public expect fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: ConstPtr, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: ConstPtr, fcontinueonerror: Bool, pvreserved: ConstPtr): Pwstr

public expect fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr

public expect fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: MutPtr, dwflags: UInt): Bool

public expect fun cryptCATClose(hcatalog: Handle): Bool

public expect fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: MutPtr, pprevattr: MutPtr): MutPtr

public expect fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: MutPtr): MutPtr

public expect fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: MutPtr): MutPtr

public expect fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: MutPtr)

public expect fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: MutPtr, pwszreferencetag: Pcwstr): MutPtr

public expect fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr

public expect fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr

public expect fun cryptCATHandleFromStore(pcatstore: MutPtr): Handle

public expect fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle

public expect fun cryptCATPersistStore(hcatalog: Handle): Bool

public expect fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: MutPtr, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr): MutPtr

public expect fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr): MutPtr

public expect fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: MutPtr, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: MutPtr): MutPtr

public expect fun cryptCATStoreFromHandle(hcatalog: Handle): MutPtr

public expect fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool
