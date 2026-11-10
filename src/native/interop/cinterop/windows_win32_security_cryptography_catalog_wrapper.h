#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext(void* phcatadmin, void* pgsubsystem, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2(void* phcatadmin, void* pgsubsystem, void* pwszhashalgorithm, void* pstronghashpolicy, uint32_t dwflags);
int64_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(int64_t hcatadmin, void* pwszcatalogfile, void* pwszselectbasename, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle(void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(int64_t hcatadmin, void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags);
int64_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(int64_t hcatadmin, void* pbhash, uint32_t cbhash, uint32_t dwflags, void* phprevcatinfo);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(uint32_t dwflags, int32_t fresume);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(int64_t hcatadmin, int64_t hcatinfo, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(int64_t hcatadmin, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(int64_t hcatadmin, void* pwszcatalogfile, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(int64_t hcatadmin, void* pwszcatalogfile, void* pscatinfo, uint32_t dwflags);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo(void* hcatalog, void* pwszreferencetag);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose(void* pcdf);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes(void* pcdf, void* pmember, void* pprevattr, void* pfnparseerror);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag(void* pcdf, void* pwszmembertag, void* pmember, void* pprevattr, void* pfnparseerror);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes(void* pcdf, void* pprevattr, void* pfnparseerror);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers(void* pcdf, void* pprevmember, void* pfnparseerror);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx(void* pcdf, void* pwszprevcdftag, void* pfnparseerror, void* ppmember, int32_t fcontinueonerror, void* pvreserved);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen(void* pwszfilepath, void* pfnparseerror);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(int64_t hcatinfo, void* pscatinfo, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATClose(void* hcatalog);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr(void* hcatalog, void* pcatmember, void* pprevattr);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr(void* hcatalog, void* pprevattr);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember(void* hcatalog, void* pprevmember);
void windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo(void* hcatalog, void* pcatmember);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo(void* hcatalog, void* pwszreferencetag);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo(void* hcatalog, void* pwszreferencetag);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore(void* pcatstore);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen(void* pwszfilename, uint32_t fdwopenflags, uint64_t hprov, uint32_t dwpublicversion, uint32_t dwencodingtype);
int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore(void* hcatalog);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo(void* hcatalog, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo(void* hcatalog, void* pwszfilename, void* pwszreferencetag, void* pgsubjecttype, uint32_t dwcertversion, uint32_t cbsipindirectdata, void* pbsipindirectdata);
void* windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle(void* hcatalog);
int32_t windowssys_windows_win32_security_cryptography_catalog_isCatalogFile(void* hfile, void* pwszfilename);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H */
