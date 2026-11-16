#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(void* phcatadmin, void* pgsubsystem, uint32_t dwflags);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(void* phcatadmin, void* pgsubsystem, void* pwszhashalgorithm, void* pstronghashpolicy, uint32_t dwflags);
int64_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(int64_t hcatadmin, void* pwszcatalogfile, void* pwszselectbasename, uint32_t dwflags);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(int64_t hcatadmin, void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags);
int64_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(int64_t hcatadmin, void* pbhash, uint32_t cbhash, uint32_t dwflags, void* phprevcatinfo);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(uint32_t dwflags, int32_t fresume);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(int64_t hcatadmin, int64_t hcatinfo, uint32_t dwflags);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(int64_t hcatadmin, uint32_t dwflags);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(int64_t hcatadmin, void* pwszcatalogfile, uint32_t dwflags);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(int64_t hcatadmin, void* pwszcatalogfile, void* pscatinfo, uint32_t dwflags);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(void* hcatalog, void* pwszreferencetag);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(void* pcdf);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(void* pcdf, void* pmember, void* pprevattr, void* pfnparseerror);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(void* pcdf, void* pwszmembertag, void* pmember, void* pprevattr, void* pfnparseerror);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(void* pcdf, void* pprevattr, void* pfnparseerror);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(void* pcdf, void* pprevmember, void* pfnparseerror);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(void* pcdf, void* pwszprevcdftag, void* pfnparseerror, void* ppmember, int32_t fcontinueonerror, void* pvreserved);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(void* pwszfilepath, void* pfnparseerror);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(int64_t hcatinfo, void* pscatinfo, uint32_t dwflags);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(void* hcatalog);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(void* hcatalog, void* pcatmember, void* pprevattr);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(void* hcatalog, void* pprevattr);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(void* hcatalog, void* pprevmember);
void windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(void* hcatalog, void* pcatmember);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(void* hcatalog, void* pwszreferencetag);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(void* hcatalog, void* pwszreferencetag);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(void* pcatstore);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(void* pwszfilename, uint32_t fdwopenflags, uint64_t hprov, uint32_t dwpublicversion, uint32_t dwencodingtype);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(void* hcatalog);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(void* hcatalog, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(void* hcatalog, void* pwszfilename, void* pwszreferencetag, void* pgsubjecttype, uint32_t dwcertversion, uint32_t cbsipindirectdata, void* pbsipindirectdata);
void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(void* hcatalog);
int32_t windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(void* hfile, void* pwszfilename);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H */
