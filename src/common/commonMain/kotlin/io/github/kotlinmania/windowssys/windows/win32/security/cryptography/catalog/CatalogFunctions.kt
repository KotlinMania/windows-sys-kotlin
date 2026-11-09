package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun CryptCATAdminAcquireContext(phcatadmin: Long, pgsubsystem: Long, dwflags: UInt): BOOL

public expect fun CryptCATAdminAcquireContext2(phcatadmin: Long, pgsubsystem: Long, pwszhashalgorithm: PCWSTR, pstronghashpolicy: Long, dwflags: UInt): BOOL

public expect fun CryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, pwszselectbasename: PCWSTR, dwflags: UInt): Long

public expect fun CryptCATAdminCalcHashFromFileHandle(hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL

public expect fun CryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: HANDLE, pcbhash: Long, pbhash: Long, dwflags: UInt): BOOL

public expect fun CryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: Long, cbhash: UInt, dwflags: UInt, phprevcatinfo: Long): Long

public expect fun CryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: BOOL): BOOL

public expect fun CryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): BOOL

public expect fun CryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): BOOL

public expect fun CryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: PCWSTR, dwflags: UInt): BOOL

public expect fun CryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: PCWSTR, pscatinfo: Long, dwflags: UInt): BOOL

public expect fun CryptCATAllocSortedMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long

public expect fun CryptCATCDFClose(pcdf: Long): BOOL

public expect fun CryptCATCDFEnumAttributes(pcdf: Long, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long

public expect fun CryptCATCDFEnumAttributesWithCDFTag(pcdf: Long, pwszmembertag: PCWSTR, pmember: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long

public expect fun CryptCATCDFEnumCatAttributes(pcdf: Long, pprevattr: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long

public expect fun CryptCATCDFEnumMembers(pcdf: Long, pprevmember: Long, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long

public expect fun CryptCATCDFEnumMembersByCDFTagEx(pcdf: Long, pwszprevcdftag: PWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK, ppmember: Long, fcontinueonerror: BOOL, pvreserved: Long): PWSTR

public expect fun CryptCATCDFOpen(pwszfilepath: PCWSTR, pfnparseerror: PFN_CDF_PARSE_ERROR_CALLBACK): Long

public expect fun CryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: Long, dwflags: UInt): BOOL

public expect fun CryptCATClose(hcatalog: HANDLE): BOOL

public expect fun CryptCATEnumerateAttr(hcatalog: HANDLE, pcatmember: Long, pprevattr: Long): Long

public expect fun CryptCATEnumerateCatAttr(hcatalog: HANDLE, pprevattr: Long): Long

public expect fun CryptCATEnumerateMember(hcatalog: HANDLE, pprevmember: Long): Long

public expect fun CryptCATFreeSortedMemberInfo(hcatalog: HANDLE, pcatmember: Long)

public expect fun CryptCATGetAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR): Long

public expect fun CryptCATGetCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long

public expect fun CryptCATGetMemberInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR): Long

public expect fun CryptCATHandleFromStore(pcatstore: Long): HANDLE

public expect fun CryptCATOpen(pwszfilename: PCWSTR, fdwopenflags: CRYPTCAT_OPEN_FLAGS, hprov: ULong, dwpublicversion: CRYPTCAT_VERSION, dwencodingtype: UInt): HANDLE

public expect fun CryptCATPersistStore(hcatalog: HANDLE): BOOL

public expect fun CryptCATPutAttrInfo(hcatalog: HANDLE, pcatmember: Long, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long

public expect fun CryptCATPutCatAttrInfo(hcatalog: HANDLE, pwszreferencetag: PCWSTR, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: Long): Long

public expect fun CryptCATPutMemberInfo(hcatalog: HANDLE, pwszfilename: PCWSTR, pwszreferencetag: PCWSTR, pgsubjecttype: Long, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: Long): Long

public expect fun CryptCATStoreFromHandle(hcatalog: HANDLE): Long

public expect fun IsCatalogFile(hfile: HANDLE, pwszfilename: PCWSTR): BOOL
