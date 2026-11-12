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

public expect fun cryptCATAdminAcquireContext(phcatadmin: MutPtr<Long>, pgsubsystem: ConstPtr<Guid>, dwflags: UInt): Bool

public expect fun cryptCATAdminAcquireContext2(phcatadmin: MutPtr<Long>, pgsubsystem: ConstPtr<Guid>, pwszhashalgorithm: Pcwstr, pstronghashpolicy: ConstPtr<CertStrongSignPara>, dwflags: UInt): Bool

public expect fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long

public expect fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: MutPtr<UInt>, pbhash: MutPtr<UByte>, dwflags: UInt): Bool

public expect fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: MutPtr<UInt>, pbhash: MutPtr<UByte>, dwflags: UInt): Bool

public expect fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: ConstPtr<UByte>, cbhash: UInt, dwflags: UInt, phprevcatinfo: MutPtr<Long>): Long

public expect fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool

public expect fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool

public expect fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool

public expect fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool

public expect fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: MutPtr<CatalogInfo>, dwflags: UInt): Bool

public expect fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatmember>

public expect fun cryptCATCDFClose(pcdf: MutPtr<Cryptcatcdf>): Bool

public expect fun cryptCATCDFEnumAttributes(pcdf: MutPtr<Cryptcatcdf>, pmember: MutPtr<Cryptcatmember>, pprevattr: MutPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute>

public expect fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: ConstPtr<Cryptcatcdf>, pwszmembertag: Pcwstr, pmember: ConstPtr<Cryptcatmember>, pprevattr: ConstPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute>

public expect fun cryptCATCDFEnumCatAttributes(pcdf: MutPtr<Cryptcatcdf>, pprevattr: MutPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute>

public expect fun cryptCATCDFEnumMembers(pcdf: MutPtr<Cryptcatcdf>, pprevmember: MutPtr<Cryptcatmember>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatmember>

public expect fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: ConstPtr<Cryptcatcdf>, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: ConstPtr<ConstPtr<Cryptcatmember>>, fcontinueonerror: Bool, pvreserved: ConstPtr<CVoid>): Pwstr

public expect fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatcdf>

public expect fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: MutPtr<CatalogInfo>, dwflags: UInt): Bool

public expect fun cryptCATClose(hcatalog: Handle): Bool

public expect fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pprevattr: MutPtr<Cryptcatattribute>): MutPtr<Cryptcatattribute>

public expect fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: MutPtr<Cryptcatattribute>): MutPtr<Cryptcatattribute>

public expect fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: MutPtr<Cryptcatmember>): MutPtr<Cryptcatmember>

public expect fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>)

public expect fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pwszreferencetag: Pcwstr): MutPtr<Cryptcatattribute>

public expect fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatattribute>

public expect fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatmember>

public expect fun cryptCATHandleFromStore(pcatstore: MutPtr<Cryptcatstore>): Handle

public expect fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle

public expect fun cryptCATPersistStore(hcatalog: Handle): Bool

public expect fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr<UByte>): MutPtr<Cryptcatattribute>

public expect fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr<UByte>): MutPtr<Cryptcatattribute>

public expect fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: MutPtr<Guid>, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: MutPtr<UByte>): MutPtr<Cryptcatmember>

public expect fun cryptCATStoreFromHandle(hcatalog: Handle): MutPtr<Cryptcatstore>

public expect fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool
