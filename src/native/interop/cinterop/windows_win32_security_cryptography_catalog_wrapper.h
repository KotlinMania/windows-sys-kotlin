#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext(void* phcatadmin, void* pgsubsystem, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAcquireContext2(void* phcatadmin, void* pgsubsystem, void* pwszhashalgorithm, void* pstronghashpolicy, uint32_t dwflags);
int64_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminAddCatalog(int64_t hcatadmin, void* pwszcatalogfile, void* pwszselectbasename, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle(void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminCalcHashFromFileHandle2(int64_t hcatadmin, void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags);
int64_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminEnumCatalogFromHash(int64_t hcatadmin, void* pbhash, uint32_t cbhash, uint32_t dwflags, void* phprevcatinfo);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminPauseServiceForBackup(uint32_t dwflags, int32_t fresume);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseCatalogContext(int64_t hcatadmin, int64_t hcatinfo, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminReleaseContext(int64_t hcatadmin, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminRemoveCatalog(int64_t hcatadmin, void* pwszcatalogfile, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATAdminResolveCatalogPath(int64_t hcatadmin, void* pwszcatalogfile, void* pscatinfo, uint32_t dwflags);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATAllocSortedMemberInfo(void* hcatalog, void* pwszreferencetag);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFClose(void* pcdf);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributes(void* pcdf, void* pmember, void* pprevattr, void* pfnparseerror);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumAttributesWithCDFTag(void* pcdf, void* pwszmembertag, void* pmember, void* pprevattr, void* pfnparseerror);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumCatAttributes(void* pcdf, void* pprevattr, void* pfnparseerror);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembers(void* pcdf, void* pprevmember, void* pfnparseerror);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFEnumMembersByCDFTagEx(void* pcdf, void* pwszprevcdftag, void* pfnparseerror, void* ppmember, int32_t fcontinueonerror, void* pvreserved);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATCDFOpen(void* pwszfilepath, void* pfnparseerror);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATCatalogInfoFromContext(int64_t hcatinfo, void* pscatinfo, uint32_t dwflags);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATClose(void* hcatalog);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateAttr(void* hcatalog, void* pcatmember, void* pprevattr);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateCatAttr(void* hcatalog, void* pprevattr);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATEnumerateMember(void* hcatalog, void* pprevmember);
void windowssys_windows_win32_security_cryptography_catalog_CryptCATFreeSortedMemberInfo(void* hcatalog, void* pcatmember);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATGetAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATGetCatAttrInfo(void* hcatalog, void* pwszreferencetag);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATGetMemberInfo(void* hcatalog, void* pwszreferencetag);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATHandleFromStore(void* pcatstore);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATOpen(void* pwszfilename, uint32_t fdwopenflags, uint64_t hprov, uint32_t dwpublicversion, uint32_t dwencodingtype);
int32_t windowssys_windows_win32_security_cryptography_catalog_CryptCATPersistStore(void* hcatalog);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATPutAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATPutCatAttrInfo(void* hcatalog, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATPutMemberInfo(void* hcatalog, void* pwszfilename, void* pwszreferencetag, void* pgsubjecttype, uint32_t dwcertversion, uint32_t cbsipindirectdata, void* pbsipindirectdata);
void* windowssys_windows_win32_security_cryptography_catalog_CryptCATStoreFromHandle(void* hcatalog);
int32_t windowssys_windows_win32_security_cryptography_catalog_IsCatalogFile(void* hfile, void* pwszfilename);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CATALOG_WRAPPER_H */
